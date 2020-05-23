package typings.googleEarth.global.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlLod")
@js.native
class KmlLod ()
  extends typings.googleEarth.google.earth.KmlLod {
  /**
    * Triggers an event when the user clicks a location in Google Earth with the mouse.
    */
  /* CompleteClass */
  override def click(event: typings.googleEarth.google.earth.KmlMouseEvent): Unit = js.native
  /**
    * Triggers an event when the user double clicks a location in Google Earth with the mouse.
    */
  /* CompleteClass */
  override def dblclick(event: typings.googleEarth.google.earth.KmlMouseEvent): Unit = js.native
  /**
    * Test whether this object is the same as another object.
    * Useful for Chrome and Safari, where the comparison a==b sometimes fails for plugin objects.
    */
  /* CompleteClass */
  override def equals(compareTo: typings.googleEarth.google.earth.KmlObject): Boolean = js.native
  /**
    * The unique ID of the KML object.
    */
  /* CompleteClass */
  override def getId(): String = js.native
  /**
    * Distance over which the geometry fades, from fully transparent to fully opaque.
    * This ramp value, expressed in screen pixels, is applied at the maximum end of the LOD (visibility) limits.
    */
  /* CompleteClass */
  override def getMaxFadeExtent(): Double = js.native
  /**
    * Measurement in screen pixels that represents the maximum limit of the visibility range for a given Region.
    * A value of -1, the default, indicates "active to infinite size."
    */
  /* CompleteClass */
  override def getMaxLodPixels(): Double = js.native
  /**
    * Distance over which the geometry fades, from fully opaque to fully transparent.
    * This ramp value, expressed in screen pixels, is applied at the minimum end of the LOD (visibility) limits.
    */
  /* CompleteClass */
  override def getMinFadeExtent(): Double = js.native
  /**
    * Specifies measurement in screen pixels that represents the minimum limit of the visibility range for a given Region.
    * Google Earth calculates the size of the region when projected onto screen space.
    * Then it computes the square root of the region's area (if, for example, the Region is square and the viewpoint is directly above the Region, and the Region is not tilted, this measurement is equal to the width of the projected Region).
    * If this measurement falls within the limits defined by minLodPixels and maxLodPixels (and if the LatLonAltBox is in view), the region is active.
    * If this limit is not reached, the associated geometry is considered to be too far from the user's viewpoint to be drawn.
    */
  /* CompleteClass */
  override def getMinLodPixels(): Double = js.native
  /**
    * The document that owns the KML object.
    */
  /* CompleteClass */
  override def getOwnerDocument(): typings.googleEarth.google.earth.KmlDocument = js.native
  /**
    * The parent node of the KML object.
    */
  /* CompleteClass */
  override def getParentNode(): typings.googleEarth.google.earth.KmlObject = js.native
  /**
    * The interface name (i.e. 'KmlPlacemark') of the object.
    */
  /* CompleteClass */
  override def getType(): String = js.native
  /**
    * The unique URL of the KML object.
    * This is the base address joined with the ID using the # character.
    *
    * For example: http://www.google.com/bar.kml#atlantis
    */
  /* CompleteClass */
  override def getUrl(): String = js.native
  /**
    * Triggers an event when the user presses the mouse button over a location in Google Earth.
    */
  /* CompleteClass */
  override def mousedown(event: typings.googleEarth.google.earth.KmlMouseEvent): Unit = js.native
  /**
    * Triggers an event when the user moves the mouse inside Google Earth.
    */
  /* CompleteClass */
  override def mousemove(event: typings.googleEarth.google.earth.KmlMouseEvent): Unit = js.native
  /**
    * Triggers an event when the user moves the mouse off of the object in Google Earth.
    */
  /* CompleteClass */
  override def mouseout(event: typings.googleEarth.google.earth.KmlMouseEvent): Unit = js.native
  /**
    * Triggers an event when the user moves the mouse pointer over a location in Google Earth.
    */
  /* CompleteClass */
  override def mouseover(event: typings.googleEarth.google.earth.KmlMouseEvent): Unit = js.native
  /**
    * Triggers an event when the user releases the mouse button over a location in Google Earth.
    */
  /* CompleteClass */
  override def mouseup(event: typings.googleEarth.google.earth.KmlMouseEvent): Unit = js.native
  /**
    * Permanently deletes an object, allowing its ID to be reused.
    * Attempting to access the object once it is released will result in an error.
    */
  /* CompleteClass */
  override def release(): Unit = js.native
  /**
    * Sets the minLodPixels, maxLodPixels, minFadeExtent, and maxFadeExtent for the projected region on the screen.
    */
  /* CompleteClass */
  override def set(minLodPixels: Double, maxLodPixels: Double, minFadeExtent: Double, maxFadeExtent: Double): Unit = js.native
  /**
    * Distance over which the geometry fades, from fully transparent to fully opaque.
    * This ramp value, expressed in screen pixels, is applied at the maximum end of the LOD (visibility) limits.
    */
  /* CompleteClass */
  override def setMaxFadeExtent(maxFadeExtent: Double): Unit = js.native
  /**
    * Measurement in screen pixels that represents the maximum limit of the visibility range for a given Region.
    * A value of -1, the default, indicates "active to infinite size."
    */
  /* CompleteClass */
  override def setMaxLodPixels(maxLogPixels: Double): Unit = js.native
  /**
    * Distance over which the geometry fades, from fully opaque to fully transparent.
    * This ramp value, expressed in screen pixels, is applied at the minimum end of the LOD (visibility) limits.
    */
  /* CompleteClass */
  override def setMinFadeExtent(minFadeExtent: Double): Unit = js.native
  /**
    * Specifies measurement in screen pixels that represents the minimum limit of the visibility range for a given Region.
    * Google Earth calculates the size of the region when projected onto screen space.
    * Then it computes the square root of the region's area (if, for example, the Region is square and the viewpoint is directly above the Region, and the Region is not tilted, this measurement is equal to the width of the projected Region).
    * If this measurement falls within the limits defined by minLodPixels and maxLodPixels (and if the LatLonAltBox is in view), the region is active.
    * If this limit is not reached, the associated geometry is considered to be too far from the user's viewpoint to be drawn.
    */
  /* CompleteClass */
  override def setMinLodPixels(minLodPixels: Double): Unit = js.native
}

