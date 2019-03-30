package typings
package editorconfigLib.srcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("editorconfig/src", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def parse(_filepath: java.lang.String): js.Promise[KnownProps] = js.native
  def parse(_filepath: java.lang.String, _options: ParseOptions): js.Promise[KnownProps] = js.native
  def parseFromFiles(filepath: java.lang.String, files: js.Promise[js.Array[ECFile]]): js.Promise[KnownProps] = js.native
  def parseFromFiles(filepath: java.lang.String, files: js.Promise[js.Array[ECFile]], options: ParseOptions): js.Promise[KnownProps] = js.native
  def parseFromFilesSync(filepath: java.lang.String, files: js.Array[ECFile]): KnownProps = js.native
  def parseFromFilesSync(filepath: java.lang.String, files: js.Array[ECFile], options: ParseOptions): KnownProps = js.native
  def parseString(data: java.lang.String): editorconfigLib.srcLibIniMod.ParseStringResult = js.native
  def parseSync(_filepath: java.lang.String): KnownProps = js.native
  def parseSync(_filepath: java.lang.String, _options: ParseOptions): KnownProps = js.native
}

