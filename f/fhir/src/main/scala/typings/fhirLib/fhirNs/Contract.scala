package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Legal Agreement
  */
trait Contract extends DomainResource {
  /**
    * Contains extended information for property 'issued'.
    */
  var _issued: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Action stipulated by this Contract
    */
  var action: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Rationale for the stiplulated action
    */
  var actionReason: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Entity being ascribed responsibility
    */
  var agent: js.UndefOr[js.Array[ContractAgent]] = js.undefined
  /**
    * Effective time
    */
  var applies: js.UndefOr[Period] = js.undefined
  /**
    * Authority under which this Contract has standing
    */
  var authority: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Binding Contract
    */
  var bindingAttachment: js.UndefOr[Attachment] = js.undefined
  /**
    * Binding Contract
    */
  var bindingReference: js.UndefOr[Reference] = js.undefined
  /**
    * Content derived from the basal information
    */
  var contentDerivative: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Decision by Grantor
    */
  var decisionType: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Domain in which this Contract applies
    */
  var domain: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Contract Friendly Language
    */
  var friendly: js.UndefOr[js.Array[ContractFriendly]] = js.undefined
  /**
    * Contract number
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
    * When this Contract was issued
    */
  var issued: js.UndefOr[dateTime] = js.undefined
  /**
    * Contract Legal Language
    */
  var legal: js.UndefOr[js.Array[ContractLegal]] = js.undefined
  /**
    * Computable Contract Language
    */
  var rule: js.UndefOr[js.Array[ContractRule]] = js.undefined
  /**
    * Security Labels that define affected resources
    */
  var securityLabel: js.UndefOr[js.Array[Coding]] = js.undefined
  /**
    * Contract Signatory
    */
  var signer: js.UndefOr[js.Array[ContractSigner]] = js.undefined
  /**
    * amended | appended | cancelled | disputed | entered-in-error | executable | executed | negotiable | offered | policy | rejected | renewed | revoked | resolved | terminated
    */
  var status: js.UndefOr[code] = js.undefined
  /**
    * Subtype within the context of type
    */
  var subType: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Contract Target Entity
    */
  var subject: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Contract Term List
    */
  var term: js.UndefOr[js.Array[ContractTerm]] = js.undefined
  /**
    * Context of the Contract
    */
  var topic: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Type or form
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Contract Valued Item List
    */
  var valuedItem: js.UndefOr[js.Array[ContractValuedItem]] = js.undefined
}

