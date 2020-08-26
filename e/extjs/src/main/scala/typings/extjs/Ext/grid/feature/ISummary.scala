package typings.extjs.Ext.grid.feature

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISummary extends IAbstractSummary {
  /** [Config Option] (String) */
  var dock: js.UndefOr[String] = js.native
}

object ISummary {
  @scala.inline
  def apply(): ISummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISummary]
  }
  @scala.inline
  implicit class ISummaryOps[Self <: ISummary] (val x: Self) extends AnyVal {
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
    def setDock(value: String): Self = this.set("dock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDock: Self = this.set("dock", js.undefined)
  }
  
}

