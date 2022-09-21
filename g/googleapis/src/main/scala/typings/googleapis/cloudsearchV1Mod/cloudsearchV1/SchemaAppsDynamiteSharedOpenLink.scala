package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedOpenLink extends StObject {
  
  /**
    * Represents the platform specific uri/intent to open on each client. For example: A companion_url will open in a companion window on the web. An iOS URL and android intent will open in the corresponding hosting apps. If these platform specific URLs can't be handled correctly, i.e. if the companion isn't supported on web and the hosting apps aren't available on the mobile platforms then the `uri` will open in a new browser window on all the platforms.
    */
  var appUri: js.UndefOr[SchemaAppsDynamiteSharedOpenLinkAppUri] = js.undefined
  
  var onClose: js.UndefOr[String | Null] = js.undefined
  
  var openAs: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URL to open.
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaAppsDynamiteSharedOpenLink {
  
  inline def apply(): SchemaAppsDynamiteSharedOpenLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedOpenLink]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedOpenLink](x: Self) {
    
    inline def setAppUri(value: SchemaAppsDynamiteSharedOpenLinkAppUri): Self = StObject.set(x, "appUri", value.asInstanceOf[js.Any])
    
    inline def setAppUriUndefined: Self = StObject.set(x, "appUri", js.undefined)
    
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
