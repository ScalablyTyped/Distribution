package typings.electron.originalFsMod

import typings.node.NodeJS.ErrnoException
import typings.node.anon.MakeDirectoryOptionsrecur
import typings.node.anon.MakeDirectoryOptionsrecurMode
import typings.node.fsMod.MakeDirectoryOptions
import typings.node.fsMod.Mode
import typings.node.fsMod.NoParamCallback
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("original-fs", "mkdir")
@js.native
object mkdir extends js.Object {
  def apply(path: PathLike, callback: NoParamCallback): Unit = js.native
  def apply(
    path: PathLike,
    options: js.UndefOr[MakeDirectoryOptions | Mode | Null],
    callback: js.Function2[ErrnoException | Null, js.UndefOr[String], Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: js.UndefOr[MakeDirectoryOptionsrecurMode | Mode | Null],
    callback: NoParamCallback
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: MakeDirectoryOptionsrecur,
    callback: js.Function2[/* err */ ErrnoException | Null, /* path */ String, Unit]
  ): Unit = js.native
  /**
    * Asynchronous mkdir(2) - create a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
    * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
    */
  @JSName("__promisify__")
  def promisify(path: PathLike): js.Promise[Unit] = js.native
  /**
    * Asynchronous mkdir(2) - create a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
    * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
    */
  @JSName("__promisify__")
  def promisify(path: PathLike, options: MakeDirectoryOptionsrecur): js.Promise[String] = js.native
  @JSName("__promisify__")
  def promisify(path: PathLike, options: MakeDirectoryOptionsrecurMode): js.Promise[Unit] = js.native
  @JSName("__promisify__")
  def promisify(path: PathLike, options: MakeDirectoryOptions): js.Promise[js.UndefOr[String]] = js.native
  @JSName("__promisify__")
  def promisify(path: PathLike, options: Mode): js.Promise[Unit] = js.native
}

