package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GEPhotoOverlayViewer extends js.Object {
  /**
    * Enters the given photo overlay object, exiting any other currently active photo overlay. 
    * If the argument is null, then any currently active photo overlay is exited and normal global navigation is enabled.
    */
  def setPhotoOverlay(photoOverlay: KmlPhotoOverlay): Unit = js.native
}

object GEPhotoOverlayViewer {
  @scala.inline
  def apply(setPhotoOverlay: KmlPhotoOverlay => Unit): GEPhotoOverlayViewer = {
    val __obj = js.Dynamic.literal(setPhotoOverlay = js.Any.fromFunction1(setPhotoOverlay))
    __obj.asInstanceOf[GEPhotoOverlayViewer]
  }
  @scala.inline
  implicit class GEPhotoOverlayViewerOps[Self <: GEPhotoOverlayViewer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSetPhotoOverlay(value: KmlPhotoOverlay => Unit): Self = this.set("setPhotoOverlay", js.Any.fromFunction1(value))
  }
  
}

