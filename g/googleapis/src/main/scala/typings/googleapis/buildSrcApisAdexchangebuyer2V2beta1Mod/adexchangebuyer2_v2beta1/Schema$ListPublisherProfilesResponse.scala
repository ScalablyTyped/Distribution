package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for profiles visible to the buyer.
  */
@js.native
trait Schema$ListPublisherProfilesResponse extends js.Object {
  /**
    * List pagination support
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of matching publisher profiles.
    */
  var publisherProfiles: js.UndefOr[js.Array[Schema$PublisherProfile]] = js.native
}

object Schema$ListPublisherProfilesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, publisherProfiles: js.Array[Schema$PublisherProfile] = null): Schema$ListPublisherProfilesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (publisherProfiles != null) __obj.updateDynamic("publisherProfiles")(publisherProfiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListPublisherProfilesResponse]
  }
}

