package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsCardV1OpenLink extends StObject {
  
  /**
    * Whether the client forgets about a link after opening it, or observes it until the window closes. Not supported by Chat apps.
    */
  var onClose: js.UndefOr[String | Null] = js.undefined
  
  /**
    * How to open a link. Not supported by Chat apps.
    */
  var openAs: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URL to open.
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAppsCardV1OpenLink {
  
  inline def apply(): SchemaGoogleAppsCardV1OpenLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsCardV1OpenLink]
  }
  
  extension [Self <: SchemaGoogleAppsCardV1OpenLink](x: Self) {
    
    inline def setOnClose(value: String): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
    
    inline def setOnCloseNull: Self = StObject.set(x, "onClose", null)
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setOpenAs(value: String): Self = StObject.set(x, "openAs", value.asInstanceOf[js.Any])
    
    inline def setOpenAsNull: Self = StObject.set(x, "openAs", null)
    
    inline def setOpenAsUndefined: Self = StObject.set(x, "openAs", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
