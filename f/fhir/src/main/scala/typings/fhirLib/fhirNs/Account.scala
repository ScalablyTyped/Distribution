package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Tracks balance, charges, for patient or cost center
  */
trait Account extends DomainResource {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Time window that transactions may be posted to this account
    */
  var active: js.UndefOr[Period] = js.undefined
  /**
    * How much is in account?
    */
  var balance: js.UndefOr[Money] = js.undefined
  /**
    * The party(s) that are responsible for covering the payment of this account, and what order should they be applied to the account
    */
  var coverage: js.UndefOr[js.Array[AccountCoverage]] = js.undefined
  /**
    * Explanation of purpose/use
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Responsible for the account
    */
  var guarantor: js.UndefOr[js.Array[AccountGuarantor]] = js.undefined
  /**
    * Account number
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * Human-readable label
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Who is responsible?
    */
  var owner: js.UndefOr[Reference] = js.undefined
  /**
    * Transaction window
    */
  var period: js.UndefOr[Period] = js.undefined
  /**
    * active | inactive | entered-in-error
    */
  var status: js.UndefOr[code] = js.undefined
  /**
    * What is account tied to?
    */
  var subject: js.UndefOr[Reference] = js.undefined
  /**
    * E.g. patient, expense, depreciation
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}

