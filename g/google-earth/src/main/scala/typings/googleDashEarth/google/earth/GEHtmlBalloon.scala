package typings.googleDashEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.GEHtmlBalloon")
@js.native
class GEHtmlBalloon () extends GEAbstractBalloon {
  /**
    * The background color of the balloon.
    * This must be set using the HTML hex format #RRGGBB.
    * If not set, the default is interpreted as #FFFFFF.
    */
  def getBackgroundColor(): String = js.native
  /**
    * The color of the text in the balloon.
    * This must be set using the HTML hex format #RRGGBB.
    * If not set, it is interpreted as #000000.
    */
  def getForegroundColor(): String = js.native
  /**
    * The background color of the balloon.
    * This must be set using the HTML hex format #RRGGBB.
    * If not set, the default is interpreted as #FFFFFF.
    */
  def setBackgroundColor(backgroundColor: String): Unit = js.native
  /**
    * The color of the text in the balloon.
    * This must be set using the HTML hex format #RRGGBB.
    * If not set, it is interpreted as #000000.
    */
  def setForegroundColor(foregroundColor: String): Unit = js.native
}

