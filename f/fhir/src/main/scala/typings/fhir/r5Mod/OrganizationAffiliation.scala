package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationAffiliation
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _active: js.UndefOr[Element] = js.undefined
  
  /**
    * If this value is false, you may refer to the period to see when the role was in active use. If there is no period specified, no inference can be made about when it was active.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Definition of the role the participatingOrganization plays in the association.
    */
  var code: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The contact details of communication devices available at the participatingOrganization relevant to this Affiliation.
    */
  var contact: js.UndefOr[js.Array[ExtendedContactDetail]] = js.undefined
  
  /**
    * Technical endpoints providing access to services operated for this role.
    */
  var endpoint: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Healthcare services provided through the role.
    */
  var healthcareService: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Business identifiers that are specific to this role.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The location(s) at which the role occurs.
    */
  var location: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * e.g. Commonly used for Health Insurance provider networks.
    */
  var network: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * For example, a Spotless Cleaning Services (participatingOrganization) is a supplier (code) to General Hospital (organization).   Similarly, General Hospital (participatingOrganization) is a member (code) of Eastern HIE (organization).  If there are two organizations that do not have a directional relationship, there would normally be a third organization that represents the joint partnership, and the two organizations would have a relationship to that joint Organization via two OrganizationAffiliations.
    */
  var organization: js.UndefOr[Reference] = js.undefined
  
  /**
    * See comments for OrganizationAffiliation.organization above.
    */
  var participatingOrganization: js.UndefOr[Reference] = js.undefined
  
  /**
    * The period during which the participatingOrganization is affiliated with the primary organization.
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_OrganizationAffiliation: typings.fhir.fhirStrings.OrganizationAffiliation
  
  /**
    * Specific specialty of the participatingOrganization in the context of the role.
    */
  var specialty: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object OrganizationAffiliation {
  
  inline def apply(): OrganizationAffiliation = {
    val __obj = js.Dynamic.literal(resourceType = "OrganizationAffiliation")
    __obj.asInstanceOf[OrganizationAffiliation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrganizationAffiliation] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "code", js.Array(value*))
    
    inline def setContact(value: js.Array[ExtendedContactDetail]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setContactVarargs(value: ExtendedContactDetail*): Self = StObject.set(x, "contact", js.Array(value*))
    
    inline def setEndpoint(value: js.Array[Reference]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setEndpointVarargs(value: Reference*): Self = StObject.set(x, "endpoint", js.Array(value*))
    
    inline def setHealthcareService(value: js.Array[Reference]): Self = StObject.set(x, "healthcareService", value.asInstanceOf[js.Any])
    
    inline def setHealthcareServiceUndefined: Self = StObject.set(x, "healthcareService", js.undefined)
    
    inline def setHealthcareServiceVarargs(value: Reference*): Self = StObject.set(x, "healthcareService", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setLocation(value: js.Array[Reference]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setLocationVarargs(value: Reference*): Self = StObject.set(x, "location", js.Array(value*))
    
    inline def setNetwork(value: js.Array[Reference]): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setNetworkVarargs(value: Reference*): Self = StObject.set(x, "network", js.Array(value*))
    
    inline def setOrganization(value: Reference): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setParticipatingOrganization(value: Reference): Self = StObject.set(x, "participatingOrganization", value.asInstanceOf[js.Any])
    
    inline def setParticipatingOrganizationUndefined: Self = StObject.set(x, "participatingOrganization", js.undefined)
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.OrganizationAffiliation): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSpecialty(value: js.Array[CodeableConcept]): Self = StObject.set(x, "specialty", value.asInstanceOf[js.Any])
    
    inline def setSpecialtyUndefined: Self = StObject.set(x, "specialty", js.undefined)
    
    inline def setSpecialtyVarargs(value: CodeableConcept*): Self = StObject.set(x, "specialty", js.Array(value*))
    
    inline def set_active(value: Element): Self = StObject.set(x, "_active", value.asInstanceOf[js.Any])
    
    inline def set_activeUndefined: Self = StObject.set(x, "_active", js.undefined)
  }
}
