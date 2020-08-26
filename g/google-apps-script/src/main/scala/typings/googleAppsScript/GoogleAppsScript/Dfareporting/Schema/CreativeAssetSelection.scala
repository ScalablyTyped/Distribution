package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreativeAssetSelection extends js.Object {
  var defaultAssetId: js.UndefOr[String] = js.native
  var rules: js.UndefOr[js.Array[Rule]] = js.native
}

object CreativeAssetSelection {
  @scala.inline
  def apply(): CreativeAssetSelection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeAssetSelection]
  }
  @scala.inline
  implicit class CreativeAssetSelectionOps[Self <: CreativeAssetSelection] (val x: Self) extends AnyVal {
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
    def setDefaultAssetId(value: String): Self = this.set("defaultAssetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultAssetId: Self = this.set("defaultAssetId", js.undefined)
    @scala.inline
    def setRulesVarargs(value: Rule*): Self = this.set("rules", js.Array(value :_*))
    @scala.inline
    def setRules(value: js.Array[Rule]): Self = this.set("rules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
  }
  
}

