package typings.expoDashConstants

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dev
  extends /* key */ StringDictionary[js.Any] {
  var dev: js.UndefOr[Boolean] = js.undefined
  var hostType: js.UndefOr[String] = js.undefined
  var lanType: js.UndefOr[String] = js.undefined
  var minify: js.UndefOr[Boolean] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
  var urlRandomness: js.UndefOr[String] = js.undefined
  var urlType: js.UndefOr[String] = js.undefined
}

object Anon_Dev {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    dev: js.UndefOr[Boolean] = js.undefined,
    hostType: String = null,
    lanType: String = null,
    minify: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined,
    urlRandomness: String = null,
    urlType: String = null
  ): Anon_Dev = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(dev)) __obj.updateDynamic("dev")(dev)
    if (hostType != null) __obj.updateDynamic("hostType")(hostType)
    if (lanType != null) __obj.updateDynamic("lanType")(lanType)
    if (!js.isUndefined(minify)) __obj.updateDynamic("minify")(minify)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (urlRandomness != null) __obj.updateDynamic("urlRandomness")(urlRandomness)
    if (urlType != null) __obj.updateDynamic("urlType")(urlType)
    __obj.asInstanceOf[Anon_Dev]
  }
}

