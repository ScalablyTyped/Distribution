package typings.googleCloudProjectify

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/projectify", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MissingProjectIdError () extends Error
  
  def replaceProjectIdToken(value: js.Any, projectId: String): js.Any = js.native
}

