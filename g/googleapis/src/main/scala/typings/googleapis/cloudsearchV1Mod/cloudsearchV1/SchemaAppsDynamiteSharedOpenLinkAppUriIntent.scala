package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedOpenLinkAppUriIntent extends StObject {
  
  /**
    * A list of extra data for the android intent. For example, for a calendar event edit intent, the event title information can be passed as extra data.
    */
  var extraData: js.UndefOr[js.Array[SchemaAppsDynamiteSharedOpenLinkAppUriIntentExtraData]] = js.undefined
  
  /**
    * An android intent action string for the {@link android.content.Intent\} object. For example: for the view intent action type, a valid value will be android.content.Intent.ACTION_VIEW.
    */
  var intentAction: js.UndefOr[String | Null] = js.undefined
}
object SchemaAppsDynamiteSharedOpenLinkAppUriIntent {
  
  inline def apply(): SchemaAppsDynamiteSharedOpenLinkAppUriIntent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedOpenLinkAppUriIntent]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedOpenLinkAppUriIntent](x: Self) {
    
    inline def setExtraData(value: js.Array[SchemaAppsDynamiteSharedOpenLinkAppUriIntentExtraData]): Self = StObject.set(x, "extraData", value.asInstanceOf[js.Any])
    
    inline def setExtraDataUndefined: Self = StObject.set(x, "extraData", js.undefined)
    
    inline def setExtraDataVarargs(value: SchemaAppsDynamiteSharedOpenLinkAppUriIntentExtraData*): Self = StObject.set(x, "extraData", js.Array(value*))
    
    inline def setIntentAction(value: String): Self = StObject.set(x, "intentAction", value.asInstanceOf[js.Any])
    
    inline def setIntentActionNull: Self = StObject.set(x, "intentAction", null)
    
    inline def setIntentActionUndefined: Self = StObject.set(x, "intentAction", js.undefined)
  }
}
