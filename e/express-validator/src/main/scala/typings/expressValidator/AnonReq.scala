package typings.expressValidator

import typings.expressValidator.baseMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReq extends js.Object {
  var req: Request
}

object AnonReq {
  @scala.inline
  def apply(req: Request): AnonReq = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonReq]
  }
}

