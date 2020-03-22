package typings.googleapis

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLocaleRuleResults extends js.Object {
  var locale: js.UndefOr[String] = js.native
  var ruleResults: js.UndefOr[StringDictionary[AnonBeta]] = js.native
}

object AnonLocaleRuleResults {
  @scala.inline
  def apply(locale: String = null, ruleResults: StringDictionary[AnonBeta] = null): AnonLocaleRuleResults = {
    val __obj = js.Dynamic.literal()
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (ruleResults != null) __obj.updateDynamic("ruleResults")(ruleResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLocaleRuleResults]
  }
}

