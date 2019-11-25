package typings.gapiDotClientDotAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugInstanceRequest extends js.Object {
  /**
    * Public SSH key to add to the instance. Examples:
    * [USERNAME]:ssh-rsa [KEY_VALUE] [USERNAME]
    * [USERNAME]:ssh-rsa [KEY_VALUE] google-ssh {"userName":"[USERNAME]","expireOn":"[EXPIRE_TIME]"}For more information, see Adding and Removing SSH Keys
    * (https://cloud.google.com/compute/docs/instances/adding-removing-ssh-keys).
    */
  var sshKey: js.UndefOr[String] = js.undefined
}

object DebugInstanceRequest {
  @scala.inline
  def apply(sshKey: String = null): DebugInstanceRequest = {
    val __obj = js.Dynamic.literal()
    if (sshKey != null) __obj.updateDynamic("sshKey")(sshKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugInstanceRequest]
  }
}

