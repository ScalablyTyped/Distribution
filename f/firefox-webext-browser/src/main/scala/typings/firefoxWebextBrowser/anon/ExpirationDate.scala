package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.cookies.SameSiteStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpirationDate extends js.Object {
  /** The domain of the cookie. If omitted, the cookie becomes a host-only cookie. */
  var domain: js.UndefOr[String] = js.native
  /**
    * The expiration date of the cookie as the number of seconds since the UNIX epoch. If omitted, the cookie
    * becomes a session cookie.
    */
  var expirationDate: js.UndefOr[Double] = js.native
  /**
    * The first-party domain of the cookie. This attribute is required if First-Party Isolation is enabled.
    */
  var firstPartyDomain: js.UndefOr[String] = js.native
  /** Whether the cookie should be marked as HttpOnly. Defaults to false. */
  var httpOnly: js.UndefOr[Boolean] = js.native
  /** The name of the cookie. Empty by default if omitted. */
  var name: js.UndefOr[String] = js.native
  /** The path of the cookie. Defaults to the path portion of the url parameter. */
  var path: js.UndefOr[String] = js.native
  /** The cookie's same-site status. */
  var sameSite: js.UndefOr[SameSiteStatus] = js.native
  /** Whether the cookie should be marked as Secure. Defaults to false. */
  var secure: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the cookie store in which to set the cookie. By default, the cookie is set in the current
    * execution context's cookie store.
    */
  var storeId: js.UndefOr[String] = js.native
  /**
    * The request-URI to associate with the setting of the cookie. This value can affect the default domain and
    * path values of the created cookie. If host permissions for this URL are not specified in the manifest file,
    * the API call will fail.
    */
  var url: String = js.native
  /** The value of the cookie. Empty by default if omitted. */
  var value: js.UndefOr[String] = js.native
}

object ExpirationDate {
  @scala.inline
  def apply(url: String): ExpirationDate = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpirationDate]
  }
  @scala.inline
  implicit class ExpirationDateOps[Self <: ExpirationDate] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    @scala.inline
    def setExpirationDate(value: Double): Self = this.set("expirationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpirationDate: Self = this.set("expirationDate", js.undefined)
    @scala.inline
    def setFirstPartyDomain(value: String): Self = this.set("firstPartyDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstPartyDomain: Self = this.set("firstPartyDomain", js.undefined)
    @scala.inline
    def setHttpOnly(value: Boolean): Self = this.set("httpOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpOnly: Self = this.set("httpOnly", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setSameSite(value: SameSiteStatus): Self = this.set("sameSite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSameSite: Self = this.set("sameSite", js.undefined)
    @scala.inline
    def setSecure(value: Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecure: Self = this.set("secure", js.undefined)
    @scala.inline
    def setStoreId(value: String): Self = this.set("storeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStoreId: Self = this.set("storeId", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

