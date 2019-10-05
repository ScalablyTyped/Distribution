package typings.firefoxDashWebextDashBrowser.browser.browsingData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.browsingData.remove")
@js.native
object remove extends js.Object {
  /**
    * Clears various types of browsing data stored in a user's profile.
    * @param dataToRemove The set of data types to remove.
    */
  def apply(options: RemovalOptions, dataToRemove: DataTypeSet): js.Promise[Unit] = js.native
}

