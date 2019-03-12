package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChangeInfoDetails extends js.Object {
  /* cookies events */
  /**
    * Fired when a cookie is set or removed. As a special case, note that updating a cookie's properties is
    * implemented as a two step process: the cookie to be updated is first removed entirely, generating a notification
    * with "cause" of "overwrite" . Afterwards, a new cookie is written with the updated values, generating a second
    * notification with "cause" "explicit".
    */
  val onChanged: WebExtEvent[js.Function1[/* changeInfo */ Anon_Cause, scala.Unit]]
  /* cookies functions */
  /**
    * Retrieves information about a single cookie. If more than one cookie of the same name exists for the given URL,
    * the one with the longest path will be returned. For cookies with the same path length, the cookie with the
    * earliest creation time will be returned.
    * @param details Details to identify the cookie being retrieved.
    */
  def get(details: Anon_FirstPartyDomain): js.Promise[firefoxDashWebextDashBrowserLib.browserNs.cookiesNs.Cookie]
  /**
    * Retrieves all cookies from a single cookie store that match the given information. The cookies returned will be
    * sorted, with those with the longest path first. If multiple cookies have the same path length, those with the
    * earliest creation time will be first.
    * @param details Information to filter the cookies being retrieved.
    */
  def getAll(details: Anon_Domain): js.Promise[js.Array[firefoxDashWebextDashBrowserLib.browserNs.cookiesNs.Cookie]]
  /** Lists all existing cookie stores. */
  def getAllCookieStores(): js.Promise[js.Array[firefoxDashWebextDashBrowserLib.browserNs.cookiesNs.CookieStore]]
  /**
    * Deletes a cookie by name.
    * @param details Information to identify the cookie to remove.
    */
  def remove(details: Anon_FirstPartyDomain): js.Promise[js.UndefOr[Anon_FirstPartyDomainName]]
  /**
    * Sets a cookie with the given cookie data; may overwrite equivalent cookies if they exist.
    * @param details Details about the cookie being set.
    */
  def set(details: Anon_DomainExpirationDate): js.Promise[js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.cookiesNs.Cookie]]
}

object Anon_ChangeInfoDetails {
  @scala.inline
  def apply(
    get: Anon_FirstPartyDomain => js.Promise[firefoxDashWebextDashBrowserLib.browserNs.cookiesNs.Cookie],
    getAll: Anon_Domain => js.Promise[js.Array[firefoxDashWebextDashBrowserLib.browserNs.cookiesNs.Cookie]],
    getAllCookieStores: () => js.Promise[js.Array[firefoxDashWebextDashBrowserLib.browserNs.cookiesNs.CookieStore]],
    onChanged: WebExtEvent[js.Function1[/* changeInfo */ Anon_Cause, scala.Unit]],
    remove: Anon_FirstPartyDomain => js.Promise[js.UndefOr[Anon_FirstPartyDomainName]],
    set: Anon_DomainExpirationDate => js.Promise[js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.cookiesNs.Cookie]]
  ): Anon_ChangeInfoDetails = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getAll = js.Any.fromFunction1(getAll), getAllCookieStores = js.Any.fromFunction0(getAllCookieStores), onChanged = onChanged, remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction1(set))
  
    __obj.asInstanceOf[Anon_ChangeInfoDetails]
  }
}

