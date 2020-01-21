package typings.expoConstants

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDev
  extends /* key */ StringDictionary[js.Any] {
  var dev: js.UndefOr[Boolean] = js.undefined
  var hostType: js.UndefOr[String] = js.undefined
  var lanType: js.UndefOr[String] = js.undefined
  var minify: js.UndefOr[Boolean] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
  var urlRandomness: js.UndefOr[String] = js.undefined
  var urlType: js.UndefOr[String] = js.undefined
}

object AnonDev {
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
  ): AnonDev = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(dev)) __obj.updateDynamic("dev")(dev.asInstanceOf[js.Any])
    if (hostType != null) __obj.updateDynamic("hostType")(hostType.asInstanceOf[js.Any])
    if (lanType != null) __obj.updateDynamic("lanType")(lanType.asInstanceOf[js.Any])
    if (!js.isUndefined(minify)) __obj.updateDynamic("minify")(minify.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    if (urlRandomness != null) __obj.updateDynamic("urlRandomness")(urlRandomness.asInstanceOf[js.Any])
    if (urlType != null) __obj.updateDynamic("urlType")(urlType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDev]
  }
}

