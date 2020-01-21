package typings.firefoxWebextBrowser.browser.contextualIdentities

import typings.firefoxWebextBrowser.AnonColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.contextualIdentities.create")
@js.native
object create extends js.Object {
  /**
    * Creates a contextual identity with the given data.
    * @param details Details about the contextual identity being created.
    */
  def apply(details: AnonColor): js.Promise[ContextualIdentity] = js.native
}

