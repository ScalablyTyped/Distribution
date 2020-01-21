package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTesters extends js.Object {
  var googleGroups: js.UndefOr[js.Array[String]] = js.native
  var googlePlusCommunities: js.UndefOr[js.Array[String]] = js.native
}

object SchemaTesters {
  @scala.inline
  def apply(googleGroups: js.Array[String] = null, googlePlusCommunities: js.Array[String] = null): SchemaTesters = {
    val __obj = js.Dynamic.literal()
    if (googleGroups != null) __obj.updateDynamic("googleGroups")(googleGroups.asInstanceOf[js.Any])
    if (googlePlusCommunities != null) __obj.updateDynamic("googlePlusCommunities")(googlePlusCommunities.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTesters]
  }
}

