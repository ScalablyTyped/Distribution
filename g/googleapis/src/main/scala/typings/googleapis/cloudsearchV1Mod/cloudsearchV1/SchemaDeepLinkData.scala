package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeepLinkData extends StObject {
  
  /**
    * Application ID (or project ID) from Google API Console.
    */
  var appId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The data for a Google API Console client is entered by a developer during client registration and is stored in PackagingService.
    */
  var client: js.UndefOr[js.Array[SchemaPackagingServiceClient]] = js.undefined
  
  /**
    * The ID for non-URL content. Embeds may either have no analogous web presence or prefer a native mobile experience if supported. In the case of no web presence, instead of setting the "url" field of an embed, such developers will set this field and other content fields, e.g. thumbnail, title, description. If set, this field is used to construct the deep-link URI. Note that the native experience is preferred over the web link and the web link is used as a fallback.
    */
  var deepLinkId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Analogous web presence. Used as desktop fallback or when no native link data is present.
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaDeepLinkData {
  
  inline def apply(): SchemaDeepLinkData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeepLinkData]
  }
  
  extension [Self <: SchemaDeepLinkData](x: Self) {
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdNull: Self = StObject.set(x, "appId", null)
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    inline def setClient(value: js.Array[SchemaPackagingServiceClient]): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    inline def setClientVarargs(value: SchemaPackagingServiceClient*): Self = StObject.set(x, "client", js.Array(value*))
    
    inline def setDeepLinkId(value: String): Self = StObject.set(x, "deepLinkId", value.asInstanceOf[js.Any])
    
    inline def setDeepLinkIdNull: Self = StObject.set(x, "deepLinkId", null)
    
    inline def setDeepLinkIdUndefined: Self = StObject.set(x, "deepLinkId", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
