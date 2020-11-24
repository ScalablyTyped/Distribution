package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.ElementItemDataItemElement
import typings.devextreme.anon.EventItemDataItemElement
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxTabPanelOptions extends dxMultiViewOptions[dxTabPanel] {
  
  /**
    * [descr:dxTabPanel.Options.dataSource]
    */
  @JSName("dataSource")
  var dataSource_dxTabPanelOptions: js.UndefOr[
    String | (js.Array[String | dxTabPanelItem | _]) | DataSource | DataSourceOptions
  ] = js.native
  
  /**
    * [descr:dxTabPanel.Options.itemTitleTemplate]
    */
  var itemTitleTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
  
  /**
    * [descr:dxTabPanel.Options.items]
    */
  @JSName("items")
  var items_dxTabPanelOptions: js.UndefOr[js.Array[String | dxTabPanelItem | _]] = js.native
  
  /**
    * [descr:dxTabPanel.Options.onTitleClick]
    */
  var onTitleClick: js.UndefOr[(js.Function1[/* e */ EventItemDataItemElement, _]) | String] = js.native
  
  /**
    * [descr:dxTabPanel.Options.onTitleHold]
    */
  var onTitleHold: js.UndefOr[js.Function1[/* e */ EventItemDataItemElement, _]] = js.native
  
  /**
    * [descr:dxTabPanel.Options.onTitleRendered]
    */
  var onTitleRendered: js.UndefOr[js.Function1[/* e */ ElementItemDataItemElement, _]] = js.native
  
  /**
    * [descr:dxTabPanel.Options.repaintChangesOnly]
    */
  var repaintChangesOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxTabPanel.Options.scrollByContent]
    */
  var scrollByContent: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxTabPanel.Options.scrollingEnabled]
    */
  var scrollingEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxTabPanel.Options.showNavButtons]
    */
  var showNavButtons: js.UndefOr[Boolean] = js.native
}
object dxTabPanelOptions {
  
  @scala.inline
  def apply(): dxTabPanelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTabPanelOptions]
  }
  
  @scala.inline
  implicit class dxTabPanelOptionsOps[Self <: dxTabPanelOptions] (val x: Self) extends AnyVal {
    
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
    def setDataSourceVarargs(value: (String | dxTabPanelItem | js.Any)*): Self = this.set("dataSource", js.Array(value :_*))
    
    @scala.inline
    def setDataSource(value: String | (js.Array[String | dxTabPanelItem | _]) | DataSource | DataSourceOptions): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setItemTitleTemplateFunction3(
      value: (/* itemData */ js.Any, /* itemIndex */ Double, /* itemElement */ dxElement) => String | Element | JQuery
    ): Self = this.set("itemTitleTemplate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setItemTitleTemplate(
      value: typings.devextreme.mod.DevExpress.core.template | (js.Function3[
          /* itemData */ js.Any, 
          /* itemIndex */ Double, 
          /* itemElement */ dxElement, 
          String | Element | JQuery
        ])
    ): Self = this.set("itemTitleTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemTitleTemplate: Self = this.set("itemTitleTemplate", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: (String | dxTabPanelItem | js.Any)*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[String | dxTabPanelItem | _]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setOnTitleClickFunction1(value: /* e */ EventItemDataItemElement => _): Self = this.set("onTitleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTitleClick(value: (js.Function1[/* e */ EventItemDataItemElement, _]) | String): Self = this.set("onTitleClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTitleClick: Self = this.set("onTitleClick", js.undefined)
    
    @scala.inline
    def setOnTitleHold(value: /* e */ EventItemDataItemElement => _): Self = this.set("onTitleHold", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTitleHold: Self = this.set("onTitleHold", js.undefined)
    
    @scala.inline
    def setOnTitleRendered(value: /* e */ ElementItemDataItemElement => _): Self = this.set("onTitleRendered", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTitleRendered: Self = this.set("onTitleRendered", js.undefined)
    
    @scala.inline
    def setRepaintChangesOnly(value: Boolean): Self = this.set("repaintChangesOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepaintChangesOnly: Self = this.set("repaintChangesOnly", js.undefined)
    
    @scala.inline
    def setScrollByContent(value: Boolean): Self = this.set("scrollByContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollByContent: Self = this.set("scrollByContent", js.undefined)
    
    @scala.inline
    def setScrollingEnabled(value: Boolean): Self = this.set("scrollingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollingEnabled: Self = this.set("scrollingEnabled", js.undefined)
    
    @scala.inline
    def setShowNavButtons(value: Boolean): Self = this.set("showNavButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowNavButtons: Self = this.set("showNavButtons", js.undefined)
  }
}
