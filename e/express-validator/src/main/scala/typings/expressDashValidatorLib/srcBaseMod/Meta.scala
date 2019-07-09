package typings
package expressDashValidatorLib.srcBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Meta extends js.Object {
  var location: Location
  var path: java.lang.String
  var req: Request
}

object Meta {
  @scala.inline
  def apply(location: Location, path: java.lang.String, req: Request): Meta = {
    val __obj = js.Dynamic.literal(location = location, path = path, req = req)
  
    __obj.asInstanceOf[Meta]
  }
}

