package typings.easyApiRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCb extends js.Object {
  var cb: js.Any
  var opts: js.Any
}

object AnonCb {
  @scala.inline
  def apply(cb: js.Any, opts: js.Any): AnonCb = {
    val __obj = js.Dynamic.literal(cb = cb.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCb]
  }
}

