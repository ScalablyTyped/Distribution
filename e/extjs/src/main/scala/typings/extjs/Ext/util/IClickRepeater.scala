package typings.extjs.Ext.util

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClickRepeater
  extends StObject
     with IObservable {
  
  /** [Config Option] (Boolean) */
  var accelerate: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Number) */
  var delay: js.UndefOr[Double] = js.undefined
  
  /** [Method] Disables the repeater and stops events from firing
    * @param force Object
    */
  var disable: js.UndefOr[js.Function1[/* force */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Config Option] (String/HTMLElement/Ext.Element) */
  var el: js.UndefOr[Any] = js.undefined
  
  /** [Method] Enables the repeater and allows events to fire  */
  var enable: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (Number) */
  var interval: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (String) */
  var pressedCls: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Boolean) */
  var preventDefault: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Convenience function for setting disabled enabled by boolean
    * @param disabled Boolean
    */
  var setDisabled: js.UndefOr[js.Function1[/* disabled */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var stopDefault: js.UndefOr[Boolean] = js.undefined
}
object IClickRepeater {
  
  inline def apply(): IClickRepeater = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClickRepeater]
  }
  
  extension [Self <: IClickRepeater](x: Self) {
    
    inline def setAccelerate(value: Boolean): Self = StObject.set(x, "accelerate", value.asInstanceOf[js.Any])
    
    inline def setAccelerateUndefined: Self = StObject.set(x, "accelerate", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDisable(value: /* force */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "disable", js.Any.fromFunction1(value))
    
    inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
    
    inline def setEl(value: Any): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
    
    inline def setElUndefined: Self = StObject.set(x, "el", js.undefined)
    
    inline def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
    
    inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setPressedCls(value: String): Self = StObject.set(x, "pressedCls", value.asInstanceOf[js.Any])
    
    inline def setPressedClsUndefined: Self = StObject.set(x, "pressedCls", js.undefined)
    
    inline def setPreventDefault(value: Boolean): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    inline def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
    
    inline def setSetDisabled(value: /* disabled */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setDisabled", js.Any.fromFunction1(value))
    
    inline def setSetDisabledUndefined: Self = StObject.set(x, "setDisabled", js.undefined)
    
    inline def setStopDefault(value: Boolean): Self = StObject.set(x, "stopDefault", value.asInstanceOf[js.Any])
    
    inline def setStopDefaultUndefined: Self = StObject.set(x, "stopDefault", js.undefined)
  }
}
