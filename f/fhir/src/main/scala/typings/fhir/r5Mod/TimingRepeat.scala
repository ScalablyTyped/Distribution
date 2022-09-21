package typings.fhir.r5Mod

import typings.fhir.fhirStrings.a
import typings.fhir.fhirStrings.d
import typings.fhir.fhirStrings.fri
import typings.fhir.fhirStrings.h
import typings.fhir.fhirStrings.min
import typings.fhir.fhirStrings.mo
import typings.fhir.fhirStrings.mon
import typings.fhir.fhirStrings.s
import typings.fhir.fhirStrings.sat
import typings.fhir.fhirStrings.sun
import typings.fhir.fhirStrings.thu
import typings.fhir.fhirStrings.tue
import typings.fhir.fhirStrings.wed
import typings.fhir.fhirStrings.wk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimingRepeat
  extends StObject
     with Element {
  
  var _dayOfWeek: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _durationUnit: js.UndefOr[Element] = js.undefined
  
  var _periodUnit: js.UndefOr[Element] = js.undefined
  
  var _timeOfDay: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _when: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Either a duration for the length of the timing schedule, a range of possible length, or outer bounds for start and/or end limits of the timing schedule.
    */
  var boundsDuration: js.UndefOr[Duration] = js.undefined
  
  /**
    * Either a duration for the length of the timing schedule, a range of possible length, or outer bounds for start and/or end limits of the timing schedule.
    */
  var boundsPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * Either a duration for the length of the timing schedule, a range of possible length, or outer bounds for start and/or end limits of the timing schedule.
    */
  var boundsRange: js.UndefOr[Range] = js.undefined
  
  /**
    * If you have both bounds and count, then this should be understood as within the bounds period, until count times happens.
    */
  var count: js.UndefOr[Double] = js.undefined
  
  /**
    * If present, indicates that the count is a range - so to perform the action between [count] and [countMax] times.
    */
  var countMax: js.UndefOr[Double] = js.undefined
  
  /**
    * If no days are specified, the action is assumed to happen every day as otherwise specified.
    */
  var dayOfWeek: js.UndefOr[js.Array[mon | tue | wed | thu | fri | sat | sun]] = js.undefined
  
  /**
    * For some events the duration is part of the definition of the event (e.g. IV infusions, where the duration is implicit in the specified quantity and rate). For others, it's part of the timing specification (e.g. exercise).
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * For some events the duration is part of the definition of the event (e.g. IV infusions, where the duration is implicit in the specified quantity and rate). For others, it's part of the timing specification (e.g. exercise).
    */
  var durationMax: js.UndefOr[Double] = js.undefined
  
  /**
    * The units of time for the duration, in UCUM units
    * Normal practice is to use the 'mo' code as a calendar month when calculating the next occurrence.
    */
  var durationUnit: js.UndefOr[s | min | h | d | wk | mo | a] = js.undefined
  
  /**
    * The number of times to repeat the action within the specified period. If frequencyMax is present, this element indicates the lower bound of the allowed range of the frequency.
    */
  var frequency: js.UndefOr[Double] = js.undefined
  
  /**
    * If present, indicates that the frequency is a range - so to repeat between [frequency] and [frequencyMax] times within the period or period range.
    */
  var frequencyMax: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of minutes from the event. If the event code does not indicate whether the minutes is before or after the event, then the offset is assumed to be after the event.
    */
  var offset: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates the duration of time over which repetitions are to occur; e.g. to express "3 times per day", 3 would be the frequency and "1 day" would be the period. If periodMax is present, this element indicates the lower bound of the allowed range of the period length.
    */
  var period: js.UndefOr[Double] = js.undefined
  
  /**
    * If present, indicates that the period is a range from [period] to [periodMax], allowing expressing concepts such as "do this once every 3-5 days.
    */
  var periodMax: js.UndefOr[Double] = js.undefined
  
  /**
    * The units of time for the period in UCUM units
    * Normal practice is to use the 'mo' code as a calendar month when calculating the next occurrence.
    */
  var periodUnit: js.UndefOr[s | min | h | d | wk | mo | a] = js.undefined
  
  /**
    * When time of day is specified, it is inferred that the action happens every day (as filtered by dayofWeek) on the specified times. If there's a timeOfDay, there cannot be a when, or vice versa.
    */
  var timeOfDay: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * When more than one event is listed, the event is tied to the union of the specified events.
    */
  var when: js.UndefOr[js.Array[String]] = js.undefined
}
object TimingRepeat {
  
