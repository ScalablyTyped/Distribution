package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Sample for analysis
     */

trait Specimen extends DomainResource {
  /**
           * Contains extended information for property 'receivedTime'.
           */
  var _receivedTime: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'status'.
           */
  var _status: js.UndefOr[Element] = js.undefined
  /**
           * Identifier assigned by the lab
           */
  var accessionIdentifier: js.UndefOr[Identifier] = js.undefined
  /**
           * Collection details
           */
  var collection: js.UndefOr[SpecimenCollection] = js.undefined
  /**
           * Direct container of specimen (tube/slide, etc.)
           */
  var container: js.UndefOr[js.Array[SpecimenContainer]] = js.undefined
  /**
           * External Identifier
           */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
           * Comments
           */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
           * Specimen from which this specimen originated
           */
  var parent: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Processing and processing step details
           */
  var processing: js.UndefOr[js.Array[SpecimenProcessing]] = js.undefined
  /**
           * The time when specimen was received for processing
           */
  var receivedTime: js.UndefOr[dateTime] = js.undefined
  /**
           * Why the specimen was collected
           */
  var request: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * available | unavailable | unsatisfactory | entered-in-error
           */
  var status: js.UndefOr[code] = js.undefined
  /**
           * Where the specimen came from. This may be from the patient(s) or from the environment or a device
           */
  var subject: Reference
  /**
           * Kind of material that forms the specimen
           */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}

