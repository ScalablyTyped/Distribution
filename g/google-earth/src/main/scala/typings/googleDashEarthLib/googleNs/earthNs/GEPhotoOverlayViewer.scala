package typings
package googleDashEarthLib.googleNs.earthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.GEPhotoOverlayViewer")
@js.native
class GEPhotoOverlayViewer () extends js.Object {
  /**
    * Enters the given photo overlay object, exiting any other currently active photo overlay. 
    * If the argument is null, then any currently active photo overlay is exited and normal global navigation is enabled.
    */
  def setPhotoOverlay(photoOverlay: KmlPhotoOverlay): scala.Unit = js.native
}

