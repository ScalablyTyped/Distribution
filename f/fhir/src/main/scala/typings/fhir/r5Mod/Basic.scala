package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Basic
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _created: js.UndefOr[Element] = js.undefined
  
  /**
    * Indicates who was responsible for creating the resource instance.
    */
  var author: js.UndefOr[Reference] = js.undefined
  
  /**
    * Because resource references will only be able to indicate 'Basic', the type of reference will need to be specified in a Profile identified as part of the resource.  Refer to the resource notes section for information on appropriate terminologies for this code.
    * This element is labeled as a modifier because it defines the meaning of the resource and cannot be ignored.
    */
  var code: CodeableConcept
  
  /**
    * Identifies when the resource was first created.
    */
  var created: js.UndefOr[String] = js.undefined
  
  /**
    * Identifier assigned to the resource for business purposes, outside the context of FHIR.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Basic: typings.fhir.fhirStrings.Basic
  
  /**
    * Optional as not all potential resources will have subjects.  Resources associated with multiple subjects can handle this via extension.
    */
  var subject: js.UndefOr[Reference] = js.undefined
}
object Basic {
  
  inline def apply(code: CodeableConcept): Basic = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], resourceType = "Basic")
    __obj.asInstanceOf[Basic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Basic] (val x: Self) extends AnyVal {
    
    inline def setAuthor(value: Reference): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Basic): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def set_created(value: Element): Self = StObject.set(x, "_created", value.asInstanceOf[js.Any])
    
    inline def set_createdUndefined: Self = StObject.set(x, "_created", js.undefined)
  }
}
