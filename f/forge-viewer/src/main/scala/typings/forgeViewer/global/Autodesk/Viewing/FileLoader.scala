package typings.forgeViewer.global.Autodesk.Viewing

import typings.forgeViewer.Autodesk.Viewing.FileLoaderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Autodesk.Viewing.FileLoader")
@js.native
open class FileLoader protected ()
  extends StObject
     with typings.forgeViewer.Autodesk.Viewing.FileLoader {
  def this(viewer: typings.forgeViewer.Autodesk.Viewing.Viewer3D) = this()
  
  /* CompleteClass */
  override def is3d(): Boolean = js.native
  
  /* CompleteClass */
  override def loadFile(
    url: String,
    options: FileLoaderOptions,
    onSuccess: js.Function0[Unit],
    onError: js.Function0[Unit]
  ): Unit = js.native
}
