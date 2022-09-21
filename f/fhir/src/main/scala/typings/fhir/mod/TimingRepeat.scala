package typings.fhir.mod

import typings.fhir.fhirStrings.a
import typings.fhir.fhirStrings.d
import typings.fhir.fhirStrings.h
import typings.fhir.fhirStrings.min
import typings.fhir.fhirStrings.mo
import typings.fhir.fhirStrings.s
import typings.fhir.fhirStrings.wk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimingRepeat
  extends StObject
     with Element {
  
  var _durationUnits: js.UndefOr[Element] = js.undefined
  
  var _periodUnits: js.UndefOr[Element] = js.undefined
  
  var _when: js.UndefOr[Element] = js.undefined
  
  /**
    * Either a duration for the length of the timing schedule, a range of possible length, or outer bounds for start and/or end limits of the timing schedule.
    */
  var boundsPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * Either a duration for the length of the timing schedule, a range of possible length, or outer bounds for start and/or end limits of the timing schedule.
    */
  var boundsQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Either a duration for the length of the timing schedule, a range of possible length, or outer bounds for start and/or end limits of the timing schedule.
    */
  var boundsRange: js.UndefOr[Range] = js.undefined
  
  /**
    * Repetitions may be limited by end time or total occurrences.
    */
  var count: js.UndefOr[Double] = js.undefined
  
  /**
    * Some activities are not instantaneous and need to be maintained for a period of time.
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * Some activities are not instantaneous and need to be maintained for a period of time.
    */
  var durationMax: js.UndefOr[Double] = js.undefined
  
  /**
    * The units of time for the duration, in UCUM units.
    */
  var durationUnits: js.UndefOr[s | min | h | d | wk | mo | a] = js.undefined
  
  /**
    * The number of times to repeat the action within the specified period / period range (i.e. both period and periodMax provided).
    */
  var frequency: js.UndefOr[Double] = js.undefined
  
  /**
    * If present, indicates that the frequency is a range - so repeat between [frequency] and [frequencyMax] times within the period or period range.
    */
  var frequencyMax: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates the duration of time over which repetitions are to occur; e.g. to express "3 times per day", 3 would be the frequency and "1 day" would be the period.
    */
  var period: js.UndefOr[Double] = js.undefined
  
  /**
    * If present, indicates that the period is a range from [period] to [periodMax], allowing expressing concepts such as "do this once every 3-5 days.
    */
  var periodMax: js.UndefOr[Double] = js.undefined
  
  /**
    * The units of time for the period in UCUM units.
    */
  var periodUnits: js.UndefOr[s | min | h | d | wk | mo | a] = js.undefined
  
  /**
    * Timings are frequently determined by occurrences such as waking, eating and sleep.
    */
  var when: js.UndefOr[String] = js.undefined
}
object TimingRepeat {
  
  inline def apply(): TimingRepeat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimingRepeat]
  }
  
  extension [Self <: TimingRepeat](x: Self) {
    
    inline def setBoundsPeriod(value: Period): Self = StObject.set(x, "boundsPeriod", value.asInstanceOf[js.Any])
    
    inline def setBoundsPeriodUndefined: Self = StObject.set(x, "boundsPeriod", js.undefined)
    
    inline def setBoundsQuantity(value: Quantity): Self = StObject.set(x, "boundsQuantity", value.asInstanceOf[js.Any])
    
    inline def setBoundsQuantityUndefined: Self = StObject.set(x, "boundsQuantity", js.undefined)
    
    inline def setBoundsRange(value: Range): Self = StObject.set(x, "boundsRange", value.asInstanceOf[js.Any])
    
    inline def setBoundsRangeUndefined: Self = StObject.set(x, "boundsRange", js.undefined)
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationMax(value: Double): Self = StObject.set(x, "durationMax", value.asInstanceOf[js.Any])
    
    inline def setDurationMaxUndefined: Self = StObject.set(x, "durationMax", js.undefined)
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setDurationUnits(value: s | min | h | d | wk | mo | a): Self = StObject.set(x, "durationUnits", value.asInstanceOf[js.Any])
    
    inline def setDurationUnitsUndefined: Self = StObject.set(x, "durationUnits", js.undefined)
    
    inline def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setFrequencyMax(value: Double): Self = StObject.set(x, "frequencyMax", value.asInstanceOf[js.Any])
    
    inline def setFrequencyMaxUndefined: Self = StObject.set(x, "frequencyMax", js.undefined)
    
    inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
    
    inline def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodMax(value: Double): Self = StObject.set(x, "periodMax", value.asInstanceOf[js.Any])
    
    inline def setPeriodMaxUndefined: Self = StObject.set(x, "periodMax", js.undefined)
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setPeriodUnits(value: s | min | h | d | wk | mo | a): Self = StObject.set(x, "periodUnits", value.asInstanceOf[js.Any])
    
    inline def setPeriodUnitsUndefined: Self = StObject.set(x, "periodUnits", js.undefined)
    
    inline def setWhen(value: String): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
    
    inline def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
    
    inline def set_durationUnits(value: Element): Self = StObject.set(x, "_durationUnits", value.asInstanceOf[js.Any])
    
    inline def set_durationUnitsUndefined: Self = StObject.set(x, "_durationUnits", js.undefined)
    
    inline def set_periodUnits(value: Element): Self = StObject.set(x, "_periodUnits", value.asInstanceOf[js.Any])
    
    inline def set_periodUnitsUndefined: Self = StObject.set(x, "_periodUnits", js.undefined)
    
    inline def set_when(value: Element): Self = StObject.set(x, "_when", value.asInstanceOf[js.Any])
    
    inline def set_whenUndefined: Self = StObject.set(x, "_when", js.undefined)
  }
}
