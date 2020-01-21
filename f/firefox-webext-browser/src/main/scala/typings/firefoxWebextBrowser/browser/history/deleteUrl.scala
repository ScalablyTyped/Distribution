package typings.firefoxWebextBrowser.browser.history

import typings.firefoxWebextBrowser.AnonUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.history.deleteUrl")
@js.native
object deleteUrl extends js.Object {
  /** Removes all occurrences of the given URL from the history. */
  def apply(details: AnonUrl): js.Promise[Unit] = js.native
}

