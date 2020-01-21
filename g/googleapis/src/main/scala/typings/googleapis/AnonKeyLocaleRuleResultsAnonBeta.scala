package typings.googleapis

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonKeyLocaleRuleResultsAnonBeta extends js.Object {
  var locale: js.UndefOr[String] = js.native
  var ruleResults: js.UndefOr[StringDictionary[AnonBeta]] = js.native
}

object AnonKeyLocaleRuleResultsAnonBeta {
  @scala.inline
  def apply(locale: String = null, ruleResults: StringDictionary[AnonBeta] = null): AnonKeyLocaleRuleResultsAnonBeta = {
    val __obj = js.Dynamic.literal()
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (ruleResults != null) __obj.updateDynamic("ruleResults")(ruleResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKeyLocaleRuleResultsAnonBeta]
  }
}

