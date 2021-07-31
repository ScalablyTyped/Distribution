package typings.extjs.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IColorPalette
  extends StObject
     with IComponent {
  
  /** [Config Option] (Boolean) */
  var allowReselect: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Clears any selection and sets the value to null  */
  var clear: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var clickEvent: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Property] (String[]) */
  var colors: js.UndefOr[Array] = js.undefined
  
  /** [Method] Get the currently selected color value
    * @returns String value The selected value. Null if nothing is selected.
    */
  var getValue: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
  /** [Config Option] (Function) */
  var handler: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (String) */
  var itemCls: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Method] Template method called when this Component s DOM structure is created  */
  @JSName("onRender")
  var onRender_IColorPalette: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] Selects the specified color in the picker fires the select event
    * @param color String A valid 6-digit color hex code (# will be stripped if included)
    * @param suppressEvent Boolean True to stop the select event from firing.
    */
  var select: js.UndefOr[
    js.Function2[
      /* color */ js.UndefOr[java.lang.String], 
      /* suppressEvent */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.undefined
  
  /** [Config Option] (String) */
  var selectedCls: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Config Option] (String) */
  var value: js.UndefOr[java.lang.String] = js.undefined
}
object IColorPalette {
  
  @scala.inline
  def apply(): IColorPalette = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColorPalette]
  }
  
  @scala.inline
  implicit class IColorPaletteMutableBuilder[Self <: IColorPalette] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowReselect(value: Boolean): Self = StObject.set(x, "allowReselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowReselectUndefined: Self = StObject.set(x, "allowReselect", js.undefined)
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    
    @scala.inline
    def setClickEvent(value: java.lang.String): Self = StObject.set(x, "clickEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickEventUndefined: Self = StObject.set(x, "clickEvent", js.undefined)
    
    @scala.inline
    def setColors(value: Array): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    @scala.inline
    def setGetValue(value: () => java.lang.String): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
    
    @scala.inline
    def setHandler(value: js.Any): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
    
    @scala.inline
    def setItemCls(value: java.lang.String): Self = StObject.set(x, "itemCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemClsUndefined: Self = StObject.set(x, "itemCls", js.undefined)
    
    @scala.inline
    def setOnRender(value: () => Unit): Self = StObject.set(x, "onRender", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnRenderUndefined: Self = StObject.set(x, "onRender", js.undefined)
    
    @scala.inline
    def setScope(value: js.Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setSelect(value: (/* color */ js.UndefOr[java.lang.String], /* suppressEvent */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "select", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    @scala.inline
    def setSelectedCls(value: java.lang.String): Self = StObject.set(x, "selectedCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedClsUndefined: Self = StObject.set(x, "selectedCls", js.undefined)
    
    @scala.inline
    def setValue(value: java.lang.String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
