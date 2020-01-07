package typings.googleapis.buildSrcApisAdexchangebuyerV1Dot4Mod.adexchangebuyer_v1_4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$GetPublisherProfilesByAccountIdResponse extends js.Object {
  /**
    * Profiles for the requested publisher
    */
  var profiles: js.UndefOr[js.Array[Schema$PublisherProfileApiProto]] = js.native
}

object Schema$GetPublisherProfilesByAccountIdResponse {
  @scala.inline
  def apply(profiles: js.Array[Schema$PublisherProfileApiProto] = null): Schema$GetPublisherProfilesByAccountIdResponse = {
    val __obj = js.Dynamic.literal()
    if (profiles != null) __obj.updateDynamic("profiles")(profiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GetPublisherProfilesByAccountIdResponse]
  }
}

