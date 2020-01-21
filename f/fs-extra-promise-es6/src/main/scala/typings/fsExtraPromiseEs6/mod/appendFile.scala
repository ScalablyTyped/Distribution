package typings.fsExtraPromiseEs6.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra-promise-es6", "appendFile")
@js.native
object appendFile extends js.Object {
  def apply(filename: String, data: js.Any): Unit = js.native
  def apply(filename: String, data: js.Any, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def apply(filename: String, data: js.Any, option: String): Unit = js.native
  def apply(filename: String, data: js.Any, option: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def apply(filename: String, data: js.Any, option: OpenOptions): Unit = js.native
  def apply(filename: String, data: js.Any, option: OpenOptions, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

