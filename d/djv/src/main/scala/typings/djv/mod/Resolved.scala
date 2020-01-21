package typings.djv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resolved extends js.Object {
  var schema: js.Object
  def fn(args: js.Any*): js.Any
}

object Resolved {
  @scala.inline
  def apply(fn: /* repeated */ js.Any => js.Any, schema: js.Object): Resolved = {
    val __obj = js.Dynamic.literal(fn = js.Any.fromFunction1(fn), schema = schema.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Resolved]
  }
}

