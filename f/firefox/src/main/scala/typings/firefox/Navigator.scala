package typings.firefox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Navigator extends js.Object {
  var mozApps: Apps
}

object Navigator {
  @scala.inline
  def apply(mozApps: Apps): Navigator = {
    val __obj = js.Dynamic.literal(mozApps = mozApps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
}

