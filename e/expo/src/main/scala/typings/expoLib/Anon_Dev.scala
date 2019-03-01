package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dev
  extends /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var dev: js.UndefOr[scala.Boolean] = js.undefined
  var hostType: js.UndefOr[java.lang.String] = js.undefined
  var lanType: js.UndefOr[java.lang.String] = js.undefined
  var minify: js.UndefOr[scala.Boolean] = js.undefined
  var strict: js.UndefOr[scala.Boolean] = js.undefined
  var urlRandomness: js.UndefOr[java.lang.String] = js.undefined
  var urlType: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Dev {
  @scala.inline
  def apply(
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    dev: js.UndefOr[scala.Boolean] = js.undefined,
    hostType: java.lang.String = null,
    lanType: java.lang.String = null,
    minify: js.UndefOr[scala.Boolean] = js.undefined,
    strict: js.UndefOr[scala.Boolean] = js.undefined,
    urlRandomness: java.lang.String = null,
    urlType: java.lang.String = null
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

