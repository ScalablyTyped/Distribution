package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GEPhotoOverlayViewer extends js.Object {
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
}

