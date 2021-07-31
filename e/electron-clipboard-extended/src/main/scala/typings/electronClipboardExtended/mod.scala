package typings.electronClipboardExtended

import org.scalablytyped.runtime.Shortcut
import typings.electron.Electron.Clipboard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("electron-clipboard-extended", JSImport.Namespace)
  @js.native
  val ^ : ClipboardExtended = js.native
  
  @js.native
  trait ClipboardExtended
    extends StObject
       with Clipboard {
    
    def off(event: String): Unit = js.native
    def off(event: String, listener: js.Function0[Unit]): Unit = js.native
    
    def startWatching(): Unit = js.native
    
    def stopWatching(): Unit = js.native
  }
  
  type _To = ClipboardExtended
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ClipboardExtended = ^
}
