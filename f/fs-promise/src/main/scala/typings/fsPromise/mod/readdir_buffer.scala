package typings.fsPromise.mod

import typings.fsPromise.fsPromiseStrings.buffer
import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-promise", "readdir")
@js.native
object readdir_buffer extends js.Object {
  
  def apply(path: PathLike, options: buffer): js.Promise[js.Array[Buffer]] = js.native
  def apply(
    path: PathLike,
    options: buffer,
    callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer], Unit]
  ): Unit = js.native
}
