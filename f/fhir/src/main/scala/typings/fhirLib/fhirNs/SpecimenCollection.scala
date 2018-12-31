package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Collection details
  */
trait SpecimenCollection extends BackboneElement {
  /**
    * Contains extended information for property 'collectedDateTime'.
    */
  var _collectedDateTime: js.UndefOr[Element] = js.undefined
  /**
    * Anatomical collection site
    */
  var bodySite: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Collection time
    */
  var collectedDateTime: js.UndefOr[dateTime] = js.undefined
  /**
    * Collection time
    */
  var collectedPeriod: js.UndefOr[Period] = js.undefined
  /**
    * Who collected the specimen
    */
  var collector: js.UndefOr[Reference] = js.undefined
  /**
    * Technique used to perform collection
    */
  var method: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * The quantity of specimen collected
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
}

