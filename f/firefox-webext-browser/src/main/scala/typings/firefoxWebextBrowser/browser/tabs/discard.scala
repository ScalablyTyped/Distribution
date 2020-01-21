package typings.firefoxWebextBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.tabs.discard")
@js.native
object discard extends js.Object {
  def apply(tabIds: js.Array[Double]): js.Promise[Unit] = js.native
  /**
    * discards one or more tabs.
    * @param tabIds The tab or list of tabs to discard.
    */
  def apply(tabIds: Double): js.Promise[Unit] = js.native
}

