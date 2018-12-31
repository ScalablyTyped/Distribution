package typings
package gapiDotClientDotAndroidmanagementLib.gapiNs.clientNs.androidmanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnrollmentTokensResource extends js.Object {
  /** Creates an enrollment token for a given enterprise. */
  def create(request: gapiDotClientDotAndroidmanagementLib.Anon_Parent): gapiDotClientLib.gapiNs.clientNs.Request[EnrollmentToken]
  /** Deletes an enrollment token, which prevents future use of the token. */
  def delete(request: gapiDotClientDotAndroidmanagementLib.Anon_Name): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
}

