package typings.fsExtraPromiseEs6.mod

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra-promise-es6", "readFile")
@js.native
object readFile extends js.Object {
  def apply(filename: String, callback: js.Function2[/* err */ Error, /* data */ Buffer, Unit]): Unit = js.native
  def apply(
    filename: String,
    options: String,
    callback: js.Function2[/* err */ Error, /* data */ String, Unit]
  ): Unit = js.native
  def apply(
    filename: String,
    options: OpenOptions,
    callback: js.Function2[/* err */ Error, /* data */ String, Unit]
  ): Unit = js.native
}

