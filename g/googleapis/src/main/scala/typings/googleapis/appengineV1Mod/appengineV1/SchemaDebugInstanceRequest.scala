package typings.googleapis.appengineV1Mod.appengineV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for Instances.DebugInstance.
  */
@js.native
trait SchemaDebugInstanceRequest extends js.Object {
  /**
    * Public SSH key to add to the instance. Examples: [USERNAME]:ssh-rsa
    * [KEY_VALUE] [USERNAME] [USERNAME]:ssh-rsa [KEY_VALUE] google-ssh
    * {&quot;userName&quot;:&quot;[USERNAME]&quot;,&quot;expireOn&quot;:&quot;[EXPIRE_TIME]&quot;}For
    * more information, see Adding and Removing SSH Keys
    * (https://cloud.google.com/compute/docs/instances/adding-removing-ssh-keys).
    */
  var sshKey: js.UndefOr[String] = js.native
}

object SchemaDebugInstanceRequest {
  @scala.inline
  def apply(sshKey: String = null): SchemaDebugInstanceRequest = {
    val __obj = js.Dynamic.literal()
    if (sshKey != null) __obj.updateDynamic("sshKey")(sshKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDebugInstanceRequest]
  }
}

