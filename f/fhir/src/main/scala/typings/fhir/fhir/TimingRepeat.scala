package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * When the event is to occur
  */
@js.native
trait TimingRepeat extends Element {
  
  /**
    * Contains extended information for property 'count'.
    */
  var _count: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'countMax'.
    */
  var _countMax: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'dayOfWeek'.
    */
  var _dayOfWeek: js.UndefOr[js.Array[Element]] = js.native
  
  /**
    * Contains extended information for property 'duration'.
    */
  var _duration: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'durationMax'.
    */
  var _durationMax: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'durationUnit'.
    */
  var _durationUnit: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'frequency'.
    */
  var _frequency: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'frequencyMax'.
    */
  var _frequencyMax: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'offset'.
    */
  var _offset: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'period'.
    */
  var _period: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'periodMax'.
    */
  var _periodMax: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'periodUnit'.
    */
  var _periodUnit: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'timeOfDay'.
    */
  var _timeOfDay: js.UndefOr[js.Array[Element]] = js.native
  
  /**
    * Contains extended information for property 'when'.
    */
  var _when: js.UndefOr[js.Array[Element]] = js.native
  
  /**
    * Length/Range of lengths, or (Start and/or end) limits
    */
  var boundsDuration: js.UndefOr[Duration] = js.native
  
  /**
    * Length/Range of lengths, or (Start and/or end) limits
    */
  var boundsPeriod: js.UndefOr[Period] = js.native
  
  /**
    * Length/Range of lengths, or (Start and/or end) limits
    */
  var boundsRange: js.UndefOr[Range] = js.native
  
  /**
    * Number of times to repeat
    */
  var count: js.UndefOr[integer] = js.native
  
  /**
    * Maximum number of times to repeat
    */
  var countMax: js.UndefOr[integer] = js.native
  
  /**
    * mon | tue | wed | thu | fri | sat | sun
    */
  var dayOfWeek: js.UndefOr[js.Array[code]] = js.native
  
  /**
    * How long when it happens
    */
  var duration: js.UndefOr[decimal] = js.native
  
  /**
    * How long when it happens (Max)
    */
  var durationMax: js.UndefOr[decimal] = js.native
  
  /**
    * s | min | h | d | wk | mo | a - unit of time (UCUM)
    */
  var durationUnit: js.UndefOr[code] = js.native
  
  /**
    * Event occurs frequency times per period
    */
  var frequency: js.UndefOr[integer] = js.native
  
  /**
    * Event occurs up to frequencyMax times per period
    */
  var frequencyMax: js.UndefOr[integer] = js.native
  
  /**
    * Minutes from event (before or after)
    */
  var offset: js.UndefOr[unsignedInt] = js.native
  
  /**
    * Event occurs frequency times per period
    */
  var period: js.UndefOr[decimal] = js.native
  
  /**
    * Upper limit of period (3-4 hours)
    */
  var periodMax: js.UndefOr[decimal] = js.native
  
  /**
    * s | min | h | d | wk | mo | a - unit of time (UCUM)
    */
  var periodUnit: js.UndefOr[code] = js.native
  
  /**
    * Time of day for action
    */
  var timeOfDay: js.UndefOr[js.Array[time]] = js.native
  
  /**
    * Regular life events the event is tied to
    */
  var when: js.UndefOr[js.Array[code]] = js.native
}
object TimingRepeat {
  
