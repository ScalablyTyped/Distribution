package typings.atGoogleDashCloudProjectify

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/projectify", JSImport.Namespace)
@js.native
object atGoogleDashCloudProjectifyMod extends js.Object {
  @js.native
  class MissingProjectIdError () extends Error {
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  def replaceProjectIdToken(value: js.Any, projectId: String): js.Any = js.native
}

