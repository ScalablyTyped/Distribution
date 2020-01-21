package typings.fsPlus.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-plus", "list")
@js.native
object list extends js.Object {
  def apply(rootPath: String, callback: js.Function2[/* err */ Error, /* result */ js.Array[String], Unit]): Unit = js.native
  def apply(
    rootPath: String,
    extensions: js.Array[String],
    callback: js.Function2[/* err */ Error, /* result */ js.Array[String], Unit]
  ): Unit = js.native
}

