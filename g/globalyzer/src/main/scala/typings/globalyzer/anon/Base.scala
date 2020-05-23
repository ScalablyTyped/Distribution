package typings.globalyzer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Base extends js.Object {
  var base: String
  var glob: String
  var isGlob: Boolean
}

object Base {
  @scala.inline
  def apply(base: String, glob: String, isGlob: Boolean): Base = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], glob = glob.asInstanceOf[js.Any], isGlob = isGlob.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base]
  }
}

