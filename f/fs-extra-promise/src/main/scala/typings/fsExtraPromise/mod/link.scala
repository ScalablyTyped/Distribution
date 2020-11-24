package typings.fsExtraPromise.mod

import typings.node.NodeJS.ErrnoException
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-extra-promise", "link")
@js.native
object link extends js.Object {
  
  def apply(existingPath: PathLike, newPath: PathLike): js.Promise[Unit] = js.native
  def apply(existingPath: PathLike, newPath: PathLike, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
}
