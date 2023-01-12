package typings.extjs.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IQuickTip
  extends StObject
     with typings.extjs.Ext.tip.IToolTip {
  
  /** [Method] Hides a visible tip or cancels an impending show for a particular element
    * @param el String/HTMLElement/Ext.Element The element that is the target of the tip or ID of the element.
    */
  var cancelShow: js.UndefOr[js.Function1[/* el */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var interceptTitles: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Configures a new quick tip instance and assigns it to a target element
    * @param config Object The config object with the following properties:
    */
  var register: js.UndefOr[js.Function1[/* config */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Removes this quick tip from its element and destroys it
    * @param el String/HTMLElement/Ext.Element The element from which the quick tip is to be removed or ID of the element.
    */
  var unregister: js.UndefOr[js.Function1[/* el */ js.UndefOr[Any], Unit]] = js.undefined
}
object IQuickTip {
  
  inline def apply(): IQuickTip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IQuickTip]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IQuickTip] (val x: Self) extends AnyVal {
    
    inline def setCancelShow(value: /* el */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "cancelShow", js.Any.fromFunction1(value))
    
    inline def setCancelShowUndefined: Self = StObject.set(x, "cancelShow", js.undefined)
    
    inline def setInterceptTitles(value: Boolean): Self = StObject.set(x, "interceptTitles", value.asInstanceOf[js.Any])
    
    inline def setInterceptTitlesUndefined: Self = StObject.set(x, "interceptTitles", js.undefined)
    
    inline def setRegister(value: /* config */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "register", js.Any.fromFunction1(value))
    
    inline def setRegisterUndefined: Self = StObject.set(x, "register", js.undefined)
    
    inline def setUnregister(value: /* el */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "unregister", js.Any.fromFunction1(value))
    
    inline def setUnregisterUndefined: Self = StObject.set(x, "unregister", js.undefined)
  }
}
