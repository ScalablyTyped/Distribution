package typings.expressDashValidator

import typings.expressDashValidator.srcBaseMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Req extends js.Object {
  var req: Request
}

object Anon_Req {
  @scala.inline
  def apply(req: Request): Anon_Req = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Req]
  }
}

