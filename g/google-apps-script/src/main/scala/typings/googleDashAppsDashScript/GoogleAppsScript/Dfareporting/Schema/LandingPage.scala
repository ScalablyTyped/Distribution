package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LandingPage extends js.Object {
  var advertiserId: js.UndefOr[String] = js.undefined
  var archived: js.UndefOr[Boolean] = js.undefined
  var deepLinks: js.UndefOr[js.Array[DeepLink]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object LandingPage {
  @scala.inline
  def apply(
    advertiserId: String = null,
    archived: js.UndefOr[Boolean] = js.undefined,
    deepLinks: js.Array[DeepLink] = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    url: String = null
  ): LandingPage = {
    val __obj = js.Dynamic.literal()
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId.asInstanceOf[js.Any])
    if (!js.isUndefined(archived)) __obj.updateDynamic("archived")(archived.asInstanceOf[js.Any])
    if (deepLinks != null) __obj.updateDynamic("deepLinks")(deepLinks.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[LandingPage]
  }
}

