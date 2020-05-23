package typings.googleCloudPubsub.pubsubMod.google.pubsub.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a MessageStoragePolicy. */
trait IMessageStoragePolicy extends js.Object {
  /** MessageStoragePolicy allowedPersistenceRegions */
  var allowedPersistenceRegions: js.UndefOr[js.Array[String] | Null] = js.undefined
}

object IMessageStoragePolicy {
  @scala.inline
  def apply(allowedPersistenceRegions: js.UndefOr[Null | js.Array[String]] = js.undefined): IMessageStoragePolicy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowedPersistenceRegions)) __obj.updateDynamic("allowedPersistenceRegions")(allowedPersistenceRegions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMessageStoragePolicy]
  }
}

