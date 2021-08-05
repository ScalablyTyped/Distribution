package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Goods and Services
  */
trait ExplanationOfBenefitItem
  extends StObject
     with BackboneElement {
  
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
    * Contains extended information for property 'noteNumber'.
    */
  var _noteNumber: js.UndefOr[js.Array[Element]] = js.undefined
  
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
    * Adjudication details
    */
  var adjudication: js.UndefOr[js.Array[ExplanationOfBenefitItemAdjudication]] = js.undefined
  
  /**
    * Service Location
    */
  var bodySite: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Applicable careteam members
    */
  var careTeamLinkId: js.UndefOr[js.Array[positiveInt]] = js.undefined
  
  /**
    * Type of service or product
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Additional items
    */
  var detail: js.UndefOr[js.Array[ExplanationOfBenefitItemDetail]] = js.undefined
  
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
    * List of note numbers which apply
    */
  var noteNumber: js.UndefOr[js.Array[positiveInt]] = js.undefined
  
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
object ExplanationOfBenefitItem {
  
  inline def apply(sequence: positiveInt): ExplanationOfBenefitItem = {
    val __obj = js.Dynamic.literal(sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplanationOfBenefitItem]
  }
  
  extension [Self <: ExplanationOfBenefitItem](x: Self) {
    
    inline def setAdjudication(value: js.Array[ExplanationOfBenefitItemAdjudication]): Self = StObject.set(x, "adjudication", value.asInstanceOf[js.Any])
    
    inline def setAdjudicationUndefined: Self = StObject.set(x, "adjudication", js.undefined)
    
    inline def setAdjudicationVarargs(value: ExplanationOfBenefitItemAdjudication*): Self = StObject.set(x, "adjudication", js.Array(value :_*))
    
    inline def setBodySite(value: CodeableConcept): Self = StObject.set(x, "bodySite", value.asInstanceOf[js.Any])
    
    inline def setBodySiteUndefined: Self = StObject.set(x, "bodySite", js.undefined)
    
    inline def setCareTeamLinkId(value: js.Array[positiveInt]): Self = StObject.set(x, "careTeamLinkId", value.asInstanceOf[js.Any])
    
    inline def setCareTeamLinkIdUndefined: Self = StObject.set(x, "careTeamLinkId", js.undefined)
    
    inline def setCareTeamLinkIdVarargs(value: positiveInt*): Self = StObject.set(x, "careTeamLinkId", js.Array(value :_*))
    
    inline def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setDetail(value: js.Array[ExplanationOfBenefitItemDetail]): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setDetailVarargs(value: ExplanationOfBenefitItemDetail*): Self = StObject.set(x, "detail", js.Array(value :_*))
    
    inline def setDiagnosisLinkId(value: js.Array[positiveInt]): Self = StObject.set(x, "diagnosisLinkId", value.asInstanceOf[js.Any])
    
    inline def setDiagnosisLinkIdUndefined: Self = StObject.set(x, "diagnosisLinkId", js.undefined)
    
    inline def setDiagnosisLinkIdVarargs(value: positiveInt*): Self = StObject.set(x, "diagnosisLinkId", js.Array(value :_*))
    
    inline def setEncounter(value: js.Array[Reference]): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setEncounterVarargs(value: Reference*): Self = StObject.set(x, "encounter", js.Array(value :_*))
    
    inline def setFactor(value: decimal): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
    
    inline def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
    
    inline def setInformationLinkId(value: js.Array[positiveInt]): Self = StObject.set(x, "informationLinkId", value.asInstanceOf[js.Any])
    
    inline def setInformationLinkIdUndefined: Self = StObject.set(x, "informationLinkId", js.undefined)
    
    inline def setInformationLinkIdVarargs(value: positiveInt*): Self = StObject.set(x, "informationLinkId", js.Array(value :_*))
    
    inline def setLocationAddress(value: Address): Self = StObject.set(x, "locationAddress", value.asInstanceOf[js.Any])
    
    inline def setLocationAddressUndefined: Self = StObject.set(x, "locationAddress", js.undefined)
    
    inline def setLocationCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "locationCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setLocationCodeableConceptUndefined: Self = StObject.set(x, "locationCodeableConcept", js.undefined)
    
    inline def setLocationReference(value: Reference): Self = StObject.set(x, "locationReference", value.asInstanceOf[js.Any])
    
    inline def setLocationReferenceUndefined: Self = StObject.set(x, "locationReference", js.undefined)
    
    inline def setModifier(value: js.Array[CodeableConcept]): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    inline def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    inline def setModifierVarargs(value: CodeableConcept*): Self = StObject.set(x, "modifier", js.Array(value :_*))
    
    inline def setNet(value: Money): Self = StObject.set(x, "net", value.asInstanceOf[js.Any])
    
    inline def setNetUndefined: Self = StObject.set(x, "net", js.undefined)
    
    inline def setNoteNumber(value: js.Array[positiveInt]): Self = StObject.set(x, "noteNumber", value.asInstanceOf[js.Any])
    
    inline def setNoteNumberUndefined: Self = StObject.set(x, "noteNumber", js.undefined)
    
    inline def setNoteNumberVarargs(value: positiveInt*): Self = StObject.set(x, "noteNumber", js.Array(value :_*))
    
    inline def setProcedureLinkId(value: js.Array[positiveInt]): Self = StObject.set(x, "procedureLinkId", value.asInstanceOf[js.Any])
    
    inline def setProcedureLinkIdUndefined: Self = StObject.set(x, "procedureLinkId", js.undefined)
    
    inline def setProcedureLinkIdVarargs(value: positiveInt*): Self = StObject.set(x, "procedureLinkId", js.Array(value :_*))
    
    inline def setProgramCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "programCode", value.asInstanceOf[js.Any])
    
    inline def setProgramCodeUndefined: Self = StObject.set(x, "programCode", js.undefined)
    
    inline def setProgramCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "programCode", js.Array(value :_*))
    
    inline def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setRevenue(value: CodeableConcept): Self = StObject.set(x, "revenue", value.asInstanceOf[js.Any])
    
    inline def setRevenueUndefined: Self = StObject.set(x, "revenue", js.undefined)
    
    inline def setSequence(value: positiveInt): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def setService(value: CodeableConcept): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    inline def setServicedDate(value: date): Self = StObject.set(x, "servicedDate", value.asInstanceOf[js.Any])
    
    inline def setServicedDateUndefined: Self = StObject.set(x, "servicedDate", js.undefined)
    
    inline def setServicedPeriod(value: Period): Self = StObject.set(x, "servicedPeriod", value.asInstanceOf[js.Any])
    
    inline def setServicedPeriodUndefined: Self = StObject.set(x, "servicedPeriod", js.undefined)
    
    inline def setSubSite(value: js.Array[CodeableConcept]): Self = StObject.set(x, "subSite", value.asInstanceOf[js.Any])
    
    inline def setSubSiteUndefined: Self = StObject.set(x, "subSite", js.undefined)
    
    inline def setSubSiteVarargs(value: CodeableConcept*): Self = StObject.set(x, "subSite", js.Array(value :_*))
    
    inline def setUdi(value: js.Array[Reference]): Self = StObject.set(x, "udi", value.asInstanceOf[js.Any])
    
    inline def setUdiUndefined: Self = StObject.set(x, "udi", js.undefined)
    
    inline def setUdiVarargs(value: Reference*): Self = StObject.set(x, "udi", js.Array(value :_*))
    
    inline def setUnitPrice(value: Money): Self = StObject.set(x, "unitPrice", value.asInstanceOf[js.Any])
    
    inline def setUnitPriceUndefined: Self = StObject.set(x, "unitPrice", js.undefined)
    
    inline def set_careTeamLinkId(value: js.Array[Element]): Self = StObject.set(x, "_careTeamLinkId", value.asInstanceOf[js.Any])
    
    inline def set_careTeamLinkIdUndefined: Self = StObject.set(x, "_careTeamLinkId", js.undefined)
    
    inline def set_careTeamLinkIdVarargs(value: Element*): Self = StObject.set(x, "_careTeamLinkId", js.Array(value :_*))
    
    inline def set_diagnosisLinkId(value: js.Array[Element]): Self = StObject.set(x, "_diagnosisLinkId", value.asInstanceOf[js.Any])
    
    inline def set_diagnosisLinkIdUndefined: Self = StObject.set(x, "_diagnosisLinkId", js.undefined)
    
    inline def set_diagnosisLinkIdVarargs(value: Element*): Self = StObject.set(x, "_diagnosisLinkId", js.Array(value :_*))
    
    inline def set_factor(value: Element): Self = StObject.set(x, "_factor", value.asInstanceOf[js.Any])
    
    inline def set_factorUndefined: Self = StObject.set(x, "_factor", js.undefined)
    
    inline def set_informationLinkId(value: js.Array[Element]): Self = StObject.set(x, "_informationLinkId", value.asInstanceOf[js.Any])
    
    inline def set_informationLinkIdUndefined: Self = StObject.set(x, "_informationLinkId", js.undefined)
    
    inline def set_informationLinkIdVarargs(value: Element*): Self = StObject.set(x, "_informationLinkId", js.Array(value :_*))
    
    inline def set_noteNumber(value: js.Array[Element]): Self = StObject.set(x, "_noteNumber", value.asInstanceOf[js.Any])
    
    inline def set_noteNumberUndefined: Self = StObject.set(x, "_noteNumber", js.undefined)
    
    inline def set_noteNumberVarargs(value: Element*): Self = StObject.set(x, "_noteNumber", js.Array(value :_*))
    
    inline def set_procedureLinkId(value: js.Array[Element]): Self = StObject.set(x, "_procedureLinkId", value.asInstanceOf[js.Any])
    
    inline def set_procedureLinkIdUndefined: Self = StObject.set(x, "_procedureLinkId", js.undefined)
    
    inline def set_procedureLinkIdVarargs(value: Element*): Self = StObject.set(x, "_procedureLinkId", js.Array(value :_*))
    
    inline def set_sequence(value: Element): Self = StObject.set(x, "_sequence", value.asInstanceOf[js.Any])
    
    inline def set_sequenceUndefined: Self = StObject.set(x, "_sequence", js.undefined)
    
    inline def set_servicedDate(value: Element): Self = StObject.set(x, "_servicedDate", value.asInstanceOf[js.Any])
    
    inline def set_servicedDateUndefined: Self = StObject.set(x, "_servicedDate", js.undefined)
  }
}
