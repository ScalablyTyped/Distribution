package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rule extends js.Object {
  /** A creativeAssets[].id. This should refer to one of the parent assets in this creative. This is a required field. */
  var assetId: js.UndefOr[String] = js.native
  /** A user-friendly name for this rule. This is a required field. */
  var name: js.UndefOr[String] = js.native
  /**
    * A targeting template ID. The targeting from the targeting template will be used to determine whether this asset should be served. This is a required
    * field.
    */
  var targetingTemplateId: js.UndefOr[String] = js.native
}

object Rule {
  @scala.inline
  def apply(): Rule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rule]
  }
  @scala.inline
  implicit class RuleOps[Self <: Rule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAssetId(value: String): Self = this.set("assetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssetId: Self = this.set("assetId", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTargetingTemplateId(value: String): Self = this.set("targetingTemplateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetingTemplateId: Self = this.set("targetingTemplateId", js.undefined)
  }
  
}

