package typings.flaggedRespawn

import typings.node.processMod.global.NodeJS.Process
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("flagged-respawn", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(flags: js.Array[String], argv: js.Array[String], callback: Callback): Unit = js.native
  def apply(flags: js.Array[String], argv: js.Array[String], forcedFlags: String, callback: Callback): Unit = js.native
  def apply(flags: js.Array[String], argv: js.Array[String], forcedFlags: js.Array[String], callback: Callback): Unit = js.native
  
  type Callback = js.Function3[/* ready */ Boolean, /* proc */ Process, /* argv */ js.Array[String], Unit]
}
