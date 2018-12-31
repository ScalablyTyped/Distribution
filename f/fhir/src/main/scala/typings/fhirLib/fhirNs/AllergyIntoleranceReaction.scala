package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Adverse Reaction Events linked to exposure to substance
  */
trait AllergyIntoleranceReaction extends BackboneElement {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'onset'.
    */
  var _onset: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'severity'.
    */
  var _severity: js.UndefOr[Element] = js.undefined
  /**
    * Description of the event as a whole
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * How the subject was exposed to the substance
    */
  var exposureRoute: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Clinical symptoms/signs associated with the Event
    */
  var manifestation: js.Array[CodeableConcept]
  /**
    * Text about event not captured in other fields
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
    * Date(/time) when manifestations showed
    */
  var onset: js.UndefOr[dateTime] = js.undefined
  /**
    * mild | moderate | severe (of event as a whole)
    */
  var severity: js.UndefOr[code] = js.undefined
  /**
    * Specific substance or pharmaceutical product considered to be responsible for event
    */
  var substance: js.UndefOr[CodeableConcept] = js.undefined
}

