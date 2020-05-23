package typings.fsPromise.mod

import typings.fsExtra.anon.Encoding
import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import typings.node.fsMod.NoParamCallback
import typings.node.fsMod.PathLike
import typings.node.fsMod.WriteFileOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-promise", "appendFile")
@js.native
object appendFile extends js.Object {
  def apply(file: String, data: js.Any): js.Promise[Unit] = js.native
  def apply(file: String, data: js.Any, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(file: String, data: js.Any, options: Encoding): js.Promise[Unit] = js.native
  def apply(
    file: String,
    data: js.Any,
    options: Encoding,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  def apply(file: Double, data: js.Any): js.Promise[Unit] = js.native
  def apply(
    file: Double,
    data: js.Any,
    callback: (js.Function1[/* err */ ErrnoException, Unit]) | NoParamCallback
  ): Unit = js.native
  def apply(file: Double, data: js.Any, options: Encoding): js.Promise[Unit] = js.native
  def apply(
    file: Double,
    data: js.Any,
    options: Encoding,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  def apply(file: Double, data: js.Any, options: WriteFileOptions, callback: NoParamCallback): Unit = js.native
  def apply(file: Buffer, data: js.Any): js.Promise[Unit] = js.native
  def apply(file: Buffer, data: js.Any, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(file: Buffer, data: js.Any, options: Encoding): js.Promise[Unit] = js.native
  def apply(
    file: Buffer,
    data: js.Any,
    options: Encoding,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  def apply(file: PathLike, data: js.Any): js.Promise[Unit] = js.native
  def apply(file: PathLike, data: js.Any, callback: NoParamCallback): Unit = js.native
  def apply(file: PathLike, data: js.Any, options: WriteFileOptions): js.Promise[Unit] = js.native
  def apply(file: PathLike, data: js.Any, options: WriteFileOptions, callback: NoParamCallback): Unit = js.native
}

