package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClaimItem
  extends StObject
     with BackboneElement {
  
  var _servicedDate: js.UndefOr[Element] = js.undefined
  
  /**
    * Physical service site on the patient (limb, tooth, etc).
    */
  var bodySite: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * CareTeam applicable for this service or product line.
    */
  var careTeamLinkId: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Health Care Service Type Codes  to identify the classification of service or benefits.
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Second tier of goods and services.
    */
  var detail: js.UndefOr[js.Array[ClaimItemDetail]] = js.undefined
  
  /**
    * Diagnosis applicable for this service or product line.
    */
  var diagnosisLinkId: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * A billed item may include goods or services provided in multiple encounters.
    */
  var encounter: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
    */
  var factor: js.UndefOr[Double] = js.undefined
  
  /**
    * Exceptions, special conditions and supporting information pplicable for this service or product line.
    */
  var informationLinkId: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Where the service was provided.
    */
  var locationAddress: js.UndefOr[Address] = js.undefined
  
  /**
    * Where the service was provided.
    */
  var locationCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Where the service was provided.
    */
  var locationReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Item typification or modifiers codes, eg for Oral whether the treatment is cosmetic or associated with TMJ, or for medical whether the treatment was outside the clinic or out of office hours.
    */
  var modifier: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The quantity times the unit price for an addittional service or product or charge. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied.
    */
  var net: js.UndefOr[Money] = js.undefined
  
  /**
    * Procedures applicable for this service or product line.
    */
  var procedureLinkId: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * For programs which require reason codes for the inclusion or covering of this billed item under the program or sub-program.
    */
  var programCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The number of repetitions of a service or product.
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * The type of reveneu or cost center providing the product and/or service.
    */
  var revenue: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A service line number.
    */
  var sequence: Double
  
  /**
    * If this is an actual service or product line, ie. not a Group, then use code to indicate the Professional Service or Product supplied (eg. CTP, HCPCS,USCLS,ICD10, NCPDP,DIN,RXNorm,ACHI,CCI). If a grouping item then use a group code to indicate the type of thing being grouped eg. 'glasses' or 'compound'.
    */
  var service: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The date or dates when the enclosed suite of services were performed or completed.
    */
  var servicedDate: js.UndefOr[String] = js.undefined
  
  /**
    * The date or dates when the enclosed suite of services were performed or completed.
    */
  var servicedPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * A region or surface of the site, eg. limb region or tooth surface(s).
    */
  var subSite: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * List of Unique Device Identifiers associated with this line item.
    */
  var udi: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * If the item is a node then this is the fee for the product or service, otherwise this is the total of the fees for the children of the group.
    */
  var unitPrice: js.UndefOr[Money] = js.undefined
}
object ClaimItem {
  
  inline def apply(sequence: Double): ClaimItem = {
    val __obj = js.Dynamic.literal(sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimItem]
  }
  
  extension [Self <: ClaimItem](x: Self) {
    
    inline def setBodySite(value: CodeableConcept): Self = StObject.set(x, "bodySite", value.asInstanceOf[js.Any])
    
    inline def setBodySiteUndefined: Self = StObject.set(x, "bodySite", js.undefined)
    
    inline def setCareTeamLinkId(value: js.Array[Double]): Self = StObject.set(x, "careTeamLinkId", value.asInstanceOf[js.Any])
    
    inline def setCareTeamLinkIdUndefined: Self = StObject.set(x, "careTeamLinkId", js.undefined)
    
    inline def setCareTeamLinkIdVarargs(value: Double*): Self = StObject.set(x, "careTeamLinkId", js.Array(value*))
    
    inline def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setDetail(value: js.Array[ClaimItemDetail]): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setDetailVarargs(value: ClaimItemDetail*): Self = StObject.set(x, "detail", js.Array(value*))
    
    inline def setDiagnosisLinkId(value: js.Array[Double]): Self = StObject.set(x, "diagnosisLinkId", value.asInstanceOf[js.Any])
    
    inline def setDiagnosisLinkIdUndefined: Self = StObject.set(x, "diagnosisLinkId", js.undefined)
    
    inline def setDiagnosisLinkIdVarargs(value: Double*): Self = StObject.set(x, "diagnosisLinkId", js.Array(value*))
    
    inline def setEncounter(value: js.Array[Reference]): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setEncounterVarargs(value: Reference*): Self = StObject.set(x, "encounter", js.Array(value*))
    
    inline def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
    
    inline def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
    
    inline def setInformationLinkId(value: js.Array[Double]): Self = StObject.set(x, "informationLinkId", value.asInstanceOf[js.Any])
    
    inline def setInformationLinkIdUndefined: Self = StObject.set(x, "informationLinkId", js.undefined)
    
    inline def setInformationLinkIdVarargs(value: Double*): Self = StObject.set(x, "informationLinkId", js.Array(value*))
    
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
    
    inline def setProcedureLinkId(value: js.Array[Double]): Self = StObject.set(x, "procedureLinkId", value.asInstanceOf[js.Any])
    
    inline def setProcedureLinkIdUndefined: Self = StObject.set(x, "procedureLinkId", js.undefined)
    
    inline def setProcedureLinkIdVarargs(value: Double*): Self = StObject.set(x, "procedureLinkId", js.Array(value*))
    
    inline def setProgramCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "programCode", value.asInstanceOf[js.Any])
    
    inline def setProgramCodeUndefined: Self = StObject.set(x, "programCode", js.undefined)
    
    inline def setProgramCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "programCode", js.Array(value*))
    
    inline def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setRevenue(value: CodeableConcept): Self = StObject.set(x, "revenue", value.asInstanceOf[js.Any])
    
    inline def setRevenueUndefined: Self = StObject.set(x, "revenue", js.undefined)
    
    inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def setService(value: CodeableConcept): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
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
