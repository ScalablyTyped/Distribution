package typings.gapiDotClientDotSourcerepo.gapiNs.clientNs.sourcerepoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MirrorConfig extends js.Object {
  /**
    * ID of the SSH deploy key at the other hosting service.
    * Removing this key from the other service would deauthorize
    * Google Cloud Source Repositories from mirroring.
    */
  var deployKeyId: js.UndefOr[String] = js.undefined
  /** URL of the main repository at the other hosting service. */
  var url: js.UndefOr[String] = js.undefined
  /**
    * ID of the webhook listening to updates to trigger mirroring.
    * Removing this webook from the other hosting service will stop
    * Google Cloud Source Repositories from receiving notifications,
    * and thereby disabling mirroring.
    */
  var webhookId: js.UndefOr[String] = js.undefined
}

object MirrorConfig {
  @scala.inline
  def apply(deployKeyId: String = null, url: String = null, webhookId: String = null): MirrorConfig = {
    val __obj = js.Dynamic.literal()
    if (deployKeyId != null) __obj.updateDynamic("deployKeyId")(deployKeyId)
    if (url != null) __obj.updateDynamic("url")(url)
    if (webhookId != null) __obj.updateDynamic("webhookId")(webhookId)
    __obj.asInstanceOf[MirrorConfig]
  }
}

