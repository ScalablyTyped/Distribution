package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.core.UserDefinedElement
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.DevExpress.ui.dxAccordion.ItemLike
import typings.devextreme.mod.DevExpress.ui.dxAccordion.ItemTitleClickEvent
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxAccordionOptions[TItem /* <: ItemLike */, TKey]
  extends StObject
     with CollectionWidgetOptions[dxAccordion[TItem, TKey], TItem, TKey] {
  
  /**
    * A number specifying the time in milliseconds spent on the animation of the expanding or collapsing of a panel.
    */
  var animationDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies whether all items can be collapsed or whether at least one item must always be expanded.
    */
  var collapsible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether to render the panel&apos;s content when it is displayed. If false, the content is rendered immediately.
    */
  var deferRendering: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a custom template for item titles.
    */
  var itemTitleTemplate: js.UndefOr[
    template | (js.Function3[
      /* itemData */ TItem, 
      /* itemIndex */ Double, 
      /* itemElement */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * Specifies whether the UI component can expand several items or only a single item at once.
    */
  var multiple: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A function that is executed when an accordion item&apos;s title is clicked or tapped.
    */
  var onItemTitleClick: js.UndefOr[(js.Function1[/* e */ ItemTitleClickEvent[TItem, TKey], Unit]) | String] = js.undefined
  
  /**
    * Specifies whether to repaint only those elements whose data changed.
    */
  var repaintChangesOnly: js.UndefOr[Boolean] = js.undefined
}
object dxAccordionOptions {
  
  inline def apply[TItem /* <: ItemLike */, TKey](): dxAccordionOptions[TItem, TKey] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxAccordionOptions[TItem, TKey]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxAccordionOptions[?, ?], TItem /* <: ItemLike */, TKey] (val x: Self & (dxAccordionOptions[TItem, TKey])) extends AnyVal {
    
    inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    inline def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
    
    inline def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
    
    inline def setDeferRendering(value: Boolean): Self = StObject.set(x, "deferRendering", value.asInstanceOf[js.Any])
    
    inline def setDeferRenderingUndefined: Self = StObject.set(x, "deferRendering", js.undefined)
    
    inline def setItemTitleTemplate(
      value: template | (js.Function3[
          /* itemData */ TItem, 
          /* itemIndex */ Double, 
          /* itemElement */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "itemTitleTemplate", value.asInstanceOf[js.Any])
    
    inline def setItemTitleTemplateFunction3(
      value: (/* itemData */ TItem, /* itemIndex */ Double, /* itemElement */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "itemTitleTemplate", js.Any.fromFunction3(value))
    
    inline def setItemTitleTemplateUndefined: Self = StObject.set(x, "itemTitleTemplate", js.undefined)
    
    inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    inline def setOnItemTitleClick(value: (js.Function1[/* e */ ItemTitleClickEvent[TItem, TKey], Unit]) | String): Self = StObject.set(x, "onItemTitleClick", value.asInstanceOf[js.Any])
    
    inline def setOnItemTitleClickFunction1(value: /* e */ ItemTitleClickEvent[TItem, TKey] => Unit): Self = StObject.set(x, "onItemTitleClick", js.Any.fromFunction1(value))
    
    inline def setOnItemTitleClickUndefined: Self = StObject.set(x, "onItemTitleClick", js.undefined)
    
    inline def setRepaintChangesOnly(value: Boolean): Self = StObject.set(x, "repaintChangesOnly", value.asInstanceOf[js.Any])
    
    inline def setRepaintChangesOnlyUndefined: Self = StObject.set(x, "repaintChangesOnly", js.undefined)
  }
}
