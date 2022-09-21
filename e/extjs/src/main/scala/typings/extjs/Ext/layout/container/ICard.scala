package typings.extjs.Ext.layout.container

import typings.extjs.Ext.IComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICard
  extends StObject
     with IFit {
  
  /** [Config Option] (Boolean) */
  var deferredRender: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Return the active visible component in the layout
    * @returns Ext.Component
    */
  var getActiveItem: js.UndefOr[js.Function0[IComponent]] = js.undefined
  
  /** [Method] Return the active visible component in the layout to the next card
    * @returns Ext.Component The next component or false.
    */
  var getNext: js.UndefOr[js.Function0[IComponent]] = js.undefined
  
  /** [Method] Return the active visible component in the layout to the previous card
    * @returns Ext.Component The previous component or false.
    */
  var getPrev: js.UndefOr[js.Function0[IComponent]] = js.undefined
  
  /** [Method] Sets the active visible component in the layout to the next card
    * @returns Ext.Component the activated component or false when nothing activated.
    */
  var next: js.UndefOr[js.Function0[IComponent]] = js.undefined
  
  /** [Method] Sets the active visible component in the layout to the previous card
    * @returns Ext.Component the activated component or false when nothing activated.
    */
  var prev: js.UndefOr[js.Function0[IComponent]] = js.undefined
  
  /** [Method] Makes the given card active
    * @param newCard Ext.Component/Number/String The component, component id, itemId, or index of component.
    * @returns Ext.Component the activated component or false when nothing activated. False is returned also when trying to activate an already active card.
    */
  var setActiveItem: js.UndefOr[js.Function1[/* newCard */ js.UndefOr[Any], IComponent]] = js.undefined
}
object ICard {
  
  inline def apply(): ICard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICard]
  }
  
  extension [Self <: ICard](x: Self) {
    
    inline def setDeferredRender(value: Boolean): Self = StObject.set(x, "deferredRender", value.asInstanceOf[js.Any])
    
    inline def setDeferredRenderUndefined: Self = StObject.set(x, "deferredRender", js.undefined)
    
    inline def setGetActiveItem(value: () => IComponent): Self = StObject.set(x, "getActiveItem", js.Any.fromFunction0(value))
    
    inline def setGetActiveItemUndefined: Self = StObject.set(x, "getActiveItem", js.undefined)
    
    inline def setGetNext(value: () => IComponent): Self = StObject.set(x, "getNext", js.Any.fromFunction0(value))
    
    inline def setGetNextUndefined: Self = StObject.set(x, "getNext", js.undefined)
    
    inline def setGetPrev(value: () => IComponent): Self = StObject.set(x, "getPrev", js.Any.fromFunction0(value))
    
    inline def setGetPrevUndefined: Self = StObject.set(x, "getPrev", js.undefined)
    
    inline def setNext(value: () => IComponent): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    inline def setPrev(value: () => IComponent): Self = StObject.set(x, "prev", js.Any.fromFunction0(value))
    
    inline def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
    
    inline def setSetActiveItem(value: /* newCard */ js.UndefOr[Any] => IComponent): Self = StObject.set(x, "setActiveItem", js.Any.fromFunction1(value))
    
    inline def setSetActiveItemUndefined: Self = StObject.set(x, "setActiveItem", js.undefined)
  }
}
