package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeepLink extends js.Object {
  var appUrl: js.UndefOr[String] = js.undefined
  var fallbackUrl: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var mobileApp: js.UndefOr[MobileApp] = js.undefined
  var remarketingListIds: js.UndefOr[js.Array[String]] = js.undefined
}

object DeepLink {
  @scala.inline
  def apply(
    appUrl: String = null,
    fallbackUrl: String = null,
    kind: String = null,
    mobileApp: MobileApp = null,
    remarketingListIds: js.Array[String] = null
  ): DeepLink = {
    val __obj = js.Dynamic.literal()
    if (appUrl != null) __obj.updateDynamic("appUrl")(appUrl)
    if (fallbackUrl != null) __obj.updateDynamic("fallbackUrl")(fallbackUrl)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (mobileApp != null) __obj.updateDynamic("mobileApp")(mobileApp)
    if (remarketingListIds != null) __obj.updateDynamic("remarketingListIds")(remarketingListIds)
    __obj.asInstanceOf[DeepLink]
  }
}

