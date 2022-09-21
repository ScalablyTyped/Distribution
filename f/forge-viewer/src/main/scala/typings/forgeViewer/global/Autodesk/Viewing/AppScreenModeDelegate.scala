package typings.forgeViewer.global.Autodesk.Viewing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Autodesk.Viewing.AppScreenModeDelegate")
@js.native
open class AppScreenModeDelegate protected ()
  extends StObject
     with typings.forgeViewer.Autodesk.Viewing.ScreenModeDelegate {
  def this(viewer: typings.forgeViewer.Autodesk.Viewing.Viewer3D) = this()
  
  /* CompleteClass */
  override def doScreenModeChange(
    oldMode: typings.forgeViewer.Autodesk.Viewing.ScreenMode,
    newMode: typings.forgeViewer.Autodesk.Viewing.ScreenMode
  ): Unit = js.native
  
  /* CompleteClass */
  override def fullscreenEventListener(): Unit = js.native
  
  /* CompleteClass */
  override def getEscapeMode(): js.UndefOr[typings.forgeViewer.Autodesk.Viewing.ScreenMode] = js.native
  
  /* CompleteClass */
  override def getMode(): typings.forgeViewer.Autodesk.Viewing.ScreenMode = js.native
  
  /* CompleteClass */
  override def getNextMode(): js.UndefOr[typings.forgeViewer.Autodesk.Viewing.ScreenMode] = js.native
  
  /* CompleteClass */
  override def isModeSupported(mode: typings.forgeViewer.Autodesk.Viewing.ScreenMode): Boolean = js.native
  
  /* CompleteClass */
  override def onScreenModeChanged(
    oldMode: typings.forgeViewer.Autodesk.Viewing.ScreenMode,
    newMode: typings.forgeViewer.Autodesk.Viewing.ScreenMode
  ): Unit = js.native
  
  /* CompleteClass */
  override def setMode(mode: typings.forgeViewer.Autodesk.Viewing.ScreenMode): Boolean = js.native
  
  /* CompleteClass */
  override def uninitialize(): Unit = js.native
}
