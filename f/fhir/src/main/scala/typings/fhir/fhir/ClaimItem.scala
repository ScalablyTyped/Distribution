package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Goods and Services
  */
@js.native
trait ClaimItem extends BackboneElement {
  /**
    * Contains extended information for property 'careTeamLinkId'.
    */
  var _careTeamLinkId: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'diagnosisLinkId'.
    */
  var _diagnosisLinkId: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'factor'.
    */
  var _factor: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'informationLinkId'.
    */
  var _informationLinkId: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'procedureLinkId'.
    */
  var _procedureLinkId: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'sequence'.
    */
  var _sequence: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'servicedDate'.
    */
  var _servicedDate: js.UndefOr[Element] = js.native
  /**
    * Service Location
    */
  var bodySite: js.UndefOr[CodeableConcept] = js.native
  /**
    * Applicable careTeam members
    */
  var careTeamLinkId: js.UndefOr[js.Array[positiveInt]] = js.native
  /**
    * Type of service or product
    */
  var category: js.UndefOr[CodeableConcept] = js.native
  /**
    * Additional items
    */
  var detail: js.UndefOr[js.Array[ClaimItemDetail]] = js.native
  /**
    * Applicable diagnoses
    */
  var diagnosisLinkId: js.UndefOr[js.Array[positiveInt]] = js.native
  /**
    * Encounters related to this billed item
    */
  var encounter: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Price scaling factor
    */
  var factor: js.UndefOr[decimal] = js.native
  /**
    * Applicable exception and supporting information
    */
  var informationLinkId: js.UndefOr[js.Array[positiveInt]] = js.native
  /**
    * Place of service
    */
  var locationAddress: js.UndefOr[Address] = js.native
  /**
    * Place of service
    */
  var locationCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  /**
    * Place of service
    */
  var locationReference: js.UndefOr[Reference] = js.native
  /**
    * Service/Product billing modifiers
    */
  var modifier: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Total item cost
    */
  var net: js.UndefOr[Money] = js.native
  /**
    * Applicable procedures
    */
  var procedureLinkId: js.UndefOr[js.Array[positiveInt]] = js.native
  /**
    * Program specific reason for item inclusion
    */
  var programCode: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Count of Products or Services
    */
  var quantity: js.UndefOr[Quantity] = js.native
  /**
    * Revenue or cost center code
    */
  var revenue: js.UndefOr[CodeableConcept] = js.native
  /**
    * Service instance
    */
  var sequence: positiveInt = js.native
  /**
    * Billing Code
    */
  var service: js.UndefOr[CodeableConcept] = js.native
  /**
    * Date or dates of Service
    */
  var servicedDate: js.UndefOr[date] = js.native
  /**
    * Date or dates of Service
    */
  var servicedPeriod: js.UndefOr[Period] = js.native
  /**
    * Service Sub-location
    */
  var subSite: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Unique Device Identifier
    */
  var udi: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Fee, charge or cost per point
    */
  var unitPrice: js.UndefOr[Money] = js.native
}

