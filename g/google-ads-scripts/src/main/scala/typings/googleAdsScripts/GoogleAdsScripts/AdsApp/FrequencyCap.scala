package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads frequency cap. */
trait FrequencyCap extends StObject {
  
  /** Returns the type of this entity as a String, in this case, "FrequencyCap". */
  def getEntityType(): String
  
  /** Returns type of event that the cap applies to. */
  def getEventType(): String
  
  /** Returns the level on which the cap is to be applied. */
  def getLevel(): String
  
  /** Returns the cap number for the frequency cap. */
  def getLimit(): Double
  
  /** Returns the unit of time the cap is defined at. */
  def getTimeUnit(): String
}
object FrequencyCap {
  
  inline def apply(
    getEntityType: () => String,
    getEventType: () => String,
    getLevel: () => String,
    getLimit: () => Double,
    getTimeUnit: () => String
  ): FrequencyCap = {
    val __obj = js.Dynamic.literal(getEntityType = js.Any.fromFunction0(getEntityType), getEventType = js.Any.fromFunction0(getEventType), getLevel = js.Any.fromFunction0(getLevel), getLimit = js.Any.fromFunction0(getLimit), getTimeUnit = js.Any.fromFunction0(getTimeUnit))
    __obj.asInstanceOf[FrequencyCap]
  }
  
  extension [Self <: FrequencyCap](x: Self) {
    
    inline def setGetEntityType(value: () => String): Self = StObject.set(x, "getEntityType", js.Any.fromFunction0(value))
    
    inline def setGetEventType(value: () => String): Self = StObject.set(x, "getEventType", js.Any.fromFunction0(value))
    
    inline def setGetLevel(value: () => String): Self = StObject.set(x, "getLevel", js.Any.fromFunction0(value))
    
    inline def setGetLimit(value: () => Double): Self = StObject.set(x, "getLimit", js.Any.fromFunction0(value))
    
    inline def setGetTimeUnit(value: () => String): Self = StObject.set(x, "getTimeUnit", js.Any.fromFunction0(value))
  }
}
