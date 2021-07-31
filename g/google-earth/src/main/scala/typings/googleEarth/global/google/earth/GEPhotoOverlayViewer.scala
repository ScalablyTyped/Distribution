package typings.googleEarth.global.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.earth.GEPhotoOverlayViewer")
@js.native
class GEPhotoOverlayViewer ()
  extends StObject
     with typings.googleEarth.google.earth.GEPhotoOverlayViewer {
  
  /**
    * Enters the given photo overlay object, exiting any other currently active photo overlay. 
    * If the argument is null, then any currently active photo overlay is exited and normal global navigation is enabled.
    */
  /* CompleteClass */
  override def setPhotoOverlay(photoOverlay: typings.googleEarth.google.earth.KmlPhotoOverlay): Unit = js.native
}
