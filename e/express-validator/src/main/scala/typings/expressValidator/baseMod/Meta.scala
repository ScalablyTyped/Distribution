package typings.expressValidator.baseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Meta extends js.Object {
  var location: Location
  var path: String
  var req: Request
}

object Meta {
  @scala.inline
  def apply(location: Location, path: String, req: Request): Meta = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Meta]
  }
}

