package typings.doctrine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMidstream extends js.Object {
  var midstream: Boolean
}

object AnonMidstream {
  @scala.inline
  def apply(midstream: Boolean): AnonMidstream = {
    val __obj = js.Dynamic.literal(midstream = midstream.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMidstream]
  }
}

