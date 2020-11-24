package typings.editorconfig.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("editorconfig/src", "parseFromFilesSync")
@js.native
object parseFromFilesSync extends js.Object {
  
  def apply(filepath: String, files: js.Array[ECFile]): KnownProps = js.native
  def apply(filepath: String, files: js.Array[ECFile], options: ParseOptions): KnownProps = js.native
}
