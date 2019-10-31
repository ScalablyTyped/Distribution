package typings.fsDashPromise.fsDashPromiseMod

import typings.fsDashExtra.fsDashExtraMod.FsSymlinkType
import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import typings.node.fsMod.NoParamCallback
import typings.node.fsMod.PathLike
import typings.node.fsMod.symlink.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("fs-promise", "symlink")
@js.native
object symlink extends js.Object {
  def apply(srcpath: String, dstpath: String): js.Promise[Unit] = js.native
  def apply(srcpath: String, dstpath: String, callback: js.Function1[js.UndefOr[ErrnoException], Unit]): Unit = js.native
  def apply(
    srcpath: String,
    dstpath: String,
    `type`: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  def apply(srcpath: String, dstpath: String, `type`: String): js.Promise[Unit] = js.native
  def apply(
    srcpath: String,
    dstpath: String,
    `type`: String,
    callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]
  ): Unit = js.native
  def apply(srcpath: String, dstpath: String, `type`: FsSymlinkType): js.Promise[Unit] = js.native
  def apply(
    srcpath: String,
    dstpath: String,
    `type`: FsSymlinkType,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  def apply(srcpath: String, dstpath: Buffer): js.Promise[Unit] = js.native
  def apply(srcpath: String, dstpath: Buffer, callback: js.Function1[js.UndefOr[ErrnoException], Unit]): Unit = js.native
  def apply(
    srcpath: String,
    dstpath: Buffer,
    `type`: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  def apply(srcpath: String, dstpath: Buffer, `type`: String): js.Promise[Unit] = js.native
  def apply(
    srcpath: String,
    dstpath: Buffer,
    `type`: String,
    callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]
  ): Unit = js.native
  def apply(srcpath: String, dstpath: Buffer, `type`: FsSymlinkType): js.Promise[Unit] = js.native
  def apply(
    srcpath: String,
    dstpath: Buffer,
    `type`: FsSymlinkType,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  def apply(srcpath: Buffer, dstpath: String): js.Promise[Unit] = js.native
  def apply(srcpath: Buffer, dstpath: String, callback: js.Function1[js.UndefOr[ErrnoException], Unit]): Unit = js.native
  def apply(
    srcpath: Buffer,
    dstpath: String,
    `type`: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  def apply(srcpath: Buffer, dstpath: String, `type`: String): js.Promise[Unit] = js.native
  def apply(
    srcpath: Buffer,
    dstpath: String,
    `type`: String,
    callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]
  ): Unit = js.native
  def apply(srcpath: Buffer, dstpath: String, `type`: FsSymlinkType): js.Promise[Unit] = js.native
  def apply(
    srcpath: Buffer,
    dstpath: String,
    `type`: FsSymlinkType,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  def apply(srcpath: Buffer, dstpath: Buffer): js.Promise[Unit] = js.native
  def apply(srcpath: Buffer, dstpath: Buffer, callback: js.Function1[js.UndefOr[ErrnoException], Unit]): Unit = js.native
  def apply(
    srcpath: Buffer,
    dstpath: Buffer,
    `type`: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  def apply(srcpath: Buffer, dstpath: Buffer, `type`: String): js.Promise[Unit] = js.native
  def apply(
    srcpath: Buffer,
    dstpath: Buffer,
    `type`: String,
    callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]
  ): Unit = js.native
  def apply(srcpath: Buffer, dstpath: Buffer, `type`: FsSymlinkType): js.Promise[Unit] = js.native
  def apply(
    srcpath: Buffer,
    dstpath: Buffer,
    `type`: FsSymlinkType,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  /**
    * Asynchronous symlink(2) - Create a new symbolic link to an existing file.
    * @param target A path to an existing file. If a URL is provided, it must use the `file:` protocol.
    * @param path A path to the new symlink. If a URL is provided, it must use the `file:` protocol.
    */
  def apply(target: PathLike, path: PathLike, callback: NoParamCallback): Unit = js.native
  def apply(target: PathLike, path: PathLike, `type`: js.UndefOr[scala.Nothing], callback: NoParamCallback): Unit = js.native
  def apply(target: PathLike, path: PathLike, `type`: Null, callback: NoParamCallback): Unit = js.native
  /**
    * Asynchronous symlink(2) - Create a new symbolic link to an existing file.
    * @param target A path to an existing file. If a URL is provided, it must use the `file:` protocol.
    * @param path A path to the new symlink. If a URL is provided, it must use the `file:` protocol.
    * @param type May be set to `'dir'`, `'file'`, or `'junction'` (default is `'file'`) and is only available on Windows (ignored on other platforms).
    * When using `'junction'`, the `target` argument will automatically be normalized to an absolute path.
    */
  def apply(target: PathLike, path: PathLike, `type`: Type, callback: NoParamCallback): Unit = js.native
  /**
    * Asynchronous symlink(2) - Create a new symbolic link to an existing file.
    * @param target A path to an existing file. If a URL is provided, it must use the `file:` protocol.
    * @param path A path to the new symlink. If a URL is provided, it must use the `file:` protocol.
    * @param type May be set to `'dir'`, `'file'`, or `'junction'` (default is `'file'`) and is only available on Windows (ignored on other platforms).
    * When using `'junction'`, the `target` argument will automatically be normalized to an absolute path.
    */
  def __promisify__(target: PathLike, path: PathLike): js.Promise[Unit] = js.native
  def __promisify__(target: PathLike, path: PathLike, `type`: String): js.Promise[Unit] = js.native
}

