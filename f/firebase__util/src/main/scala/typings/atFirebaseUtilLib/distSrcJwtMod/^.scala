package typings
package atFirebaseUtilLib.distSrcJwtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/util/dist/src/jwt", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def decode(token: js.Any): DecodedToken = js.native
  def isAdmin(token: js.Any): scala.Boolean = js.native
  def isValidFormat(token: js.Any): scala.Boolean = js.native
  def isValidTimestamp(token: js.Any): scala.Boolean = js.native
  def issuedAtTime(token: js.Any): scala.Double | scala.Null = js.native
}

