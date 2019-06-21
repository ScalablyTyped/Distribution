package typings
package atFirebaseUtilLib.distSrcJwtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/util/dist/src/jwt", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def decode(token: java.lang.String): DecodedToken = js.native
  def isAdmin(token: java.lang.String): scala.Boolean = js.native
  def isValidFormat(token: java.lang.String): scala.Boolean = js.native
  def isValidTimestamp(token: java.lang.String): scala.Boolean = js.native
  def issuedAtTime(token: java.lang.String): scala.Double | scala.Null = js.native
}

