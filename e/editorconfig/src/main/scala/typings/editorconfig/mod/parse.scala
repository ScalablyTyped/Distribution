package typings.editorconfig.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("editorconfig/src", "parse")
@js.native
object parse extends js.Object {
  
  def apply(_filepath: String): js.Promise[KnownProps] = js.native
  def apply(_filepath: String, _options: ParseOptions): js.Promise[KnownProps] = js.native
}
