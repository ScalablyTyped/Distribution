package typings.devtoolsProtocol.mod.Protocol.Audits

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SameSiteCookieIssueDetails extends js.Object {
  var cookie: AffectedCookie = js.native
  var cookieExclusionReasons: js.Array[SameSiteCookieExclusionReason] = js.native
  var cookieUrl: js.UndefOr[String] = js.native
  var cookieWarningReasons: js.Array[SameSiteCookieWarningReason] = js.native
  /**
    * Optionally identifies the site-for-cookies and the cookie url, which
    * may be used by the front-end as additional context.
    */
  var operation: SameSiteCookieOperation = js.native
  var request: js.UndefOr[AffectedRequest] = js.native
  var siteForCookies: js.UndefOr[String] = js.native
}

object SameSiteCookieIssueDetails {
  @scala.inline
  def apply(
    cookie: AffectedCookie,
    cookieExclusionReasons: js.Array[SameSiteCookieExclusionReason],
    cookieWarningReasons: js.Array[SameSiteCookieWarningReason],
    operation: SameSiteCookieOperation
  ): SameSiteCookieIssueDetails = {
    val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any], cookieExclusionReasons = cookieExclusionReasons.asInstanceOf[js.Any], cookieWarningReasons = cookieWarningReasons.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SameSiteCookieIssueDetails]
  }
  @scala.inline
  implicit class SameSiteCookieIssueDetailsOps[Self <: SameSiteCookieIssueDetails] (val x: Self) extends AnyVal {
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
    def setCookie(value: AffectedCookie): Self = this.set("cookie", value.asInstanceOf[js.Any])
    @scala.inline
    def setCookieExclusionReasonsVarargs(value: SameSiteCookieExclusionReason*): Self = this.set("cookieExclusionReasons", js.Array(value :_*))
    @scala.inline
    def setCookieExclusionReasons(value: js.Array[SameSiteCookieExclusionReason]): Self = this.set("cookieExclusionReasons", value.asInstanceOf[js.Any])
    @scala.inline
    def setCookieWarningReasonsVarargs(value: SameSiteCookieWarningReason*): Self = this.set("cookieWarningReasons", js.Array(value :_*))
    @scala.inline
    def setCookieWarningReasons(value: js.Array[SameSiteCookieWarningReason]): Self = this.set("cookieWarningReasons", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperation(value: SameSiteCookieOperation): Self = this.set("operation", value.asInstanceOf[js.Any])
    @scala.inline
    def setCookieUrl(value: String): Self = this.set("cookieUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookieUrl: Self = this.set("cookieUrl", js.undefined)
    @scala.inline
    def setRequest(value: AffectedRequest): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    @scala.inline
    def setSiteForCookies(value: String): Self = this.set("siteForCookies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSiteForCookies: Self = this.set("siteForCookies", js.undefined)
  }
  
}

