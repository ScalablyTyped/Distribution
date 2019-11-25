package typings.googleDashAppsDashScript.GoogleAppsScript.People.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldMetadata extends js.Object {
  var primary: js.UndefOr[Boolean] = js.undefined
  var source: js.UndefOr[Source] = js.undefined
  var verified: js.UndefOr[Boolean] = js.undefined
}

object FieldMetadata {
  @scala.inline
  def apply(
    primary: js.UndefOr[Boolean] = js.undefined,
    source: Source = null,
    verified: js.UndefOr[Boolean] = js.undefined
  ): FieldMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (!js.isUndefined(verified)) __obj.updateDynamic("verified")(verified.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldMetadata]
  }
}

