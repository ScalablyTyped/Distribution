package typings.electron.originalFsMod

import typings.node.fsMod.Mode
import typings.node.fsMod.NoParamCallback
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("original-fs", "lchmod")
@js.native
object lchmod extends js.Object {
  def apply(path: PathLike, mode: Mode, callback: NoParamCallback): Unit = js.native
  /**
    * Asynchronous lchmod(2) - Change permissions of a file. Does not dereference symbolic links.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
    */
  @JSName("__promisify__")
  def promisify(path: PathLike, mode: Mode): js.Promise[Unit] = js.native
}

