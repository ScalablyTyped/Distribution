package typings.gapiDotClientDotAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Testers extends js.Object {
  var googleGroups: js.UndefOr[js.Array[String]] = js.undefined
  var googlePlusCommunities: js.UndefOr[js.Array[String]] = js.undefined
}

object Testers {
  @scala.inline
  def apply(googleGroups: js.Array[String] = null, googlePlusCommunities: js.Array[String] = null): Testers = {
    val __obj = js.Dynamic.literal()
    if (googleGroups != null) __obj.updateDynamic("googleGroups")(googleGroups.asInstanceOf[js.Any])
    if (googlePlusCommunities != null) __obj.updateDynamic("googlePlusCommunities")(googlePlusCommunities.asInstanceOf[js.Any])
    __obj.asInstanceOf[Testers]
  }
}

