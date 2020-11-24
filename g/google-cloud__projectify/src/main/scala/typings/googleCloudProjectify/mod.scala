package typings.googleCloudProjectify

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@google-cloud/projectify", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def replaceProjectIdToken(value: js.Any, projectId: String): js.Any = js.native
  
  @js.native
  class MissingProjectIdError () extends Error
}
