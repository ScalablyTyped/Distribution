package typings.fsPromise.mod

import typings.fsExtra.mod.Mode
import typings.node.NodeJS.ErrnoException
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-promise", "open")
@js.native
object open extends js.Object {
  
  def apply(path: PathLike, flags: String): js.Promise[Double] = js.native
  def apply(
    path: PathLike,
    flags: String,
    callback: js.Function2[(/* err */ ErrnoException) | Null, /* fd */ Double, Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    flags: String,
    mode: js.UndefOr[Mode],
    callback: js.Function2[(/* err */ ErrnoException) | Null, /* fd */ Double, Unit]
  ): Unit = js.native
  def apply(path: PathLike, flags: String, mode: String): js.Promise[Double] = js.native
  def apply(
    path: PathLike,
    flags: String,
    mode: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
  ): Unit = js.native
  def apply(path: PathLike, flags: String, mode: Double): js.Promise[Double] = js.native
  def apply(
    path: PathLike,
    flags: String,
    mode: Double,
    callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    flags: String,
    mode: Null,
    callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
  ): Unit = js.native
  def apply(path: PathLike, flags: String, mode: Mode): js.Promise[Double] = js.native
  def apply(path: PathLike, flags: Double): js.Promise[Double] = js.native
  def apply(
    path: PathLike,
    flags: Double,
    callback: js.Function2[(/* err */ ErrnoException) | Null, /* fd */ Double, Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    flags: Double,
    mode: js.UndefOr[Mode],
    callback: js.Function2[(/* err */ ErrnoException) | Null, /* fd */ Double, Unit]
  ): Unit = js.native
  def apply(path: PathLike, flags: Double, mode: String): js.Promise[Double] = js.native
  def apply(
    path: PathLike,
    flags: Double,
    mode: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
  ): Unit = js.native
  def apply(path: PathLike, flags: Double, mode: Double): js.Promise[Double] = js.native
  def apply(
    path: PathLike,
    flags: Double,
    mode: Double,
    callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    flags: Double,
    mode: Null,
    callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
  ): Unit = js.native
  def apply(path: PathLike, flags: Double, mode: Mode): js.Promise[Double] = js.native
}
