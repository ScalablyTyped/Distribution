package typings.googleEarth.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlLod
  extends StObject
     with KmlObject {
  
  /**
    * Distance over which the geometry fades, from fully transparent to fully opaque.
    * This ramp value, expressed in screen pixels, is applied at the maximum end of the LOD (visibility) limits.
    */
  def getMaxFadeExtent(): Double
  
  /**
    * Measurement in screen pixels that represents the maximum limit of the visibility range for a given Region.
    * A value of -1, the default, indicates "active to infinite size."
    */
  def getMaxLodPixels(): Double
  
  /**
    * Distance over which the geometry fades, from fully opaque to fully transparent.
    * This ramp value, expressed in screen pixels, is applied at the minimum end of the LOD (visibility) limits.
    */
  def getMinFadeExtent(): Double
  
  /**
    * Specifies measurement in screen pixels that represents the minimum limit of the visibility range for a given Region.
    * Google Earth calculates the size of the region when projected onto screen space.
    * Then it computes the square root of the region's area (if, for example, the Region is square and the viewpoint is directly above the Region, and the Region is not tilted, this measurement is equal to the width of the projected Region).
    * If this measurement falls within the limits defined by minLodPixels and maxLodPixels (and if the LatLonAltBox is in view), the region is active.
    * If this limit is not reached, the associated geometry is considered to be too far from the user's viewpoint to be drawn.
    */
  def getMinLodPixels(): Double
  
  /**
    * Sets the minLodPixels, maxLodPixels, minFadeExtent, and maxFadeExtent for the projected region on the screen.
    */
  def set(minLodPixels: Double, maxLodPixels: Double, minFadeExtent: Double, maxFadeExtent: Double): Unit
  
  /**
    * Distance over which the geometry fades, from fully transparent to fully opaque.
    * This ramp value, expressed in screen pixels, is applied at the maximum end of the LOD (visibility) limits.
    */
  def setMaxFadeExtent(maxFadeExtent: Double): Unit
  
  /**
    * Measurement in screen pixels that represents the maximum limit of the visibility range for a given Region.
    * A value of -1, the default, indicates "active to infinite size."
    */
  def setMaxLodPixels(maxLogPixels: Double): Unit
  
  /**
    * Distance over which the geometry fades, from fully opaque to fully transparent.
    * This ramp value, expressed in screen pixels, is applied at the minimum end of the LOD (visibility) limits.
    */
  def setMinFadeExtent(minFadeExtent: Double): Unit
  
  /**
    * Specifies measurement in screen pixels that represents the minimum limit of the visibility range for a given Region.
    * Google Earth calculates the size of the region when projected onto screen space.
    * Then it computes the square root of the region's area (if, for example, the Region is square and the viewpoint is directly above the Region, and the Region is not tilted, this measurement is equal to the width of the projected Region).
    * If this measurement falls within the limits defined by minLodPixels and maxLodPixels (and if the LatLonAltBox is in view), the region is active.
    * If this limit is not reached, the associated geometry is considered to be too far from the user's viewpoint to be drawn.
    */
  def setMinLodPixels(minLodPixels: Double): Unit
}
object KmlLod {
  
  @scala.inline
  def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    equals_ : KmlObject => Boolean,
    getId: () => String,
    getMaxFadeExtent: () => Double,
    getMaxLodPixels: () => Double,
    getMinFadeExtent: () => Double,
    getMinLodPixels: () => Double,
    getOwnerDocument: () => KmlDocument,
    getParentNode: () => KmlObject,
    getType: () => String,
    getUrl: () => String,
    mousedown: KmlMouseEvent => Unit,
    mousemove: KmlMouseEvent => Unit,
    mouseout: KmlMouseEvent => Unit,
    mouseover: KmlMouseEvent => Unit,
    mouseup: KmlMouseEvent => Unit,
    release: () => Unit,
    set: (Double, Double, Double, Double) => Unit,
    setMaxFadeExtent: Double => Unit,
    setMaxLodPixels: Double => Unit,
    setMinFadeExtent: Double => Unit,
    setMinLodPixels: Double => Unit
  ): KmlLod = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), getId = js.Any.fromFunction0(getId), getMaxFadeExtent = js.Any.fromFunction0(getMaxFadeExtent), getMaxLodPixels = js.Any.fromFunction0(getMaxLodPixels), getMinFadeExtent = js.Any.fromFunction0(getMinFadeExtent), getMinLodPixels = js.Any.fromFunction0(getMinLodPixels), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release), set = js.Any.fromFunction4(set), setMaxFadeExtent = js.Any.fromFunction1(setMaxFadeExtent), setMaxLodPixels = js.Any.fromFunction1(setMaxLodPixels), setMinFadeExtent = js.Any.fromFunction1(setMinFadeExtent), setMinLodPixels = js.Any.fromFunction1(setMinLodPixels))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlLod]
  }
  
  @scala.inline
  implicit class KmlLodMutableBuilder[Self <: KmlLod] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetMaxFadeExtent(value: () => Double): Self = StObject.set(x, "getMaxFadeExtent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMaxLodPixels(value: () => Double): Self = StObject.set(x, "getMaxLodPixels", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMinFadeExtent(value: () => Double): Self = StObject.set(x, "getMinFadeExtent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMinLodPixels(value: () => Double): Self = StObject.set(x, "getMinLodPixels", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet(value: (Double, Double, Double, Double) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSetMaxFadeExtent(value: Double => Unit): Self = StObject.set(x, "setMaxFadeExtent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMaxLodPixels(value: Double => Unit): Self = StObject.set(x, "setMaxLodPixels", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMinFadeExtent(value: Double => Unit): Self = StObject.set(x, "setMinFadeExtent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMinLodPixels(value: Double => Unit): Self = StObject.set(x, "setMinLodPixels", js.Any.fromFunction1(value))
  }
}
