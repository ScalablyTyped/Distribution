package typings.extractDashFiles.extractDashFilesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("extract-files", "ReactNativeFile")
@js.native
class ReactNativeFile protected () extends js.Object {
  def this(options: ReactNativeFileOptions) = this()
  var name: String = js.native
  var `type`: String = js.native
  var uri: String = js.native
}

/* static members */
@JSImport("extract-files", "ReactNativeFile")
@js.native
object ReactNativeFile extends js.Object {
  def list(files: js.Array[ReactNativeFileOptions]): js.Array[ReactNativeFile] = js.native
}

