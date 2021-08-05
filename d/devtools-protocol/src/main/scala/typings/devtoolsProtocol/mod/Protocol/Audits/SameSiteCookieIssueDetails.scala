package typings.devtoolsProtocol.mod.Protocol.Audits

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SameSiteCookieIssueDetails extends StObject {
  
  var cookie: AffectedCookie
  
  var cookieExclusionReasons: js.Array[SameSiteCookieExclusionReason]
  
  var cookieUrl: js.UndefOr[String] = js.undefined
  
  var cookieWarningReasons: js.Array[SameSiteCookieWarningReason]
  
  /**
    * Optionally identifies the site-for-cookies and the cookie url, which
    * may be used by the front-end as additional context.
    */
  var operation: SameSiteCookieOperation
  
  var request: js.UndefOr[AffectedRequest] = js.undefined
  
  var siteForCookies: js.UndefOr[String] = js.undefined
}
object SameSiteCookieIssueDetails {
  
  inline def apply(
    cookie: AffectedCookie,
    cookieExclusionReasons: js.Array[SameSiteCookieExclusionReason],
    cookieWarningReasons: js.Array[SameSiteCookieWarningReason],
    operation: SameSiteCookieOperation
  ): SameSiteCookieIssueDetails = {
    val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any], cookieExclusionReasons = cookieExclusionReasons.asInstanceOf[js.Any], cookieWarningReasons = cookieWarningReasons.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SameSiteCookieIssueDetails]
  }
  
  extension [Self <: SameSiteCookieIssueDetails](x: Self) {
    
    inline def setCookie(value: AffectedCookie): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
    
    inline def setCookieExclusionReasons(value: js.Array[SameSiteCookieExclusionReason]): Self = StObject.set(x, "cookieExclusionReasons", value.asInstanceOf[js.Any])
    
    inline def setCookieExclusionReasonsVarargs(value: SameSiteCookieExclusionReason*): Self = StObject.set(x, "cookieExclusionReasons", js.Array(value :_*))
    
    inline def setCookieUrl(value: String): Self = StObject.set(x, "cookieUrl", value.asInstanceOf[js.Any])
    
    inline def setCookieUrlUndefined: Self = StObject.set(x, "cookieUrl", js.undefined)
    
    inline def setCookieWarningReasons(value: js.Array[SameSiteCookieWarningReason]): Self = StObject.set(x, "cookieWarningReasons", value.asInstanceOf[js.Any])
    
    inline def setCookieWarningReasonsVarargs(value: SameSiteCookieWarningReason*): Self = StObject.set(x, "cookieWarningReasons", js.Array(value :_*))
    
    inline def setOperation(value: SameSiteCookieOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: AffectedRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setSiteForCookies(value: String): Self = StObject.set(x, "siteForCookies", value.asInstanceOf[js.Any])
    
    inline def setSiteForCookiesUndefined: Self = StObject.set(x, "siteForCookies", js.undefined)
  }
}
