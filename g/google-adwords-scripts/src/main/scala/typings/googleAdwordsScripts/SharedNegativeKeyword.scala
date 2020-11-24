package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedNegativeKeyword extends AdWordsEntity {
  
  def getMatchType(): MatchType = js.native
  
  def getNegativeKeywordList(): NegativeKeywordList = js.native
  
  def getText(): String = js.native
  
  def remove(): Unit = js.native
}
object SharedNegativeKeyword {
  
  @scala.inline
  def apply(
    getMatchType: () => MatchType,
    getNegativeKeywordList: () => NegativeKeywordList,
    getText: () => String,
    remove: () => Unit
  ): SharedNegativeKeyword = {
    val __obj = js.Dynamic.literal(getMatchType = js.Any.fromFunction0(getMatchType), getNegativeKeywordList = js.Any.fromFunction0(getNegativeKeywordList), getText = js.Any.fromFunction0(getText), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[SharedNegativeKeyword]
  }
  
  @scala.inline
  implicit class SharedNegativeKeywordOps[Self <: SharedNegativeKeyword] (val x: Self) extends AnyVal {
    
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
    def setGetNegativeKeywordList(value: () => NegativeKeywordList): Self = this.set("getNegativeKeywordList", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetText(value: () => String): Self = this.set("getText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemove(value: () => Unit): Self = this.set("remove", js.Any.fromFunction0(value))
  }
}
