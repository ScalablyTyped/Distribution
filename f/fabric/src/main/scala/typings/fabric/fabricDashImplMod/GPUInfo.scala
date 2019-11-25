package typings.fabric.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GPUInfo extends js.Object {
  var renderer: String
  var vendor: String
}

object GPUInfo {
  @scala.inline
  def apply(renderer: String, vendor: String): GPUInfo = {
    val __obj = js.Dynamic.literal(renderer = renderer.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GPUInfo]
  }
}

