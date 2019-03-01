package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationObject extends js.Object {
  var bidModifier: js.UndefOr[scala.Double] = js.undefined
  var id: scala.Double
}

object LocationObject {
  @scala.inline
  def apply(id: scala.Double, bidModifier: scala.Int | scala.Double = null): LocationObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    if (bidModifier != null) __obj.updateDynamic("bidModifier")(bidModifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationObject]
  }
}

