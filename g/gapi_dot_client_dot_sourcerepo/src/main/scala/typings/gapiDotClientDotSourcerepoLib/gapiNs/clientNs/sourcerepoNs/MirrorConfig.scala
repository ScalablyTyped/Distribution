package typings
package gapiDotClientDotSourcerepoLib.gapiNs.clientNs.sourcerepoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MirrorConfig extends js.Object {
  /**
               * ID of the SSH deploy key at the other hosting service.
               * Removing this key from the other service would deauthorize
               * Google Cloud Source Repositories from mirroring.
               */
  var deployKeyId: js.UndefOr[java.lang.String] = js.undefined
  /** URL of the main repository at the other hosting service. */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /**
               * ID of the webhook listening to updates to trigger mirroring.
               * Removing this webook from the other hosting service will stop
               * Google Cloud Source Repositories from receiving notifications,
               * and thereby disabling mirroring.
               */
  var webhookId: js.UndefOr[java.lang.String] = js.undefined
}

