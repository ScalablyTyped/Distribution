package typings.globalyzer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBase extends js.Object {
  var base: String
  var glob: String
  var isGlob: Boolean
}

object AnonBase {
  @scala.inline
  def apply(base: String, glob: String, isGlob: Boolean): AnonBase = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], glob = glob.asInstanceOf[js.Any], isGlob = isGlob.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBase]
  }
}

