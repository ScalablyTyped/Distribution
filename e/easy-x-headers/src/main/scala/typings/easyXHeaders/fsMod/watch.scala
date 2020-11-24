package typings.easyXHeaders.fsMod

import typings.easyXHeaders.anon.Persistent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs", "watch")
@js.native
object watch extends js.Object {
  
  def apply(filename: String): FSWatcher = js.native
  def apply(filename: String, listener: js.Function2[/* event */ String, /* filename */ String, _]): FSWatcher = js.native
  def apply(filename: String, options: Persistent): FSWatcher = js.native
  def apply(
    filename: String,
    options: Persistent,
    listener: js.Function2[/* event */ String, /* filename */ String, _]
  ): FSWatcher = js.native
}
