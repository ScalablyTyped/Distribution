package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Document.KnowledgeType
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Document. */
@js.native
trait IDocument extends StObject {
  
  /** Document content */
  var content: js.UndefOr[String | Null] = js.native
  
  /** Document contentUri */
  var contentUri: js.UndefOr[String | Null] = js.native
  
  /** Document displayName */
  var displayName: js.UndefOr[String | Null] = js.native
  
  /** Document knowledgeTypes */
  var knowledgeTypes: js.UndefOr[js.Array[KnowledgeType] | Null] = js.native
  
  /** Document mimeType */
  var mimeType: js.UndefOr[String | Null] = js.native
  
  /** Document name */
  var name: js.UndefOr[String | Null] = js.native
  
  /** Document rawContent */
  var rawContent: js.UndefOr[Uint8Array | String | Null] = js.native
}
object IDocument {
  
  @scala.inline
  def apply(): IDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDocument]
  }
  
  @scala.inline
  implicit class IDocumentMutableBuilder[Self <: IDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentNull: Self = StObject.set(x, "content", null)
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setContentUri(value: String): Self = StObject.set(x, "contentUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUriNull: Self = StObject.set(x, "contentUri", null)
    
    @scala.inline
    def setContentUriUndefined: Self = StObject.set(x, "contentUri", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setKnowledgeTypes(value: js.Array[KnowledgeType]): Self = StObject.set(x, "knowledgeTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKnowledgeTypesNull: Self = StObject.set(x, "knowledgeTypes", null)
    
    @scala.inline
    def setKnowledgeTypesUndefined: Self = StObject.set(x, "knowledgeTypes", js.undefined)
    
    @scala.inline
    def setKnowledgeTypesVarargs(value: KnowledgeType*): Self = StObject.set(x, "knowledgeTypes", js.Array(value :_*))
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeNull: Self = StObject.set(x, "mimeType", null)
    
    @scala.inline
    def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRawContent(value: Uint8Array | String): Self = StObject.set(x, "rawContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawContentNull: Self = StObject.set(x, "rawContent", null)
    
    @scala.inline
    def setRawContentUndefined: Self = StObject.set(x, "rawContent", js.undefined)
  }
}
