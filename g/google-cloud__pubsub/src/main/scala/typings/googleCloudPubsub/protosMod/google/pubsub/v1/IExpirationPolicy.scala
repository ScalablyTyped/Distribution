package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import typings.googleCloudPubsub.protosMod.google.protobuf.IDuration
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
  def apply(ttl: js.UndefOr[Null | IDuration] = js.undefined): IExpirationPolicy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ttl)) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExpirationPolicy]
  }
}

