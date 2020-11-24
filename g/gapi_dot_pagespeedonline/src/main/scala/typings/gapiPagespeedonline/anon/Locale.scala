package typings.gapiPagespeedonline.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Locale extends js.Object {
  
  /**
    * The locale of the formattedResults, such as en_US.
    */
  var locale: String = js.native
  
  /**
    * Dictionary of formatted rule results, with one entry for each PageSpeed rule instantiated and run by the server.
    */
  var ruleResults: AvoidBadRequests = js.native
}
object Locale {
  
  @scala.inline
  def apply(locale: String, ruleResults: AvoidBadRequests): Locale = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], ruleResults = ruleResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
  
  @scala.inline
  implicit class LocaleOps[Self <: Locale] (val x: Self) extends AnyVal {
    
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
    def setRuleResults(value: AvoidBadRequests): Self = this.set("ruleResults", value.asInstanceOf[js.Any])
  }
}
