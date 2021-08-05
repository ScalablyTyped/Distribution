package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedNegativeKeyword
  extends StObject
     with AdWordsEntity {
  
  def getMatchType(): MatchType
  
  def getNegativeKeywordList(): NegativeKeywordList
  
  def getText(): String
  
  def remove(): Unit
}
object SharedNegativeKeyword {
  
  inline def apply(
    getMatchType: () => MatchType,
    getNegativeKeywordList: () => NegativeKeywordList,
    getText: () => String,
    remove: () => Unit
  ): SharedNegativeKeyword = {
    val __obj = js.Dynamic.literal(getMatchType = js.Any.fromFunction0(getMatchType), getNegativeKeywordList = js.Any.fromFunction0(getNegativeKeywordList), getText = js.Any.fromFunction0(getText), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[SharedNegativeKeyword]
  }
  
  extension [Self <: SharedNegativeKeyword](x: Self) {
    
    inline def setGetMatchType(value: () => MatchType): Self = StObject.set(x, "getMatchType", js.Any.fromFunction0(value))
    
    inline def setGetNegativeKeywordList(value: () => NegativeKeywordList): Self = StObject.set(x, "getNegativeKeywordList", js.Any.fromFunction0(value))
    
    inline def setGetText(value: () => String): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
