package typings.fsExtraPromiseEs6.mod

import typings.fsExtraPromiseEs6.AnonPersistent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra-promise-es6", "watch")
@js.native
object watch extends js.Object {
  def apply(filename: String): FSWatcher = js.native
  def apply(filename: String, options: AnonPersistent): FSWatcher = js.native
  def apply(
    filename: String,
    options: AnonPersistent,
    listener: js.Function2[/* event */ String, /* filename */ String, _]
  ): FSWatcher = js.native
}

