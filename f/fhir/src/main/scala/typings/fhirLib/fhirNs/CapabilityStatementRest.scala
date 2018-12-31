package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * If the endpoint is a RESTful one
  */
trait CapabilityStatementRest extends BackboneElement {
  /**
    * Contains extended information for property 'compartment'.
    */
  var _compartment: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'mode'.
    */
  var _mode: js.UndefOr[Element] = js.undefined
  /**
    * Compartments served/used by system
    */
  var compartment: js.UndefOr[js.Array[uri]] = js.undefined
  /**
    * General description of implementation
    */
  var documentation: js.UndefOr[java.lang.String] = js.undefined
  /**
    * What operations are supported?
    */
  var interaction: js.UndefOr[js.Array[CapabilityStatementRestInteraction]] = js.undefined
  /**
    * client | server
    */
  var mode: code
  /**
    * Definition of an operation or a custom query
    */
  var operation: js.UndefOr[js.Array[CapabilityStatementRestOperation]] = js.undefined
  /**
    * Resource served on the REST interface
    */
  var resource: js.UndefOr[js.Array[CapabilityStatementRestResource]] = js.undefined
  /**
    * Search parameters for searching all resources
    */
  var searchParam: js.UndefOr[js.Array[CapabilityStatementRestResourceSearchParam]] = js.undefined
  /**
    * Information about security of implementation
    */
  var security: js.UndefOr[CapabilityStatementRestSecurity] = js.undefined
}

