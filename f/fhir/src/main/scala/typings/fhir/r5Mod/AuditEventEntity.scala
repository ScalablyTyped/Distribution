package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuditEventEntity
  extends StObject
     with BackboneElement {
  
  var _query: js.UndefOr[Element] = js.undefined
  
  /**
    * A usecase where one AuditEvent.entity.agent is used where the Entity that was used in the creation/updating of a target resource, is not in the context of the same custodianship as the target resource, and thus the meaning of AuditEvent.entity.agent is to say that the entity referenced is managed elsewhere and that this Agent provided access to it.  This would be similar to where the Entity being referenced is managed outside FHIR, such as through HL7 v2, v3, or XDS. This might be where the Entity being referenced is managed in another FHIR resource server. Thus it explains the provenance of that Entity's use in the context of this AuditEvent activity.
    */
  var agent: js.UndefOr[js.Array[AuditEventAgent]] = js.undefined
  
  /**
    * Tagged value pairs for conveying additional information about the entity.
    */
  var detail: js.UndefOr[js.Array[AuditEventEntityDetail]] = js.undefined
  
  /**
    * The meaning and secondary-encoding of the content of base64 encoded blob is specific to the AuditEvent.type, AuditEvent.subtype, and AuditEvent.entity.role.  The base64 is a general-use and safe container for event specific data blobs regardless of the encoding used by the transaction being recorded.  An AuditEvent consuming application must understand the event it is consuming and the formats used by the event. For example, if auditing an Oracle network database access, the Oracle formats must be understood as they will be simply encoded in the base64binary blob.
    * The DICOM AuditMessage schema does not support both .name and .query being populated.
    */
  var query: js.UndefOr[String] = js.undefined
  
  /**
    * Code representing the role the entity played in the event being audited.
    */
  var role: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Copied from entity meta security tags.
    */
  var securityLabel: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Use .what.display when all you have is a string (e.g. ParticipantObjectName).
    */
  var what: js.UndefOr[Reference] = js.undefined
}
object AuditEventEntity {
  
  inline def apply(): AuditEventEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditEventEntity]
  }
  
  extension [Self <: AuditEventEntity](x: Self) {
    
    inline def setAgent(value: js.Array[AuditEventAgent]): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
    
    inline def setAgentVarargs(value: AuditEventAgent*): Self = StObject.set(x, "agent", js.Array(value*))
    
    inline def setDetail(value: js.Array[AuditEventEntityDetail]): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setDetailVarargs(value: AuditEventEntityDetail*): Self = StObject.set(x, "detail", js.Array(value*))
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setRole(value: CodeableConcept): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setSecurityLabel(value: js.Array[CodeableConcept]): Self = StObject.set(x, "securityLabel", value.asInstanceOf[js.Any])
    
    inline def setSecurityLabelUndefined: Self = StObject.set(x, "securityLabel", js.undefined)
    
    inline def setSecurityLabelVarargs(value: CodeableConcept*): Self = StObject.set(x, "securityLabel", js.Array(value*))
    
    inline def setWhat(value: Reference): Self = StObject.set(x, "what", value.asInstanceOf[js.Any])
    
    inline def setWhatUndefined: Self = StObject.set(x, "what", js.undefined)
    
    inline def set_query(value: Element): Self = StObject.set(x, "_query", value.asInstanceOf[js.Any])
    
    inline def set_queryUndefined: Self = StObject.set(x, "_query", js.undefined)
  }
}
