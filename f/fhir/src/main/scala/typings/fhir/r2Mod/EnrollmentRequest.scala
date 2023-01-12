package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnrollmentRequest
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _created: js.UndefOr[Element] = js.undefined
  
  /**
    * Need to identify the issuer to target for processing and for coordination of benefit processing.
    */
  var coverage: Reference
  
  /**
    * The date when this resource was created.
    */
  var created: js.UndefOr[String] = js.undefined
  
  /**
    * The Response business identifier.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The organization which is responsible for the services rendered to the patient.
    */
  var organization: js.UndefOr[Reference] = js.undefined
  
  /**
    * Knowledge of the original version can inform the processing of this instance so that information which is processable by the originating system may be generated.
    */
  var originalRuleset: js.UndefOr[Coding] = js.undefined
  
  /**
    * The practitioner who is responsible for the services rendered to the patient.
    */
  var provider: js.UndefOr[Reference] = js.undefined
  
  /**
    * To determine the relationship between the patient and the subscriber.
    */
  var relationship: Coding
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_EnrollmentRequest: typings.fhir.fhirStrings.EnrollmentRequest
  
  /**
    * The version of the style of resource contents. This should be mapped to the allowable profiles for this and supporting resources.
    */
  var ruleset: js.UndefOr[Coding] = js.undefined
  
  /**
    * Patient Resource.
    */
  var subject: Reference
  
  /**
    * The Insurer who is target  of the request.
    */
  var target: js.UndefOr[Reference] = js.undefined
}
object EnrollmentRequest {
  
  inline def apply(coverage: Reference, relationship: Coding, subject: Reference): EnrollmentRequest = {
    val __obj = js.Dynamic.literal(coverage = coverage.asInstanceOf[js.Any], relationship = relationship.asInstanceOf[js.Any], resourceType = "EnrollmentRequest", subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnrollmentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnrollmentRequest] (val x: Self) extends AnyVal {
    
    inline def setCoverage(value: Reference): Self = StObject.set(x, "coverage", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setOrganization(value: Reference): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setOriginalRuleset(value: Coding): Self = StObject.set(x, "originalRuleset", value.asInstanceOf[js.Any])
    
    inline def setOriginalRulesetUndefined: Self = StObject.set(x, "originalRuleset", js.undefined)
    
    inline def setProvider(value: Reference): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    inline def setRelationship(value: Coding): Self = StObject.set(x, "relationship", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: typings.fhir.fhirStrings.EnrollmentRequest): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setRuleset(value: Coding): Self = StObject.set(x, "ruleset", value.asInstanceOf[js.Any])
    
    inline def setRulesetUndefined: Self = StObject.set(x, "ruleset", js.undefined)
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Reference): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def set_created(value: Element): Self = StObject.set(x, "_created", value.asInstanceOf[js.Any])
    
    inline def set_createdUndefined: Self = StObject.set(x, "_created", js.undefined)
  }
}
