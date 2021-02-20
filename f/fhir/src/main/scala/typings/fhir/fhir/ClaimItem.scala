package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class ClaimItemMutableBuilder[Self <: ClaimItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBodySite(value: CodeableConcept): Self = StObject.set(x, "bodySite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodySiteUndefined: Self = StObject.set(x, "bodySite", js.undefined)
    
    @scala.inline
    def setCareTeamLinkId(value: js.Array[positiveInt]): Self = StObject.set(x, "careTeamLinkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCareTeamLinkIdUndefined: Self = StObject.set(x, "careTeamLinkId", js.undefined)
    
    @scala.inline
    def setCareTeamLinkIdVarargs(value: positiveInt*): Self = StObject.set(x, "careTeamLinkId", js.Array(value :_*))
    
    @scala.inline
    def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setDetail(value: js.Array[ClaimItemDetail]): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    @scala.inline
    def setDetailVarargs(value: ClaimItemDetail*): Self = StObject.set(x, "detail", js.Array(value :_*))
    
    @scala.inline
    def setDiagnosisLinkId(value: js.Array[positiveInt]): Self = StObject.set(x, "diagnosisLinkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagnosisLinkIdUndefined: Self = StObject.set(x, "diagnosisLinkId", js.undefined)
    
    @scala.inline
    def setDiagnosisLinkIdVarargs(value: positiveInt*): Self = StObject.set(x, "diagnosisLinkId", js.Array(value :_*))
    
    @scala.inline
    def setEncounter(value: js.Array[Reference]): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    @scala.inline
    def setEncounterVarargs(value: Reference*): Self = StObject.set(x, "encounter", js.Array(value :_*))
    
    @scala.inline
    def setFactor(value: decimal): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
    
    @scala.inline
    def setInformationLinkId(value: js.Array[positiveInt]): Self = StObject.set(x, "informationLinkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInformationLinkIdUndefined: Self = StObject.set(x, "informationLinkId", js.undefined)
    
    @scala.inline
    def setInformationLinkIdVarargs(value: positiveInt*): Self = StObject.set(x, "informationLinkId", js.Array(value :_*))
    
    @scala.inline
    def setLocationAddress(value: Address): Self = StObject.set(x, "locationAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationAddressUndefined: Self = StObject.set(x, "locationAddress", js.undefined)
    
    @scala.inline
    def setLocationCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "locationCodeableConcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationCodeableConceptUndefined: Self = StObject.set(x, "locationCodeableConcept", js.undefined)
    
    @scala.inline
    def setLocationReference(value: Reference): Self = StObject.set(x, "locationReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationReferenceUndefined: Self = StObject.set(x, "locationReference", js.undefined)
    
    @scala.inline
    def setModifier(value: js.Array[CodeableConcept]): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    @scala.inline
    def setModifierVarargs(value: CodeableConcept*): Self = StObject.set(x, "modifier", js.Array(value :_*))
    
    @scala.inline
    def setNet(value: Money): Self = StObject.set(x, "net", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetUndefined: Self = StObject.set(x, "net", js.undefined)
    
    @scala.inline
    def setProcedureLinkId(value: js.Array[positiveInt]): Self = StObject.set(x, "procedureLinkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcedureLinkIdUndefined: Self = StObject.set(x, "procedureLinkId", js.undefined)
    
    @scala.inline
    def setProcedureLinkIdVarargs(value: positiveInt*): Self = StObject.set(x, "procedureLinkId", js.Array(value :_*))
    
    @scala.inline
    def setProgramCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "programCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgramCodeUndefined: Self = StObject.set(x, "programCode", js.undefined)
    
    @scala.inline
    def setProgramCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "programCode", js.Array(value :_*))
    
    @scala.inline
    def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    @scala.inline
    def setRevenue(value: CodeableConcept): Self = StObject.set(x, "revenue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevenueUndefined: Self = StObject.set(x, "revenue", js.undefined)
    
    @scala.inline
    def setSequence(value: positiveInt): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setService(value: CodeableConcept): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    @scala.inline
    def setServicedDate(value: date): Self = StObject.set(x, "servicedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicedDateUndefined: Self = StObject.set(x, "servicedDate", js.undefined)
    
    @scala.inline
    def setServicedPeriod(value: Period): Self = StObject.set(x, "servicedPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicedPeriodUndefined: Self = StObject.set(x, "servicedPeriod", js.undefined)
    
    @scala.inline
    def setSubSite(value: js.Array[CodeableConcept]): Self = StObject.set(x, "subSite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubSiteUndefined: Self = StObject.set(x, "subSite", js.undefined)
    
    @scala.inline
    def setSubSiteVarargs(value: CodeableConcept*): Self = StObject.set(x, "subSite", js.Array(value :_*))
    
    @scala.inline
    def setUdi(value: js.Array[Reference]): Self = StObject.set(x, "udi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUdiUndefined: Self = StObject.set(x, "udi", js.undefined)
    
    @scala.inline
    def setUdiVarargs(value: Reference*): Self = StObject.set(x, "udi", js.Array(value :_*))
    
    @scala.inline
    def setUnitPrice(value: Money): Self = StObject.set(x, "unitPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitPriceUndefined: Self = StObject.set(x, "unitPrice", js.undefined)
    
    @scala.inline
    def set_careTeamLinkId(value: js.Array[Element]): Self = StObject.set(x, "_careTeamLinkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_careTeamLinkIdUndefined: Self = StObject.set(x, "_careTeamLinkId", js.undefined)
    
    @scala.inline
    def set_careTeamLinkIdVarargs(value: Element*): Self = StObject.set(x, "_careTeamLinkId", js.Array(value :_*))
    
    @scala.inline
    def set_diagnosisLinkId(value: js.Array[Element]): Self = StObject.set(x, "_diagnosisLinkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_diagnosisLinkIdUndefined: Self = StObject.set(x, "_diagnosisLinkId", js.undefined)
    
    @scala.inline
    def set_diagnosisLinkIdVarargs(value: Element*): Self = StObject.set(x, "_diagnosisLinkId", js.Array(value :_*))
    
    @scala.inline
    def set_factor(value: Element): Self = StObject.set(x, "_factor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_factorUndefined: Self = StObject.set(x, "_factor", js.undefined)
    
    @scala.inline
    def set_informationLinkId(value: js.Array[Element]): Self = StObject.set(x, "_informationLinkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_informationLinkIdUndefined: Self = StObject.set(x, "_informationLinkId", js.undefined)
    
    @scala.inline
    def set_informationLinkIdVarargs(value: Element*): Self = StObject.set(x, "_informationLinkId", js.Array(value :_*))
    
    @scala.inline
    def set_procedureLinkId(value: js.Array[Element]): Self = StObject.set(x, "_procedureLinkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_procedureLinkIdUndefined: Self = StObject.set(x, "_procedureLinkId", js.undefined)
    
    @scala.inline
    def set_procedureLinkIdVarargs(value: Element*): Self = StObject.set(x, "_procedureLinkId", js.Array(value :_*))
    
    @scala.inline
    def set_sequence(value: Element): Self = StObject.set(x, "_sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_sequenceUndefined: Self = StObject.set(x, "_sequence", js.undefined)
    
    @scala.inline
    def set_servicedDate(value: Element): Self = StObject.set(x, "_servicedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_servicedDateUndefined: Self = StObject.set(x, "_servicedDate", js.undefined)
  }
}
