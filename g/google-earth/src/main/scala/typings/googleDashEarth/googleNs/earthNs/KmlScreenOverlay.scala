package typings.googleDashEarth.googleNs.earthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlScreenOverlay")
@js.native
class KmlScreenOverlay () extends KmlOverlay {
  /**
    * Specifies a point relative to the screen origin that the overlay image is mapped to.
    * The x and y values can be specified in three different ways: as pixels ("pixels"), as fractions of the screen ("fraction"), or as inset pixels ("insetPixels"), which is an offset in pixels from the upper right corner of the screen.
    * The x and y positions can be specified in different ways - for example, x can be in pixels and y can be a fraction.
    * The origin of the coordinate system is in the lower left corner of the screen.
    *
    * Note: 
    *
    *  screenXY and overlayXY behave opposite to their corresponding behaviors in KML.
    *  This is due to a bug in the Earth API that will intentionally remain unfixed until a major version change.
    */
  def getOverlayXY(): KmlVec2 = js.native
  /**
    * Adjusts how the image is placed inside the field of view.
    * This element is useful if your image has been rotated and deviates slightly from a desired horizontal view.
    */
  def getRotation(): Double = js.native
  /**
    * Point relative to the screen about which the screen overlay is rotated.
    */
  def getRotationXY(): KmlVec2 = js.native
  /**
    * Specifies a point on (or outside of) the overlay image that is mapped to the screen coordinate.
    * It requires x and y values, and the units for those values.
    *
    * Note: 
    *
    *  screenXY and overlayXY behave opposite to their corresponding behaviors in KML.
    *  This is due to a bug in the Earth API that will intentionally remain unfixed until a major version change.
    */
  def getScreenXY(): KmlVec2 = js.native
  /**
    * Specifies the size of the image for the screen overlay, as follows:
    *
    * * A value of -1 indicates to use the native dimension
    * * A value of 0 indicates to maintain the aspect ratio
    * * A value of n sets the value of the dimension
    */
  def getSize(): KmlVec2 = js.native
  /**
    * Adjusts how the image is placed inside the field of view.
    * This element is useful if your image has been rotated and deviates slightly from a desired horizontal view.
    */
  def setRotation(rotation: Double): Unit = js.native
}

