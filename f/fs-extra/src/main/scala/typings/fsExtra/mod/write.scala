package typings.fsExtra.mod

import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra", "write")
@js.native
object write extends js.Object {
  def apply(fd: Double, buffer: Buffer): js.Promise[WriteResult] = js.native
  def apply(
    fd: Double,
    buffer: Buffer,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[WriteResult] = js.native
  def apply(fd: Double, buffer: Buffer, offset: js.UndefOr[scala.Nothing], length: Double): js.Promise[WriteResult] = js.native
  def apply(fd: Double, buffer: Buffer, offset: js.UndefOr[scala.Nothing], length: Double, position: Double): js.Promise[WriteResult] = js.native
  def apply(fd: Double, buffer: Buffer, offset: Double): js.Promise[WriteResult] = js.native
  def apply(fd: Double, buffer: Buffer, offset: Double, length: js.UndefOr[scala.Nothing], position: Double): js.Promise[WriteResult] = js.native
  def apply(fd: Double, buffer: Buffer, offset: Double, length: Double): js.Promise[WriteResult] = js.native
  def apply(
    fd: Double,
    buffer: Buffer,
    offset: Double,
    length: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Buffer, Unit]
  ): Unit = js.native
  def apply(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): js.Promise[WriteResult] = js.native
  def apply(
    fd: Double,
    buffer: Buffer,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Buffer, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Buffer,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Buffer, Unit]
  ): Unit = js.native
  def apply(fd: Double, data: js.Any): js.Promise[WriteResult] = js.native
  def apply(
    fd: Double,
    data: js.Any,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* str */ String, Unit]
  ): Unit = js.native
  def apply(fd: Double, data: js.Any, offset: js.UndefOr[scala.Nothing], encoding: String): js.Promise[WriteResult] = js.native
  def apply(fd: Double, data: js.Any, offset: Double): js.Promise[WriteResult] = js.native
  def apply(
    fd: Double,
    data: js.Any,
    offset: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* str */ String, Unit]
  ): Unit = js.native
  def apply(fd: Double, data: js.Any, offset: Double, encoding: String): js.Promise[WriteResult] = js.native
  def apply(
    fd: Double,
    data: js.Any,
    offset: Double,
    encoding: String,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* str */ String, Unit]
  ): Unit = js.native
}

