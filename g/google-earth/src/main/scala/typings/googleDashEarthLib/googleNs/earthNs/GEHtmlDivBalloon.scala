package typings
package googleDashEarthLib.googleNs.earthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.GEHtmlDivBalloon")
@js.native
class GEHtmlDivBalloon () extends GEHtmlBalloon {
  /**
       * An HTMLDivElement to be used as the contents of the balloon.
       * When the balloon is shown, the HTMLDivElement is attached to the balloon element in the web page.
       * You can manipulate this balloon using ordinary HTML DOM techniques.
       */
  def getContentDiv(): stdLib.HTMLDivElement = js.native
  /**
       * An HTMLDivElement to be used as the contents of the balloon.
       * When the balloon is shown, the HTMLDivElement is attached to the balloon element in the web page.
       * You can manipulate this balloon using ordinary HTML DOM techniques.
       */
  def setContentDiv(contentDiv: stdLib.HTMLElement): scala.Unit = js.native
}

