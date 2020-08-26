package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Negative Keywords
@js.native
trait NegativeKeyword
  extends isAdGroupChild
     with AdWordsEntity {
  def getMatchType(): MatchType = js.native
  def getText(): String = js.native
  def remove(): Unit = js.native
}

object NegativeKeyword {
  @scala.inline
  def apply(
    getAdGroup: () => AdGroup,
    getCampaign: () => Campaign,
    getMatchType: () => MatchType,
    getText: () => String,
    remove: () => Unit
  ): NegativeKeyword = {
    val __obj = js.Dynamic.literal(getAdGroup = js.Any.fromFunction0(getAdGroup), getCampaign = js.Any.fromFunction0(getCampaign), getMatchType = js.Any.fromFunction0(getMatchType), getText = js.Any.fromFunction0(getText), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[NegativeKeyword]
  }
  @scala.inline
  implicit class NegativeKeywordOps[Self <: NegativeKeyword] (val x: Self) extends AnyVal {
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
    def setGetMatchType(value: () => MatchType): Self = this.set("getMatchType", js.Any.fromFunction0(value))
    @scala.inline
    def setGetText(value: () => String): Self = this.set("getText", js.Any.fromFunction0(value))
    @scala.inline
    def setRemove(value: () => Unit): Self = this.set("remove", js.Any.fromFunction0(value))
  }
  
}