  @scala.inline
  def apply(): TimingRepeat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimingRepeat]
  }
  
  @scala.inline
  implicit class TimingRepeatMutableBuilder[Self <: TimingRepeat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundsDuration(value: Duration): Self = StObject.set(x, "boundsDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundsDurationUndefined: Self = StObject.set(x, "boundsDuration", js.undefined)
    
    @scala.inline
    def setBoundsPeriod(value: Period): Self = StObject.set(x, "boundsPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundsPeriodUndefined: Self = StObject.set(x, "boundsPeriod", js.undefined)
    
    @scala.inline
    def setBoundsRange(value: Range): Self = StObject.set(x, "boundsRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundsRangeUndefined: Self = StObject.set(x, "boundsRange", js.undefined)
    
    @scala.inline
    def setCount(value: integer): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountMax(value: integer): Self = StObject.set(x, "countMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountMaxUndefined: Self = StObject.set(x, "countMax", js.undefined)
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setDayOfWeek(value: js.Array[code]): Self = StObject.set(x, "dayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayOfWeekUndefined: Self = StObject.set(x, "dayOfWeek", js.undefined)
    
    @scala.inline
    def setDayOfWeekVarargs(value: code*): Self = StObject.set(x, "dayOfWeek", js.Array(value :_*))
    
    @scala.inline
    def setDuration(value: decimal): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationMax(value: decimal): Self = StObject.set(x, "durationMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationMaxUndefined: Self = StObject.set(x, "durationMax", js.undefined)
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setDurationUnit(value: code): Self = StObject.set(x, "durationUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUnitUndefined: Self = StObject.set(x, "durationUnit", js.undefined)
    
    @scala.inline
    def setFrequency(value: integer): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrequencyMax(value: integer): Self = StObject.set(x, "frequencyMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrequencyMaxUndefined: Self = StObject.set(x, "frequencyMax", js.undefined)
    
    @scala.inline
    def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
    
    @scala.inline
    def setOffset(value: unsignedInt): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setPeriod(value: decimal): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodMax(value: decimal): Self = StObject.set(x, "periodMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodMaxUndefined: Self = StObject.set(x, "periodMax", js.undefined)
    
    @scala.inline
    def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    @scala.inline
    def setPeriodUnit(value: code): Self = StObject.set(x, "periodUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodUnitUndefined: Self = StObject.set(x, "periodUnit", js.undefined)
    
    @scala.inline
    def setTimeOfDay(value: js.Array[time]): Self = StObject.set(x, "timeOfDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeOfDayUndefined: Self = StObject.set(x, "timeOfDay", js.undefined)
    
    @scala.inline
    def setTimeOfDayVarargs(value: time*): Self = StObject.set(x, "timeOfDay", js.Array(value :_*))
    
    @scala.inline
    def setWhen(value: js.Array[code]): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
    
    @scala.inline
    def setWhenVarargs(value: code*): Self = StObject.set(x, "when", js.Array(value :_*))
    
    @scala.inline
    def set_count(value: Element): Self = StObject.set(x, "_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_countMax(value: Element): Self = StObject.set(x, "_countMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_countMaxUndefined: Self = StObject.set(x, "_countMax", js.undefined)
    
    @scala.inline
    def set_countUndefined: Self = StObject.set(x, "_count", js.undefined)
    
    @scala.inline
    def set_dayOfWeek(value: js.Array[Element]): Self = StObject.set(x, "_dayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_dayOfWeekUndefined: Self = StObject.set(x, "_dayOfWeek", js.undefined)
    
    @scala.inline
    def set_dayOfWeekVarargs(value: Element*): Self = StObject.set(x, "_dayOfWeek", js.Array(value :_*))
    
    @scala.inline
    def set_duration(value: Element): Self = StObject.set(x, "_duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_durationMax(value: Element): Self = StObject.set(x, "_durationMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_durationMaxUndefined: Self = StObject.set(x, "_durationMax", js.undefined)
    
    @scala.inline
    def set_durationUndefined: Self = StObject.set(x, "_duration", js.undefined)
    
    @scala.inline
    def set_durationUnit(value: Element): Self = StObject.set(x, "_durationUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_durationUnitUndefined: Self = StObject.set(x, "_durationUnit", js.undefined)
    
    @scala.inline
    def set_frequency(value: Element): Self = StObject.set(x, "_frequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_frequencyMax(value: Element): Self = StObject.set(x, "_frequencyMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_frequencyMaxUndefined: Self = StObject.set(x, "_frequencyMax", js.undefined)
    
    @scala.inline
    def set_frequencyUndefined: Self = StObject.set(x, "_frequency", js.undefined)
    
    @scala.inline
    def set_offset(value: Element): Self = StObject.set(x, "_offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_offsetUndefined: Self = StObject.set(x, "_offset", js.undefined)
    
    @scala.inline
    def set_period(value: Element): Self = StObject.set(x, "_period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_periodMax(value: Element): Self = StObject.set(x, "_periodMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_periodMaxUndefined: Self = StObject.set(x, "_periodMax", js.undefined)
    
    @scala.inline
    def set_periodUndefined: Self = StObject.set(x, "_period", js.undefined)
    
    @scala.inline
    def set_periodUnit(value: Element): Self = StObject.set(x, "_periodUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_periodUnitUndefined: Self = StObject.set(x, "_periodUnit", js.undefined)
    
    @scala.inline
    def set_timeOfDay(value: js.Array[Element]): Self = StObject.set(x, "_timeOfDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_timeOfDayUndefined: Self = StObject.set(x, "_timeOfDay", js.undefined)
    
    @scala.inline
    def set_timeOfDayVarargs(value: Element*): Self = StObject.set(x, "_timeOfDay", js.Array(value :_*))
    
    @scala.inline
    def set_when(value: js.Array[Element]): Self = StObject.set(x, "_when", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_whenUndefined: Self = StObject.set(x, "_when", js.undefined)
    
    @scala.inline
    def set_whenVarargs(value: Element*): Self = StObject.set(x, "_when", js.Array(value :_*))
  }
}
