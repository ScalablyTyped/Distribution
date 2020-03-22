package typings.firefoxWebextBrowser.browser.history

import typings.firefoxWebextBrowser.AnonTransition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.history.addUrl")
@js.native
object addUrl extends js.Object {
  /**
    * Adds a URL to the history with a default visitTime of the current time and a default transition type of "link".
    */
  def apply(details: AnonTransition): js.Promise[Unit] = js.native
}

