package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Potential target for the link
  */
trait GraphDefinitionLinkTarget extends BackboneElement {
  /**
    * Contains extended information for property 'profile'.
    */
  var _profile: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  /**
    * Compartment Consistency Rules
    */
  var compartment: js.UndefOr[js.Array[GraphDefinitionLinkTargetCompartment]] = js.undefined
  /**
    * Additional links from target resource
    */
  var link: js.UndefOr[js.Array[GraphDefinitionLink]] = js.undefined
  /**
    * Profile for the target resource
    */
  var profile: js.UndefOr[uri] = js.undefined
  /**
    * Type of resource this link refers to
    */
  var `type`: code
}

