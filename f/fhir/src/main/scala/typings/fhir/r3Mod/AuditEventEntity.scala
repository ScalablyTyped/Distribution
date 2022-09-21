package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuditEventEntity
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _query: js.UndefOr[Element] = js.undefined
  
  /**
    * Text that describes the entity in more detail.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Tagged value pairs for conveying additional information about the entity.
    */
  var detail: js.UndefOr[js.Array[AuditEventEntityDetail]] = js.undefined
  
  /**
    * Identifier detail depends on entity type.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * This can be used to provide an audit trail for data, over time, as it passes through the system.
    */
  var lifecycle: js.UndefOr[Coding] = js.undefined
  
  /**
    * This field may be used in a query/report to identify audit events for a specific person.  For example, where multiple synonymous entity identifiers (patient number, medical record number, encounter number, etc.) have been used.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The query parameters for a query-type entities.
    */
  var query: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies a specific instance of the entity. The reference should be version specific.
    */
  var reference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Code representing the role the entity played in the event being audited.
    */
  var role: js.UndefOr[Coding] = js.undefined
  
  /**
    * Copied from entity meta security tags.
    */
  var securityLabel: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * This value is distinct from the user's role or any user relationship to the entity.
    */
  var `type`: js.UndefOr[Coding] = js.undefined
}
object AuditEventEntity {
  
  inline def apply(): AuditEventEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditEventEntity]
  }
  
  extension [Self <: AuditEventEntity](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDetail(value: js.Array[AuditEventEntityDetail]): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setDetailVarargs(value: AuditEventEntityDetail*): Self = StObject.set(x, "detail", js.Array(value*))
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setLifecycle(value: Coding): Self = StObject.set(x, "lifecycle", value.asInstanceOf[js.Any])
    
    inline def setLifecycleUndefined: Self = StObject.set(x, "lifecycle", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setReference(value: Reference): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
    
    inline def setRole(value: Coding): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setSecurityLabel(value: js.Array[Coding]): Self = StObject.set(x, "securityLabel", value.asInstanceOf[js.Any])
    
    inline def setSecurityLabelUndefined: Self = StObject.set(x, "securityLabel", js.undefined)
    
    inline def setSecurityLabelVarargs(value: Coding*): Self = StObject.set(x, "securityLabel", js.Array(value*))
    
    inline def setType(value: Coding): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_query(value: Element): Self = StObject.set(x, "_query", value.asInstanceOf[js.Any])
    
    inline def set_queryUndefined: Self = StObject.set(x, "_query", js.undefined)
  }
}
