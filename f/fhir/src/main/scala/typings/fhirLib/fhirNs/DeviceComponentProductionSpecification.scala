package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specification details such as Component Revisions, or Serial Numbers
  */
trait DeviceComponentProductionSpecification extends BackboneElement {
  /**
    * Contains extended information for property 'productionSpec'.
    */
  var _productionSpec: js.UndefOr[Element] = js.undefined
  /**
    * Internal component unique identification
    */
  var componentId: js.UndefOr[Identifier] = js.undefined
  /**
    * A printable string defining the component
    */
  var productionSpec: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Type or kind of production specification, for example serial number or software revision
    */
  var specType: js.UndefOr[CodeableConcept] = js.undefined
}

