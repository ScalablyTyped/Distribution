package typings.atFirebaseUtil.distSrcJwtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/util/dist/src/jwt", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def decode(token: String): DecodedToken = js.native
  def isAdmin(token: String): Boolean = js.native
  def isValidFormat(token: String): Boolean = js.native
  def isValidTimestamp(token: String): Boolean = js.native
  def issuedAtTime(token: String): Double | Null = js.native
}

