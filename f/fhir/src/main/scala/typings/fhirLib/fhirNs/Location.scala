package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Details and position information for a physical place
     */

trait Location extends DomainResource {
  /**
           * Contains extended information for property 'alias'.
           */
  var _alias: js.UndefOr[js.Array[Element]] = js.undefined
  /**
           * Contains extended information for property 'description'.
           */
  var _description: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'mode'.
           */
  var _mode: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'name'.
           */
  var _name: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'status'.
           */
  var _status: js.UndefOr[Element] = js.undefined
  /**
           * Physical location
           */
  var address: js.UndefOr[Address] = js.undefined
  /**
           * A list of alternate names that the location is known as, or was known as in the past
           */
  var alias: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
           * Additional details about the location that could be displayed as further information to identify the location beyond its name
           */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Technical endpoints providing access to services operated for the location
           */
  var endpoint: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Unique code or number identifying the location to its users
           */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
           * Organization responsible for provisioning and upkeep
           */
  var managingOrganization: js.UndefOr[Reference] = js.undefined
  /**
           * instance | kind
           */
  var mode: js.UndefOr[code] = js.undefined
  /**
           * Name of the location as used by humans
           */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The Operational status of the location (typically only for a bed/room)
           */
  var operationalStatus: js.UndefOr[Coding] = js.undefined
  /**
           * Another Location this one is physically part of
           */
  var partOf: js.UndefOr[Reference] = js.undefined
  /**
           * Physical form of the location
           */
  var physicalType: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * The absolute geographic location
           */
  var position: js.UndefOr[LocationPosition] = js.undefined
  /**
           * active | suspended | inactive
           */
  var status: js.UndefOr[code] = js.undefined
  /**
           * Contact details of the location
           */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.undefined
  /**
           * Type of function performed
           */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}

