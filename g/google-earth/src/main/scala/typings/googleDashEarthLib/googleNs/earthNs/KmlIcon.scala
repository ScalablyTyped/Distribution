package typings
package googleDashEarthLib.googleNs.earthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlIcon")
@js.native
class KmlIcon () extends KmlLink {
  /**
       * Gets the height (<gx:h>), in pixels, of the icon.
       */
  def getH(): scala.Double = js.native
  /**
       * Gets the width (<gx:w>), in pixels, of the icon.
       */
  def getW(): scala.Double = js.native
  /**
       * Gets the offset from the left (<gx:x>), in pixels, of the icon.
       */
  def getX(): scala.Double = js.native
  /**
       * Gets the offset from the bottom (<gx:y>), in pixels, of the icon.
       */
  def getY(): scala.Double = js.native
  /**
       * Specifies the height (<gx:h>), in pixels, of the icon to use.
       */
  def setH(h: scala.Double): scala.Unit = js.native
  /**
       * Specifies the width (<gx:w>), in pixels, of the icon to use.
       */
  def setW(w: scala.Double): scala.Unit = js.native
  /**
       * Specifies the icon's offset (<gx:x>), in pixels from the left side of its icon palette, if a palette has been specified in the <href> element.
       */
  def setX(x: scala.Double): scala.Double = js.native
  /**
       * Specifies the offset (<gx:y>), in pixels from the bottom of its icon palette, if a palette has been specified in the <href> element.
       */
  def setY(y: scala.Double): scala.Unit = js.native
}

