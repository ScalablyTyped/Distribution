package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ClientSpecificActorInfo extends js.Object {
  var clientSpecificActorInfo: js.UndefOr[Anon_YoutubeActorInfo] = js.native
  var displayName: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var image: js.UndefOr[Anon_Url] = js.native
  var name: js.UndefOr[Anon_FamilyName] = js.native
  var url: js.UndefOr[String] = js.native
  var verification: js.UndefOr[Anon_AdHocVerified] = js.native
}

object Anon_ClientSpecificActorInfo {
  @scala.inline
  def apply(
    clientSpecificActorInfo: Anon_YoutubeActorInfo = null,
    displayName: String = null,
    id: String = null,
    image: Anon_Url = null,
    name: Anon_FamilyName = null,
    url: String = null,
    verification: Anon_AdHocVerified = null
  ): Anon_ClientSpecificActorInfo = {
    val __obj = js.Dynamic.literal()
    if (clientSpecificActorInfo != null) __obj.updateDynamic("clientSpecificActorInfo")(clientSpecificActorInfo.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (verification != null) __obj.updateDynamic("verification")(verification.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClientSpecificActorInfo]
  }
}

