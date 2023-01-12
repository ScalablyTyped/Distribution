package typings.facebookNodejsBusinessSdk

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsServersideHttpServiceInterfaceMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/serverside/http-service-interface", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with HttpServiceInterface {
    
    /* CompleteClass */
    override def executeRequest(url: String, method: String, headers: Record[String, Any], params: Record[String, Any]): js.Promise[Record[String, Any]] = js.native
  }
  
  trait HttpServiceInterface extends StObject {
    
    def executeRequest(url: String, method: String, headers: Record[String, Any], params: Record[String, Any]): js.Promise[Record[String, Any]]
  }
  object HttpServiceInterface {
    
    inline def apply(
      executeRequest: (String, String, Record[String, Any], Record[String, Any]) => js.Promise[Record[String, Any]]
    ): HttpServiceInterface = {
      val __obj = js.Dynamic.literal(executeRequest = js.Any.fromFunction4(executeRequest))
      __obj.asInstanceOf[HttpServiceInterface]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HttpServiceInterface] (val x: Self) extends AnyVal {
      
      inline def setExecuteRequest(
        value: (String, String, Record[String, Any], Record[String, Any]) => js.Promise[Record[String, Any]]
      ): Self = StObject.set(x, "executeRequest", js.Any.fromFunction4(value))
    }
  }
}
