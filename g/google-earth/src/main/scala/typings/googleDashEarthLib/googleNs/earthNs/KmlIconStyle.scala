package typings
package googleDashEarthLib.googleNs.earthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlIconStyle")
@js.native
class KmlIconStyle () extends KmlColorStyle {
  /**
       * The direction that icons are set to point, clockwise, and in degrees.
       */
  def getHeading(): scala.Double = js.native
  /**
       * Specifies the position within the Icon that is anchored to the point specified in the placemark.
       * The x and y values can be specified in three different ways: as pixels, as fractions of the icon, or as inset pixels, which is an offset in pixels from the upper right corner of the icon.
       * The x and y positions can be specified in different ways.
       * For example, x can be in pixels and y can be a fraction.
       * The origin of the coordinate system is in the lower left corner of the icon.
       */
  def getHotSpot(): KmlVec2 = js.native
  /**
       * A custom Icon. In KmlIconStyle, the only child element of KmlIcon is href and href is an HTTP address or a local file specification used to load an icon.
       */
  def getIcon(): KmlIcon = js.native
  /**
       * Resizes the icon.
       */
  def getScale(): scala.Double = js.native
  /**
       * The direction that icons are set to point, clockwise, and in degrees.
       */
  def setHeading(heading: scala.Double): scala.Unit = js.native
  /**
       * A custom Icon. In KmlIconStyle, the only child element of KmlIcon is href and href is an HTTP address or a local file specification used to load an icon.
       */
  def setIcon(icon: KmlIcon): scala.Unit = js.native
  /**
       * Resizes the icon.
       */
  def setScale(scale: scala.Double): scala.Unit = js.native
}

