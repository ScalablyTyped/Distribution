package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CitationCitedArtifactRelatesTo
  extends StObject
     with BackboneElement {
  
  var _targetUri: js.UndefOr[Element] = js.undefined
  
  /**
    * How the cited artifact relates to the target artifact.
    */
  var relationshipType: CodeableConcept
  
  /**
    * The article or artifact that the cited artifact is related to.
    */
  var targetAttachment: js.UndefOr[Attachment] = js.undefined
  
  /**
    * The clasification of the related artifact.
    */
  var targetClassifier: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The article or artifact that the cited artifact is related to.
    */
  var targetIdentifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * The article or artifact that the cited artifact is related to.
    */
  var targetReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * The article or artifact that the cited artifact is related to.
    */
  var targetUri: js.UndefOr[String] = js.undefined
}
object CitationCitedArtifactRelatesTo {
  
  inline def apply(relationshipType: CodeableConcept): CitationCitedArtifactRelatesTo = {
    val __obj = js.Dynamic.literal(relationshipType = relationshipType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CitationCitedArtifactRelatesTo]
  }
  
  extension [Self <: CitationCitedArtifactRelatesTo](x: Self) {
    
    inline def setRelationshipType(value: CodeableConcept): Self = StObject.set(x, "relationshipType", value.asInstanceOf[js.Any])
    
    inline def setTargetAttachment(value: Attachment): Self = StObject.set(x, "targetAttachment", value.asInstanceOf[js.Any])
    
    inline def setTargetAttachmentUndefined: Self = StObject.set(x, "targetAttachment", js.undefined)
    
    inline def setTargetClassifier(value: js.Array[CodeableConcept]): Self = StObject.set(x, "targetClassifier", value.asInstanceOf[js.Any])
    
    inline def setTargetClassifierUndefined: Self = StObject.set(x, "targetClassifier", js.undefined)
    
    inline def setTargetClassifierVarargs(value: CodeableConcept*): Self = StObject.set(x, "targetClassifier", js.Array(value*))
    
    inline def setTargetIdentifier(value: Identifier): Self = StObject.set(x, "targetIdentifier", value.asInstanceOf[js.Any])
    
    inline def setTargetIdentifierUndefined: Self = StObject.set(x, "targetIdentifier", js.undefined)
    
    inline def setTargetReference(value: Reference): Self = StObject.set(x, "targetReference", value.asInstanceOf[js.Any])
    
    inline def setTargetReferenceUndefined: Self = StObject.set(x, "targetReference", js.undefined)
    
    inline def setTargetUri(value: String): Self = StObject.set(x, "targetUri", value.asInstanceOf[js.Any])
    
    inline def setTargetUriUndefined: Self = StObject.set(x, "targetUri", js.undefined)
    
    inline def set_targetUri(value: Element): Self = StObject.set(x, "_targetUri", value.asInstanceOf[js.Any])
    
    inline def set_targetUriUndefined: Self = StObject.set(x, "_targetUri", js.undefined)
  }
}
