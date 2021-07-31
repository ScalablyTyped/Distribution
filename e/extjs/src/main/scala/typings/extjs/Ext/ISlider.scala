package typings.extjs.Ext

import typings.extjs.Ext.slider.IMulti
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISlider
  extends StObject
     with IMulti {
  
  /** [Method] Returns the current value of the slider
    * @returns any The current value of the slider
    */
  @JSName("getValue")
  var getValue_ISlider: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Programmatically sets the value of the Slider
    * @param value Number The value to set the slider to. (This will be constrained within minValue and maxValue)
    * @param animate Boolean Turn on or off animation
    */
  @JSName("setValue")
  var setValue_ISlider: js.UndefOr[
    js.Function2[/* value */ js.UndefOr[Double], /* animate */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
}
object ISlider {
  
  @scala.inline
  def apply(): ISlider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISlider]
  }
  
  @scala.inline
  implicit class ISliderMutableBuilder[Self <: ISlider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetValue(value: () => js.Any): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
    
    @scala.inline
    def setSetValue(value: (/* value */ js.UndefOr[Double], /* animate */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
  }
}
