package typings.fsDashExt.fsDashExtMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-ext", "fcntl")
@js.native
object fcntl extends js.Object {
  def apply(
    fd: Double,
    cmd: String,
    arg: Double,
    callback: js.Function2[/* err */ Error, /* result */ Double, Unit]
  ): Unit = js.native
  def apply(fd: Double, cmd: String, callback: js.Function2[/* err */ Error, /* result */ Double, Unit]): Unit = js.native
}

