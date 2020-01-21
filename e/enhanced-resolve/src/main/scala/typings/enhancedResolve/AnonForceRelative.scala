package typings.enhancedResolve

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonForceRelative extends js.Object {
  var forceRelative: Boolean
  var name: String
}

object AnonForceRelative {
  @scala.inline
  def apply(forceRelative: Boolean, name: String): AnonForceRelative = {
    val __obj = js.Dynamic.literal(forceRelative = forceRelative.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonForceRelative]
  }
}