  inline def apply(): TimingRepeat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimingRepeat]
  }
  
  extension [Self <: TimingRepeat](x: Self) {
    
    inline def setBoundsDuration(value: Duration): Self = StObject.set(x, "boundsDuration", value.asInstanceOf[js.Any])
    
    inline def setBoundsDurationUndefined: Self = StObject.set(x, "boundsDuration", js.undefined)
    
    inline def setBoundsPeriod(value: Period): Self = StObject.set(x, "boundsPeriod", value.asInstanceOf[js.Any])
    
    inline def setBoundsPeriodUndefined: Self = StObject.set(x, "boundsPeriod", js.undefined)
    
    inline def setBoundsRange(value: Range): Self = StObject.set(x, "boundsRange", value.asInstanceOf[js.Any])
    
    inline def setBoundsRangeUndefined: Self = StObject.set(x, "boundsRange", js.undefined)
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountMax(value: Double): Self = StObject.set(x, "countMax", value.asInstanceOf[js.Any])
    
    inline def setCountMaxUndefined: Self = StObject.set(x, "countMax", js.undefined)
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setDayOfWeek(value: js.Array[mon | tue | wed | thu | fri | sat | sun]): Self = StObject.set(x, "dayOfWeek", value.asInstanceOf[js.Any])
    
    inline def setDayOfWeekUndefined: Self = StObject.set(x, "dayOfWeek", js.undefined)
    
    inline def setDayOfWeekVarargs(value: (mon | tue | wed | thu | fri | sat | sun)*): Self = StObject.set(x, "dayOfWeek", js.Array(value*))
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationMax(value: Double): Self = StObject.set(x, "durationMax", value.asInstanceOf[js.Any])
    
    inline def setDurationMaxUndefined: Self = StObject.set(x, "durationMax", js.undefined)
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setDurationUnit(value: s | min | h | d | wk | mo | a): Self = StObject.set(x, "durationUnit", value.asInstanceOf[js.Any])
    
    inline def setDurationUnitUndefined: Self = StObject.set(x, "durationUnit", js.undefined)
    
    inline def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setFrequencyMax(value: Double): Self = StObject.set(x, "frequencyMax", value.asInstanceOf[js.Any])
    
    inline def setFrequencyMaxUndefined: Self = StObject.set(x, "frequencyMax", js.undefined)
    
    inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodMax(value: Double): Self = StObject.set(x, "periodMax", value.asInstanceOf[js.Any])
    
    inline def setPeriodMaxUndefined: Self = StObject.set(x, "periodMax", js.undefined)
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setPeriodUnit(value: s | min | h | d | wk | mo | a): Self = StObject.set(x, "periodUnit", value.asInstanceOf[js.Any])
    
    inline def setPeriodUnitUndefined: Self = StObject.set(x, "periodUnit", js.undefined)
    
    inline def setTimeOfDay(value: js.Array[String]): Self = StObject.set(x, "timeOfDay", value.asInstanceOf[js.Any])
    
    inline def setTimeOfDayUndefined: Self = StObject.set(x, "timeOfDay", js.undefined)
    
    inline def setTimeOfDayVarargs(value: String*): Self = StObject.set(x, "timeOfDay", js.Array(value*))
    
    inline def setWhen(value: js.Array[String]): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
    
    inline def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
    
    inline def setWhenVarargs(value: String*): Self = StObject.set(x, "when", js.Array(value*))
    
    inline def set_dayOfWeek(value: js.Array[Element]): Self = StObject.set(x, "_dayOfWeek", value.asInstanceOf[js.Any])
    
    inline def set_dayOfWeekUndefined: Self = StObject.set(x, "_dayOfWeek", js.undefined)
    
    inline def set_dayOfWeekVarargs(value: Element*): Self = StObject.set(x, "_dayOfWeek", js.Array(value*))
    
    inline def set_durationUnit(value: Element): Self = StObject.set(x, "_durationUnit", value.asInstanceOf[js.Any])
    
    inline def set_durationUnitUndefined: Self = StObject.set(x, "_durationUnit", js.undefined)
    
    inline def set_periodUnit(value: Element): Self = StObject.set(x, "_periodUnit", value.asInstanceOf[js.Any])
    
    inline def set_periodUnitUndefined: Self = StObject.set(x, "_periodUnit", js.undefined)
    
    inline def set_timeOfDay(value: js.Array[Element]): Self = StObject.set(x, "_timeOfDay", value.asInstanceOf[js.Any])
    
    inline def set_timeOfDayUndefined: Self = StObject.set(x, "_timeOfDay", js.undefined)
    
    inline def set_timeOfDayVarargs(value: Element*): Self = StObject.set(x, "_timeOfDay", js.Array(value*))
    
    inline def set_when(value: js.Array[Element]): Self = StObject.set(x, "_when", value.asInstanceOf[js.Any])
    
    inline def set_whenUndefined: Self = StObject.set(x, "_when", js.undefined)
    
    inline def set_whenVarargs(value: Element*): Self = StObject.set(x, "_when", js.Array(value*))
  }
}
