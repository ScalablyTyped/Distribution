package typings.enhancedResolve.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForceRelative extends js.Object {
  var forceRelative: Boolean
  var name: String
}

object ForceRelative {
  @scala.inline
  def apply(forceRelative: Boolean, name: String): ForceRelative = {
    val __obj = js.Dynamic.literal(forceRelative = forceRelative.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceRelative]
  }
}

