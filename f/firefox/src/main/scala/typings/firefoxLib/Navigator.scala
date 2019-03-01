package typings
package firefoxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Navigator extends js.Object {
  var mozApps: Apps
}

object Navigator {
  @scala.inline
  def apply(mozApps: Apps): Navigator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mozApps")(mozApps)
    __obj.asInstanceOf[Navigator]
  }
}

