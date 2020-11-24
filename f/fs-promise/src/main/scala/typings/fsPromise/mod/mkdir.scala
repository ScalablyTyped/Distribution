package typings.fsPromise.mod

import typings.fsExtra.mod.Mode
import typings.node.NodeJS.ErrnoException
import typings.node.fsMod.MakeDirectoryOptions
import typings.node.fsMod.NoParamCallback
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-promise", "mkdir")
@js.native
object mkdir extends js.Object {
  
  def apply(path: PathLike): js.Promise[Unit] = js.native
  def apply(path: PathLike, callback: (js.Function1[/* err */ ErrnoException, Unit]) | NoParamCallback): Unit = js.native
  def apply(
    path: PathLike,
    options: js.UndefOr[Mode],
    callback: (js.Function1[/* err */ ErrnoException, Unit]) | NoParamCallback
  ): Unit = js.native
  def apply(path: PathLike, options: String): js.Promise[Unit] = js.native
  def apply(path: PathLike, options: String, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, options: Double): js.Promise[Unit] = js.native
  def apply(path: PathLike, options: Double, callback: NoParamCallback): Unit = js.native
  def apply(
    path: PathLike,
    options: Null,
    callback: (js.Function1[/* err */ ErrnoException, Unit]) | NoParamCallback
  ): Unit = js.native
  def apply(path: PathLike, options: MakeDirectoryOptions): js.Promise[Unit] = js.native
  def apply(
    path: PathLike,
    options: MakeDirectoryOptions,
    callback: (js.Function1[/* err */ ErrnoException, Unit]) | NoParamCallback
  ): Unit = js.native
}
