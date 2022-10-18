package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuditEventObject
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _query: js.UndefOr[Element] = js.undefined
  
  /**
    * Text that describes the object in more detail.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Additional Information about the Object.
    */
  var detail: js.UndefOr[js.Array[AuditEventObjectDetail]] = js.undefined
  
  /**
    * Identifies a specific instance of the participant object. The reference should always be version specific.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Institutional policies for privacy and security may optionally fall under different accountability rules based on data life cycle. This provides a differentiating value for those cases.
    */
  var lifecycle: js.UndefOr[Coding] = js.undefined
  
  /**
    * An instance-specific descriptor of the Participant Object ID audited, such as a person's name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * For query events it may be necessary to capture the actual query input to the query process in order to identify the specific event. Because of differences among query implementations and data encoding for them, this is a base 64 encoded data blob. It may be subsequently decoded or interpreted by downstream audit analysis processing.
    */
  var query: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies a specific instance of the participant object. The reference should always be version specific.
    */
  var reference: js.UndefOr[Reference] = js.undefined
  
  /**
    * For some detailed audit analysis it may be necessary to indicate a more granular type of participant, based on the application role it serves.
    */
  var role: js.UndefOr[Coding] = js.undefined
  
  /**
    * This field identifies the security labels for a specific instance of an object, such as a patient, to detect/track privacy and security issues.
    */
  var securityLabel: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * To describe the object being acted upon. In addition to queries on the subject of the action in an auditable event, it is also important to be able to query on the object type for the action.
    */
  var `type`: js.UndefOr[Coding] = js.undefined
}
object AuditEventObject {
  
  inline def apply(): AuditEventObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditEventObject]
  }
  
  extension [Self <: AuditEventObject](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDetail(value: js.Array[AuditEventObjectDetail]): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setDetailVarargs(value: AuditEventObjectDetail*): Self = StObject.set(x, "detail", js.Array(value*))
    
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
