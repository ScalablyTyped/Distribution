package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NegativeKeywordList extends AdWordsEntity {
  def addNegativeKeyword(keywordText: String): Unit = js.native
  def addNegativeKeywords(keywordTexts: js.Array[String]): Unit = js.native
  def campaigns(): AdWordsSelector[Campaign] = js.native
  def getId(): Double = js.native
  def getName(): String = js.native
  def negativeKeywords(): AdWordsSelector[SharedNegativeKeyword] = js.native
  def setName(): String = js.native
}

object NegativeKeywordList {
  @scala.inline
  def apply(
    addNegativeKeyword: String => Unit,
    addNegativeKeywords: js.Array[String] => Unit,
    campaigns: () => AdWordsSelector[Campaign],
    getId: () => Double,
    getName: () => String,
    negativeKeywords: () => AdWordsSelector[SharedNegativeKeyword],
    setName: () => String
  ): NegativeKeywordList = {
    val __obj = js.Dynamic.literal(addNegativeKeyword = js.Any.fromFunction1(addNegativeKeyword), addNegativeKeywords = js.Any.fromFunction1(addNegativeKeywords), campaigns = js.Any.fromFunction0(campaigns), getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), negativeKeywords = js.Any.fromFunction0(negativeKeywords), setName = js.Any.fromFunction0(setName))
    __obj.asInstanceOf[NegativeKeywordList]
  }
  @scala.inline
  implicit class NegativeKeywordListOps[Self <: NegativeKeywordList] (val x: Self) extends AnyVal {
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
    def setAddNegativeKeyword(value: String => Unit): Self = this.set("addNegativeKeyword", js.Any.fromFunction1(value))
    @scala.inline
    def setAddNegativeKeywords(value: js.Array[String] => Unit): Self = this.set("addNegativeKeywords", js.Any.fromFunction1(value))
    @scala.inline
    def setCampaigns(value: () => AdWordsSelector[Campaign]): Self = this.set("campaigns", js.Any.fromFunction0(value))
    @scala.inline
    def setGetId(value: () => Double): Self = this.set("getId", js.Any.fromFunction0(value))
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
    @scala.inline
    def setNegativeKeywords(value: () => AdWordsSelector[SharedNegativeKeyword]): Self = this.set("negativeKeywords", js.Any.fromFunction0(value))
    @scala.inline
    def setSetName(value: () => String): Self = this.set("setName", js.Any.fromFunction0(value))
  }
  
}

