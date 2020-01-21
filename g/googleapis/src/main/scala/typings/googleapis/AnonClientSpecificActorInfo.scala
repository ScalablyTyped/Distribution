package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonClientSpecificActorInfo extends js.Object {
  var clientSpecificActorInfo: js.UndefOr[AnonYoutubeActorInfo] = js.native
  var displayName: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var image: js.UndefOr[AnonUrl] = js.native
  var name: js.UndefOr[AnonFamilyName] = js.native
  var url: js.UndefOr[String] = js.native
  var verification: js.UndefOr[AnonAdHocVerified] = js.native
}

object AnonClientSpecificActorInfo {
  @scala.inline
  def apply(
    clientSpecificActorInfo: AnonYoutubeActorInfo = null,
    displayName: String = null,
    id: String = null,
    image: AnonUrl = null,
    name: AnonFamilyName = null,
    url: String = null,
    verification: AnonAdHocVerified = null
  ): AnonClientSpecificActorInfo = {
    val __obj = js.Dynamic.literal()
    if (clientSpecificActorInfo != null) __obj.updateDynamic("clientSpecificActorInfo")(clientSpecificActorInfo.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (verification != null) __obj.updateDynamic("verification")(verification.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClientSpecificActorInfo]
  }
}

