package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.browser.cookies.Cookie
import typings.firefoxWebextBrowser.browser.cookies.CookieStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofcookies extends js.Object {
  /* cookies events */
  /**
    * Fired when a cookie is set or removed. As a special case, note that updating a cookie's properties is
    * implemented as a two step process: the cookie to be updated is first removed entirely, generating a notification
    * with "cause" of "overwrite" . Afterwards, a new cookie is written with the updated values, generating a second
    * notification with "cause" "explicit".
    */
  val onChanged: WebExtEvent[js.Function1[/* changeInfo */ Cause, Unit]] = js.native
  /* cookies functions */
  /**
    * Retrieves information about a single cookie. If more than one cookie of the same name exists for the given URL,
    * the one with the longest path will be returned. For cookies with the same path length, the cookie with the
    * earliest creation time will be returned.
    * @param details Details to identify the cookie being retrieved.
    */
  def get(details: FirstPartyDomain): js.Promise[Cookie] = js.native
  /**
    * Retrieves all cookies from a single cookie store that match the given information. The cookies returned will be
    * sorted, with those with the longest path first. If multiple cookies have the same path length, those with the
    * earliest creation time will be first.
    * @param details Information to filter the cookies being retrieved.
    */
  def getAll(details: Domain): js.Promise[js.Array[Cookie]] = js.native
  /** Lists all existing cookie stores. */
  def getAllCookieStores(): js.Promise[js.Array[CookieStore]] = js.native
  /**
    * Deletes a cookie by name.
    * @param details Information to identify the cookie to remove.
    */
  def remove(details: FirstPartyDomain): js.Promise[StoreId] = js.native
  /**
    * Sets a cookie with the given cookie data; may overwrite equivalent cookies if they exist.
    * @param details Details about the cookie being set.
    */
  def set(details: ExpirationDate): js.Promise[Cookie] = js.native
}

object Typeofcookies {
  @scala.inline
  def apply(
    get: FirstPartyDomain => js.Promise[Cookie],
    getAll: Domain => js.Promise[js.Array[Cookie]],
    getAllCookieStores: () => js.Promise[js.Array[CookieStore]],
    onChanged: WebExtEvent[js.Function1[/* changeInfo */ Cause, Unit]],
    remove: FirstPartyDomain => js.Promise[StoreId],
    set: ExpirationDate => js.Promise[Cookie]
  ): Typeofcookies = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getAll = js.Any.fromFunction1(getAll), getAllCookieStores = js.Any.fromFunction0(getAllCookieStores), onChanged = onChanged.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[Typeofcookies]
  }
  @scala.inline
  implicit class TypeofcookiesOps[Self <: Typeofcookies] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGet(value: FirstPartyDomain => js.Promise[Cookie]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setGetAll(value: Domain => js.Promise[js.Array[Cookie]]): Self = this.set("getAll", js.Any.fromFunction1(value))
    @scala.inline
    def setGetAllCookieStores(value: () => js.Promise[js.Array[CookieStore]]): Self = this.set("getAllCookieStores", js.Any.fromFunction0(value))
    @scala.inline
    def setOnChanged(value: WebExtEvent[js.Function1[/* changeInfo */ Cause, Unit]]): Self = this.set("onChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemove(value: FirstPartyDomain => js.Promise[StoreId]): Self = this.set("remove", js.Any.fromFunction1(value))
    @scala.inline
    def setSet(value: ExpirationDate => js.Promise[Cookie]): Self = this.set("set", js.Any.fromFunction1(value))
  }
  
}

