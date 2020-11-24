package typings.extjs.Ext.grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBooleanColumn
  extends typings.extjs.Ext.grid.column.IColumn {
  
  /** [Config Option] (String) */
  var falseText: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var trueText: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var undefinedText: js.UndefOr[String] = js.native
}
object IBooleanColumn {
  
  @scala.inline
  def apply(): IBooleanColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBooleanColumn]
  }
  
  @scala.inline
  implicit class IBooleanColumnOps[Self <: IBooleanColumn] (val x: Self) extends AnyVal {
    
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
    def setFalseText(value: String): Self = this.set("falseText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFalseText: Self = this.set("falseText", js.undefined)
    
    @scala.inline
    def setTrueText(value: String): Self = this.set("trueText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrueText: Self = this.set("trueText", js.undefined)
    
    @scala.inline
    def setUndefinedText(value: String): Self = this.set("undefinedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUndefinedText: Self = this.set("undefinedText", js.undefined)
  }
}
