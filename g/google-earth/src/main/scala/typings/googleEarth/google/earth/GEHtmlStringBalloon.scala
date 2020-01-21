package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.GEHtmlStringBalloon")
@js.native
class GEHtmlStringBalloon () extends GEHtmlBalloon {
  /**
    * You can include any HTML using the contentString property.
    * When the balloon is visible, the content specified in contentString property,
    * is inserted directly into the balloon element in the web page.
    */
  def getContentString(): String = js.native
  /**
    * You can include any HTML using the contentString property.
    * When the balloon is visible, the content specified in contentString property,
    * is inserted directly into the balloon element in the web page.
    */
  def setContentString(contentString: String): Unit = js.native
}

