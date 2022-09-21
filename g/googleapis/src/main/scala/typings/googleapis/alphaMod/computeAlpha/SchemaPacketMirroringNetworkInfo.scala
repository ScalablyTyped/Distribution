package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPacketMirroringNetworkInfo extends StObject {
  
  /**
    * [Output Only] Unique identifier for the network; defined by the server.
    */
  var canonicalUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URL of the network resource.
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaPacketMirroringNetworkInfo {
  
  inline def apply(): SchemaPacketMirroringNetworkInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPacketMirroringNetworkInfo]
  }
  
  extension [Self <: SchemaPacketMirroringNetworkInfo](x: Self) {
    
    inline def setCanonicalUrl(value: String): Self = StObject.set(x, "canonicalUrl", value.asInstanceOf[js.Any])
    
    inline def setCanonicalUrlNull: Self = StObject.set(x, "canonicalUrl", null)
    
    inline def setCanonicalUrlUndefined: Self = StObject.set(x, "canonicalUrl", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
