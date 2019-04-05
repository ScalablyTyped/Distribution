package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountStatusExampleItem extends js.Object {
  var itemId: js.UndefOr[java.lang.String] = js.undefined
  var link: js.UndefOr[java.lang.String] = js.undefined
  var submittedValue: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var valueOnLandingPage: js.UndefOr[java.lang.String] = js.undefined
}

object AccountStatusExampleItem {
  @scala.inline
  def apply(
    itemId: java.lang.String = null,
    link: java.lang.String = null,
    submittedValue: java.lang.String = null,
    title: java.lang.String = null,
    valueOnLandingPage: java.lang.String = null
  ): AccountStatusExampleItem = {
    val __obj = js.Dynamic.literal()
    if (itemId != null) __obj.updateDynamic("itemId")(itemId)
    if (link != null) __obj.updateDynamic("link")(link)
    if (submittedValue != null) __obj.updateDynamic("submittedValue")(submittedValue)
    if (title != null) __obj.updateDynamic("title")(title)
    if (valueOnLandingPage != null) __obj.updateDynamic("valueOnLandingPage")(valueOnLandingPage)
    __obj.asInstanceOf[AccountStatusExampleItem]
  }
}

