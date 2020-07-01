package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalizedRuleName extends js.Object {
  var localizedRuleName: js.UndefOr[String] = js.native
  var ruleImpact: js.UndefOr[Double] = js.native
  var urlBlocks: js.UndefOr[js.Array[Header]] = js.native
}

object LocalizedRuleName {
  @scala.inline
  def apply(
    localizedRuleName: String = null,
    ruleImpact: js.UndefOr[Double] = js.undefined,
    urlBlocks: js.Array[Header] = null
  ): LocalizedRuleName = {
    val __obj = js.Dynamic.literal()
    if (localizedRuleName != null) __obj.updateDynamic("localizedRuleName")(localizedRuleName.asInstanceOf[js.Any])
    if (!js.isUndefined(ruleImpact)) __obj.updateDynamic("ruleImpact")(ruleImpact.get.asInstanceOf[js.Any])
    if (urlBlocks != null) __obj.updateDynamic("urlBlocks")(urlBlocks.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalizedRuleName]
  }
}

