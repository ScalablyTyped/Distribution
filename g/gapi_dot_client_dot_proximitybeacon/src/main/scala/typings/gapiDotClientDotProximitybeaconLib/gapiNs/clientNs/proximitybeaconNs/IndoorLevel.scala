package typings
package gapiDotClientDotProximitybeaconLib.gapiNs.clientNs.proximitybeaconNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndoorLevel extends js.Object {
  /** The name of this level. */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object IndoorLevel {
  @scala.inline
  def apply(name: java.lang.String = null): IndoorLevel = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[IndoorLevel]
  }
}

