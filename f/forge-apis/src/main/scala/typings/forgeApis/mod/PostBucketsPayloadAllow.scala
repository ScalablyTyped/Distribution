package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostBucketsPayloadAllow extends StObject {
  
  var access: String
  
  var authId: String
}
object PostBucketsPayloadAllow {
  
  inline def apply(access: String, authId: String): PostBucketsPayloadAllow = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], authId = authId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostBucketsPayloadAllow]
  }
  
  extension [Self <: PostBucketsPayloadAllow](x: Self) {
    
    inline def setAccess(value: String): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
    
    inline def setAuthId(value: String): Self = StObject.set(x, "authId", value.asInstanceOf[js.Any])
  }
}
