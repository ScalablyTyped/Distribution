package typings.firefoxWebextBrowser.browser.tabs

import typings.firefoxWebextBrowser.AnonIndexWindowId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.tabs.move")
@js.native
object move extends js.Object {
  def apply(tabIds: js.Array[Double], moveProperties: AnonIndexWindowId): js.Promise[Tab | js.Array[Tab]] = js.native
  /**
    * Moves one or more tabs to a new position within its window, or to a new window. Note that tabs can only be moved
    * to and from normal (window.type === "normal") windows.
    * @param tabIds The tab or list of tabs to move.
    */
  def apply(tabIds: Double, moveProperties: AnonIndexWindowId): js.Promise[Tab | js.Array[Tab]] = js.native
}

