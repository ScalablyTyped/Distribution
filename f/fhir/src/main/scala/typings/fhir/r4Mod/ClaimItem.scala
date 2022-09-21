package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClaimItem
  extends StObject
     with BackboneElement {
  
  var _servicedDate: js.UndefOr[Element] = js.undefined
  
  /**
    * For example: Providing a tooth code, allows an insurer to identify a provider performing a filling on a tooth that was previously removed.
    */
  var bodySite: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * CareTeam members related to this service or product.
    */
  var careTeamSequence: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Examples include Medical Care, Periodontics, Renal Dialysis, Vision Coverage.
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A claim detail line. Either a simple (a product or service) or a 'group' of sub-details which are simple items.
    */
  var detail: js.UndefOr[js.Array[ClaimItemDetail]] = js.undefined
  
  /**
    * Diagnosis applicable for this service or product.
    */
  var diagnosisSequence: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * This will typically be the encounter the event occurred within, but some activities may be initiated prior to or after the official completion of an encounter but still be tied to the context of the encounter.
    */
  var encounter: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * To show a 10% senior's discount, the value entered is: 0.90 (1.00 - 0.10).
    */
  var factor: js.UndefOr[Double] = js.undefined
  
  /**
    * Exceptions, special conditions and supporting information applicable for this service or product.
    */
  var informationSequence: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Where the product or service was provided.
    */
  var locationAddress: js.UndefOr[Address] = js.undefined
  
  /**
    * Where the product or service was provided.
    */
  var locationCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Where the product or service was provided.
    */
  var locationReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * For example in Oral whether the treatment is cosmetic or associated with TMJ, or for Medical whether the treatment was outside the clinic or outside of office hours.
    */
  var modifier: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * For example, the formula: quantity * unitPrice * factor  = net. Quantity and factor are assumed to be 1 if not supplied.
    */
  var net: js.UndefOr[Money] = js.undefined
  
  /**
    * Procedures applicable for this service or product.
    */
  var procedureSequence: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * If this is an actual service or product line, i.e. not a Group, then use code to indicate the Professional Service or Product supplied (e.g. CTP, HCPCS, USCLS, ICD10, NCPDP, DIN, RxNorm, ACHI, CCI). If a grouping item then use a group code to indicate the type of thing being grouped e.g. 'glasses' or 'compound'.
    */
  var productOrService: CodeableConcept
  
  /**
    * For example: Neonatal program, child dental program or drug users recovery program.
    */
  var programCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The number of repetitions of a service or product.
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * The type of revenue or cost center providing the product and/or service.
    */
  var revenue: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A number to uniquely identify item entries.
    */
  var sequence: Double
  
  /**
    * The date or dates when the service or product was supplied, performed or completed.
    */
  var servicedDate: js.UndefOr[String] = js.undefined
  
  /**
    * The date or dates when the service or product was supplied, performed or completed.
    */
  var servicedPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * A region or surface of the bodySite, e.g. limb region or tooth surface(s).
    */
  var subSite: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Unique Device Identifiers associated with this line item.
    */
  var udi: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * If the item is not a group then this is the fee for the product or service, otherwise this is the total of the fees for the details of the group.
    */
  var unitPrice: js.UndefOr[Money] = js.undefined
}
object ClaimItem {
  
  inline def apply(productOrService: CodeableConcept, sequence: Double): ClaimItem = {
    val __obj = js.Dynamic.literal(productOrService = productOrService.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimItem]
  }
  
  extension [Self <: ClaimItem](x: Self) {
    
    inline def setBodySite(value: CodeableConcept): Self = StObject.set(x, "bodySite", value.asInstanceOf[js.Any])
    
    inline def setBodySiteUndefined: Self = StObject.set(x, "bodySite", js.undefined)
    
    inline def setCareTeamSequence(value: js.Array[Double]): Self = StObject.set(x, "careTeamSequence", value.asInstanceOf[js.Any])
    
    inline def setCareTeamSequenceUndefined: Self = StObject.set(x, "careTeamSequence", js.undefined)
    
    inline def setCareTeamSequenceVarargs(value: Double*): Self = StObject.set(x, "careTeamSequence", js.Array(value*))
    
    inline def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setDetail(value: js.Array[ClaimItemDetail]): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setDetailVarargs(value: ClaimItemDetail*): Self = StObject.set(x, "detail", js.Array(value*))
    
    inline def setDiagnosisSequence(value: js.Array[Double]): Self = StObject.set(x, "diagnosisSequence", value.asInstanceOf[js.Any])
    
    inline def setDiagnosisSequenceUndefined: Self = StObject.set(x, "diagnosisSequence", js.undefined)
    
