package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * When the expansion profile imposes designation contraints
     */

trait ExpansionProfileDesignation extends BackboneElement {
  /**
           * Designations to be excluded
           */
  var exclude: js.UndefOr[ExpansionProfileDesignationExclude] = js.undefined
  /**
           * Designations to be included
           */
  var include: js.UndefOr[ExpansionProfileDesignationInclude] = js.undefined
}

