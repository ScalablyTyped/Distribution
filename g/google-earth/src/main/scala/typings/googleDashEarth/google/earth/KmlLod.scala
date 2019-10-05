package typings.googleDashEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlLod")
@js.native
class KmlLod () extends KmlObject {
  /**
    * Distance over which the geometry fades, from fully transparent to fully opaque.
    * This ramp value, expressed in screen pixels, is applied at the maximum end of the LOD (visibility) limits.
    */
  def getMaxFadeExtent(): Double = js.native
  /**
    * Measurement in screen pixels that represents the maximum limit of the visibility range for a given Region.
    * A value of -1, the default, indicates "active to infinite size."
    */
  def getMaxLodPixels(): Double = js.native
  /**
    * Distance over which the geometry fades, from fully opaque to fully transparent.
    * This ramp value, expressed in screen pixels, is applied at the minimum end of the LOD (visibility) limits.
    */
  def getMinFadeExtent(): Double = js.native
  /**
    * Specifies measurement in screen pixels that represents the minimum limit of the visibility range for a given Region.
    * Google Earth calculates the size of the region when projected onto screen space.
    * Then it computes the square root of the region's area (if, for example, the Region is square and the viewpoint is directly above the Region, and the Region is not tilted, this measurement is equal to the width of the projected Region).
    * If this measurement falls within the limits defined by minLodPixels and maxLodPixels (and if the LatLonAltBox is in view), the region is active.
    * If this limit is not reached, the associated geometry is considered to be too far from the user's viewpoint to be drawn.
    */
  def getMinLodPixels(): Double = js.native
  /**
    * Sets the minLodPixels, maxLodPixels, minFadeExtent, and maxFadeExtent for the projected region on the screen.
    */
  def set(minLodPixels: Double, maxLodPixels: Double, minFadeExtent: Double, maxFadeExtent: Double): Unit = js.native
  /**
    * Distance over which the geometry fades, from fully transparent to fully opaque.
    * This ramp value, expressed in screen pixels, is applied at the maximum end of the LOD (visibility) limits.
    */
  def setMaxFadeExtent(maxFadeExtent: Double): Unit = js.native
  /**
    * Measurement in screen pixels that represents the maximum limit of the visibility range for a given Region.
    * A value of -1, the default, indicates "active to infinite size."
    */
  def setMaxLodPixels(maxLogPixels: Double): Unit = js.native
  /**
    * Distance over which the geometry fades, from fully opaque to fully transparent.
    * This ramp value, expressed in screen pixels, is applied at the minimum end of the LOD (visibility) limits.
    */
  def setMinFadeExtent(minFadeExtent: Double): Unit = js.native
  /**
    * Specifies measurement in screen pixels that represents the minimum limit of the visibility range for a given Region.
    * Google Earth calculates the size of the region when projected onto screen space.
    * Then it computes the square root of the region's area (if, for example, the Region is square and the viewpoint is directly above the Region, and the Region is not tilted, this measurement is equal to the width of the projected Region).
    * If this measurement falls within the limits defined by minLodPixels and maxLodPixels (and if the LatLonAltBox is in view), the region is active.
    * If this limit is not reached, the associated geometry is considered to be too far from the user's viewpoint to be drawn.
    */
  def setMinLodPixels(minLodPixels: Double): Unit = js.native
}

