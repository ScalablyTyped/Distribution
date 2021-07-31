package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A grouping of people or organizations with a common purpose
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait Organization
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'active'.
    */
  var _active: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'alias'.
    */
  var _alias: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * Whether the organization's record is still in active use
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An address for the organization
    */
  var address: js.UndefOr[js.Array[Address]] = js.undefined
  
  /**
    * A list of alternate names that the organization is known as, or was known as in the past
    */
  var alias: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Contact for the organization for a certain purpose
    */
  var contact: js.UndefOr[js.Array[OrganizationContact]] = js.undefined
  
  /**
    * Technical endpoints providing access to services operated for the organization
    */
  var endpoint: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Identifies this organization  across multiple systems
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Name used for the organization
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The organization of which this organization forms a part
    */
  var partOf: js.UndefOr[Reference] = js.undefined
  
  /**
    * A contact detail for the organization
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.undefined
  
  /**
    * Kind of organization
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object Organization {
  
  @scala.inline
  def apply(): Organization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Organization]
  }
  
  @scala.inline
  implicit class OrganizationMutableBuilder[Self <: Organization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setAddress(value: js.Array[Address]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setAddressVarargs(value: Address*): Self = StObject.set(x, "address", js.Array(value :_*))
    
    @scala.inline
    def setAlias(value: js.Array[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    @scala.inline
    def setAliasVarargs(value: String*): Self = StObject.set(x, "alias", js.Array(value :_*))
    
    @scala.inline
    def setContact(value: js.Array[OrganizationContact]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    @scala.inline
    def setContactVarargs(value: OrganizationContact*): Self = StObject.set(x, "contact", js.Array(value :_*))
    
    @scala.inline
    def setEndpoint(value: js.Array[Reference]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    @scala.inline
    def setEndpointVarargs(value: Reference*): Self = StObject.set(x, "endpoint", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPartOf(value: Reference): Self = StObject.set(x, "partOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartOfUndefined: Self = StObject.set(x, "partOf", js.undefined)
    
    @scala.inline
    def setTelecom(value: js.Array[ContactPoint]): Self = StObject.set(x, "telecom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTelecomUndefined: Self = StObject.set(x, "telecom", js.undefined)
    
    @scala.inline
    def setTelecomVarargs(value: ContactPoint*): Self = StObject.set(x, "telecom", js.Array(value :_*))
    
    @scala.inline
    def setType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "type", js.Array(value :_*))
    
    @scala.inline
    def set_active(value: Element): Self = StObject.set(x, "_active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_activeUndefined: Self = StObject.set(x, "_active", js.undefined)
    
    @scala.inline
    def set_alias(value: js.Array[Element]): Self = StObject.set(x, "_alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_aliasUndefined: Self = StObject.set(x, "_alias", js.undefined)
    
    @scala.inline
    def set_aliasVarargs(value: Element*): Self = StObject.set(x, "_alias", js.Array(value :_*))
    
    @scala.inline
    def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
  }
}
