package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_LocalizedRuleName extends js.Object {
  var localizedRuleName: js.UndefOr[String] = js.native
  var ruleImpact: js.UndefOr[Double] = js.native
  var urlBlocks: js.UndefOr[js.Array[Anon_Header]] = js.native
}

object Anon_LocalizedRuleName {
  @scala.inline
  def apply(
    localizedRuleName: String = null,
    ruleImpact: Int | Double = null,
    urlBlocks: js.Array[Anon_Header] = null
  ): Anon_LocalizedRuleName = {
    val __obj = js.Dynamic.literal()
    if (localizedRuleName != null) __obj.updateDynamic("localizedRuleName")(localizedRuleName.asInstanceOf[js.Any])
    if (ruleImpact != null) __obj.updateDynamic("ruleImpact")(ruleImpact.asInstanceOf[js.Any])
    if (urlBlocks != null) __obj.updateDynamic("urlBlocks")(urlBlocks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_LocalizedRuleName]
  }
}

