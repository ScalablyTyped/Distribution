package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a shared negative keyword. */
trait SharedNegativeKeyword extends StObject {
  
  /** Returns the type of this entity as a String, in this case, "SharedNegativeKeyword". */
  def getEntityType(): String
  
  /** Returns the match type of the negative keyword. */
  def getMatchType(): String
  
  /** Returns the NegativeKeywordList this keyword is in. */
  def getNegativeKeywordList(): NegativeKeywordList
  
  /** Returns the text of the negative keyword. */
  def getText(): String
  
  /** Removes the shared negative keyword. */
  def remove(): Unit
}
object SharedNegativeKeyword {
  
  inline def apply(
    getEntityType: () => String,
    getMatchType: () => String,
    getNegativeKeywordList: () => NegativeKeywordList,
    getText: () => String,
    remove: () => Unit
  ): SharedNegativeKeyword = {
    val __obj = js.Dynamic.literal(getEntityType = js.Any.fromFunction0(getEntityType), getMatchType = js.Any.fromFunction0(getMatchType), getNegativeKeywordList = js.Any.fromFunction0(getNegativeKeywordList), getText = js.Any.fromFunction0(getText), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[SharedNegativeKeyword]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SharedNegativeKeyword] (val x: Self) extends AnyVal {
    
    inline def setGetEntityType(value: () => String): Self = StObject.set(x, "getEntityType", js.Any.fromFunction0(value))
    
    inline def setGetMatchType(value: () => String): Self = StObject.set(x, "getMatchType", js.Any.fromFunction0(value))
    
    inline def setGetNegativeKeywordList(value: () => NegativeKeywordList): Self = StObject.set(x, "getNegativeKeywordList", js.Any.fromFunction0(value))
    
    inline def setGetText(value: () => String): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
