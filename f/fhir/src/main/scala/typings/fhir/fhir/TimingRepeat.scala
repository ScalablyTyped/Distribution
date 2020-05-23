package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * When the event is to occur
  */
trait TimingRepeat extends Element {
  /**
    * Contains extended information for property 'count'.
    */
  var _count: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'countMax'.
    */
  var _countMax: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'dayOfWeek'.
    */
  var _dayOfWeek: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'duration'.
    */
  var _duration: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'durationMax'.
    */
  var _durationMax: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'durationUnit'.
    */
  var _durationUnit: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'frequency'.
    */
  var _frequency: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'frequencyMax'.
    */
  var _frequencyMax: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'offset'.
    */
  var _offset: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'period'.
    */
  var _period: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'periodMax'.
    */
  var _periodMax: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'periodUnit'.
    */
  var _periodUnit: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'timeOfDay'.
    */
  var _timeOfDay: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'when'.
    */
  var _when: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Length/Range of lengths, or (Start and/or end) limits
    */
  var boundsDuration: js.UndefOr[Duration] = js.undefined
  /**
    * Length/Range of lengths, or (Start and/or end) limits
    */
  var boundsPeriod: js.UndefOr[Period] = js.undefined
  /**
    * Length/Range of lengths, or (Start and/or end) limits
    */
  var boundsRange: js.UndefOr[Range] = js.undefined
  /**
    * Number of times to repeat
    */
  var count: js.UndefOr[integer] = js.undefined
  /**
    * Maximum number of times to repeat
    */
  var countMax: js.UndefOr[integer] = js.undefined
  /**
    * mon | tue | wed | thu | fri | sat | sun
    */
  var dayOfWeek: js.UndefOr[js.Array[code]] = js.undefined
  /**
    * How long when it happens
    */
  var duration: js.UndefOr[decimal] = js.undefined
  /**
    * How long when it happens (Max)
    */
  var durationMax: js.UndefOr[decimal] = js.undefined
  /**
    * s | min | h | d | wk | mo | a - unit of time (UCUM)
    */
  var durationUnit: js.UndefOr[code] = js.undefined
  /**
    * Event occurs frequency times per period
    */
  var frequency: js.UndefOr[integer] = js.undefined
  /**
    * Event occurs up to frequencyMax times per period
    */
  var frequencyMax: js.UndefOr[integer] = js.undefined
  /**
    * Minutes from event (before or after)
    */
  var offset: js.UndefOr[unsignedInt] = js.undefined
  /**
    * Event occurs frequency times per period
    */
  var period: js.UndefOr[decimal] = js.undefined
  /**
    * Upper limit of period (3-4 hours)
    */
  var periodMax: js.UndefOr[decimal] = js.undefined
  /**
    * s | min | h | d | wk | mo | a - unit of time (UCUM)
    */
  var periodUnit: js.UndefOr[code] = js.undefined
  /**
    * Time of day for action
    */
  var timeOfDay: js.UndefOr[js.Array[time]] = js.undefined
  /**
    * Regular life events the event is tied to
    */
  var when: js.UndefOr[js.Array[code]] = js.undefined
}

