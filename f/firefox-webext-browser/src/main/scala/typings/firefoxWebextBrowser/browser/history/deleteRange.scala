package typings.firefoxWebextBrowser.browser.history

import typings.firefoxWebextBrowser.AnonEndTimeStartTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.history.deleteRange")
@js.native
object deleteRange extends js.Object {
  /**
    * Removes all items within the specified date range from the history. Pages will not be removed from the history
    * unless all visits fall within the range.
    */
  def apply(range: AnonEndTimeStartTime): js.Promise[Unit] = js.native
}

