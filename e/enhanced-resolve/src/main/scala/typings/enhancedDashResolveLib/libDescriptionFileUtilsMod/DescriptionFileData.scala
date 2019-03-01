package typings
package enhancedDashResolveLib.libDescriptionFileUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescriptionFileData extends js.Object {
  var browser: js.UndefOr[
    enhancedDashResolveLib.libConcordMod.Dictionary[java.lang.String | scala.Boolean]
  ] = js.undefined
  var concord: js.UndefOr[enhancedDashResolveLib.libConcordMod.Concord] = js.undefined
}

object DescriptionFileData {
  @scala.inline
  def apply(
    browser: enhancedDashResolveLib.libConcordMod.Dictionary[java.lang.String | scala.Boolean] = null,
    concord: enhancedDashResolveLib.libConcordMod.Concord = null
  ): DescriptionFileData = {
    val __obj = js.Dynamic.literal()
    if (browser != null) __obj.updateDynamic("browser")(browser)
    if (concord != null) __obj.updateDynamic("concord")(concord)
    __obj.asInstanceOf[DescriptionFileData]
  }
}

