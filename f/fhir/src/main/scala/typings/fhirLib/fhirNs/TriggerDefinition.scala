package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines an expected trigger for a module
  */
trait TriggerDefinition extends Element {
  /**
    * Contains extended information for property 'eventName'.
    */
  var _eventName: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'eventTimingDate'.
    */
  var _eventTimingDate: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'eventTimingDateTime'.
    */
  var _eventTimingDateTime: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  /**
    * Triggering data of the event
    */
  var eventData: js.UndefOr[DataRequirement] = js.undefined
  /**
    * Triggering event name
    */
  var eventName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Timing of the event
    */
  var eventTimingDate: js.UndefOr[date] = js.undefined
  /**
    * Timing of the event
    */
  var eventTimingDateTime: js.UndefOr[dateTime] = js.undefined
  /**
    * Timing of the event
    */
  var eventTimingReference: js.UndefOr[Reference] = js.undefined
  /**
    * Timing of the event
    */
  var eventTimingTiming: js.UndefOr[Timing] = js.undefined
  /**
    * named-event | periodic | data-added | data-modified | data-removed | data-accessed | data-access-ended
    */
  var `type`: code
}

