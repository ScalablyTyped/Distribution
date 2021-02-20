package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a GetIntentRequest. */
@js.native
trait IGetIntentRequest extends StObject {
  
  /** GetIntentRequest intentView */
  var intentView: js.UndefOr[
    IntentView | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.IntentView * / any */ String) | Null
  ] = js.native
  
  /** GetIntentRequest languageCode */
  var languageCode: js.UndefOr[String | Null] = js.native
  
  /** GetIntentRequest name */
  var name: js.UndefOr[String | Null] = js.native
}
object IGetIntentRequest {
  
  @scala.inline
  def apply(): IGetIntentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGetIntentRequest]
  }
  
  @scala.inline
  implicit class IGetIntentRequestMutableBuilder[Self <: IGetIntentRequest] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
