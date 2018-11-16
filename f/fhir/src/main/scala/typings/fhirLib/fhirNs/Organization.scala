package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A grouping of people or organizations with a common purpose
     */

trait Organization extends DomainResource {
  /**
           * Contains extended information for property 'active'.
           */
  var _active: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'alias'.
           */
  var _alias: js.UndefOr[js.Array[Element]] = js.undefined
  /**
           * Contains extended information for property 'name'.
           */
  var _name: js.UndefOr[Element] = js.undefined
  /**
           * Whether the organization's record is still in active use
           */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * An address for the organization
           */
  var address: js.UndefOr[js.Array[Address]] = js.undefined
  /**
           * A list of alternate names that the organization is known as, or was known as in the past
           */
  var alias: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
           * Contact for the organization for a certain purpose
           */
  var contact: js.UndefOr[js.Array[OrganizationContact]] = js.undefined
  /**
           * Technical endpoints providing access to services operated for the organization
           */
  var endpoint: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Identifies this organization  across multiple systems
           */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
           * Name used for the organization
           */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The organization of which this organization forms a part
           */
  var partOf: js.UndefOr[Reference] = js.undefined
  /**
           * A contact detail for the organization
           */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.undefined
  /**
           * Kind of organization
           */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}

