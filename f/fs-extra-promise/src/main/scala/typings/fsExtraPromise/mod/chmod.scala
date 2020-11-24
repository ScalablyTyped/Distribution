package typings.fsExtraPromise.mod

import typings.fsExtra.mod.Mode
import typings.node.NodeJS.ErrnoException
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-extra-promise", "chmod")
@js.native
object chmod extends js.Object {
  
  def apply(path: PathLike, mode: Mode): js.Promise[Unit] = js.native
  def apply(path: PathLike, mode: Mode, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
}
