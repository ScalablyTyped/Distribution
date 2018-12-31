package typings
package expressDashJwtLib.expressDashJwtMod.jwtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnauthorizedError
  extends nodeLib.Error {
  var code: ErrorCode
  var inner: expressDashJwtLib.Anon_Message
  var message: java.lang.String
  var name: expressDashJwtLib.expressDashJwtLibStrings.UnauthorizedError
  var status: scala.Double
}

