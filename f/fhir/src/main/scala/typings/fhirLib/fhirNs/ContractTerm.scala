package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Contract Term List
     */

trait ContractTerm extends BackboneElement {
  /**
           * Contains extended information for property 'issued'.
           */
  var _issued: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'text'.
           */
  var _text: js.UndefOr[Element] = js.undefined
  /**
           * Contract Term Activity
           */
  var action: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * Purpose for the Contract Term Action
           */
  var actionReason: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * Contract Term Agent List
           */
  var agent: js.UndefOr[js.Array[ContractTermAgent]] = js.undefined
  /**
           * Contract Term Effective Time
           */
  var applies: js.UndefOr[Period] = js.undefined
  /**
           * Nested Contract Term Group
           */
  var group: js.UndefOr[js.Array[ContractTerm]] = js.undefined
  /**
           * Contract Term Number
           */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
           * Contract Term Issue Date Time
           */
  var issued: js.UndefOr[dateTime] = js.undefined
  /**
           * Security Labels that define affected terms
           */
  var securityLabel: js.UndefOr[js.Array[Coding]] = js.undefined
  /**
           * Contract Term Type specific classification
           */
  var subType: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Human readable Contract term text
           */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Context of the Contract term
           */
  var topic: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Contract Term Type or Form
           */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Contract Term Valued Item List
           */
  var valuedItem: js.UndefOr[js.Array[ContractTermValuedItem]] = js.undefined
}

