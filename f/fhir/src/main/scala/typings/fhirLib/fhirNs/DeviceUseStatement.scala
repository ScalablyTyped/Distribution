package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Record of use of a device
  */
trait DeviceUseStatement extends DomainResource {
  /**
    * Contains extended information for property 'recordedOn'.
    */
  var _recordedOn: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'timingDateTime'.
    */
  var _timingDateTime: js.UndefOr[Element] = js.undefined
  /**
    * Target body site
    */
  var bodySite: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Reference to device used
    */
  var device: Reference
  /**
    * External identifier for this record
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * Why device was used
    */
  var indication: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Addition details (comments, instructions)
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
    * When statement was recorded
    */
  var recordedOn: js.UndefOr[dateTime] = js.undefined
  /**
    * Who made the statement
    */
  var source: js.UndefOr[Reference] = js.undefined
  /**
    * active | completed | entered-in-error +
    */
  var status: code
  /**
    * Patient using device
    */
  var subject: Reference
  /**
    * How often  the device was used
    */
  var timingDateTime: js.UndefOr[dateTime] = js.undefined
  /**
    * How often  the device was used
    */
  var timingPeriod: js.UndefOr[Period] = js.undefined
  /**
    * How often  the device was used
    */
  var timingTiming: js.UndefOr[Timing] = js.undefined
  /**
    * Period device was used
    */
  var whenUsed: js.UndefOr[Period] = js.undefined
}

