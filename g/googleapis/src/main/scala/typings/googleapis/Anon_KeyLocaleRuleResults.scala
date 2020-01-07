package typings.googleapis

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_KeyLocaleRuleResults extends js.Object {
  var locale: js.UndefOr[String] = js.native
  var ruleResults: js.UndefOr[StringDictionary[Anon_Groups]] = js.native
}

object Anon_KeyLocaleRuleResults {
  @scala.inline
  def apply(locale: String = null, ruleResults: StringDictionary[Anon_Groups] = null): Anon_KeyLocaleRuleResults = {
    val __obj = js.Dynamic.literal()
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (ruleResults != null) __obj.updateDynamic("ruleResults")(ruleResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_KeyLocaleRuleResults]
  }
}

