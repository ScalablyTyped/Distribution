package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRequestPostDataResponse extends StObject {
  
  /**
    * Request body string, omitting files from multipart requests
    */
  var postData: String
}
object GetRequestPostDataResponse {
  
  inline def apply(postData: String): GetRequestPostDataResponse = {
    val __obj = js.Dynamic.literal(postData = postData.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRequestPostDataResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetRequestPostDataResponse] (val x: Self) extends AnyVal {
    
    inline def setPostData(value: String): Self = StObject.set(x, "postData", value.asInstanceOf[js.Any])
  }
}
