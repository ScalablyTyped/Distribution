package typings.firefoxWebextBrowser.browser.webRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlClassification extends js.Object {
  /** Classification flags if the request has been classified and it is first party. */
  var firstParty: UrlClassificationParty = js.native
  /**
    * Classification flags if the request has been classified and it or its window hierarchy is third party.
    */
  var thirdParty: UrlClassificationParty = js.native
}

object UrlClassification {
  @scala.inline
  def apply(firstParty: UrlClassificationParty, thirdParty: UrlClassificationParty): UrlClassification = {
    val __obj = js.Dynamic.literal(firstParty = firstParty.asInstanceOf[js.Any], thirdParty = thirdParty.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlClassification]
  }
  @scala.inline
  implicit class UrlClassificationOps[Self <: UrlClassification] (val x: Self) extends AnyVal {
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
    def setFirstPartyVarargs(value: UrlClassificationFlags*): Self = this.set("firstParty", js.Array(value :_*))
    @scala.inline
    def setFirstParty(value: UrlClassificationParty): Self = this.set("firstParty", value.asInstanceOf[js.Any])
    @scala.inline
    def setThirdPartyVarargs(value: UrlClassificationFlags*): Self = this.set("thirdParty", js.Array(value :_*))
    @scala.inline
    def setThirdParty(value: UrlClassificationParty): Self = this.set("thirdParty", value.asInstanceOf[js.Any])
  }
  
}

