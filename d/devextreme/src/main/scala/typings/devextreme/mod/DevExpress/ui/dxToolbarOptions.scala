package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxToolbarOptions extends CollectionWidgetOptions[dxToolbar] {
  
  /**
    * [descr:dxToolbar.Options.dataSource]
    */
  @JSName("dataSource")
  var dataSource_dxToolbarOptions: js.UndefOr[String | (js.Array[String | dxToolbarItem | _]) | DataSource | DataSourceOptions] = js.native
  
  /**
    * [descr:dxToolbar.Options.items]
    */
  @JSName("items")
  var items_dxToolbarOptions: js.UndefOr[js.Array[String | dxToolbarItem | _]] = js.native
  
  /**
    * [descr:dxToolbar.Options.menuItemTemplate]
    */
  var menuItemTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
}
object dxToolbarOptions {
  
  @scala.inline
  def apply(): dxToolbarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxToolbarOptions]
  }
  
  @scala.inline
  implicit class dxToolbarOptionsOps[Self <: dxToolbarOptions] (val x: Self) extends AnyVal {
    
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
    def setDataSourceVarargs(value: (String | dxToolbarItem | js.Any)*): Self = this.set("dataSource", js.Array(value :_*))
    
    @scala.inline
    def setDataSource(value: String | (js.Array[String | dxToolbarItem | _]) | DataSource | DataSourceOptions): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: (String | dxToolbarItem | js.Any)*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[String | dxToolbarItem | _]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setMenuItemTemplateFunction3(
      value: (/* itemData */ js.Any, /* itemIndex */ Double, /* itemElement */ dxElement) => String | Element | JQuery
    ): Self = this.set("menuItemTemplate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMenuItemTemplate(
      value: typings.devextreme.mod.DevExpress.core.template | (js.Function3[
          /* itemData */ js.Any, 
          /* itemIndex */ Double, 
          /* itemElement */ dxElement, 
          String | Element | JQuery
        ])
    ): Self = this.set("menuItemTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuItemTemplate: Self = this.set("menuItemTemplate", js.undefined)
  }
}
