package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rule extends js.Object {
  var assetId: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var targetingTemplateId: js.UndefOr[String] = js.undefined
}

object Rule {
  @scala.inline
  def apply(assetId: String = null, name: String = null, targetingTemplateId: String = null): Rule = {
    val __obj = js.Dynamic.literal()
    if (assetId != null) __obj.updateDynamic("assetId")(assetId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (targetingTemplateId != null) __obj.updateDynamic("targetingTemplateId")(targetingTemplateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
}

