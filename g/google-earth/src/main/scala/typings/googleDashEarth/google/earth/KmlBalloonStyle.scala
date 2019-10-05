package typings.googleDashEarth.google.earth

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
  def getText(): String = js.native
  /**
    * Foreground color for text. The default is black (ff000000).
    */
  def getTextColor(): KmlColor = js.native
  /**
    * The text contained in the balloon. 
    */
  def setText(text: String): Unit = js.native
}

