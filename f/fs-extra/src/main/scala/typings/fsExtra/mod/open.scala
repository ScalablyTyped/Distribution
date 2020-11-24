package typings.fsExtra.mod

import typings.node.NodeJS.ErrnoException
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-extra", "open")
@js.native
object open extends js.Object {
  
  def apply(path: PathLike, flags: String): js.Promise[Double] = js.native
  def apply(
    path: PathLike,
    flags: String,
    callback: js.Function2[/* err */ ErrnoException, /* fd */ Double, Unit]
  ): Unit = js.native
  def apply(path: PathLike, flags: String, mode: Mode): js.Promise[Double] = js.native
  def apply(
    path: PathLike,
    flags: String,
    mode: Mode,
    callback: js.Function2[/* err */ ErrnoException, /* fd */ Double, Unit]
  ): Unit = js.native
  def apply(path: PathLike, flags: Double): js.Promise[Double] = js.native
  def apply(
    path: PathLike,
    flags: Double,
    callback: js.Function2[/* err */ ErrnoException, /* fd */ Double, Unit]
  ): Unit = js.native
  def apply(path: PathLike, flags: Double, mode: Mode): js.Promise[Double] = js.native
  def apply(
    path: PathLike,
    flags: Double,
    mode: Mode,
    callback: js.Function2[/* err */ ErrnoException, /* fd */ Double, Unit]
  ): Unit = js.native
}
