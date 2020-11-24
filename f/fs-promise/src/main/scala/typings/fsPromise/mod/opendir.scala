package typings.fsPromise.mod

import typings.node.NodeJS.ErrnoException
import typings.node.fsMod.OpenDirOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-promise", "opendir")
@js.native
object opendir extends js.Object {
  
  def apply(path: String): js.Promise[typings.node.fsMod.Dir] = js.native
  def apply(path: String, cb: js.Function2[ErrnoException | Null, /* dir */ typings.node.fsMod.Dir, Unit]): Unit = js.native
  def apply(path: String, options: OpenDirOptions): js.Promise[typings.node.fsMod.Dir] = js.native
  def apply(
    path: String,
    options: OpenDirOptions,
    cb: js.Function2[ErrnoException | Null, /* dir */ typings.node.fsMod.Dir, Unit]
  ): Unit = js.native
}
