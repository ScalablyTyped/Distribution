package typings.editorconfig.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("editorconfig/src", "parseFromFiles")
@js.native
object parseFromFiles extends js.Object {
  
  def apply(filepath: String, files: js.Promise[js.Array[ECFile]]): js.Promise[KnownProps] = js.native
  def apply(filepath: String, files: js.Promise[js.Array[ECFile]], options: ParseOptions): js.Promise[KnownProps] = js.native
}
