package typings.fluentLangneg.mod

import typings.fluentLangneg.fluentLangnegStrings.filtering
import typings.fluentLangneg.fluentLangnegStrings.lookup
import typings.fluentLangneg.fluentLangnegStrings.matching
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NegotiateLanguageOptions extends js.Object {
  var defaultLocale: js.UndefOr[String] = js.native
  var likelySubtags: js.UndefOr[StringMap] = js.native
  var strategy: js.UndefOr[filtering | matching | lookup] = js.native
}

object NegotiateLanguageOptions {
  @scala.inline
  def apply(): NegotiateLanguageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NegotiateLanguageOptions]
  }
  @scala.inline
  implicit class NegotiateLanguageOptionsOps[Self <: NegotiateLanguageOptions] (val x: Self) extends AnyVal {
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
    def setDefaultLocale(value: String): Self = this.set("defaultLocale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultLocale: Self = this.set("defaultLocale", js.undefined)
    @scala.inline
    def setLikelySubtags(value: StringMap): Self = this.set("likelySubtags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLikelySubtags: Self = this.set("likelySubtags", js.undefined)
    @scala.inline
    def setStrategy(value: filtering | matching | lookup): Self = this.set("strategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrategy: Self = this.set("strategy", js.undefined)
  }
  
}

