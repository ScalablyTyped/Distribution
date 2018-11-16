package typings
package googleDashEarthLib.googleNs.earthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlBalloonStyle")
@js.native
class KmlBalloonStyle () extends KmlObject {
  /**
       * Background color of the balloon (optional).
       */
  def getBgColor(): KmlColor = js.native
  /**
       * The text contained in the balloon. 
       */
  def getText(): java.lang.String = js.native
  /**
       * Foreground color for text. The default is black (ff000000).
       */
  def getTextColor(): KmlColor = js.native
  /**
       * The text contained in the balloon. 
       */
  def setText(text: java.lang.String): scala.Unit = js.native
}

