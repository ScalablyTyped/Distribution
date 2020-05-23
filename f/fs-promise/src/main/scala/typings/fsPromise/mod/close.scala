package typings.fsPromise.mod

import typings.node.NodeJS.ErrnoException
import typings.node.fsMod.NoParamCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-promise", "close")
@js.native
object close extends js.Object {
  def apply(fd: Double): js.Promise[Unit] = js.native
  def apply(fd: Double, callback: (js.Function1[/* err */ ErrnoException, Unit]) | NoParamCallback): Unit = js.native
}

