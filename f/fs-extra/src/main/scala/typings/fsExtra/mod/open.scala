package typings.fsExtra.mod

import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra", "open")
@js.native
object open extends js.Object {
  def apply(path: String, flags: String): js.Promise[Double] = js.native
  def apply(
    path: String,
    flags: String,
    callback: js.Function2[/* err */ ErrnoException, /* fd */ Double, Unit]
  ): Unit = js.native
  def apply(path: String, flags: String, mode: Double): js.Promise[Double] = js.native
  def apply(
    path: String,
    flags: String,
    mode: Double,
    callback: js.Function2[/* err */ ErrnoException, /* fd */ Double, Unit]
  ): Unit = js.native
  def apply(path: String, flags: Double): js.Promise[Double] = js.native
  def apply(
    path: String,
    flags: Double,
    callback: js.Function2[/* err */ ErrnoException, /* fd */ Double, Unit]
  ): Unit = js.native
  def apply(path: String, flags: Double, mode: Double): js.Promise[Double] = js.native
  def apply(
    path: String,
    flags: Double,
    mode: Double,
    callback: js.Function2[/* err */ ErrnoException, /* fd */ Double, Unit]
  ): Unit = js.native
  def apply(path: Buffer, flags: String): js.Promise[Double] = js.native
  def apply(
    path: Buffer,
    flags: String,
    callback: js.Function2[/* err */ ErrnoException, /* fd */ Double, Unit]
  ): Unit = js.native
  def apply(path: Buffer, flags: String, mode: Double): js.Promise[Double] = js.native
  def apply(
    path: Buffer,
    flags: String,
    mode: Double,
    callback: js.Function2[/* err */ ErrnoException, /* fd */ Double, Unit]
  ): Unit = js.native
  def apply(path: Buffer, flags: Double): js.Promise[Double] = js.native
  def apply(
    path: Buffer,
    flags: Double,
    callback: js.Function2[/* err */ ErrnoException, /* fd */ Double, Unit]
  ): Unit = js.native
  def apply(path: Buffer, flags: Double, mode: Double): js.Promise[Double] = js.native
  def apply(
    path: Buffer,
    flags: Double,
    mode: Double,
    callback: js.Function2[/* err */ ErrnoException, /* fd */ Double, Unit]
  ): Unit = js.native
}

