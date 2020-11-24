package typings.easyXHeaders.fsMod

import typings.easyXHeaders.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs", "open")
@js.native
object open extends js.Object {
  
  def apply(path: String, flags: String): Unit = js.native
  def apply(path: String, flags: String, callback: js.Function2[/* err */ ErrnoException, /* fd */ Double, _]): Unit = js.native
  def apply(path: String, flags: String, mode: String): Unit = js.native
  def apply(
    path: String,
    flags: String,
    mode: String,
    callback: js.Function2[/* err */ ErrnoException, /* fd */ Double, _]
  ): Unit = js.native
  def apply(path: String, flags: String, mode: Double): Unit = js.native
  def apply(
    path: String,
    flags: String,
    mode: Double,
    callback: js.Function2[/* err */ ErrnoException, /* fd */ Double, _]
  ): Unit = js.native
}
