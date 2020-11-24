package typings.fsPromise.mod

import typings.node.NodeJS.ErrnoException
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-promise", "lstat")
@js.native
object lstat extends js.Object {
  
  def apply(path: PathLike): js.Promise[typings.node.fsMod.Stats] = js.native
  def apply(
    path: PathLike,
    callback: js.Function2[(/* err */ ErrnoException) | Null, /* stats */ typings.node.fsMod.Stats, _ | Unit]
  ): Unit = js.native
}
