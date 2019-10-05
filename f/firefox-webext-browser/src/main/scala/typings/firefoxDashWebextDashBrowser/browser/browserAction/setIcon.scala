package typings.firefoxDashWebextDashBrowser.browser.browserAction

import typings.firefoxDashWebextDashBrowser.Anon_ImageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.browserAction.setIcon")
@js.native
object setIcon extends js.Object {
  /**
    * Sets the icon for the browser action. The icon can be specified either as the path to an image file or as the
    * pixel data from a canvas element, or as dictionary of either one of those. Either the **path** or the
    * **imageData** property must be specified.
    * @param details Specifies to which tab or window the value should be set, or from which one it should be
    *     retrieved. If no tab nor window is specified, the global value is set or retrieved.
    */
  def apply(details: Anon_ImageData): js.Promise[Unit] = js.native
}

