package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxHtmlEditorVariables extends js.Object {
  
  /**
    * [descr:dxHtmlEditorVariables.dataSource]
    */
  var dataSource: js.UndefOr[String | js.Array[String] | DataSource | DataSourceOptions] = js.native
  
  /**
    * [descr:dxHtmlEditorVariables.escapeChar]
    */
  var escapeChar: js.UndefOr[String | js.Array[String]] = js.native
}
object dxHtmlEditorVariables {
  
  @scala.inline
  def apply(): dxHtmlEditorVariables = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxHtmlEditorVariables]
  }
  
  @scala.inline
  implicit class dxHtmlEditorVariablesOps[Self <: dxHtmlEditorVariables] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDataSourceVarargs(value: String*): Self = this.set("dataSource", js.Array(value :_*))
    
    @scala.inline
    def setDataSource(value: String | js.Array[String] | DataSource | DataSourceOptions): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setEscapeCharVarargs(value: String*): Self = this.set("escapeChar", js.Array(value :_*))
    
    @scala.inline
    def setEscapeChar(value: String | js.Array[String]): Self = this.set("escapeChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEscapeChar: Self = this.set("escapeChar", js.undefined)
  }
}
