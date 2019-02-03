package typings
package extractDashFilesLib.extractDashFilesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("extract-files", "ReactNativeFile")
@js.native
class ReactNativeFile protected () extends js.Object {
  def this(options: ReactNativeFileOptions) = this()
  var name: java.lang.String = js.native
  var `type`: java.lang.String = js.native
  var uri: java.lang.String = js.native
}

/* static members */
@JSImport("extract-files", "ReactNativeFile")
@js.native
object ReactNativeFile extends js.Object {
  def list(files: js.Array[extractDashFilesLib.extractDashFilesMod.ReactNativeFileOptions]): js.Array[extractDashFilesLib.extractDashFilesMod.ReactNativeFile] = js.native
}

