package typings
package gapiDotClientDotPlusdomainsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientSpecificActorInfoDisplayName extends js.Object {
  /** Actor info specific to particular clients. */
  var clientSpecificActorInfo: js.UndefOr[Anon_YoutubeActorInfo] = js.undefined
  /** The name of this actor, suitable for display. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the actor. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The image representation of this actor. */
  var image: js.UndefOr[Anon_Url] = js.undefined
  /** A link to the Person resource for this actor. */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /** Verification status of actor. */
  var verification: js.UndefOr[Anon_AdHocVerified] = js.undefined
}

object Anon_ClientSpecificActorInfoDisplayName {
  @scala.inline
  def apply(
    clientSpecificActorInfo: Anon_YoutubeActorInfo = null,
    displayName: java.lang.String = null,
    id: java.lang.String = null,
    image: Anon_Url = null,
    url: java.lang.String = null,
    verification: Anon_AdHocVerified = null
  ): Anon_ClientSpecificActorInfoDisplayName = {
    val __obj = js.Dynamic.literal()
    if (clientSpecificActorInfo != null) __obj.updateDynamic("clientSpecificActorInfo")(clientSpecificActorInfo)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (image != null) __obj.updateDynamic("image")(image)
    if (url != null) __obj.updateDynamic("url")(url)
    if (verification != null) __obj.updateDynamic("verification")(verification)
    __obj.asInstanceOf[Anon_ClientSpecificActorInfoDisplayName]
  }
}

