package typings.googleDashEarth.googleNs.earthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlIcon")
@js.native
class KmlIcon () extends KmlLink {
  /**
    * Gets the height (<gx:h>), in pixels, of the icon.
    */
  def getH(): Double = js.native
  /**
    * Gets the width (<gx:w>), in pixels, of the icon.
    */
  def getW(): Double = js.native
  /**
    * Gets the offset from the left (<gx:x>), in pixels, of the icon.
    */
  def getX(): Double = js.native
  /**
    * Gets the offset from the bottom (<gx:y>), in pixels, of the icon.
    */
  def getY(): Double = js.native
  /**
    * Specifies the height (<gx:h>), in pixels, of the icon to use.
    */
  def setH(h: Double): Unit = js.native
  /**
    * Specifies the width (<gx:w>), in pixels, of the icon to use.
    */
  def setW(w: Double): Unit = js.native
  /**
    * Specifies the icon's offset (<gx:x>), in pixels from the left side of its icon palette, if a palette has been specified in the <href> element.
    */
  def setX(x: Double): Double = js.native
  /**
    * Specifies the offset (<gx:y>), in pixels from the bottom of its icon palette, if a palette has been specified in the <href> element.
    */
  def setY(y: Double): Unit = js.native
}

