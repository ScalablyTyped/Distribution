package typings.expressDashValidator.srcBaseMod

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
    val __obj = js.Dynamic.literal(location = location, path = path, req = req)
  
    __obj.asInstanceOf[Meta]
  }
}

