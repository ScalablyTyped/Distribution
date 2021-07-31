package typings.framebus

import typings.framebus.typesMod.global.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hasOpenerMod {
  
  @JSImport("framebus/dist/lib/has-opener", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def hasOpener(frame: Window): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasOpener")(frame.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
