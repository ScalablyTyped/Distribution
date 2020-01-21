package typings.easyXapiSupertest.fsMod

import typings.easyXapiSupertest.AnonPersistent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "watch")
@js.native
object watch extends js.Object {
  def apply(filename: String): FSWatcher = js.native
  def apply(filename: String, listener: js.Function2[/* event */ String, /* filename */ String, _]): FSWatcher = js.native
  def apply(filename: String, options: AnonPersistent): FSWatcher = js.native
  def apply(
    filename: String,
    options: AnonPersistent,
    listener: js.Function2[/* event */ String, /* filename */ String, _]
  ): FSWatcher = js.native
}