object TimingRepeat {
  @scala.inline
  def apply(
    _count: Element = null,
    _countMax: Element = null,
    _dayOfWeek: js.Array[Element] = null,
    _duration: Element = null,
    _durationMax: Element = null,
    _durationUnit: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _frequency: Element = null,
    _frequencyMax: Element = null,
    _id: Element = null,
    _offset: Element = null,
    _period: Element = null,
    _periodMax: Element = null,
    _periodUnit: Element = null,
    _timeOfDay: js.Array[Element] = null,
    _when: js.Array[Element] = null,
    boundsDuration: Duration = null,
    boundsPeriod: Period = null,
    boundsRange: Range = null,
    count: js.UndefOr[integer] = js.undefined,
    countMax: js.UndefOr[integer] = js.undefined,
    dayOfWeek: js.Array[code] = null,
    duration: js.UndefOr[decimal] = js.undefined,
    durationMax: js.UndefOr[decimal] = js.undefined,
    durationUnit: code = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    frequency: js.UndefOr[integer] = js.undefined,
    frequencyMax: js.UndefOr[integer] = js.undefined,
    id: String = null,
    offset: js.UndefOr[unsignedInt] = js.undefined,
    period: js.UndefOr[decimal] = js.undefined,
    periodMax: js.UndefOr[decimal] = js.undefined,
    periodUnit: code = null,
    timeOfDay: js.Array[time] = null,
    when: js.Array[code] = null
  ): TimingRepeat = {
    val __obj = js.Dynamic.literal()
    if (_count != null) __obj.updateDynamic("_count")(_count.asInstanceOf[js.Any])
    if (_countMax != null) __obj.updateDynamic("_countMax")(_countMax.asInstanceOf[js.Any])
    if (_dayOfWeek != null) __obj.updateDynamic("_dayOfWeek")(_dayOfWeek.asInstanceOf[js.Any])
    if (_duration != null) __obj.updateDynamic("_duration")(_duration.asInstanceOf[js.Any])
    if (_durationMax != null) __obj.updateDynamic("_durationMax")(_durationMax.asInstanceOf[js.Any])
    if (_durationUnit != null) __obj.updateDynamic("_durationUnit")(_durationUnit.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_frequency != null) __obj.updateDynamic("_frequency")(_frequency.asInstanceOf[js.Any])
    if (_frequencyMax != null) __obj.updateDynamic("_frequencyMax")(_frequencyMax.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_offset != null) __obj.updateDynamic("_offset")(_offset.asInstanceOf[js.Any])
    if (_period != null) __obj.updateDynamic("_period")(_period.asInstanceOf[js.Any])
    if (_periodMax != null) __obj.updateDynamic("_periodMax")(_periodMax.asInstanceOf[js.Any])
    if (_periodUnit != null) __obj.updateDynamic("_periodUnit")(_periodUnit.asInstanceOf[js.Any])
    if (_timeOfDay != null) __obj.updateDynamic("_timeOfDay")(_timeOfDay.asInstanceOf[js.Any])
    if (_when != null) __obj.updateDynamic("_when")(_when.asInstanceOf[js.Any])
    if (boundsDuration != null) __obj.updateDynamic("boundsDuration")(boundsDuration.asInstanceOf[js.Any])
    if (boundsPeriod != null) __obj.updateDynamic("boundsPeriod")(boundsPeriod.asInstanceOf[js.Any])
    if (boundsRange != null) __obj.updateDynamic("boundsRange")(boundsRange.asInstanceOf[js.Any])
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (!js.isUndefined(countMax)) __obj.updateDynamic("countMax")(countMax.get.asInstanceOf[js.Any])
    if (dayOfWeek != null) __obj.updateDynamic("dayOfWeek")(dayOfWeek.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(durationMax)) __obj.updateDynamic("durationMax")(durationMax.get.asInstanceOf[js.Any])
    if (durationUnit != null) __obj.updateDynamic("durationUnit")(durationUnit.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (!js.isUndefined(frequency)) __obj.updateDynamic("frequency")(frequency.get.asInstanceOf[js.Any])
    if (!js.isUndefined(frequencyMax)) __obj.updateDynamic("frequencyMax")(frequencyMax.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(period)) __obj.updateDynamic("period")(period.get.asInstanceOf[js.Any])
    if (!js.isUndefined(periodMax)) __obj.updateDynamic("periodMax")(periodMax.get.asInstanceOf[js.Any])
    if (periodUnit != null) __obj.updateDynamic("periodUnit")(periodUnit.asInstanceOf[js.Any])
    if (timeOfDay != null) __obj.updateDynamic("timeOfDay")(timeOfDay.asInstanceOf[js.Any])
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimingRepeat]
  }
}

