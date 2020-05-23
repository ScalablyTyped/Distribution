package typings.glReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Obj extends js.Object {
  var obj: js.Any
  var `type`: String
}

object Obj {
  @scala.inline
  def apply(obj: js.Any, `type`: String): Obj = {
    val __obj = js.Dynamic.literal(obj = obj.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Obj]
  }
}

