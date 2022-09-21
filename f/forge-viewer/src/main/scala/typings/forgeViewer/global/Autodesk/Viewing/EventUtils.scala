package typings.forgeViewer.global.Autodesk.Viewing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EventUtils {
  
  @JSGlobal("Autodesk.Viewing.EventUtils")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isMiddleClick(event: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMiddleClick")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRightClick(event: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRightClick")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def setUseLeftHandedInput(value: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUseLeftHandedInput")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def waitUntilGeometryLoaded(viewer: typings.forgeViewer.Autodesk.Viewing.Viewer3D): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilGeometryLoaded")(viewer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def waitUntilGeometryLoaded(
    viewer: typings.forgeViewer.Autodesk.Viewing.Viewer3D,
    model: typings.forgeViewer.Autodesk.Viewing.Model
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilGeometryLoaded")(viewer.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def waitUntilModelAdded(viewer: typings.forgeViewer.Autodesk.Viewing.Viewer3D): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilModelAdded")(viewer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def waitUntilModelAdded(
    viewer: typings.forgeViewer.Autodesk.Viewing.Viewer3D,
    model: typings.forgeViewer.Autodesk.Viewing.Model
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilModelAdded")(viewer.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def waitUntilTransitionEnded(viewer: typings.forgeViewer.Autodesk.Viewing.Viewer3D): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilTransitionEnded")(viewer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
