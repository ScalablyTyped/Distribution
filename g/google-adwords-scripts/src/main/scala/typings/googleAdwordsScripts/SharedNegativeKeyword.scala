package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
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
  implicit class SharedNegativeKeywordMutableBuilder[Self <: SharedNegativeKeyword] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetMatchType(value: () => MatchType): Self = StObject.set(x, "getMatchType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNegativeKeywordList(value: () => NegativeKeywordList): Self = StObject.set(x, "getNegativeKeywordList", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetText(value: () => String): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
