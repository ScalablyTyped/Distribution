package typings.googleapis.buildSrcApisSourcerepoV1Mod.sourcerepo_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration to automatically mirror a repository from another hosting
  * service, for example GitHub or Bitbucket.
  */
@js.native
trait Schema$MirrorConfig extends js.Object {
  /**
    * ID of the SSH deploy key at the other hosting service. Removing this key
    * from the other service would deauthorize Google Cloud Source Repositories
    * from mirroring.
    */
  var deployKeyId: js.UndefOr[String] = js.native
  /**
    * URL of the main repository at the other hosting service.
    */
  var url: js.UndefOr[String] = js.native
  /**
    * ID of the webhook listening to updates to trigger mirroring. Removing
    * this webhook from the other hosting service will stop Google Cloud Source
    * Repositories from receiving notifications, and thereby disabling
    * mirroring.
    */
  var webhookId: js.UndefOr[String] = js.native
}

object Schema$MirrorConfig {
  @scala.inline
  def apply(deployKeyId: String = null, url: String = null, webhookId: String = null): Schema$MirrorConfig = {
    val __obj = js.Dynamic.literal()
    if (deployKeyId != null) __obj.updateDynamic("deployKeyId")(deployKeyId.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (webhookId != null) __obj.updateDynamic("webhookId")(webhookId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MirrorConfig]
  }
}

