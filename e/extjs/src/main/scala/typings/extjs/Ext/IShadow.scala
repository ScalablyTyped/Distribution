package typings.extjs.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IShadow extends IBase {
  
  /** [Method] Hides this shadow */
  var hide: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Returns true if the shadow is visible else false */
  var isVisible: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (String) */
  var mode: js.UndefOr[java.lang.String] = js.native
  
  /** [Config Option] (Number) */
  var offset: js.UndefOr[Double] = js.native
  
  /** [Method] Direct alignment when values are already available
    * @param left Number The target element left position
    * @param top Number The target element top position
    * @param width Number The target element width
    * @param height Number The target element height
    */
  var realign: js.UndefOr[
    js.Function4[
      /* left */ js.UndefOr[Double], 
      /* top */ js.UndefOr[Double], 
      /* width */ js.UndefOr[Double], 
      /* height */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  
  /** [Method] Sets the opacity of the shadow
    * @param opacity Number The opacity
    */
  var setOpacity: js.UndefOr[js.Function1[/* opacity */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Adjust the z index of this shadow
    * @param zindex Number The new z-index
    */
  var setZIndex: js.UndefOr[js.Function1[/* zindex */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Displays the shadow under the target element
    * @param targetEl String/HTMLElement/Ext.Element The id or element under which the shadow should display
    */
  var show: js.UndefOr[js.Function1[/* targetEl */ js.UndefOr[js.Any], Unit]] = js.native
}
object IShadow {
  
  @scala.inline
  def apply(): IShadow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IShadow]
  }
  
  @scala.inline
  implicit class IShadowMutableBuilder[Self <: IShadow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    @scala.inline
    def setIsVisible(value: () => Unit): Self = StObject.set(x, "isVisible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsVisibleUndefined: Self = StObject.set(x, "isVisible", js.undefined)
    
    @scala.inline
    def setMode(value: java.lang.String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setRealign(
      value: (/* left */ js.UndefOr[Double], /* top */ js.UndefOr[Double], /* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => Unit
    ): Self = StObject.set(x, "realign", js.Any.fromFunction4(value))
    
    @scala.inline
    def setRealignUndefined: Self = StObject.set(x, "realign", js.undefined)
    
    @scala.inline
    def setSetOpacity(value: /* opacity */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setOpacity", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOpacityUndefined: Self = StObject.set(x, "setOpacity", js.undefined)
    
    @scala.inline
    def setSetZIndex(value: /* zindex */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setZIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetZIndexUndefined: Self = StObject.set(x, "setZIndex", js.undefined)
    
    @scala.inline
    def setShow(value: /* targetEl */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
