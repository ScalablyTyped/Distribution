package typings.extjs.Ext.util

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClickRepeater extends IObservable {
  
  /** [Config Option] (Boolean) */
  var accelerate: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Number) */
  var delay: js.UndefOr[Double] = js.native
  
  /** [Method] Disables the repeater and stops events from firing
    * @param force Object
    */
  var disable: js.UndefOr[js.Function1[/* force */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (String/HTMLElement/Ext.Element) */
  var el: js.UndefOr[js.Any] = js.native
  
  /** [Method] Enables the repeater and allows events to fire  */
  var enable: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (Number) */
  var interval: js.UndefOr[Double] = js.native
  
  /** [Config Option] (String) */
  var pressedCls: js.UndefOr[String] = js.native
  
  /** [Config Option] (Boolean) */
  var preventDefault: js.UndefOr[Boolean] = js.native
  
  /** [Method] Convenience function for setting disabled enabled by boolean
    * @param disabled Boolean
    */
  var setDisabled: js.UndefOr[js.Function1[/* disabled */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var stopDefault: js.UndefOr[Boolean] = js.native
}
object IClickRepeater {
  
  @scala.inline
  def apply(): IClickRepeater = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClickRepeater]
  }
  
  @scala.inline
  implicit class IClickRepeaterMutableBuilder[Self <: IClickRepeater] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccelerate(value: Boolean): Self = StObject.set(x, "accelerate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccelerateUndefined: Self = StObject.set(x, "accelerate", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setDisable(value: /* force */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "disable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
    
    @scala.inline
    def setEl(value: js.Any): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElUndefined: Self = StObject.set(x, "el", js.undefined)
    
    @scala.inline
    def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    @scala.inline
    def setPressedCls(value: String): Self = StObject.set(x, "pressedCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPressedClsUndefined: Self = StObject.set(x, "pressedCls", js.undefined)
    
    @scala.inline
    def setPreventDefault(value: Boolean): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
    
    @scala.inline
    def setSetDisabled(value: /* disabled */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setDisabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDisabledUndefined: Self = StObject.set(x, "setDisabled", js.undefined)
    
    @scala.inline
    def setStopDefault(value: Boolean): Self = StObject.set(x, "stopDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopDefaultUndefined: Self = StObject.set(x, "stopDefault", js.undefined)
  }
}
