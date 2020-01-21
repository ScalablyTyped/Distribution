package typings.enhancedResolve.descriptionFileUtilsMod

import typings.enhancedResolve.concordMod.Concord
import typings.enhancedResolve.concordMod.Dictionary
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
    if (browser != null) __obj.updateDynamic("browser")(browser.asInstanceOf[js.Any])
    if (concord != null) __obj.updateDynamic("concord")(concord.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptionFileData]
  }
}

