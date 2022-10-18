package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CreateIntentRequest. */
trait ICreateIntentRequest extends StObject {
  
  /** CreateIntentRequest intent */
  var intent: js.UndefOr[IIntent | Null] = js.undefined
  
  /** CreateIntentRequest intentView */
  var intentView: js.UndefOr[
    IntentView | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.IntentView * / any */ String) | Null
  ] = js.undefined
  
  /** CreateIntentRequest languageCode */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /** CreateIntentRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}
object ICreateIntentRequest {
  
  inline def apply(): ICreateIntentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICreateIntentRequest]
  }
  
  extension [Self <: ICreateIntentRequest](x: Self) {
    
    inline def setIntent(value: IIntent): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setIntentNull: Self = StObject.set(x, "intent", null)
    
    inline def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
    
    inline def setIntentView(
      value: IntentView | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.IntentView * / any */ String)
    ): Self = StObject.set(x, "intentView", value.asInstanceOf[js.Any])
    
    inline def setIntentViewNull: Self = StObject.set(x, "intentView", null)
    
    inline def setIntentViewUndefined: Self = StObject.set(x, "intentView", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
