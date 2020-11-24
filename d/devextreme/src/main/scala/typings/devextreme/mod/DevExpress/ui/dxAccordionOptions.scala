package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.ItemIndex
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxAccordionOptions extends CollectionWidgetOptions[dxAccordion] {
  
  /**
    * [descr:dxAccordion.Options.animationDuration]
    */
  var animationDuration: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxAccordion.Options.collapsible]
    */
  var collapsible: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxAccordion.Options.dataSource]
    */
  @JSName("dataSource")
  var dataSource_dxAccordionOptions: js.UndefOr[
    String | (js.Array[String | dxAccordionItem | _]) | DataSource | DataSourceOptions
  ] = js.native
  
  /**
    * [descr:dxAccordion.Options.deferRendering]
    */
  var deferRendering: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxAccordion.Options.itemTitleTemplate]
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
    * [descr:dxAccordion.Options.items]
    */
  @JSName("items")
  var items_dxAccordionOptions: js.UndefOr[js.Array[String | dxAccordionItem | _]] = js.native
  
  /**
    * [descr:dxAccordion.Options.multiple]
    */
  var multiple: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxAccordion.Options.onItemTitleClick]
    */
  var onItemTitleClick: js.UndefOr[(js.Function1[/* e */ ItemIndex, _]) | String] = js.native
  
  /**
    * [descr:dxAccordion.Options.repaintChangesOnly]
    */
  var repaintChangesOnly: js.UndefOr[Boolean] = js.native
}
object dxAccordionOptions {
  
  @scala.inline
  def apply(): dxAccordionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxAccordionOptions]
  }
  
  @scala.inline
  implicit class dxAccordionOptionsOps[Self <: dxAccordionOptions] (val x: Self) extends AnyVal {
    
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
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    
    @scala.inline
    def setCollapsible(value: Boolean): Self = this.set("collapsible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapsible: Self = this.set("collapsible", js.undefined)
    
    @scala.inline
    def setDataSourceVarargs(value: (String | dxAccordionItem | js.Any)*): Self = this.set("dataSource", js.Array(value :_*))
    
    @scala.inline
    def setDataSource(value: String | (js.Array[String | dxAccordionItem | _]) | DataSource | DataSourceOptions): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setDeferRendering(value: Boolean): Self = this.set("deferRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeferRendering: Self = this.set("deferRendering", js.undefined)
    
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
    def setItemsVarargs(value: (String | dxAccordionItem | js.Any)*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[String | dxAccordionItem | _]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    
    @scala.inline
    def setOnItemTitleClickFunction1(value: /* e */ ItemIndex => _): Self = this.set("onItemTitleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnItemTitleClick(value: (js.Function1[/* e */ ItemIndex, _]) | String): Self = this.set("onItemTitleClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnItemTitleClick: Self = this.set("onItemTitleClick", js.undefined)
    
    @scala.inline
    def setRepaintChangesOnly(value: Boolean): Self = this.set("repaintChangesOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepaintChangesOnly: Self = this.set("repaintChangesOnly", js.undefined)
  }
}
