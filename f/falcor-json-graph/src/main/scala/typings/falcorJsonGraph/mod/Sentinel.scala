package typings.falcorJsonGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sentinel extends js.Object {
  @JSName("$expires")
  var $expires: js.UndefOr[Double] = js.undefined
}

object Sentinel {
  @scala.inline
  def apply($expires: js.UndefOr[Double] = js.undefined): Sentinel = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($expires)) __obj.updateDynamic("$expires")($expires.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sentinel]
  }
}

