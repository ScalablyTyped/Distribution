package typings.glReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ratio extends js.Object {
  var obj: js.Any
  var ratio: Boolean
  var `type`: String
}

object Ratio {
  @scala.inline
  def apply(obj: js.Any, ratio: Boolean, `type`: String): Ratio = {
    val __obj = js.Dynamic.literal(obj = obj.asInstanceOf[js.Any], ratio = ratio.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ratio]
  }
}

