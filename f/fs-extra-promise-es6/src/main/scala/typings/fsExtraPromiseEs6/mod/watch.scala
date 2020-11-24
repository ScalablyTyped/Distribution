package typings.fsExtraPromiseEs6.mod

import typings.fsExtraPromiseEs6.anon.Persistent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-extra-promise-es6", "watch")
@js.native
object watch extends js.Object {
  
  def apply(filename: String): FSWatcher = js.native
  def apply(
    filename: String,
    options: js.UndefOr[scala.Nothing],
    listener: js.Function2[/* event */ String, /* filename */ String, _]
  ): FSWatcher = js.native
  def apply(filename: String, options: Persistent): FSWatcher = js.native
  def apply(
    filename: String,
    options: Persistent,
    listener: js.Function2[/* event */ String, /* filename */ String, _]
  ): FSWatcher = js.native
}
