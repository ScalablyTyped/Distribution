package typings.easyXapiSupertest.fsMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs", "utimesSync")
@js.native
object utimesSync extends js.Object {
  
  def apply(path: String, atime: Double, mtime: Double): Unit = js.native
  def apply(path: String, atime: Date, mtime: Date): Unit = js.native
}
