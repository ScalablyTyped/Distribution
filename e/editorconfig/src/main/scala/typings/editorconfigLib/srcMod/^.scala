package typings
package editorconfigLib.srcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("editorconfig/src", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def parse(_filepath: java.lang.String): js.Promise[editorconfigLib.srcMod.KnownProps] = js.native
  def parse(_filepath: java.lang.String, _options: editorconfigLib.srcMod.ParseOptions): js.Promise[editorconfigLib.srcMod.KnownProps] = js.native
  def parseFromFiles(filepath: java.lang.String, files: js.Promise[js.Array[editorconfigLib.srcMod.ECFile]]): js.Promise[editorconfigLib.srcMod.KnownProps] = js.native
  def parseFromFiles(
    filepath: java.lang.String,
    files: js.Promise[js.Array[editorconfigLib.srcMod.ECFile]],
    options: editorconfigLib.srcMod.ParseOptions
  ): js.Promise[editorconfigLib.srcMod.KnownProps] = js.native
  def parseFromFilesSync(filepath: java.lang.String, files: js.Array[editorconfigLib.srcMod.ECFile]): editorconfigLib.srcMod.KnownProps = js.native
  def parseFromFilesSync(
    filepath: java.lang.String,
    files: js.Array[editorconfigLib.srcMod.ECFile],
    options: editorconfigLib.srcMod.ParseOptions
  ): editorconfigLib.srcMod.KnownProps = js.native
  def parseString(data: java.lang.String): editorconfigLib.srcLibIniMod.ParseStringResult = js.native
  def parseSync(_filepath: java.lang.String): editorconfigLib.srcMod.KnownProps = js.native
  def parseSync(_filepath: java.lang.String, _options: editorconfigLib.srcMod.ParseOptions): editorconfigLib.srcMod.KnownProps = js.native
}

