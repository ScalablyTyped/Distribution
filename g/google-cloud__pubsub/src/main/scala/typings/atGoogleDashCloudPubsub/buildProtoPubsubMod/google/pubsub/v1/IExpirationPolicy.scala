package typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1

import typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.protobuf.IDuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an ExpirationPolicy. */
trait IExpirationPolicy extends js.Object {
  /** ExpirationPolicy ttl */
  var ttl: js.UndefOr[IDuration | Null] = js.undefined
}

object IExpirationPolicy {
  @scala.inline
  def apply(ttl: IDuration = null): IExpirationPolicy = {
    val __obj = js.Dynamic.literal()
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExpirationPolicy]
  }
}

