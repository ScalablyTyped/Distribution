package typings
package fhirLib.fhirNs

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

