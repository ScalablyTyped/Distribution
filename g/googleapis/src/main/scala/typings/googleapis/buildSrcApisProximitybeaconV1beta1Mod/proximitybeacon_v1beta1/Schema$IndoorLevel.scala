package typings.googleapis.buildSrcApisProximitybeaconV1beta1Mod.proximitybeacon_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Indoor level, a human-readable string as returned by Google Maps APIs,
  * useful to indicate which floor of a building a beacon is located on.
  */
@js.native
trait Schema$IndoorLevel extends js.Object {
  /**
    * The name of this level.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$IndoorLevel {
  @scala.inline
  def apply(name: String = null): Schema$IndoorLevel = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$IndoorLevel]
  }
}

