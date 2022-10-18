package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Document.KnowledgeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Document. */
trait IDocument extends StObject {
  
  /** Document content */
  var content: js.UndefOr[String | Null] = js.undefined
  
  /** Document contentUri */
  var contentUri: js.UndefOr[String | Null] = js.undefined
  
  /** Document displayName */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /** Document knowledgeTypes */
  var knowledgeTypes: js.UndefOr[js.Array[KnowledgeType] | Null] = js.undefined
  
  /** Document mimeType */
  var mimeType: js.UndefOr[String | Null] = js.undefined
  
  /** Document name */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** Document rawContent */
  var rawContent: js.UndefOr[js.typedarray.Uint8Array | String | Null] = js.undefined
}
object IDocument {
  
  inline def apply(): IDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDocument]
  }
  
  extension [Self <: IDocument](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setContentUri(value: String): Self = StObject.set(x, "contentUri", value.asInstanceOf[js.Any])
    
    inline def setContentUriNull: Self = StObject.set(x, "contentUri", null)
    
    inline def setContentUriUndefined: Self = StObject.set(x, "contentUri", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setKnowledgeTypes(value: js.Array[KnowledgeType]): Self = StObject.set(x, "knowledgeTypes", value.asInstanceOf[js.Any])
    
    inline def setKnowledgeTypesNull: Self = StObject.set(x, "knowledgeTypes", null)
    
    inline def setKnowledgeTypesUndefined: Self = StObject.set(x, "knowledgeTypes", js.undefined)
    
    inline def setKnowledgeTypesVarargs(value: KnowledgeType*): Self = StObject.set(x, "knowledgeTypes", js.Array(value*))
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeNull: Self = StObject.set(x, "mimeType", null)
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRawContent(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "rawContent", value.asInstanceOf[js.Any])
    
    inline def setRawContentNull: Self = StObject.set(x, "rawContent", null)
    
    inline def setRawContentUndefined: Self = StObject.set(x, "rawContent", js.undefined)
  }
}
