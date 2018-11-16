package typings
package firefoxDashWebextDashBrowserLib.browserNs.cookiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.cookies")
@js.native
object cookiesNsMembers extends js.Object {
  /* cookies events */
  /**
       * Fired when a cookie is set or removed. As a special case, note that updating a cookie's properties is
       * implemented as a two step process: the cookie to be updated is first removed entirely, generating a notification
       * with "cause" of "overwrite" . Afterwards, a new cookie is written with the updated values, generating a second
       * notification with "cause" "explicit".
       */
  val onChanged: firefoxDashWebextDashBrowserLib.WebExtEvent[
    js.Function1[/* changeInfo */ firefoxDashWebextDashBrowserLib.Anon_Cause, scala.Unit]
  ] = js.native
  /* cookies functions */
  /**
       * Retrieves information about a single cookie. If more than one cookie of the same name exists for the given URL,
       * the one with the longest path will be returned. For cookies with the same path length, the cookie with the
       * earliest creation time will be returned.
       * @param details Details to identify the cookie being retrieved.
       */
  def get(details: firefoxDashWebextDashBrowserLib.Anon_StoreId): stdLib.Promise[Cookie] = js.native
  /**
       * Retrieves all cookies from a single cookie store that match the given information. The cookies returned will be
       * sorted, with those with the longest path first. If multiple cookies have the same path length, those with the
       * earliest creation time will be first.
       * @param details Information to filter the cookies being retrieved.
       */
  def getAll(details: firefoxDashWebextDashBrowserLib.Anon_NamePath): stdLib.Promise[js.Array[Cookie]] = js.native
  /** Lists all existing cookie stores. */
  def getAllCookieStores(): stdLib.Promise[js.Array[CookieStore]] = js.native
  /**
       * Deletes a cookie by name.
       * @param details Information to identify the cookie to remove.
       */
  def remove(details: firefoxDashWebextDashBrowserLib.Anon_StoreId): stdLib.Promise[js.UndefOr[firefoxDashWebextDashBrowserLib.Anon_StoreIdFirstPartyDomain]] = js.native
  /**
       * Sets a cookie with the given cookie data; may overwrite equivalent cookies if they exist.
       * @param details Details about the cookie being set.
       */
  def set(details: firefoxDashWebextDashBrowserLib.Anon_NameExpirationDate): stdLib.Promise[js.UndefOr[Cookie]] = js.native
}

