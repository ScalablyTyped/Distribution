package typings.dialogflow.mod.google.cloud.dialogflow.v2

import typings.dialogflow.mod.google.protobuf.IFieldMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a BatchUpdateIntentsRequest. */
@js.native
trait IBatchUpdateIntentsRequest extends StObject {
  
  /** BatchUpdateIntentsRequest intentBatchInline */
  var intentBatchInline: js.UndefOr[IIntentBatch | Null] = js.native
  
  /** BatchUpdateIntentsRequest intentBatchUri */
  var intentBatchUri: js.UndefOr[String | Null] = js.native
  
  /** BatchUpdateIntentsRequest intentView */
  var intentView: js.UndefOr[
    IntentView | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.IntentView * / any */ String) | Null
  ] = js.native
  
  /** BatchUpdateIntentsRequest languageCode */
  var languageCode: js.UndefOr[String | Null] = js.native
  
  /** BatchUpdateIntentsRequest parent */
  var parent: js.UndefOr[String | Null] = js.native
  
  /** BatchUpdateIntentsRequest updateMask */
  var updateMask: js.UndefOr[IFieldMask | Null] = js.native
}
object IBatchUpdateIntentsRequest {
  
  @scala.inline
  def apply(): IBatchUpdateIntentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBatchUpdateIntentsRequest]
  }
  
  @scala.inline
  implicit class IBatchUpdateIntentsRequestMutableBuilder[Self <: IBatchUpdateIntentsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIntentBatchInline(value: IIntentBatch): Self = StObject.set(x, "intentBatchInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentBatchInlineNull: Self = StObject.set(x, "intentBatchInline", null)
    
    @scala.inline
    def setIntentBatchInlineUndefined: Self = StObject.set(x, "intentBatchInline", js.undefined)
    
    @scala.inline
    def setIntentBatchUri(value: String): Self = StObject.set(x, "intentBatchUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentBatchUriNull: Self = StObject.set(x, "intentBatchUri", null)
    
    @scala.inline
    def setIntentBatchUriUndefined: Self = StObject.set(x, "intentBatchUri", js.undefined)
    
    @scala.inline
    def setIntentView(
      value: IntentView | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.IntentView * / any */ String)
    ): Self = StObject.set(x, "intentView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentViewNull: Self = StObject.set(x, "intentView", null)
    
    @scala.inline
    def setIntentViewUndefined: Self = StObject.set(x, "intentView", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNull: Self = StObject.set(x, "parent", null)
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: IFieldMask): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskNull: Self = StObject.set(x, "updateMask", null)
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
