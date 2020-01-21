package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountStatusExampleItem extends js.Object {
  var itemId: js.UndefOr[String] = js.undefined
  var link: js.UndefOr[String] = js.undefined
  var submittedValue: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var valueOnLandingPage: js.UndefOr[String] = js.undefined
}

object AccountStatusExampleItem {
  @scala.inline
  def apply(
    itemId: String = null,
    link: String = null,
    submittedValue: String = null,
    title: String = null,
    valueOnLandingPage: String = null
  ): AccountStatusExampleItem = {
    val __obj = js.Dynamic.literal()
    if (itemId != null) __obj.updateDynamic("itemId")(itemId.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (submittedValue != null) __obj.updateDynamic("submittedValue")(submittedValue.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (valueOnLandingPage != null) __obj.updateDynamic("valueOnLandingPage")(valueOnLandingPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountStatusExampleItem]
  }
}

