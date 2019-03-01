package typings
package fluentDashFfmpegLib.fluentDashFfmpegMod.FfmpegNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Format extends js.Object {
  var canDemux: scala.Boolean
  var canMux: scala.Boolean
  var description: java.lang.String
}

object Format {
  @scala.inline
  def apply(canDemux: scala.Boolean, canMux: scala.Boolean, description: java.lang.String): Format = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canDemux")(canDemux)
    __obj.updateDynamic("canMux")(canMux)
    __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[Format]
  }
}

