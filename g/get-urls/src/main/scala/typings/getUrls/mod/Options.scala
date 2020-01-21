package typings.getUrls.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends typings.normalizeUrl.mod.Options {
  /**
  		Exclude URLs that match URLs in the given array.
  		@default []
  		*/
  val exclude: js.UndefOr[js.Array[String]] = js.undefined
  /**
  		Extract URLs that appear as query parameters in the found URLs.
  		@default false
  		*/
  val extractFromQueryString: js.UndefOr[Boolean] = js.undefined
  /**
  		Require URLs to have a scheme or leading `www.` to be considered an URL. When `false`, matches against a list of valid TLDs, so it will match URLs like `unicorn.education`.
  		Does not affect URLs in query parameters if using the `extractFromQueryString` option.
  		@default true
  		*/
  val requireSchemeOrWww: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    defaultProtocol: String = null,
    exclude: js.Array[String] = null,
    extractFromQueryString: js.UndefOr[Boolean] = js.undefined,
    forceHttp: js.UndefOr[Boolean] = js.undefined,
    forceHttps: js.UndefOr[Boolean] = js.undefined,
    normalizeProtocol: js.UndefOr[Boolean] = js.undefined,
    removeDirectoryIndex: js.Array[RegExp | String] = null,
    removeQueryParameters: js.Array[RegExp | String] = null,
    removeTrailingSlash: js.UndefOr[Boolean] = js.undefined,
    requireSchemeOrWww: js.UndefOr[Boolean] = js.undefined,
    sortQueryParameters: js.UndefOr[Boolean] = js.undefined,
    stripAuthentication: js.UndefOr[Boolean] = js.undefined,
    stripHash: js.UndefOr[Boolean] = js.undefined,
    stripProtocol: js.UndefOr[Boolean] = js.undefined,
    stripWWW: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (defaultProtocol != null) __obj.updateDynamic("defaultProtocol")(defaultProtocol.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (!js.isUndefined(extractFromQueryString)) __obj.updateDynamic("extractFromQueryString")(extractFromQueryString.asInstanceOf[js.Any])
    if (!js.isUndefined(forceHttp)) __obj.updateDynamic("forceHttp")(forceHttp.asInstanceOf[js.Any])
    if (!js.isUndefined(forceHttps)) __obj.updateDynamic("forceHttps")(forceHttps.asInstanceOf[js.Any])
    if (!js.isUndefined(normalizeProtocol)) __obj.updateDynamic("normalizeProtocol")(normalizeProtocol.asInstanceOf[js.Any])
    if (removeDirectoryIndex != null) __obj.updateDynamic("removeDirectoryIndex")(removeDirectoryIndex.asInstanceOf[js.Any])
    if (removeQueryParameters != null) __obj.updateDynamic("removeQueryParameters")(removeQueryParameters.asInstanceOf[js.Any])
    if (!js.isUndefined(removeTrailingSlash)) __obj.updateDynamic("removeTrailingSlash")(removeTrailingSlash.asInstanceOf[js.Any])
    if (!js.isUndefined(requireSchemeOrWww)) __obj.updateDynamic("requireSchemeOrWww")(requireSchemeOrWww.asInstanceOf[js.Any])
    if (!js.isUndefined(sortQueryParameters)) __obj.updateDynamic("sortQueryParameters")(sortQueryParameters.asInstanceOf[js.Any])
    if (!js.isUndefined(stripAuthentication)) __obj.updateDynamic("stripAuthentication")(stripAuthentication.asInstanceOf[js.Any])
    if (!js.isUndefined(stripHash)) __obj.updateDynamic("stripHash")(stripHash.asInstanceOf[js.Any])
    if (!js.isUndefined(stripProtocol)) __obj.updateDynamic("stripProtocol")(stripProtocol.asInstanceOf[js.Any])
    if (!js.isUndefined(stripWWW)) __obj.updateDynamic("stripWWW")(stripWWW.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

