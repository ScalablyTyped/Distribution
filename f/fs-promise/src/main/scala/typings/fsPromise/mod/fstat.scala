package typings.fsPromise.mod

import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-promise", "fstat")
@js.native
object fstat extends js.Object {
  def apply(fd: Double): js.Promise[typings.node.fsMod.Stats] = js.native
  def apply(
    fd: Double,
    callback: js.Function2[(/* err */ ErrnoException) | Null, /* stats */ typings.node.fsMod.Stats, _ | Unit]
  ): Unit = js.native
}

