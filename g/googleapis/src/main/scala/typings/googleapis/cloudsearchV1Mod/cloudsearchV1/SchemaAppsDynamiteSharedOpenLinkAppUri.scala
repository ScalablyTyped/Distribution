package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedOpenLinkAppUri extends StObject {
  
  /**
    * An intent object to be opened in the corresponding android hosting app.
    */
  var androidIntent: js.UndefOr[SchemaAppsDynamiteSharedOpenLinkAppUriIntent] = js.undefined
  
  /**
    * A companion uri string to be opened in the chat companion window. on the web.
    */
  var companionUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A uri string to be opened in the corresponding iOS hosting app.
    */
  var iosUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaAppsDynamiteSharedOpenLinkAppUri {
  
  inline def apply(): SchemaAppsDynamiteSharedOpenLinkAppUri = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedOpenLinkAppUri]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedOpenLinkAppUri](x: Self) {
    
    inline def setAndroidIntent(value: SchemaAppsDynamiteSharedOpenLinkAppUriIntent): Self = StObject.set(x, "androidIntent", value.asInstanceOf[js.Any])
    
    inline def setAndroidIntentUndefined: Self = StObject.set(x, "androidIntent", js.undefined)
    
    inline def setCompanionUri(value: String): Self = StObject.set(x, "companionUri", value.asInstanceOf[js.Any])
    
    inline def setCompanionUriNull: Self = StObject.set(x, "companionUri", null)
    
    inline def setCompanionUriUndefined: Self = StObject.set(x, "companionUri", js.undefined)
    
    inline def setIosUri(value: String): Self = StObject.set(x, "iosUri", value.asInstanceOf[js.Any])
    
    inline def setIosUriNull: Self = StObject.set(x, "iosUri", null)
    
    inline def setIosUriUndefined: Self = StObject.set(x, "iosUri", js.undefined)
  }
}
