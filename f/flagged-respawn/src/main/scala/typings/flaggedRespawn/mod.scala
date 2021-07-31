package typings.flaggedRespawn

import typings.node.processMod.global.NodeJS.Process
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(flags: js.Array[String], argv: js.Array[String], callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(flags.asInstanceOf[js.Any], argv.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(flags: js.Array[String], argv: js.Array[String], forcedFlags: String, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(flags.asInstanceOf[js.Any], argv.asInstanceOf[js.Any], forcedFlags.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(flags: js.Array[String], argv: js.Array[String], forcedFlags: js.Array[String], callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(flags.asInstanceOf[js.Any], argv.asInstanceOf[js.Any], forcedFlags.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("flagged-respawn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Callback = js.Function3[/* ready */ Boolean, /* proc */ Process, /* argv */ js.Array[String], Unit]
}
