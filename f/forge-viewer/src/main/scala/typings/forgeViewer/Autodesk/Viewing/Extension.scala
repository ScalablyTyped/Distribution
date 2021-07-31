package typings.forgeViewer.Autodesk.Viewing

import typings.forgeViewer.Autodesk.Viewing.UI.ToolBar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Extension extends StObject {
  
  def load(): Boolean | js.Promise[Boolean] = js.native
  
  def onToolbarCreated(): Unit = js.native
  def onToolbarCreated(toolbar: ToolBar): Unit = js.native
  
  var options: js.Any = js.native
  
  def unload(): Boolean = js.native
  
  var viewer: GuiViewer3D = js.native
}
