package typings.gapiDotClientDotPlus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientSpecificActorInfo extends js.Object {
  /** Actor info specific to particular clients. */
  var clientSpecificActorInfo: js.UndefOr[Anon_YoutubeActorInfo] = js.undefined
  /** The name of the actor, suitable for display. */
  var displayName: js.UndefOr[String] = js.undefined
  /** The ID of the actor's Person resource. */
  var id: js.UndefOr[String] = js.undefined
  /** The image representation of the actor. */
  var image: js.UndefOr[Anon_Url] = js.undefined
  /** An object representation of the individual components of name. */
  var name: js.UndefOr[Anon_FamilyName] = js.undefined
  /** The link to the actor's Google profile. */
  var url: js.UndefOr[String] = js.undefined
  /** Verification status of actor. */
  var verification: js.UndefOr[Anon_AdHocVerified] = js.undefined
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
    if (clientSpecificActorInfo != null) __obj.updateDynamic("clientSpecificActorInfo")(clientSpecificActorInfo)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (image != null) __obj.updateDynamic("image")(image)
    if (name != null) __obj.updateDynamic("name")(name)
    if (url != null) __obj.updateDynamic("url")(url)
    if (verification != null) __obj.updateDynamic("verification")(verification)
    __obj.asInstanceOf[Anon_ClientSpecificActorInfo]
  }
}

