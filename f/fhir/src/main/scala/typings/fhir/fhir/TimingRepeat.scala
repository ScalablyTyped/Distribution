package typings.fhir.fhir

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
  implicit class TimingRepeatOps[Self <: TimingRepeat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_count(value: Element): Self = this.set("_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_count: Self = this.set("_count", js.undefined)
    
    @scala.inline
    def set_countMax(value: Element): Self = this.set("_countMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_countMax: Self = this.set("_countMax", js.undefined)
    
    @scala.inline
    def set_dayOfWeekVarargs(value: Element*): Self = this.set("_dayOfWeek", js.Array(value :_*))
    
    @scala.inline
    def set_dayOfWeek(value: js.Array[Element]): Self = this.set("_dayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_dayOfWeek: Self = this.set("_dayOfWeek", js.undefined)
    
    @scala.inline
    def set_duration(value: Element): Self = this.set("_duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_duration: Self = this.set("_duration", js.undefined)
    
    @scala.inline
    def set_durationMax(value: Element): Self = this.set("_durationMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_durationMax: Self = this.set("_durationMax", js.undefined)
    
    @scala.inline
    def set_durationUnit(value: Element): Self = this.set("_durationUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_durationUnit: Self = this.set("_durationUnit", js.undefined)
    
    @scala.inline
    def set_frequency(value: Element): Self = this.set("_frequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_frequency: Self = this.set("_frequency", js.undefined)
    
    @scala.inline
    def set_frequencyMax(value: Element): Self = this.set("_frequencyMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_frequencyMax: Self = this.set("_frequencyMax", js.undefined)
    
    @scala.inline
    def set_offset(value: Element): Self = this.set("_offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_offset: Self = this.set("_offset", js.undefined)
    
    @scala.inline
    def set_period(value: Element): Self = this.set("_period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_period: Self = this.set("_period", js.undefined)
    
    @scala.inline
    def set_periodMax(value: Element): Self = this.set("_periodMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_periodMax: Self = this.set("_periodMax", js.undefined)
    
    @scala.inline
    def set_periodUnit(value: Element): Self = this.set("_periodUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_periodUnit: Self = this.set("_periodUnit", js.undefined)
    
    @scala.inline
    def set_timeOfDayVarargs(value: Element*): Self = this.set("_timeOfDay", js.Array(value :_*))
    
    @scala.inline
    def set_timeOfDay(value: js.Array[Element]): Self = this.set("_timeOfDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_timeOfDay: Self = this.set("_timeOfDay", js.undefined)
    
    @scala.inline
    def set_whenVarargs(value: Element*): Self = this.set("_when", js.Array(value :_*))
    
    @scala.inline
    def set_when(value: js.Array[Element]): Self = this.set("_when", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_when: Self = this.set("_when", js.undefined)
    
    @scala.inline
    def setBoundsDuration(value: Duration): Self = this.set("boundsDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundsDuration: Self = this.set("boundsDuration", js.undefined)
    
    @scala.inline
    def setBoundsPeriod(value: Period): Self = this.set("boundsPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundsPeriod: Self = this.set("boundsPeriod", js.undefined)
    
    @scala.inline
    def setBoundsRange(value: Range): Self = this.set("boundsRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundsRange: Self = this.set("boundsRange", js.undefined)
    
    @scala.inline
    def setCount(value: integer): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setCountMax(value: integer): Self = this.set("countMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountMax: Self = this.set("countMax", js.undefined)
    
    @scala.inline
    def setDayOfWeekVarargs(value: code*): Self = this.set("dayOfWeek", js.Array(value :_*))
    
    @scala.inline
    def setDayOfWeek(value: js.Array[code]): Self = this.set("dayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayOfWeek: Self = this.set("dayOfWeek", js.undefined)
    
    @scala.inline
    def setDuration(value: decimal): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setDurationMax(value: decimal): Self = this.set("durationMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurationMax: Self = this.set("durationMax", js.undefined)
    
    @scala.inline
    def setDurationUnit(value: code): Self = this.set("durationUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurationUnit: Self = this.set("durationUnit", js.undefined)
    
    @scala.inline
    def setFrequency(value: integer): Self = this.set("frequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrequency: Self = this.set("frequency", js.undefined)
    
    @scala.inline
    def setFrequencyMax(value: integer): Self = this.set("frequencyMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrequencyMax: Self = this.set("frequencyMax", js.undefined)
    
    @scala.inline
    def setOffset(value: unsignedInt): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setPeriod(value: decimal): Self = this.set("period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
    
    @scala.inline
    def setPeriodMax(value: decimal): Self = this.set("periodMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriodMax: Self = this.set("periodMax", js.undefined)
    
    @scala.inline
    def setPeriodUnit(value: code): Self = this.set("periodUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriodUnit: Self = this.set("periodUnit", js.undefined)
    
    @scala.inline
    def setTimeOfDayVarargs(value: time*): Self = this.set("timeOfDay", js.Array(value :_*))
    
    @scala.inline
    def setTimeOfDay(value: js.Array[time]): Self = this.set("timeOfDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeOfDay: Self = this.set("timeOfDay", js.undefined)
    
    @scala.inline
    def setWhenVarargs(value: code*): Self = this.set("when", js.Array(value :_*))
    
    @scala.inline
    def setWhen(value: js.Array[code]): Self = this.set("when", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhen: Self = this.set("when", js.undefined)
  }
}
