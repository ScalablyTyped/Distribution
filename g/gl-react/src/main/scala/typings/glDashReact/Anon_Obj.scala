package typings.glDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Obj extends js.Object {
  var obj: js.Any
  var `type`: String
}

object Anon_Obj {
  @scala.inline
  def apply(obj: js.Any, `type`: String): Anon_Obj = {
    val __obj = js.Dynamic.literal(obj = obj.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Obj]
  }
}

