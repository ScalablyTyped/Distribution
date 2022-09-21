package typings.devtoolsProtocol.mod.Protocol.Audits

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CookieIssueDetails extends StObject {
  
  /**
    * If AffectedCookie is not set then rawCookieLine contains the raw
    * Set-Cookie header string. This hints at a problem where the
    * cookie line is syntactically or semantically malformed in a way
    * that no valid cookie could be created.
    */
  var cookie: js.UndefOr[AffectedCookie] = js.undefined
  
  var cookieExclusionReasons: js.Array[CookieExclusionReason]
  
  var cookieUrl: js.UndefOr[String] = js.undefined
  
  var cookieWarningReasons: js.Array[CookieWarningReason]
  
  /**
    * Optionally identifies the site-for-cookies and the cookie url, which
    * may be used by the front-end as additional context.
    */
  var operation: CookieOperation
  
  var rawCookieLine: js.UndefOr[String] = js.undefined
  
  var request: js.UndefOr[AffectedRequest] = js.undefined
  
  var siteForCookies: js.UndefOr[String] = js.undefined
}
object CookieIssueDetails {
  
  inline def apply(
    cookieExclusionReasons: js.Array[CookieExclusionReason],
    cookieWarningReasons: js.Array[CookieWarningReason],
    operation: CookieOperation
  ): CookieIssueDetails = {
    val __obj = js.Dynamic.literal(cookieExclusionReasons = cookieExclusionReasons.asInstanceOf[js.Any], cookieWarningReasons = cookieWarningReasons.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookieIssueDetails]
  }
  
  extension [Self <: CookieIssueDetails](x: Self) {
    
    inline def setCookie(value: AffectedCookie): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
    
    inline def setCookieExclusionReasons(value: js.Array[CookieExclusionReason]): Self = StObject.set(x, "cookieExclusionReasons", value.asInstanceOf[js.Any])
    
    inline def setCookieExclusionReasonsVarargs(value: CookieExclusionReason*): Self = StObject.set(x, "cookieExclusionReasons", js.Array(value*))
    
    inline def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
    
    inline def setCookieUrl(value: String): Self = StObject.set(x, "cookieUrl", value.asInstanceOf[js.Any])
    
    inline def setCookieUrlUndefined: Self = StObject.set(x, "cookieUrl", js.undefined)
    
    inline def setCookieWarningReasons(value: js.Array[CookieWarningReason]): Self = StObject.set(x, "cookieWarningReasons", value.asInstanceOf[js.Any])
    
    inline def setCookieWarningReasonsVarargs(value: CookieWarningReason*): Self = StObject.set(x, "cookieWarningReasons", js.Array(value*))
    
    inline def setOperation(value: CookieOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setRawCookieLine(value: String): Self = StObject.set(x, "rawCookieLine", value.asInstanceOf[js.Any])
    
    inline def setRawCookieLineUndefined: Self = StObject.set(x, "rawCookieLine", js.undefined)
    
    inline def setRequest(value: AffectedRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setSiteForCookies(value: String): Self = StObject.set(x, "siteForCookies", value.asInstanceOf[js.Any])
    
    inline def setSiteForCookiesUndefined: Self = StObject.set(x, "siteForCookies", js.undefined)
  }
}
