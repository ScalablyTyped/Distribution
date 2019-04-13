package typings
package expressDashValidatorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LocationPath extends js.Object {
  var location: expressDashValidatorLib.checkLocationMod.Location
  var path: java.lang.String
  var req: expressLib.expressMod.Request
}

object Anon_LocationPath {
  @scala.inline
  def apply(
    location: expressDashValidatorLib.checkLocationMod.Location,
    path: java.lang.String,
    req: expressLib.expressMod.Request
  ): Anon_LocationPath = {
    val __obj = js.Dynamic.literal(location = location, path = path, req = req)
  
    __obj.asInstanceOf[Anon_LocationPath]
  }
}

