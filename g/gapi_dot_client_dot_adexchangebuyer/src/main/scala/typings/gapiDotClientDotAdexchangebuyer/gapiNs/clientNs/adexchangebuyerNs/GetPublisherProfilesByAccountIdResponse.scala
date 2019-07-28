package typings.gapiDotClientDotAdexchangebuyer.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPublisherProfilesByAccountIdResponse extends js.Object {
  /** Profiles for the requested publisher */
  var profiles: js.UndefOr[js.Array[PublisherProfileApiProto]] = js.undefined
}

object GetPublisherProfilesByAccountIdResponse {
  @scala.inline
  def apply(profiles: js.Array[PublisherProfileApiProto] = null): GetPublisherProfilesByAccountIdResponse = {
    val __obj = js.Dynamic.literal()
    if (profiles != null) __obj.updateDynamic("profiles")(profiles)
    __obj.asInstanceOf[GetPublisherProfilesByAccountIdResponse]
  }
}

