package typings.googleapis.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocaleRuleResults extends js.Object {
  var locale: js.UndefOr[String] = js.native
  var ruleResults: js.UndefOr[StringDictionary[Beta]] = js.native
}

object LocaleRuleResults {
  @scala.inline
  def apply(): LocaleRuleResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocaleRuleResults]
  }
  @scala.inline
  implicit class LocaleRuleResultsOps[Self <: LocaleRuleResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setRuleResults(value: StringDictionary[Beta]): Self = this.set("ruleResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleResults: Self = this.set("ruleResults", js.undefined)
  }
  
}

