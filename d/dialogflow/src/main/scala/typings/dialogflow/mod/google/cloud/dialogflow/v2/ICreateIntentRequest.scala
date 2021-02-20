package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CreateIntentRequest. */
@js.native
trait ICreateIntentRequest extends StObject {
  
  /** CreateIntentRequest intent */
  var intent: js.UndefOr[IIntent | Null] = js.native
  
  /** CreateIntentRequest intentView */
  var intentView: js.UndefOr[
    IntentView | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.IntentView * / any */ String) | Null
  ] = js.native
  
  /** CreateIntentRequest languageCode */
  var languageCode: js.UndefOr[String | Null] = js.native
  
  /** CreateIntentRequest parent */
  var parent: js.UndefOr[String | Null] = js.native
}
object ICreateIntentRequest {
  
  @scala.inline
  def apply(): ICreateIntentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICreateIntentRequest]
  }
  
  @scala.inline
  implicit class ICreateIntentRequestMutableBuilder[Self <: ICreateIntentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIntent(value: IIntent): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentNull: Self = StObject.set(x, "intent", null)
    
    @scala.inline
    def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
    
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
  }
}
