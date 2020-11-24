package typings.easyXHeaders.fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs", "unwatchFile")
@js.native
object unwatchFile extends js.Object {
  
  def apply(filename: String): Unit = js.native
  def apply(filename: String, listener: js.Function2[/* curr */ Stats, /* prev */ Stats, Unit]): Unit = js.native
}
