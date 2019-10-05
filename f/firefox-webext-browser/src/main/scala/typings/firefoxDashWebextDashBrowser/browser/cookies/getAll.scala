package typings.firefoxDashWebextDashBrowser.browser.cookies

import typings.firefoxDashWebextDashBrowser.Anon_Domain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.cookies.getAll")
@js.native
object getAll extends js.Object {
  /**
    * Retrieves all cookies from a single cookie store that match the given information. The cookies returned will be
    * sorted, with those with the longest path first. If multiple cookies have the same path length, those with the
    * earliest creation time will be first.
    * @param details Information to filter the cookies being retrieved.
    */
  def apply(details: Anon_Domain): js.Promise[js.Array[Cookie]] = js.native
}

