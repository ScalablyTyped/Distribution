package typings
package getDashUrlsLib.getDashUrlsMod.getUrlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends normalizeDashUrlLib.normalizeDashUrlMod.Options {
  var exclude: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var extractFromQueryString: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    defaultProtocol: java.lang.String = null,
    exclude: js.Array[java.lang.String] = null,
    extractFromQueryString: js.UndefOr[scala.Boolean] = js.undefined,
    forceHttp: js.UndefOr[scala.Boolean] = js.undefined,
    forceHttps: js.UndefOr[scala.Boolean] = js.undefined,
    normalizeProtocol: js.UndefOr[scala.Boolean] = js.undefined,
    removeDirectoryIndex: js.Array[stdLib.RegExp | java.lang.String] = null,
    removeQueryParameters: js.Array[stdLib.RegExp | java.lang.String] = null,
    removeTrailingSlash: js.UndefOr[scala.Boolean] = js.undefined,
    sortQueryParameters: js.UndefOr[scala.Boolean] = js.undefined,
    stripAuthentication: js.UndefOr[scala.Boolean] = js.undefined,
    stripHash: js.UndefOr[scala.Boolean] = js.undefined,
    stripProtocol: js.UndefOr[scala.Boolean] = js.undefined,
    stripWWW: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (defaultProtocol != null) __obj.updateDynamic("defaultProtocol")(defaultProtocol)
    if (exclude != null) __obj.updateDynamic("exclude")(exclude)
    if (!js.isUndefined(extractFromQueryString)) __obj.updateDynamic("extractFromQueryString")(extractFromQueryString)
    if (!js.isUndefined(forceHttp)) __obj.updateDynamic("forceHttp")(forceHttp)
    if (!js.isUndefined(forceHttps)) __obj.updateDynamic("forceHttps")(forceHttps)
    if (!js.isUndefined(normalizeProtocol)) __obj.updateDynamic("normalizeProtocol")(normalizeProtocol)
    if (removeDirectoryIndex != null) __obj.updateDynamic("removeDirectoryIndex")(removeDirectoryIndex)
    if (removeQueryParameters != null) __obj.updateDynamic("removeQueryParameters")(removeQueryParameters)
    if (!js.isUndefined(removeTrailingSlash)) __obj.updateDynamic("removeTrailingSlash")(removeTrailingSlash)
    if (!js.isUndefined(sortQueryParameters)) __obj.updateDynamic("sortQueryParameters")(sortQueryParameters)
    if (!js.isUndefined(stripAuthentication)) __obj.updateDynamic("stripAuthentication")(stripAuthentication)
    if (!js.isUndefined(stripHash)) __obj.updateDynamic("stripHash")(stripHash)
    if (!js.isUndefined(stripProtocol)) __obj.updateDynamic("stripProtocol")(stripProtocol)
    if (!js.isUndefined(stripWWW)) __obj.updateDynamic("stripWWW")(stripWWW)
    __obj.asInstanceOf[Options]
  }
}

