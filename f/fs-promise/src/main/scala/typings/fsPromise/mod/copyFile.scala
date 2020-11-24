package typings.fsPromise.mod

import typings.node.fsMod.NoParamCallback
import typings.node.fsMod.PathLike
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-promise", "copyFile")
@js.native
object copyFile extends js.Object {
  
  def apply(src: String, dest: String): js.Promise[Unit] = js.native
  def apply(src: String, dest: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def apply(src: String, dest: String, flags: Double): js.Promise[Unit] = js.native
  def apply(src: String, dest: String, flags: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def apply(src: PathLike, dest: PathLike): js.Promise[Unit] = js.native
  def apply(src: PathLike, dest: PathLike, callback: NoParamCallback): Unit = js.native
  def apply(src: PathLike, dest: PathLike, flags: Double): js.Promise[Unit] = js.native
  def apply(src: PathLike, dest: PathLike, flags: Double, callback: NoParamCallback): Unit = js.native
}
