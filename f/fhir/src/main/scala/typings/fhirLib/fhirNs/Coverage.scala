package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Insurance or medical plan or a payment agreement
  */
trait Coverage extends DomainResource {
  /**
    * Contains extended information for property 'dependent'.
    */
  var _dependent: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'network'.
    */
  var _network: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'order'.
    */
  var _order: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'sequence'.
    */
  var _sequence: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'subscriberId'.
    */
  var _subscriberId: js.UndefOr[Element] = js.undefined
  /**
    * Plan Beneficiary
    */
  var beneficiary: js.UndefOr[Reference] = js.undefined
  /**
    * Contract details
    */
  var contract: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Dependent number
    */
  var dependent: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Additional coverage classifications
    */
  var grouping: js.UndefOr[CoverageGrouping] = js.undefined
  /**
    * The primary coverage ID
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * Insurer network
    */
  var network: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Relative order of the coverage
    */
  var order: js.UndefOr[positiveInt] = js.undefined
  /**
    * Identifier for the plan or agreement issuer
    */
  var payor: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Coverage start and end dates
    */
  var period: js.UndefOr[Period] = js.undefined
  /**
    * Owner of the policy
    */
  var policyHolder: js.UndefOr[Reference] = js.undefined
  /**
    * Beneficiary relationship to the Subscriber
    */
  var relationship: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * The plan instance or sequence counter
    */
  var sequence: js.UndefOr[java.lang.String] = js.undefined
  /**
    * active | cancelled | draft | entered-in-error
    */
  var status: js.UndefOr[code] = js.undefined
  /**
    * Subscriber to the policy
    */
  var subscriber: js.UndefOr[Reference] = js.undefined
  /**
    * ID assigned to the Subscriber
    */
  var subscriberId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Type of coverage such as medical or accident
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}

