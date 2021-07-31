package typings.fabric.fabricImplMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// animation mixin
// ----------------------------------------------------
@js.native
trait ICanvasAnimation[T] extends StObject {
  
  var FX_DURATION: Double = js.native
  
  /**
    * Centers object horizontally with animation.
    * @param object Object to center
    */
  def fxCenterObjectH(`object`: Object): T = js.native
  def fxCenterObjectH(`object`: Object, callbacks: Callbacks): T = js.native
  
  /**
    * Centers object vertically with animation.
    * @param object Object to center
    */
  def fxCenterObjectV(`object`: Object): T = js.native
  def fxCenterObjectV(`object`: Object, callbacks: Callbacks): T = js.native
  
  /**
    * Same as `fabric.Canvas#remove` but animated
    * @param object Object to remove
    * @chainable
    */
  def fxRemove(`object`: Object): T = js.native
  
  /**
    * Same as {@link fabric.Canvas.prototype.straightenObject}, but animated
    * @param {fabric.Object} object Object to straighten
    * @return {fabric.Canvas} thisArg
    * @chainable
    */
  def fxStraightenObject(`object`: Object): T = js.native
}
