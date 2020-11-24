package typings.fsExt.mod

import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-ext", "statVFS")
@js.native
object statVFS extends js.Object {
  
  def apply(): StatFVS = js.native
  def apply(callback: js.Function2[/* err */ ErrnoException | Null, /* stat */ StatFVS, Unit]): Unit = js.native
  def apply(path: String): StatFVS = js.native
  def apply(path: String, callback: js.Function2[/* err */ ErrnoException | Null, /* stat */ StatFVS, Unit]): Unit = js.native
}
