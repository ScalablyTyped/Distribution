package typings.facebookNodejsBusinessSdk

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcExceptionsMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/exceptions", "FacebookRequestError")
  @js.native
  open class FacebookRequestError protected ()
    extends StObject
       with Error {
    def this(response: Any, method: Any, url: Any, data: Any) = this()
    
    var data: Any = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    var method: Any = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var response: Any = js.native
    
    var url: Any = js.native
  }
  
  type FacebookError = js.Error
}
