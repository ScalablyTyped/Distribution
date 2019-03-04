package typings
package expressDashValidatorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Location extends js.Object {
  var location: java.lang.String
  var path: java.lang.String
  var req: expressLib.expressMod.eNs.Request
}

object Anon_Location {
  @scala.inline
  def apply(location: java.lang.String, path: java.lang.String, req: expressLib.expressMod.eNs.Request): Anon_Location = {
    val __obj = js.Dynamic.literal(location = location, path = path, req = req)
  
    __obj.asInstanceOf[Anon_Location]
  }
}

