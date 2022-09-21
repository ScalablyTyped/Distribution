package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads ad param. */
trait AdParam extends StObject {
  
  /** Returns the ad group to which this ad param belongs. */
  def getAdGroup(): AdGroup
  
  /** Returns the base ad group to which this ad param belongs. */
  def getBaseAdGroup(): AdGroup
  
  /** Returns the type of this entity as a String, in this case, "AdParam". */
  def getEntityType(): String
  
  /** Returns the index of the ad param. */
  def getIndex(): Double
  
  /** Returns the insertion text of the ad param. */
  def getInsertionText(): String
  
  /** Returns the Keyword the ad param belongs to. */
  def getKeyword(): Keyword
  
  /** Removes the ad param. */
  def remove(): Unit
  
  /** Sets the insertion text of the ad param to the specified value. */
  def setInsertionText(insertionText: String): Unit
}
object AdParam {
  
  inline def apply(
    getAdGroup: () => AdGroup,
    getBaseAdGroup: () => AdGroup,
    getEntityType: () => String,
    getIndex: () => Double,
    getInsertionText: () => String,
    getKeyword: () => Keyword,
    remove: () => Unit,
    setInsertionText: String => Unit
  ): AdParam = {
    val __obj = js.Dynamic.literal(getAdGroup = js.Any.fromFunction0(getAdGroup), getBaseAdGroup = js.Any.fromFunction0(getBaseAdGroup), getEntityType = js.Any.fromFunction0(getEntityType), getIndex = js.Any.fromFunction0(getIndex), getInsertionText = js.Any.fromFunction0(getInsertionText), getKeyword = js.Any.fromFunction0(getKeyword), remove = js.Any.fromFunction0(remove), setInsertionText = js.Any.fromFunction1(setInsertionText))
    __obj.asInstanceOf[AdParam]
  }
  
  extension [Self <: AdParam](x: Self) {
    
    inline def setGetAdGroup(value: () => AdGroup): Self = StObject.set(x, "getAdGroup", js.Any.fromFunction0(value))
    
    inline def setGetBaseAdGroup(value: () => AdGroup): Self = StObject.set(x, "getBaseAdGroup", js.Any.fromFunction0(value))
    
    inline def setGetEntityType(value: () => String): Self = StObject.set(x, "getEntityType", js.Any.fromFunction0(value))
    
    inline def setGetIndex(value: () => Double): Self = StObject.set(x, "getIndex", js.Any.fromFunction0(value))
    
    inline def setGetInsertionText(value: () => String): Self = StObject.set(x, "getInsertionText", js.Any.fromFunction0(value))
    
    inline def setGetKeyword(value: () => Keyword): Self = StObject.set(x, "getKeyword", js.Any.fromFunction0(value))
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    
    inline def setSetInsertionText(value: String => Unit): Self = StObject.set(x, "setInsertionText", js.Any.fromFunction1(value))
  }
}
