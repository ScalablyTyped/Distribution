package typings.extjs.Ext.layout.container

import typings.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICard extends IFit {
  
  /** [Config Option] (Boolean) */
  var deferredRender: js.UndefOr[Boolean] = js.native
  
  /** [Method] Return the active visible component in the layout
    * @returns Ext.Component
    */
  var getActiveItem: js.UndefOr[js.Function0[IComponent]] = js.native
  
  /** [Method] Return the active visible component in the layout to the next card
    * @returns Ext.Component The next component or false.
    */
  var getNext: js.UndefOr[js.Function0[IComponent]] = js.native
  
  /** [Method] Return the active visible component in the layout to the previous card
    * @returns Ext.Component The previous component or false.
    */
  var getPrev: js.UndefOr[js.Function0[IComponent]] = js.native
  
  /** [Method] Sets the active visible component in the layout to the next card
    * @returns Ext.Component the activated component or false when nothing activated.
    */
  var next: js.UndefOr[js.Function0[IComponent]] = js.native
  
  /** [Method] Sets the active visible component in the layout to the previous card
    * @returns Ext.Component the activated component or false when nothing activated.
    */
  var prev: js.UndefOr[js.Function0[IComponent]] = js.native
  
  /** [Method] Makes the given card active
    * @param newCard Ext.Component/Number/String The component, component id, itemId, or index of component.
    * @returns Ext.Component the activated component or false when nothing activated. False is returned also when trying to activate an already active card.
    */
  var setActiveItem: js.UndefOr[js.Function1[/* newCard */ js.UndefOr[js.Any], IComponent]] = js.native
}
object ICard {
  
  @scala.inline
  def apply(): ICard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICard]
  }
  
  @scala.inline
  implicit class ICardOps[Self <: ICard] (val x: Self) extends AnyVal {
    
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
    def setDeferredRender(value: Boolean): Self = this.set("deferredRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeferredRender: Self = this.set("deferredRender", js.undefined)
    
    @scala.inline
    def setGetActiveItem(value: () => IComponent): Self = this.set("getActiveItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetActiveItem: Self = this.set("getActiveItem", js.undefined)
    
    @scala.inline
    def setGetNext(value: () => IComponent): Self = this.set("getNext", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetNext: Self = this.set("getNext", js.undefined)
    
    @scala.inline
    def setGetPrev(value: () => IComponent): Self = this.set("getPrev", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetPrev: Self = this.set("getPrev", js.undefined)
    
    @scala.inline
    def setNext(value: () => IComponent): Self = this.set("next", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
    
    @scala.inline
    def setPrev(value: () => IComponent): Self = this.set("prev", js.Any.fromFunction0(value))
    
    @scala.inline
    def deletePrev: Self = this.set("prev", js.undefined)
    
    @scala.inline
    def setSetActiveItem(value: /* newCard */ js.UndefOr[js.Any] => IComponent): Self = this.set("setActiveItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetActiveItem: Self = this.set("setActiveItem", js.undefined)
  }
}
