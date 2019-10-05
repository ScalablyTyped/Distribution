package typings.fsDashExtraDashPromiseDashEs6.fsDashExtraDashPromiseDashEs6Mod

import typings.fsDashExtraDashPromiseDashEs6.Anon_Persistent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra-promise-es6", "watch")
@js.native
object watch extends js.Object {
  def apply(filename: String): FSWatcher = js.native
  def apply(filename: String, options: Anon_Persistent): FSWatcher = js.native
  def apply(
    filename: String,
    options: Anon_Persistent,
    listener: js.Function2[/* event */ String, /* filename */ String, _]
  ): FSWatcher = js.native
}

