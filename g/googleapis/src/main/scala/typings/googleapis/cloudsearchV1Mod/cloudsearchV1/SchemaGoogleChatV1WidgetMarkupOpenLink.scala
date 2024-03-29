package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChatV1WidgetMarkupOpenLink extends StObject {
  
  /**
    * The URL to open.
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleChatV1WidgetMarkupOpenLink {
  
  inline def apply(): SchemaGoogleChatV1WidgetMarkupOpenLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChatV1WidgetMarkupOpenLink]
  }
  
  extension [Self <: SchemaGoogleChatV1WidgetMarkupOpenLink](x: Self) {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
