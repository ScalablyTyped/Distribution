package typings.devtoolsProtocol.mod.Protocol.Audits

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SameSiteCookieIssueDetails extends StObject {
  
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
  implicit class SameSiteCookieIssueDetailsMutableBuilder[Self <: SameSiteCookieIssueDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCookie(value: AffectedCookie): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookieExclusionReasons(value: js.Array[SameSiteCookieExclusionReason]): Self = StObject.set(x, "cookieExclusionReasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookieExclusionReasonsVarargs(value: SameSiteCookieExclusionReason*): Self = StObject.set(x, "cookieExclusionReasons", js.Array(value :_*))
    
    @scala.inline
    def setCookieUrl(value: String): Self = StObject.set(x, "cookieUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookieUrlUndefined: Self = StObject.set(x, "cookieUrl", js.undefined)
    
    @scala.inline
    def setCookieWarningReasons(value: js.Array[SameSiteCookieWarningReason]): Self = StObject.set(x, "cookieWarningReasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookieWarningReasonsVarargs(value: SameSiteCookieWarningReason*): Self = StObject.set(x, "cookieWarningReasons", js.Array(value :_*))
    
    @scala.inline
    def setOperation(value: SameSiteCookieOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: AffectedRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    @scala.inline
    def setSiteForCookies(value: String): Self = StObject.set(x, "siteForCookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteForCookiesUndefined: Self = StObject.set(x, "siteForCookies", js.undefined)
  }
}