object ClaimItem {
  @scala.inline
  def apply(sequence: positiveInt): ClaimItem = {
    val __obj = js.Dynamic.literal(sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimItem]
  }
  @scala.inline
  implicit class ClaimItemOps[Self <: ClaimItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSequence(value: positiveInt): Self = this.set("sequence", value.asInstanceOf[js.Any])
    @scala.inline
    def set_careTeamLinkIdVarargs(value: Element*): Self = this.set("_careTeamLinkId", js.Array(value :_*))
    @scala.inline
    def set_careTeamLinkId(value: js.Array[Element]): Self = this.set("_careTeamLinkId", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_careTeamLinkId: Self = this.set("_careTeamLinkId", js.undefined)
    @scala.inline
    def set_diagnosisLinkIdVarargs(value: Element*): Self = this.set("_diagnosisLinkId", js.Array(value :_*))
    @scala.inline
    def set_diagnosisLinkId(value: js.Array[Element]): Self = this.set("_diagnosisLinkId", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_diagnosisLinkId: Self = this.set("_diagnosisLinkId", js.undefined)
    @scala.inline
    def set_factor(value: Element): Self = this.set("_factor", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_factor: Self = this.set("_factor", js.undefined)
    @scala.inline
    def set_informationLinkIdVarargs(value: Element*): Self = this.set("_informationLinkId", js.Array(value :_*))
    @scala.inline
    def set_informationLinkId(value: js.Array[Element]): Self = this.set("_informationLinkId", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_informationLinkId: Self = this.set("_informationLinkId", js.undefined)
    @scala.inline
    def set_procedureLinkIdVarargs(value: Element*): Self = this.set("_procedureLinkId", js.Array(value :_*))
    @scala.inline
    def set_procedureLinkId(value: js.Array[Element]): Self = this.set("_procedureLinkId", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_procedureLinkId: Self = this.set("_procedureLinkId", js.undefined)
    @scala.inline
    def set_sequence(value: Element): Self = this.set("_sequence", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_sequence: Self = this.set("_sequence", js.undefined)
    @scala.inline
    def set_servicedDate(value: Element): Self = this.set("_servicedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_servicedDate: Self = this.set("_servicedDate", js.undefined)
    @scala.inline
    def setBodySite(value: CodeableConcept): Self = this.set("bodySite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodySite: Self = this.set("bodySite", js.undefined)
    @scala.inline
    def setCareTeamLinkIdVarargs(value: positiveInt*): Self = this.set("careTeamLinkId", js.Array(value :_*))
    @scala.inline
    def setCareTeamLinkId(value: js.Array[positiveInt]): Self = this.set("careTeamLinkId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCareTeamLinkId: Self = this.set("careTeamLinkId", js.undefined)
    @scala.inline
    def setCategory(value: CodeableConcept): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    @scala.inline
    def setDetailVarargs(value: ClaimItemDetail*): Self = this.set("detail", js.Array(value :_*))
    @scala.inline
    def setDetail(value: js.Array[ClaimItemDetail]): Self = this.set("detail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetail: Self = this.set("detail", js.undefined)
    @scala.inline
    def setDiagnosisLinkIdVarargs(value: positiveInt*): Self = this.set("diagnosisLinkId", js.Array(value :_*))
    @scala.inline
    def setDiagnosisLinkId(value: js.Array[positiveInt]): Self = this.set("diagnosisLinkId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiagnosisLinkId: Self = this.set("diagnosisLinkId", js.undefined)
    @scala.inline
    def setEncounterVarargs(value: Reference*): Self = this.set("encounter", js.Array(value :_*))
    @scala.inline
    def setEncounter(value: js.Array[Reference]): Self = this.set("encounter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncounter: Self = this.set("encounter", js.undefined)
    @scala.inline
    def setFactor(value: decimal): Self = this.set("factor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFactor: Self = this.set("factor", js.undefined)
    @scala.inline
    def setInformationLinkIdVarargs(value: positiveInt*): Self = this.set("informationLinkId", js.Array(value :_*))
    @scala.inline
    def setInformationLinkId(value: js.Array[positiveInt]): Self = this.set("informationLinkId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInformationLinkId: Self = this.set("informationLinkId", js.undefined)
    @scala.inline
    def setLocationAddress(value: Address): Self = this.set("locationAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationAddress: Self = this.set("locationAddress", js.undefined)
    @scala.inline
    def setLocationCodeableConcept(value: CodeableConcept): Self = this.set("locationCodeableConcept", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationCodeableConcept: Self = this.set("locationCodeableConcept", js.undefined)
    @scala.inline
    def setLocationReference(value: Reference): Self = this.set("locationReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationReference: Self = this.set("locationReference", js.undefined)
    @scala.inline
    def setModifierVarargs(value: CodeableConcept*): Self = this.set("modifier", js.Array(value :_*))
    @scala.inline
    def setModifier(value: js.Array[CodeableConcept]): Self = this.set("modifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifier: Self = this.set("modifier", js.undefined)
    @scala.inline
    def setNet(value: Money): Self = this.set("net", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNet: Self = this.set("net", js.undefined)
    @scala.inline
    def setProcedureLinkIdVarargs(value: positiveInt*): Self = this.set("procedureLinkId", js.Array(value :_*))
    @scala.inline
    def setProcedureLinkId(value: js.Array[positiveInt]): Self = this.set("procedureLinkId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcedureLinkId: Self = this.set("procedureLinkId", js.undefined)
    @scala.inline
    def setProgramCodeVarargs(value: CodeableConcept*): Self = this.set("programCode", js.Array(value :_*))
    @scala.inline
    def setProgramCode(value: js.Array[CodeableConcept]): Self = this.set("programCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgramCode: Self = this.set("programCode", js.undefined)
    @scala.inline
    def setQuantity(value: Quantity): Self = this.set("quantity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
    @scala.inline
    def setRevenue(value: CodeableConcept): Self = this.set("revenue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevenue: Self = this.set("revenue", js.undefined)
    @scala.inline
    def setService(value: CodeableConcept): Self = this.set("service", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
    @scala.inline
    def setServicedDate(value: date): Self = this.set("servicedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServicedDate: Self = this.set("servicedDate", js.undefined)
    @scala.inline
    def setServicedPeriod(value: Period): Self = this.set("servicedPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServicedPeriod: Self = this.set("servicedPeriod", js.undefined)
    @scala.inline
    def setSubSiteVarargs(value: CodeableConcept*): Self = this.set("subSite", js.Array(value :_*))
    @scala.inline
    def setSubSite(value: js.Array[CodeableConcept]): Self = this.set("subSite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubSite: Self = this.set("subSite", js.undefined)
    @scala.inline
    def setUdiVarargs(value: Reference*): Self = this.set("udi", js.Array(value :_*))
    @scala.inline
    def setUdi(value: js.Array[Reference]): Self = this.set("udi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUdi: Self = this.set("udi", js.undefined)
    @scala.inline
    def setUnitPrice(value: Money): Self = this.set("unitPrice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnitPrice: Self = this.set("unitPrice", js.undefined)
  }
  
}