    inline def setDiagnosisSequenceVarargs(value: Double*): Self = StObject.set(x, "diagnosisSequence", js.Array(value*))
    
    inline def setEncounter(value: js.Array[Reference]): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setEncounterVarargs(value: Reference*): Self = StObject.set(x, "encounter", js.Array(value*))
    
    inline def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
    
    inline def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
    
    inline def setInformationSequence(value: js.Array[Double]): Self = StObject.set(x, "informationSequence", value.asInstanceOf[js.Any])
    
    inline def setInformationSequenceUndefined: Self = StObject.set(x, "informationSequence", js.undefined)
    
    inline def setInformationSequenceVarargs(value: Double*): Self = StObject.set(x, "informationSequence", js.Array(value*))
    
    inline def setLocationAddress(value: Address): Self = StObject.set(x, "locationAddress", value.asInstanceOf[js.Any])
    
    inline def setLocationAddressUndefined: Self = StObject.set(x, "locationAddress", js.undefined)
    
    inline def setLocationCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "locationCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setLocationCodeableConceptUndefined: Self = StObject.set(x, "locationCodeableConcept", js.undefined)
    
    inline def setLocationReference(value: Reference): Self = StObject.set(x, "locationReference", value.asInstanceOf[js.Any])
    
    inline def setLocationReferenceUndefined: Self = StObject.set(x, "locationReference", js.undefined)
    
    inline def setModifier(value: js.Array[CodeableConcept]): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    inline def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    inline def setModifierVarargs(value: CodeableConcept*): Self = StObject.set(x, "modifier", js.Array(value*))
    
    inline def setNet(value: Money): Self = StObject.set(x, "net", value.asInstanceOf[js.Any])
    
    inline def setNetUndefined: Self = StObject.set(x, "net", js.undefined)
    
    inline def setProcedureSequence(value: js.Array[Double]): Self = StObject.set(x, "procedureSequence", value.asInstanceOf[js.Any])
    
    inline def setProcedureSequenceUndefined: Self = StObject.set(x, "procedureSequence", js.undefined)
    
    inline def setProcedureSequenceVarargs(value: Double*): Self = StObject.set(x, "procedureSequence", js.Array(value*))
    
    inline def setProductOrService(value: CodeableConcept): Self = StObject.set(x, "productOrService", value.asInstanceOf[js.Any])
    
    inline def setProgramCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "programCode", value.asInstanceOf[js.Any])
    
    inline def setProgramCodeUndefined: Self = StObject.set(x, "programCode", js.undefined)
    
    inline def setProgramCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "programCode", js.Array(value*))
    
    inline def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setRevenue(value: CodeableConcept): Self = StObject.set(x, "revenue", value.asInstanceOf[js.Any])
    
    inline def setRevenueUndefined: Self = StObject.set(x, "revenue", js.undefined)
    
    inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def setServicedDate(value: String): Self = StObject.set(x, "servicedDate", value.asInstanceOf[js.Any])
    
    inline def setServicedDateUndefined: Self = StObject.set(x, "servicedDate", js.undefined)
    
    inline def setServicedPeriod(value: Period): Self = StObject.set(x, "servicedPeriod", value.asInstanceOf[js.Any])
    
    inline def setServicedPeriodUndefined: Self = StObject.set(x, "servicedPeriod", js.undefined)
    
    inline def setSubSite(value: js.Array[CodeableConcept]): Self = StObject.set(x, "subSite", value.asInstanceOf[js.Any])
    
    inline def setSubSiteUndefined: Self = StObject.set(x, "subSite", js.undefined)
    
    inline def setSubSiteVarargs(value: CodeableConcept*): Self = StObject.set(x, "subSite", js.Array(value*))
    
    inline def setUdi(value: js.Array[Reference]): Self = StObject.set(x, "udi", value.asInstanceOf[js.Any])
    
    inline def setUdiUndefined: Self = StObject.set(x, "udi", js.undefined)
    
    inline def setUdiVarargs(value: Reference*): Self = StObject.set(x, "udi", js.Array(value*))
    
    inline def setUnitPrice(value: Money): Self = StObject.set(x, "unitPrice", value.asInstanceOf[js.Any])
    
    inline def setUnitPriceUndefined: Self = StObject.set(x, "unitPrice", js.undefined)
    
    inline def set_servicedDate(value: Element): Self = StObject.set(x, "_servicedDate", value.asInstanceOf[js.Any])
    
    inline def set_servicedDateUndefined: Self = StObject.set(x, "_servicedDate", js.undefined)
  }
}
