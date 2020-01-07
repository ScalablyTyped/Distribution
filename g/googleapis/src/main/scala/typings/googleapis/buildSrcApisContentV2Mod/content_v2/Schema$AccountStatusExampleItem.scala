package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$AccountStatusExampleItem extends js.Object {
  var itemId: js.UndefOr[String] = js.native
  var link: js.UndefOr[String] = js.native
  var submittedValue: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var valueOnLandingPage: js.UndefOr[String] = js.native
}

object Schema$AccountStatusExampleItem {
  @scala.inline
  def apply(
    itemId: String = null,
    link: String = null,
    submittedValue: String = null,
    title: String = null,
    valueOnLandingPage: String = null
  ): Schema$AccountStatusExampleItem = {
    val __obj = js.Dynamic.literal()
    if (itemId != null) __obj.updateDynamic("itemId")(itemId.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (submittedValue != null) __obj.updateDynamic("submittedValue")(submittedValue.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (valueOnLandingPage != null) __obj.updateDynamic("valueOnLandingPage")(valueOnLandingPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AccountStatusExampleItem]
  }
}

