package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A list that defines a set of documents
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait DocumentManifest
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'created'.
    */
  var _created: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'source'.
    */
  var _source: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Who and/or what authored the manifest
    */
  var author: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The items included
    */
  var content: js.Array[DocumentManifestContent]
  
  /**
    * When this document manifest created
    */
  var created: js.UndefOr[dateTime] = js.undefined
  
  /**
    * Human-readable description (title)
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Other identifiers for the manifest
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Unique Identifier for the set of documents
    */
  var masterIdentifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Intended to get notified about this set of documents
    */
  var recipient: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Related things
    */
  var related: js.UndefOr[js.Array[DocumentManifestRelated]] = js.undefined
  
  /**
    * The source system/application/software
    */
  var source: js.UndefOr[uri] = js.undefined
  
  /**
    * current | superseded | entered-in-error
    */
  var status: code
  
  /**
    * The subject of the set of documents
    */
  var subject: js.UndefOr[Reference] = js.undefined
  
  /**
    * Kind of document set
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object DocumentManifest {
  
  inline def apply(content: js.Array[DocumentManifestContent], status: code): DocumentManifest = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentManifest]
  }
  
  extension [Self <: DocumentManifest](x: Self) {
    
    inline def setAuthor(value: js.Array[Reference]): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setAuthorVarargs(value: Reference*): Self = StObject.set(x, "author", js.Array(value :_*))
    
    inline def setContent(value: js.Array[DocumentManifestContent]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentVarargs(value: DocumentManifestContent*): Self = StObject.set(x, "content", js.Array(value :_*))
    
    inline def setCreated(value: dateTime): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    inline def setMasterIdentifier(value: Identifier): Self = StObject.set(x, "masterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setMasterIdentifierUndefined: Self = StObject.set(x, "masterIdentifier", js.undefined)
    
    inline def setRecipient(value: js.Array[Reference]): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    inline def setRecipientUndefined: Self = StObject.set(x, "recipient", js.undefined)
    
    inline def setRecipientVarargs(value: Reference*): Self = StObject.set(x, "recipient", js.Array(value :_*))
    
    inline def setRelated(value: js.Array[DocumentManifestRelated]): Self = StObject.set(x, "related", value.asInstanceOf[js.Any])
    
    inline def setRelatedUndefined: Self = StObject.set(x, "related", js.undefined)
    
    inline def setRelatedVarargs(value: DocumentManifestRelated*): Self = StObject.set(x, "related", js.Array(value :_*))
    
    inline def setSource(value: uri): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_created(value: Element): Self = StObject.set(x, "_created", value.asInstanceOf[js.Any])
    
    inline def set_createdUndefined: Self = StObject.set(x, "_created", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_source(value: Element): Self = StObject.set(x, "_source", value.asInstanceOf[js.Any])
    
    inline def set_sourceUndefined: Self = StObject.set(x, "_source", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
