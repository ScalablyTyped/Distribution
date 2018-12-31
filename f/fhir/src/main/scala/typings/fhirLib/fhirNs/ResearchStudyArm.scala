package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defined path through the study for a subject
  */
trait ResearchStudyArm extends BackboneElement {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  /**
    * Categorization of study arm
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Short explanation of study path
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Label for study arm
    */
  var name: java.lang.String
}

