package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies settings for an HTTP redirect.
  */
@js.native
trait SchemaHttpRedirectAction extends js.Object {
  /**
    * The host that will be used in the redirect response instead of the one
    * that was supplied in the request. The value must be between 1 and 255
    * characters.
    */
  var hostRedirect: js.UndefOr[String] = js.native
  /**
    * If set to true, the URL scheme in the redirected request is set to https.
    * If set to false, the URL scheme of the redirected request will remain the
    * same as that of the request. This must only be set for UrlMaps used in
    * TargetHttpProxys. Setting this true for TargetHttpsProxy is not
    * permitted. The default is set to false.
    */
  var httpsRedirect: js.UndefOr[Boolean] = js.native
  /**
    * The path that will be used in the redirect response instead of the one
    * that was supplied in the request. Only one of pathRedirect or
    * prefixRedirect must be specified. The value must be between 1 and 1024
    * characters.
    */
  var pathRedirect: js.UndefOr[String] = js.native
  /**
    * The prefix that replaces the prefixMatch specified in the
    * HttpRouteRuleMatch, retaining the remaining portion of the URL before
    * redirecting the request.
    */
  var prefixRedirect: js.UndefOr[String] = js.native
  /**
    * The HTTP Status code to use for this RedirectAction. Supported values
    * are:   - MOVED_PERMANENTLY_DEFAULT, which is the default value and
    * corresponds to 301.  - FOUND, which corresponds to 302.  - SEE_OTHER
    * which corresponds to 303.  - TEMPORARY_REDIRECT, which corresponds to
    * 307. In this case, the request method will be retained.  -
    * PERMANENT_REDIRECT, which corresponds to 308. In this case, the request
    * method will be retained.
    */
  var redirectResponseCode: js.UndefOr[String] = js.native
  /**
    * If set to true, any accompanying query portion of the original URL is
    * removed prior to redirecting the request. If set to false, the query
    * portion of the original URL is retained. The default is set to false.
    */
  var stripQuery: js.UndefOr[Boolean] = js.native
}

object SchemaHttpRedirectAction {
  @scala.inline
  def apply(
    hostRedirect: String = null,
    httpsRedirect: js.UndefOr[Boolean] = js.undefined,
    pathRedirect: String = null,
    prefixRedirect: String = null,
    redirectResponseCode: String = null,
    stripQuery: js.UndefOr[Boolean] = js.undefined
  ): SchemaHttpRedirectAction = {
    val __obj = js.Dynamic.literal()
    if (hostRedirect != null) __obj.updateDynamic("hostRedirect")(hostRedirect.asInstanceOf[js.Any])
    if (!js.isUndefined(httpsRedirect)) __obj.updateDynamic("httpsRedirect")(httpsRedirect.asInstanceOf[js.Any])
    if (pathRedirect != null) __obj.updateDynamic("pathRedirect")(pathRedirect.asInstanceOf[js.Any])
    if (prefixRedirect != null) __obj.updateDynamic("prefixRedirect")(prefixRedirect.asInstanceOf[js.Any])
    if (redirectResponseCode != null) __obj.updateDynamic("redirectResponseCode")(redirectResponseCode.asInstanceOf[js.Any])
    if (!js.isUndefined(stripQuery)) __obj.updateDynamic("stripQuery")(stripQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaHttpRedirectAction]
  }
}

