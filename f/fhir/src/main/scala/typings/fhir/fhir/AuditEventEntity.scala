package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Data or objects used
  */
@js.native
trait AuditEventEntity extends BackboneElement {
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'query'.
    */
  var _query: js.UndefOr[Element] = js.native
  
  /**
    * Descriptive text
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Additional Information about the entity
    */
  var detail: js.UndefOr[js.Array[AuditEventEntityDetail]] = js.native
  
  /**
    * Specific instance of object
    */
  var identifier: js.UndefOr[Identifier] = js.native
  
  /**
    * Life-cycle stage for the entity
    */
  var lifecycle: js.UndefOr[Coding] = js.native
  
  /**
    * Descriptor for entity
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Query parameters
    */
  var query: js.UndefOr[base64Binary] = js.native
  
  /**
    * Specific instance of resource
    */
  var reference: js.UndefOr[Reference] = js.native
  
  /**
    * What role the entity played
    */
  var role: js.UndefOr[Coding] = js.native
  
  /**
    * Security labels on the entity
    */
  var securityLabel: js.UndefOr[js.Array[Coding]] = js.native
  
  /**
    * Type of entity involved
    */
  var `type`: js.UndefOr[Coding] = js.native
}
object AuditEventEntity {
  
  @scala.inline
  def apply(): AuditEventEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditEventEntity]
  }
  
  @scala.inline
  implicit class AuditEventEntityMutableBuilder[Self <: AuditEventEntity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDetail(value: js.Array[AuditEventEntityDetail]): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    @scala.inline
    def setDetailVarargs(value: AuditEventEntityDetail*): Self = StObject.set(x, "detail", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setLifecycle(value: Coding): Self = StObject.set(x, "lifecycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecycleUndefined: Self = StObject.set(x, "lifecycle", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setQuery(value: base64Binary): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setReference(value: Reference): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
    
    @scala.inline
    def setRole(value: Coding): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setSecurityLabel(value: js.Array[Coding]): Self = StObject.set(x, "securityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityLabelUndefined: Self = StObject.set(x, "securityLabel", js.undefined)
    
    @scala.inline
    def setSecurityLabelVarargs(value: Coding*): Self = StObject.set(x, "securityLabel", js.Array(value :_*))
    
    @scala.inline
    def setType(value: Coding): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    @scala.inline
    def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    @scala.inline
    def set_query(value: Element): Self = StObject.set(x, "_query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_queryUndefined: Self = StObject.set(x, "_query", js.undefined)
  }
}
