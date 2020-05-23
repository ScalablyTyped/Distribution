package typings.googleEarth.global.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.GESun")
@js.native
class GESun ()
  extends typings.googleEarth.google.earth.GESun {
  /**
    *  Specifies whether the feature is drawn in the 3D viewer when it is initially loaded.
    *  In order for a feature to be visible, the visibility property and all of its ancestors must also be set to 1.
    */
  /* CompleteClass */
  override def getVisibility(): Boolean = js.native
  /**
    *  Specifies whether the feature is drawn in the 3D viewer when it is initially loaded.
    *  In order for a feature to be visible, the visibility property and all of its ancestors must also be set to 1.
    */
  /* CompleteClass */
  override def setVisibility(visibility: Boolean): Unit = js.native
}

