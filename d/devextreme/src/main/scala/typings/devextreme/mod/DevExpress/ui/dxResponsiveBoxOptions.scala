package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.BaseSize
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxResponsiveBoxOptions extends CollectionWidgetOptions[dxResponsiveBox] {
  
  /**
    * [descr:dxResponsiveBox.Options.cols]
    */
  var cols: js.UndefOr[js.Array[BaseSize]] = js.native
  
  /**
    * [descr:dxResponsiveBox.Options.dataSource]
    */
  @JSName("dataSource")
  var dataSource_dxResponsiveBoxOptions: js.UndefOr[
    String | (js.Array[String | dxResponsiveBoxItem | _]) | DataSource | DataSourceOptions
  ] = js.native
  
  /**
    * [descr:dxResponsiveBox.Options.items]
    */
  @JSName("items")
  var items_dxResponsiveBoxOptions: js.UndefOr[js.Array[String | dxResponsiveBoxItem | _]] = js.native
  
  /**
    * [descr:dxResponsiveBox.Options.rows]
    */
  var rows: js.UndefOr[js.Array[BaseSize]] = js.native
  
  /**
    * [descr:dxResponsiveBox.Options.screenByWidth]
    */
  var screenByWidth: js.UndefOr[js.Function] = js.native
  
  /**
    * [descr:dxResponsiveBox.Options.singleColumnScreen]
    */
  var singleColumnScreen: js.UndefOr[String] = js.native
}
object dxResponsiveBoxOptions {
  
  @scala.inline
  def apply(): dxResponsiveBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxResponsiveBoxOptions]
  }
  
  @scala.inline
  implicit class dxResponsiveBoxOptionsOps[Self <: dxResponsiveBoxOptions] (val x: Self) extends AnyVal {
    
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
    def setColsVarargs(value: BaseSize*): Self = this.set("cols", js.Array(value :_*))
    
    @scala.inline
    def setCols(value: js.Array[BaseSize]): Self = this.set("cols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCols: Self = this.set("cols", js.undefined)
    
    @scala.inline
    def setDataSourceVarargs(value: (String | dxResponsiveBoxItem | js.Any)*): Self = this.set("dataSource", js.Array(value :_*))
    
    @scala.inline
    def setDataSource(value: String | (js.Array[String | dxResponsiveBoxItem | _]) | DataSource | DataSourceOptions): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: (String | dxResponsiveBoxItem | js.Any)*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[String | dxResponsiveBoxItem | _]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: BaseSize*): Self = this.set("rows", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[BaseSize]): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    
    @scala.inline
    def setScreenByWidth(value: js.Function): Self = this.set("screenByWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenByWidth: Self = this.set("screenByWidth", js.undefined)
    
    @scala.inline
    def setSingleColumnScreen(value: String): Self = this.set("singleColumnScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleColumnScreen: Self = this.set("singleColumnScreen", js.undefined)
  }
}
