package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GPUInfo extends js.Object {
  var renderer: java.lang.String
  var vendor: java.lang.String
}

object GPUInfo {
  @scala.inline
  def apply(renderer: java.lang.String, vendor: java.lang.String): GPUInfo = {
    val __obj = js.Dynamic.literal(renderer = renderer, vendor = vendor)
  
    __obj.asInstanceOf[GPUInfo]
  }
}

