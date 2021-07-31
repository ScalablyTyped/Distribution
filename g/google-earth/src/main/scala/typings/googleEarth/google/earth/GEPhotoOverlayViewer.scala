package typings.googleEarth.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GEPhotoOverlayViewer extends StObject {
  
  /**
    * Enters the given photo overlay object, exiting any other currently active photo overlay. 
    * If the argument is null, then any currently active photo overlay is exited and normal global navigation is enabled.
    */
  def setPhotoOverlay(photoOverlay: KmlPhotoOverlay): Unit
}
object GEPhotoOverlayViewer {
  
  @scala.inline
  def apply(setPhotoOverlay: KmlPhotoOverlay => Unit): GEPhotoOverlayViewer = {
    val __obj = js.Dynamic.literal(setPhotoOverlay = js.Any.fromFunction1(setPhotoOverlay))
    __obj.asInstanceOf[GEPhotoOverlayViewer]
  }
  
  @scala.inline
  implicit class GEPhotoOverlayViewerMutableBuilder[Self <: GEPhotoOverlayViewer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetPhotoOverlay(value: KmlPhotoOverlay => Unit): Self = StObject.set(x, "setPhotoOverlay", js.Any.fromFunction1(value))
  }
}
