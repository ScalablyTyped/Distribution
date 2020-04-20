package typings.fluentFfmpeg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Format extends js.Object {
  var canDemux: Boolean
  var canMux: Boolean
  var description: String
}

object Format {
  @scala.inline
  def apply(canDemux: Boolean, canMux: Boolean, description: String): Format = {
    val __obj = js.Dynamic.literal(canDemux = canDemux.asInstanceOf[js.Any], canMux = canMux.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
}

