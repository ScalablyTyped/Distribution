package typings.googleapis

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_KeyLocaleRuleResultsAnonBeta extends js.Object {
  var locale: js.UndefOr[String] = js.native
  var ruleResults: js.UndefOr[StringDictionary[Anon_Beta]] = js.native
}

object Anon_KeyLocaleRuleResultsAnonBeta {
  @scala.inline
  def apply(locale: String = null, ruleResults: StringDictionary[Anon_Beta] = null): Anon_KeyLocaleRuleResultsAnonBeta = {
    val __obj = js.Dynamic.literal()
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (ruleResults != null) __obj.updateDynamic("ruleResults")(ruleResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_KeyLocaleRuleResultsAnonBeta]
  }
}

