package typings.googleCloudStorage.utilMod

import typings.std.Error
import typings.teenyRequest.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@google-cloud/storage/build/src/nodejs-common/util", "PartialFailureError")
@js.native
open class PartialFailureError protected ()
  extends StObject
     with Error {
  def this(b: GoogleErrorBody) = this()
  
  var errors: js.UndefOr[js.Array[GoogleInnerError]] = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
  
  var response: js.UndefOr[Response[Any]] = js.native
}
