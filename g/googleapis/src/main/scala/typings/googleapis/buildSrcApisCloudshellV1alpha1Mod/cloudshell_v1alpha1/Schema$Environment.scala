package typings.googleapis.buildSrcApisCloudshellV1alpha1Mod.cloudshell_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Cloud Shell environment, which is defined as the combination of a Docker
  * image specifying what is installed on the environment and a home directory
  * containing the user&#39;s data that will remain across sessions. Each user
  * has a single environment with the ID &quot;default&quot;.
  */
@js.native
trait Schema$Environment extends js.Object {
  /**
    * Required. Full path to the Docker image used to run this environment,
    * e.g. &quot;gcr.io/dev-con/cloud-devshell:latest&quot;.
    */
  var dockerImage: js.UndefOr[String] = js.native
  /**
    * Output only. The environment&#39;s identifier, which is always
    * &quot;default&quot;.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Output only. Full name of this resource, in the format
    * `users/{owner_email}/environments/{environment_id}`. `{owner_email}` is
    * the email address of the user to whom this environment belongs, and
    * `{environment_id}` is the identifier of this environment. For example,
    * `users/someone@example.com/environments/default`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Output only. Public keys associated with the environment. Clients can
    * connect to this environment via SSH only if they possess a private key
    * corresponding to at least one of these public keys. Keys can be added to
    * or removed from the environment using the CreatePublicKey and
    * DeletePublicKey methods.
    */
  var publicKeys: js.UndefOr[js.Array[Schema$PublicKey]] = js.native
  /**
    * Output only. Host to which clients can connect to initiate SSH sessions
    * with the environment.
    */
  var sshHost: js.UndefOr[String] = js.native
  /**
    * Output only. Port to which clients can connect to initiate SSH sessions
    * with the environment.
    */
  var sshPort: js.UndefOr[Double] = js.native
  /**
    * Output only. Username that clients should use when initiating SSH
    * sessions with the environment.
    */
  var sshUsername: js.UndefOr[String] = js.native
  /**
    * Output only. Current execution state of this environment.
    */
  var state: js.UndefOr[String] = js.native
}

object Schema$Environment {
  @scala.inline
  def apply(
    dockerImage: String = null,
    id: String = null,
    name: String = null,
    publicKeys: js.Array[Schema$PublicKey] = null,
    sshHost: String = null,
    sshPort: Int | Double = null,
    sshUsername: String = null,
    state: String = null
  ): Schema$Environment = {
    val __obj = js.Dynamic.literal()
    if (dockerImage != null) __obj.updateDynamic("dockerImage")(dockerImage.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (publicKeys != null) __obj.updateDynamic("publicKeys")(publicKeys.asInstanceOf[js.Any])
    if (sshHost != null) __obj.updateDynamic("sshHost")(sshHost.asInstanceOf[js.Any])
    if (sshPort != null) __obj.updateDynamic("sshPort")(sshPort.asInstanceOf[js.Any])
    if (sshUsername != null) __obj.updateDynamic("sshUsername")(sshUsername.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Environment]
  }
}

