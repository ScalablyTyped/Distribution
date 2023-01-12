package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FrequencyCaps provides access to each of the frequency cap. */
trait FrequencyCaps extends StObject {
  
  /** Returns the type of this entity as a String, in this case, "FrequencyCaps". */
  def getEntityType(): String
  
  /** Get frequency cap for the chosen event type. */
  def getFrequencyCapFor(): FrequencyCap
  
  /** Returns a new frequency cap builder for the campaign that the frequency caps belong to. */
  def newFrequencyCapBuilder(): FrequencyCapBuilder
  
  /** Remove frequency cap for the chosen event type. */
  def removeFrequencyCapFor(eventType: String): Unit
}
object FrequencyCaps {
  
  inline def apply(
    getEntityType: () => String,
    getFrequencyCapFor: () => FrequencyCap,
    newFrequencyCapBuilder: () => FrequencyCapBuilder,
    removeFrequencyCapFor: String => Unit
  ): FrequencyCaps = {
    val __obj = js.Dynamic.literal(getEntityType = js.Any.fromFunction0(getEntityType), getFrequencyCapFor = js.Any.fromFunction0(getFrequencyCapFor), newFrequencyCapBuilder = js.Any.fromFunction0(newFrequencyCapBuilder), removeFrequencyCapFor = js.Any.fromFunction1(removeFrequencyCapFor))
    __obj.asInstanceOf[FrequencyCaps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FrequencyCaps] (val x: Self) extends AnyVal {
    
    inline def setGetEntityType(value: () => String): Self = StObject.set(x, "getEntityType", js.Any.fromFunction0(value))
    
    inline def setGetFrequencyCapFor(value: () => FrequencyCap): Self = StObject.set(x, "getFrequencyCapFor", js.Any.fromFunction0(value))
    
    inline def setNewFrequencyCapBuilder(value: () => FrequencyCapBuilder): Self = StObject.set(x, "newFrequencyCapBuilder", js.Any.fromFunction0(value))
    
    inline def setRemoveFrequencyCapFor(value: String => Unit): Self = StObject.set(x, "removeFrequencyCapFor", js.Any.fromFunction1(value))
  }
}
