package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Processing and processing step details
     */

trait SpecimenProcessing extends BackboneElement {
  /**
           * Contains extended information for property 'description'.
           */
  var _description: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'timeDateTime'.
           */
  var _timeDateTime: js.UndefOr[Element] = js.undefined
  /**
           * Material used in the processing step
           */
  var additive: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Textual description of procedure
           */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Indicates the treatment step  applied to the specimen
           */
  var procedure: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Date and time of specimen processing
           */
  var timeDateTime: js.UndefOr[dateTime] = js.undefined
  /**
           * Date and time of specimen processing
           */
  var timePeriod: js.UndefOr[Period] = js.undefined
}

