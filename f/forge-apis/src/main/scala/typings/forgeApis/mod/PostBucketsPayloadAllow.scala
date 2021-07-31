package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostBucketsPayloadAllow extends StObject {
  
  var access: String
  
  var authId: String
}
object PostBucketsPayloadAllow {
  
  @scala.inline
  def apply(access: String, authId: String): PostBucketsPayloadAllow = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], authId = authId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostBucketsPayloadAllow]
  }
  
  @scala.inline
  implicit class PostBucketsPayloadAllowMutableBuilder[Self <: PostBucketsPayloadAllow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccess(value: String): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthId(value: String): Self = StObject.set(x, "authId", value.asInstanceOf[js.Any])
  }
}
