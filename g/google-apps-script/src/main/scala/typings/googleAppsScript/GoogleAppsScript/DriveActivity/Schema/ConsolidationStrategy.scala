package typings.googleAppsScript.GoogleAppsScript.DriveActivity.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConsolidationStrategy extends js.Object {
  var legacy: js.UndefOr[js.Any] = js.native
  var none: js.UndefOr[js.Any] = js.native
}

object ConsolidationStrategy {
  @scala.inline
  def apply(): ConsolidationStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsolidationStrategy]
  }
  @scala.inline
  implicit class ConsolidationStrategyOps[Self <: ConsolidationStrategy] (val x: Self) extends AnyVal {
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
    def setLegacy(value: js.Any): Self = this.set("legacy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegacy: Self = this.set("legacy", js.undefined)
    @scala.inline
    def setNone(value: js.Any): Self = this.set("none", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNone: Self = this.set("none", js.undefined)
  }
  
}

