package typings.googleCloudProjectify

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@google-cloud/projectify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@google-cloud/projectify", "MissingProjectIdError")
  @js.native
  class MissingProjectIdError ()
    extends StObject
       with Error {
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def replaceProjectIdToken(value: js.Any, projectId: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceProjectIdToken")(value.asInstanceOf[js.Any], projectId.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
