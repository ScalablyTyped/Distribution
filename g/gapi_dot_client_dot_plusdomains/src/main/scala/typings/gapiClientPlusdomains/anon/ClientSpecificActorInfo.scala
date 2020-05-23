package typings.gapiClientPlusdomains.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientSpecificActorInfo extends js.Object {
  /** Actor info specific to particular clients. */
  var clientSpecificActorInfo: js.UndefOr[YoutubeActorInfo] = js.undefined
  /** The name of the actor, suitable for display. */
  var displayName: js.UndefOr[String] = js.undefined
  /** The ID of the actor's Person resource. */
  var id: js.UndefOr[String] = js.undefined
  /** The image representation of the actor. */
  var image: js.UndefOr[Url] = js.undefined
  /** An object representation of the individual components of name. */
  var name: js.UndefOr[FamilyName] = js.undefined
  /** The link to the actor's Google profile. */
  var url: js.UndefOr[String] = js.undefined
  /** Verification status of actor. */
  var verification: js.UndefOr[AdHocVerified] = js.undefined
}

object ClientSpecificActorInfo {
  @scala.inline
  def apply(
    clientSpecificActorInfo: YoutubeActorInfo = null,
    displayName: String = null,
    id: String = null,
    image: Url = null,
    name: FamilyName = null,
    url: String = null,
    verification: AdHocVerified = null
  ): ClientSpecificActorInfo = {
    val __obj = js.Dynamic.literal()
    if (clientSpecificActorInfo != null) __obj.updateDynamic("clientSpecificActorInfo")(clientSpecificActorInfo.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (verification != null) __obj.updateDynamic("verification")(verification.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientSpecificActorInfo]
  }
}

