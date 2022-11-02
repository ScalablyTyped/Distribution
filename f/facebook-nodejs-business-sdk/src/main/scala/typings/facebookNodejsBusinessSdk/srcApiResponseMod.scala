package typings.facebookNodejsBusinessSdk

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcApiResponseMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/api-response", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with APIResponse {
    def this(response: Record[String, Any]) = this()
    def this(response: Record[String, Any], call: Record[String, Any]) = this()
  }
  
  @js.native
  trait APIResponse extends StObject {
    
    var _body: Record[String, Any] = js.native
    
    var _call: Record[String, Any] = js.native
    
    var _headers: Record[String, Any] = js.native
    
    var _httpStatus: String = js.native
    
    var _response: Record[String, Any] = js.native
    
    def body: Any = js.native
    
    def error: Any = js.native
    
    def etag: Any = js.native
    
    def headers: Any = js.native
    
    def isSuccess: Boolean = js.native
    
    def status: String = js.native
  }
}
