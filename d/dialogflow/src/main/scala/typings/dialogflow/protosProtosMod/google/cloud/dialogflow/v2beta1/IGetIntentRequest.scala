package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a GetIntentRequest. */
trait IGetIntentRequest extends StObject {
  
  /** GetIntentRequest intentView */
  var intentView: js.UndefOr[
    IntentView | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.IntentView * / any */ String) | Null
  ] = js.undefined
  
  /** GetIntentRequest languageCode */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /** GetIntentRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
}
object IGetIntentRequest {
  
  inline def apply(): IGetIntentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGetIntentRequest]
  }
  
  extension [Self <: IGetIntentRequest](x: Self) {
    
    inline def setIntentView(
      value: IntentView | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.IntentView * / any */ String)
    ): Self = StObject.set(x, "intentView", value.asInstanceOf[js.Any])
    
    inline def setIntentViewNull: Self = StObject.set(x, "intentView", null)
    
    inline def setIntentViewUndefined: Self = StObject.set(x, "intentView", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
