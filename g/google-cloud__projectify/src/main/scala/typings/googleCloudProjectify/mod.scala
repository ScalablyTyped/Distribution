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
  open class MissingProjectIdError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def replaceProjectIdToken(value: Any, projectId: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceProjectIdToken")(value.asInstanceOf[js.Any], projectId.asInstanceOf[js.Any])).asInstanceOf[Any]
}
