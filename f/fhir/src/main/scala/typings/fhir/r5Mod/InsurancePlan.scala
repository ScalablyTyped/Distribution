package typings.fhir.r5Mod

import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.retired
import typings.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsurancePlan
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _alias: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * An organization which administer other services such as underwriting, customer service and/or claims processing on behalf of the health insurance product owner.
    */
  var administeredBy: js.UndefOr[Reference] = js.undefined
  
  /**
    * There are no dates associated with the alias/historic names, as this is not intended to track when names were used, but to assist in searching so that older names can still result in identifying the product/plan.
    */
  var alias: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The address/telecom use code 'home' are not to be used.
    */
  var contact: js.UndefOr[js.Array[ExtendedContactDetail]] = js.undefined
  
  /**
    * Details about the coverage offered by the insurance product.
    */
  var coverage: js.UndefOr[js.Array[InsurancePlanCoverage]] = js.undefined
  
  /**
    * The geographic region in which a health insurance product's benefits apply.
    */
  var coverageArea: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The technical endpoints providing access to services operated for the health insurance product.
    */
  var endpoint: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Business identifiers assigned to this health insurance product which remain constant as the resource is updated and propagates from server to server.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * If the name of the product/plan changes, consider putting the old name in the alias column so that it can still be located through searches.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Networks are represented as a hierarchy of organization resources.
    */
  var network: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The entity that is providing  the health insurance product and underwriting the risk.  This is typically an insurance carriers, other third-party payers, or health plan sponsors comonly referred to as 'payers'.
    */
  var ownedBy: js.UndefOr[Reference] = js.undefined
  
  /**
    * The period of time that the health insurance product is available.
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * Details about an insurance plan.
    */
  var plan: js.UndefOr[js.Array[InsurancePlanPlan]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_InsurancePlan: typings.fhir.fhirStrings.InsurancePlan
  
  /**
    * The current state of the health insurance product.
    */
  var status: js.UndefOr[draft | active | retired | unknown] = js.undefined
  
  /**
    * The kind of health insurance product.
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object InsurancePlan {
  
  inline def apply(): InsurancePlan = {
    val __obj = js.Dynamic.literal(resourceType = "InsurancePlan")
    __obj.asInstanceOf[InsurancePlan]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InsurancePlan] (val x: Self) extends AnyVal {
    
    inline def setAdministeredBy(value: Reference): Self = StObject.set(x, "administeredBy", value.asInstanceOf[js.Any])
    
    inline def setAdministeredByUndefined: Self = StObject.set(x, "administeredBy", js.undefined)
    
    inline def setAlias(value: js.Array[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setAliasVarargs(value: String*): Self = StObject.set(x, "alias", js.Array(value*))
    
    inline def setContact(value: js.Array[ExtendedContactDetail]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setContactVarargs(value: ExtendedContactDetail*): Self = StObject.set(x, "contact", js.Array(value*))
    
    inline def setCoverage(value: js.Array[InsurancePlanCoverage]): Self = StObject.set(x, "coverage", value.asInstanceOf[js.Any])
    
    inline def setCoverageArea(value: js.Array[Reference]): Self = StObject.set(x, "coverageArea", value.asInstanceOf[js.Any])
    
    inline def setCoverageAreaUndefined: Self = StObject.set(x, "coverageArea", js.undefined)
    
    inline def setCoverageAreaVarargs(value: Reference*): Self = StObject.set(x, "coverageArea", js.Array(value*))
    
    inline def setCoverageUndefined: Self = StObject.set(x, "coverage", js.undefined)
    
    inline def setCoverageVarargs(value: InsurancePlanCoverage*): Self = StObject.set(x, "coverage", js.Array(value*))
    
    inline def setEndpoint(value: js.Array[Reference]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setEndpointVarargs(value: Reference*): Self = StObject.set(x, "endpoint", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetwork(value: js.Array[Reference]): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setNetworkVarargs(value: Reference*): Self = StObject.set(x, "network", js.Array(value*))
    
    inline def setOwnedBy(value: Reference): Self = StObject.set(x, "ownedBy", value.asInstanceOf[js.Any])
    
    inline def setOwnedByUndefined: Self = StObject.set(x, "ownedBy", js.undefined)
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setPlan(value: js.Array[InsurancePlanPlan]): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
    
    inline def setPlanUndefined: Self = StObject.set(x, "plan", js.undefined)
    
    inline def setPlanVarargs(value: InsurancePlanPlan*): Self = StObject.set(x, "plan", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.InsurancePlan): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: draft | active | retired | unknown): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "type", js.Array(value*))
    
    inline def set_alias(value: js.Array[Element]): Self = StObject.set(x, "_alias", value.asInstanceOf[js.Any])
    
    inline def set_aliasUndefined: Self = StObject.set(x, "_alias", js.undefined)
    
    inline def set_aliasVarargs(value: Element*): Self = StObject.set(x, "_alias", js.Array(value*))
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
