package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Builder for FrequencyCap objects. */
trait FrequencyCapBuilder extends StObject {
  
  /** Builds the frequency cap. */
  def build(): Unit
  
  /** Set the event type to the new frequency cap. */
  def withEventType(eventType: String): this.type
  
  /** Set the cap number to the new frequency cap. */
  def withLimit(limit: Double): this.type
  
  /** Set the time unit to the new frequency cap. */
  def withTimeUnit(timeUnit: String): this.type
}
object FrequencyCapBuilder {
  
  inline def apply(
    build: () => Unit,
    withEventType: String => FrequencyCapBuilder,
    withLimit: Double => FrequencyCapBuilder,
    withTimeUnit: String => FrequencyCapBuilder
  ): FrequencyCapBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withEventType = js.Any.fromFunction1(withEventType), withLimit = js.Any.fromFunction1(withLimit), withTimeUnit = js.Any.fromFunction1(withTimeUnit))
    __obj.asInstanceOf[FrequencyCapBuilder]
  }
  
  extension [Self <: FrequencyCapBuilder](x: Self) {
    
    inline def setBuild(value: () => Unit): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    
    inline def setWithEventType(value: String => FrequencyCapBuilder): Self = StObject.set(x, "withEventType", js.Any.fromFunction1(value))
    
    inline def setWithLimit(value: Double => FrequencyCapBuilder): Self = StObject.set(x, "withLimit", js.Any.fromFunction1(value))
    
    inline def setWithTimeUnit(value: String => FrequencyCapBuilder): Self = StObject.set(x, "withTimeUnit", js.Any.fromFunction1(value))
  }
}
