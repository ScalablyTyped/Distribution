package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Goods and Services
  */
trait ClaimItem extends BackboneElement {
  /**
    * Contains extended information for property 'careTeamLinkId'.
    */
  var _careTeamLinkId: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'diagnosisLinkId'.
    */
  var _diagnosisLinkId: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'factor'.
    */
  var _factor: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'informationLinkId'.
    */
  var _informationLinkId: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'procedureLinkId'.
    */
  var _procedureLinkId: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'sequence'.
    */
  var _sequence: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'servicedDate'.
    */
  var _servicedDate: js.UndefOr[Element] = js.undefined
  /**
    * Service Location
    */
  var bodySite: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Applicable careTeam members
    */
  var careTeamLinkId: js.UndefOr[js.Array[positiveInt]] = js.undefined
  /**
    * Type of service or product
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Additional items
    */
  var detail: js.UndefOr[js.Array[ClaimItemDetail]] = js.undefined
  /**
    * Applicable diagnoses
    */
  var diagnosisLinkId: js.UndefOr[js.Array[positiveInt]] = js.undefined
  /**
    * Encounters related to this billed item
    */
  var encounter: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Price scaling factor
    */
  var factor: js.UndefOr[decimal] = js.undefined
  /**
    * Applicable exception and supporting information
    */
  var informationLinkId: js.UndefOr[js.Array[positiveInt]] = js.undefined
  /**
    * Place of service
    */
  var locationAddress: js.UndefOr[Address] = js.undefined
  /**
    * Place of service
    */
  var locationCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Place of service
    */
  var locationReference: js.UndefOr[Reference] = js.undefined
  /**
    * Service/Product billing modifiers
    */
  var modifier: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Total item cost
    */
  var net: js.UndefOr[Money] = js.undefined
  /**
    * Applicable procedures
    */
  var procedureLinkId: js.UndefOr[js.Array[positiveInt]] = js.undefined
  /**
    * Program specific reason for item inclusion
    */
  var programCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Count of Products or Services
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  /**
    * Revenue or cost center code
    */
  var revenue: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Service instance
    */
  var sequence: positiveInt
  /**
    * Billing Code
    */
  var service: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Date or dates of Service
    */
  var servicedDate: js.UndefOr[date] = js.undefined
  /**
    * Date or dates of Service
    */
  var servicedPeriod: js.UndefOr[Period] = js.undefined
  /**
    * Service Sub-location
    */
  var subSite: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Unique Device Identifier
    */
  var udi: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Fee, charge or cost per point
    */
  var unitPrice: js.UndefOr[Money] = js.undefined
}

object ClaimItem {
  @scala.inline
  def apply(
    sequence: positiveInt,
    _careTeamLinkId: js.Array[Element] = null,
    _diagnosisLinkId: js.Array[Element] = null,
    _factor: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _informationLinkId: js.Array[Element] = null,
    _procedureLinkId: js.Array[Element] = null,
    _sequence: Element = null,
    _servicedDate: Element = null,
    bodySite: CodeableConcept = null,
    careTeamLinkId: js.Array[positiveInt] = null,
    category: CodeableConcept = null,
    detail: js.Array[ClaimItemDetail] = null,
    diagnosisLinkId: js.Array[positiveInt] = null,
    encounter: js.Array[Reference] = null,
    extension: js.Array[Extension] = null,
    factor: js.UndefOr[decimal] = js.undefined,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    informationLinkId: js.Array[positiveInt] = null,
    locationAddress: Address = null,
    locationCodeableConcept: CodeableConcept = null,
    locationReference: Reference = null,
    modifier: js.Array[CodeableConcept] = null,
    modifierExtension: js.Array[Extension] = null,
    net: Money = null,
    procedureLinkId: js.Array[positiveInt] = null,
    programCode: js.Array[CodeableConcept] = null,
    quantity: Quantity = null,
    revenue: CodeableConcept = null,
    service: CodeableConcept = null,
    servicedDate: date = null,
    servicedPeriod: Period = null,
    subSite: js.Array[CodeableConcept] = null,
    udi: js.Array[Reference] = null,
    unitPrice: Money = null
  ): ClaimItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sequence")(sequence)
    if (_careTeamLinkId != null) __obj.updateDynamic("_careTeamLinkId")(_careTeamLinkId)
    if (_diagnosisLinkId != null) __obj.updateDynamic("_diagnosisLinkId")(_diagnosisLinkId)
    if (_factor != null) __obj.updateDynamic("_factor")(_factor)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_informationLinkId != null) __obj.updateDynamic("_informationLinkId")(_informationLinkId)
    if (_procedureLinkId != null) __obj.updateDynamic("_procedureLinkId")(_procedureLinkId)
    if (_sequence != null) __obj.updateDynamic("_sequence")(_sequence)
    if (_servicedDate != null) __obj.updateDynamic("_servicedDate")(_servicedDate)
    if (bodySite != null) __obj.updateDynamic("bodySite")(bodySite)
    if (careTeamLinkId != null) __obj.updateDynamic("careTeamLinkId")(careTeamLinkId)
    if (category != null) __obj.updateDynamic("category")(category)
    if (detail != null) __obj.updateDynamic("detail")(detail)
    if (diagnosisLinkId != null) __obj.updateDynamic("diagnosisLinkId")(diagnosisLinkId)
    if (encounter != null) __obj.updateDynamic("encounter")(encounter)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (!js.isUndefined(factor)) __obj.updateDynamic("factor")(factor)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (informationLinkId != null) __obj.updateDynamic("informationLinkId")(informationLinkId)
    if (locationAddress != null) __obj.updateDynamic("locationAddress")(locationAddress)
    if (locationCodeableConcept != null) __obj.updateDynamic("locationCodeableConcept")(locationCodeableConcept)
    if (locationReference != null) __obj.updateDynamic("locationReference")(locationReference)
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (net != null) __obj.updateDynamic("net")(net)
    if (procedureLinkId != null) __obj.updateDynamic("procedureLinkId")(procedureLinkId)
    if (programCode != null) __obj.updateDynamic("programCode")(programCode)
    if (quantity != null) __obj.updateDynamic("quantity")(quantity)
    if (revenue != null) __obj.updateDynamic("revenue")(revenue)
    if (service != null) __obj.updateDynamic("service")(service)
    if (servicedDate != null) __obj.updateDynamic("servicedDate")(servicedDate)
    if (servicedPeriod != null) __obj.updateDynamic("servicedPeriod")(servicedPeriod)
    if (subSite != null) __obj.updateDynamic("subSite")(subSite)
    if (udi != null) __obj.updateDynamic("udi")(udi)
    if (unitPrice != null) __obj.updateDynamic("unitPrice")(unitPrice)
    __obj.asInstanceOf[ClaimItem]
  }
}

