package typings.firefoxDashWebextDashBrowser.browser.events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Filters URLs for various criteria. See event filtering. All criteria are case sensitive. */
trait UrlFilter extends js.Object {
  /**
    * Matches if the host name of the URL contains a specified string. To test whether a host name component has a
    * prefix 'foo', use hostContains: '.foo'. This matches 'www.foobar.com' and 'foo.com', because an implicit dot
    * is added at the beginning of the host name. Similarly, hostContains can be used to match against component
    * suffix ('foo.') and to exactly match against components ('.foo.'). Suffix- and exact-matching for the last
    * components need to be done separately using hostSuffix, because no implicit dot is added at the end of the
    * host name.
    */
  var hostContains: js.UndefOr[String] = js.undefined
  /** Matches if the host name of the URL is equal to a specified string. */
  var hostEquals: js.UndefOr[String] = js.undefined
  /** Matches if the host name of the URL starts with a specified string. */
  var hostPrefix: js.UndefOr[String] = js.undefined
  /** Matches if the host name of the URL ends with a specified string. */
  var hostSuffix: js.UndefOr[String] = js.undefined
  /**
    * Matches if the URL without query segment and fragment identifier matches a specified regular expression.
    * Port numbers are stripped from the URL if they match the default port number. The regular expressions use
    * the [RE2 syntax](https://github.com/google/re2/blob/master/doc/syntax.txt).
    */
  var originAndPathMatches: js.UndefOr[String] = js.undefined
  /** Matches if the path segment of the URL contains a specified string. */
  var pathContains: js.UndefOr[String] = js.undefined
  /** Matches if the path segment of the URL is equal to a specified string. */
  var pathEquals: js.UndefOr[String] = js.undefined
  /** Matches if the path segment of the URL starts with a specified string. */
  var pathPrefix: js.UndefOr[String] = js.undefined
  /** Matches if the path segment of the URL ends with a specified string. */
  var pathSuffix: js.UndefOr[String] = js.undefined
  /**
    * Matches if the port of the URL is contained in any of the specified port lists. For example `[80, 443,
    * [1000, 1200]]` matches all requests on port 80, 443 and in the range 1000-1200.
    */
  var ports: js.UndefOr[js.Array[Double | (js.Tuple2[Double, Double])]] = js.undefined
  /** Matches if the query segment of the URL contains a specified string. */
  var queryContains: js.UndefOr[String] = js.undefined
  /** Matches if the query segment of the URL is equal to a specified string. */
  var queryEquals: js.UndefOr[String] = js.undefined
  /** Matches if the query segment of the URL starts with a specified string. */
  var queryPrefix: js.UndefOr[String] = js.undefined
  /** Matches if the query segment of the URL ends with a specified string. */
  var querySuffix: js.UndefOr[String] = js.undefined
  /** Matches if the scheme of the URL is equal to any of the schemes specified in the array. */
  var schemes: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Matches if the URL (without fragment identifier) contains a specified string. Port numbers are stripped from
    * the URL if they match the default port number.
    */
  var urlContains: js.UndefOr[String] = js.undefined
  /**
    * Matches if the URL (without fragment identifier) is equal to a specified string. Port numbers are stripped
    * from the URL if they match the default port number.
    */
  var urlEquals: js.UndefOr[String] = js.undefined
  /**
    * Matches if the URL (without fragment identifier) matches a specified regular expression. Port numbers are
    * stripped from the URL if they match the default port number. The regular expressions use the [RE2
    * syntax](https://github.com/google/re2/blob/master/doc/syntax.txt).
    */
  var urlMatches: js.UndefOr[String] = js.undefined
  /**
    * Matches if the URL (without fragment identifier) starts with a specified string. Port numbers are stripped
    * from the URL if they match the default port number.
    */
  var urlPrefix: js.UndefOr[String] = js.undefined
  /**
    * Matches if the URL (without fragment identifier) ends with a specified string. Port numbers are stripped
    * from the URL if they match the default port number.
    */
  var urlSuffix: js.UndefOr[String] = js.undefined
}

object UrlFilter {
  @scala.inline
  def apply(
    hostContains: String = null,
    hostEquals: String = null,
    hostPrefix: String = null,
    hostSuffix: String = null,
    originAndPathMatches: String = null,
    pathContains: String = null,
    pathEquals: String = null,
    pathPrefix: String = null,
    pathSuffix: String = null,
    ports: js.Array[Double | (js.Tuple2[Double, Double])] = null,
    queryContains: String = null,
    queryEquals: String = null,
    queryPrefix: String = null,
    querySuffix: String = null,
    schemes: js.Array[String] = null,
    urlContains: String = null,
    urlEquals: String = null,
    urlMatches: String = null,
    urlPrefix: String = null,
    urlSuffix: String = null
  ): UrlFilter = {
    val __obj = js.Dynamic.literal()
    if (hostContains != null) __obj.updateDynamic("hostContains")(hostContains)
    if (hostEquals != null) __obj.updateDynamic("hostEquals")(hostEquals)
    if (hostPrefix != null) __obj.updateDynamic("hostPrefix")(hostPrefix)
    if (hostSuffix != null) __obj.updateDynamic("hostSuffix")(hostSuffix)
    if (originAndPathMatches != null) __obj.updateDynamic("originAndPathMatches")(originAndPathMatches)
    if (pathContains != null) __obj.updateDynamic("pathContains")(pathContains)
    if (pathEquals != null) __obj.updateDynamic("pathEquals")(pathEquals)
    if (pathPrefix != null) __obj.updateDynamic("pathPrefix")(pathPrefix)
    if (pathSuffix != null) __obj.updateDynamic("pathSuffix")(pathSuffix)
    if (ports != null) __obj.updateDynamic("ports")(ports)
    if (queryContains != null) __obj.updateDynamic("queryContains")(queryContains)
    if (queryEquals != null) __obj.updateDynamic("queryEquals")(queryEquals)
    if (queryPrefix != null) __obj.updateDynamic("queryPrefix")(queryPrefix)
    if (querySuffix != null) __obj.updateDynamic("querySuffix")(querySuffix)
    if (schemes != null) __obj.updateDynamic("schemes")(schemes)
    if (urlContains != null) __obj.updateDynamic("urlContains")(urlContains)
    if (urlEquals != null) __obj.updateDynamic("urlEquals")(urlEquals)
    if (urlMatches != null) __obj.updateDynamic("urlMatches")(urlMatches)
    if (urlPrefix != null) __obj.updateDynamic("urlPrefix")(urlPrefix)
    if (urlSuffix != null) __obj.updateDynamic("urlSuffix")(urlSuffix)
    __obj.asInstanceOf[UrlFilter]
  }
}

