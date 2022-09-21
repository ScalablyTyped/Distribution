package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExternalData extends StObject {
  
  /**
    * The base-64 encoded SHA-256 hash of the content hosted at url. If the content doesn't match this hash, Android Device Policy won't use the data.
    */
  var sha256Hash: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The absolute URL to the data, which must use either the http or https scheme. Android Device Policy doesn't provide any credentials in the GET request, so the URL must be publicly accessible. Including a long, random component in the URL may be used to prevent attackers from discovering the URL.
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaExternalData {
  
  inline def apply(): SchemaExternalData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExternalData]
  }
  
  extension [Self <: SchemaExternalData](x: Self) {
    
    inline def setSha256Hash(value: String): Self = StObject.set(x, "sha256Hash", value.asInstanceOf[js.Any])
    
    inline def setSha256HashNull: Self = StObject.set(x, "sha256Hash", null)
    
    inline def setSha256HashUndefined: Self = StObject.set(x, "sha256Hash", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
