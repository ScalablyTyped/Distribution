package typings.fsExtraPromiseEs6.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra-promise-es6", "open")
@js.native
object open extends js.Object {
  def apply(path: String, flags: String): Unit = js.native
  def apply(path: String, flags: String, mode: String): Unit = js.native
  def apply(
    path: String,
    flags: String,
    mode: String,
    callback: js.Function2[/* err */ Error, /* fs */ Double, Unit]
  ): Unit = js.native
}

