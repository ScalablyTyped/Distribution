package typings.figma.mod.global

import typings.figma.figmaStrings.message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIAPI extends StObject {
  
  def close(): Unit = js.native
  
  def hide(): Unit = js.native
  
  @JSName("off")
  def off_message(`type`: message, callback: MessageEventHandler): Unit = js.native
  
  @JSName("on")
  def on_message(`type`: message, callback: MessageEventHandler): Unit = js.native
  
  @JSName("once")
  def once_message(`type`: message, callback: MessageEventHandler): Unit = js.native
  
  var onmessage: js.UndefOr[MessageEventHandler] = js.native
  
  def postMessage(pluginMessage: js.Any): Unit = js.native
  def postMessage(pluginMessage: js.Any, options: UIPostMessageOptions): Unit = js.native
  
  def resize(width: Double, height: Double): Unit = js.native
  
  def show(): Unit = js.native
}
