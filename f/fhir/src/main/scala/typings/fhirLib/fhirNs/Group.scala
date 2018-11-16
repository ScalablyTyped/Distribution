package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Group of multiple entities
     */

trait Group extends DomainResource {
  /**
           * Contains extended information for property 'active'.
           */
  var _active: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'actual'.
           */
  var _actual: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'name'.
           */
  var _name: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'quantity'.
           */
  var _quantity: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'type'.
           */
  var _type: js.UndefOr[Element] = js.undefined
  /**
           * Whether this group's record is in active use
           */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Descriptive or actual
           */
  var actual: scala.Boolean
  /**
           * Trait of group members
           */
  var characteristic: js.UndefOr[js.Array[GroupCharacteristic]] = js.undefined
  /**
           * Kind of Group members
           */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Unique id
           */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
           * Who or what is in group
           */
  var member: js.UndefOr[js.Array[GroupMember]] = js.undefined
  /**
           * Label for Group
           */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Number of members
           */
  var quantity: js.UndefOr[unsignedInt] = js.undefined
  /**
           * person | animal | practitioner | device | medication | substance
           */
  var `type`: code
}

