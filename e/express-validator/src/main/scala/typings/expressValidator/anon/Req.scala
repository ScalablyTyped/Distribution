package typings.expressValidator.anon

import typings.expressValidator.baseMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Req extends js.Object {
  var req: Request
}

object Req {
  @scala.inline
  def apply(req: Request): Req = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any])
    __obj.asInstanceOf[Req]
  }
}

