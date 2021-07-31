package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.browser.cookies.Cookie
import typings.firefoxWebextBrowser.browser.cookies.CookieStore
import typings.firefoxWebextBrowser.browser.cookies.GetAllDetails
import typings.firefoxWebextBrowser.browser.cookies.GetDetails
import typings.firefoxWebextBrowser.browser.cookies.OnChangedChangeInfo
import typings.firefoxWebextBrowser.browser.cookies.RemoveDetails
import typings.firefoxWebextBrowser.browser.cookies.RemoveReturnDetails
import typings.firefoxWebextBrowser.browser.cookies.SetDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the `browser.cookies` API to query and modify cookies, and to be notified when they change.
  *
  * Permissions: `cookies`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object cookies {
  
  @JSGlobal("browser.cookies")
  @js.native
  val ^ : js.Any = js.native
  
  /* cookies functions */
  /**
    * Retrieves information about a single cookie. If more than one cookie of the same name exists for the given URL, the one with the longest path will be returned. For cookies with the same path length, the cookie with the earliest creation time will be returned.
    * @param details Details to identify the cookie being retrieved.
    */
  @scala.inline
  def get(details: GetDetails): js.Promise[Cookie | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Cookie | Null]]
  
  /**
    * Retrieves all cookies from a single cookie store that match the given information. The cookies returned will be sorted, with those with the longest path first. If multiple cookies have the same path length, those with the earliest creation time will be first.
    * @param details Information to filter the cookies being retrieved.
    */
  @scala.inline
  def getAll(details: GetAllDetails): js.Promise[js.Array[Cookie]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAll")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Cookie]]]
  
  /** Lists all existing cookie stores. */
  @scala.inline
  def getAllCookieStores(): js.Promise[js.Array[CookieStore]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllCookieStores")().asInstanceOf[js.Promise[js.Array[CookieStore]]]
  
  /* cookies events */
  /**
    * Fired when a cookie is set or removed. As a special case, note that updating a cookie's properties is implemented as a two step process: the cookie to be updated is first removed entirely, generating a notification with "cause" of "overwrite" . Afterwards, a new cookie is written with the updated values, generating a second notification with "cause" "explicit".
    */
  @JSGlobal("browser.cookies.onChanged")
  @js.native
  val onChanged: WebExtEvent[js.Function1[/* changeInfo */ OnChangedChangeInfo, Unit]] = js.native
  
  /**
    * Deletes a cookie by name.
    * @param details Information to identify the cookie to remove.
    */
  @scala.inline
  def remove(details: RemoveDetails): js.Promise[RemoveReturnDetails | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RemoveReturnDetails | Null]]
  
  /**
    * Sets a cookie with the given cookie data; may overwrite equivalent cookies if they exist.
    * @param details Details about the cookie being set.
    */
  @scala.inline
  def set(details: SetDetails): js.Promise[Cookie] = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Cookie]]
}
