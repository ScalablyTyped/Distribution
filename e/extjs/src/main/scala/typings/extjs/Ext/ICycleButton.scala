package typings.extjs.Ext

import typings.extjs.Ext.button.ISplit
import typings.extjs.Ext.menu.ICheckItem
import typings.extjs.Ext.menu.IMenu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICycleButton extends ISplit {
  
  /** [Config Option] (Function) */
  var changeHandler: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Number/String) */
  var forceGlyph: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var forceIcon: js.UndefOr[java.lang.String] = js.native
  
  /** [Method] Gets the currently active menu item
    * @returns Ext.menu.CheckItem The active item
    */
  var getActiveItem: js.UndefOr[js.Function0[ICheckItem]] = js.native
  
  /** [Config Option] (Object[]) */
  var items: js.UndefOr[Array] = js.native
  
  /** [Property] (Ext.menu.Menu) */
  @JSName("menu")
  var menu_ICycleButton: js.UndefOr[IMenu] = js.native
  
  /** [Config Option] (String) */
  var prependText: js.UndefOr[java.lang.String] = js.native
  
  /** [Method] Sets the button s active menu item
    * @param item Ext.menu.CheckItem The item to activate
    * @param suppressEvent Boolean True to prevent the button's change event from firing.
    */
  var setActiveItem: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[ICheckItem], /* suppressEvent */ js.UndefOr[Boolean], Unit]
  ] = js.native
  
  /** [Config Option] (Boolean) */
  var showText: js.UndefOr[Boolean] = js.native
  
  /** [Method] This is normally called internally on button click but can be called externally to advance the button s active item */
  var toggleSelected: js.UndefOr[js.Function0[Unit]] = js.native
}
object ICycleButton {
  
  @scala.inline
  def apply(): ICycleButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICycleButton]
  }
  
  @scala.inline
  implicit class ICycleButtonMutableBuilder[Self <: ICycleButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeHandler(value: js.Any): Self = StObject.set(x, "changeHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeHandlerUndefined: Self = StObject.set(x, "changeHandler", js.undefined)
    
    @scala.inline
    def setForceGlyph(value: js.Any): Self = StObject.set(x, "forceGlyph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceGlyphUndefined: Self = StObject.set(x, "forceGlyph", js.undefined)
    
    @scala.inline
    def setForceIcon(value: java.lang.String): Self = StObject.set(x, "forceIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceIconUndefined: Self = StObject.set(x, "forceIcon", js.undefined)
    
    @scala.inline
    def setGetActiveItem(value: () => ICheckItem): Self = StObject.set(x, "getActiveItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetActiveItemUndefined: Self = StObject.set(x, "getActiveItem", js.undefined)
    
    @scala.inline
    def setItems(value: Array): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setMenu(value: IMenu): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
    
    @scala.inline
    def setPrependText(value: java.lang.String): Self = StObject.set(x, "prependText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrependTextUndefined: Self = StObject.set(x, "prependText", js.undefined)
    
    @scala.inline
    def setSetActiveItem(value: (/* item */ js.UndefOr[ICheckItem], /* suppressEvent */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "setActiveItem", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetActiveItemUndefined: Self = StObject.set(x, "setActiveItem", js.undefined)
    
    @scala.inline
    def setShowText(value: Boolean): Self = StObject.set(x, "showText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTextUndefined: Self = StObject.set(x, "showText", js.undefined)
    
    @scala.inline
    def setToggleSelected(value: () => Unit): Self = StObject.set(x, "toggleSelected", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToggleSelectedUndefined: Self = StObject.set(x, "toggleSelected", js.undefined)
  }
}
