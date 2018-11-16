package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Snapshot view of the structure
     */

trait StructureDefinitionSnapshot extends BackboneElement {
  /**
           * Definition of elements in the resource (if no StructureDefinition)
           */
  var element: js.Array[ElementDefinition]
}

