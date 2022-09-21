package typings.forgeViewer.Autodesk.Viewing

import typings.forgeViewer.Autodesk.Viewing.Private.ViewerStateOptions
import typings.forgeViewer.Autodesk.Viewing.UI.ToolBar
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Extension extends StObject {
  
  def activate(mode: String): Boolean = js.native
  
  var container: HTMLDivElement = js.native
  
  def deactivate(): Boolean = js.native
  
  def extendLocalization(locales: js.Object): Boolean = js.native
  
  def getCache(): js.Object = js.native
  
  def getModes(): js.Array[String] = js.native
  
  def getName(): String = js.native
  
  def getState(viewerState: ViewerStateOptions): Unit = js.native
  
  def isActive(mode: String): Boolean = js.native
  
  def load(): Boolean | js.Promise[Boolean] = js.native
  
  def onToolbarCreated(): Unit = js.native
  def onToolbarCreated(toolbar: ToolBar): Unit = js.native
  
  var options: Any = js.native
  
  def restoreState(viewerState: ViewerStateOptions, immediate: Boolean): Boolean = js.native
  
  def setActive(enable: Boolean, mode: String): Unit = js.native
  
  def unload(): Boolean = js.native
  
  var viewer: GuiViewer3D = js.native
}
