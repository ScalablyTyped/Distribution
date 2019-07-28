package typings.googleDashEarth.googleNs.earthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.GESun")
@js.native
class GESun () extends js.Object {
  /**
    *  Specifies whether the feature is drawn in the 3D viewer when it is initially loaded.
    *  In order for a feature to be visible, the visibility property and all of its ancestors must also be set to 1.
    */
  def getVisibility(): Boolean = js.native
  /**
    *  Specifies whether the feature is drawn in the 3D viewer when it is initially loaded.
    *  In order for a feature to be visible, the visibility property and all of its ancestors must also be set to 1.
    */
  def setVisibility(visibility: Boolean): Unit = js.native
}

