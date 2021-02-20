package typings.flaggedRespawn

import typings.node.processMod.global.NodeJS.Process
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("flagged-respawn", JSImport.Namespace)
  @js.native
  def apply(flags: js.Array[String], argv: js.Array[String], callback: Callback): Unit = js.native
  @JSImport("flagged-respawn", JSImport.Namespace)
  @js.native
  def apply(flags: js.Array[String], argv: js.Array[String], forcedFlags: String, callback: Callback): Unit = js.native
  @JSImport("flagged-respawn", JSImport.Namespace)
  @js.native
  def apply(flags: js.Array[String], argv: js.Array[String], forcedFlags: js.Array[String], callback: Callback): Unit = js.native
  
  type Callback = js.Function3[/* ready */ Boolean, /* proc */ Process, /* argv */ js.Array[String], Unit]
}
