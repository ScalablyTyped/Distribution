package typings.googleapis.buildSrcApisAndroidpublisherV3Mod.androidpublisher_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$InAppProductListing extends js.Object {
  var description: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
}

object Schema$InAppProductListing {
  @scala.inline
  def apply(description: String = null, title: String = null): Schema$InAppProductListing = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InAppProductListing]
  }
}

