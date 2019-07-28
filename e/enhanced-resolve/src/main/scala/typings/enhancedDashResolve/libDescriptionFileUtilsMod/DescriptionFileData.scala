package typings.enhancedDashResolve.libDescriptionFileUtilsMod

import typings.enhancedDashResolve.libConcordMod.Concord
import typings.enhancedDashResolve.libConcordMod.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescriptionFileData extends js.Object {
  var browser: js.UndefOr[Dictionary[String | Boolean]] = js.undefined
  var concord: js.UndefOr[Concord] = js.undefined
}

object DescriptionFileData {
  @scala.inline
  def apply(browser: Dictionary[String | Boolean] = null, concord: Concord = null): DescriptionFileData = {
    val __obj = js.Dynamic.literal()
    if (browser != null) __obj.updateDynamic("browser")(browser)
    if (concord != null) __obj.updateDynamic("concord")(concord)
    __obj.asInstanceOf[DescriptionFileData]
  }
}

