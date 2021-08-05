package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListIntentsRequest. */
trait IListIntentsRequest extends StObject {
  
  /** ListIntentsRequest intentView */
  var intentView: js.UndefOr[
    IntentView | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.IntentView * / any */ String) | Null
  ] = js.undefined
  
  /** ListIntentsRequest languageCode */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /** ListIntentsRequest pageSize */
  var pageSize: js.UndefOr[Double | Null] = js.undefined
  
  /** ListIntentsRequest pageToken */
  var pageToken: js.UndefOr[String | Null] = js.undefined
  
  /** ListIntentsRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}
object IListIntentsRequest {
  
  inline def apply(): IListIntentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListIntentsRequest]
  }
  
  extension [Self <: IListIntentsRequest](x: Self) {
    
    inline def setIntentView(
      value: IntentView | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.IntentView * / any */ String)
    ): Self = StObject.set(x, "intentView", value.asInstanceOf[js.Any])
    
    inline def setIntentViewNull: Self = StObject.set(x, "intentView", null)
    
    inline def setIntentViewUndefined: Self = StObject.set(x, "intentView", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeNull: Self = StObject.set(x, "pageSize", null)
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenNull: Self = StObject.set(x, "pageToken", null)
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
