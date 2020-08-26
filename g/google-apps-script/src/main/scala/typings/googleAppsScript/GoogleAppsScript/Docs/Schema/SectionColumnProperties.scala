package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SectionColumnProperties extends js.Object {
  var paddingEnd: js.UndefOr[Dimension] = js.native
  var width: js.UndefOr[Dimension] = js.native
}

object SectionColumnProperties {
  @scala.inline
  def apply(): SectionColumnProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SectionColumnProperties]
  }
  @scala.inline
  implicit class SectionColumnPropertiesOps[Self <: SectionColumnProperties] (val x: Self) extends AnyVal {
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
    def setPaddingEnd(value: Dimension): Self = this.set("paddingEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingEnd: Self = this.set("paddingEnd", js.undefined)
    @scala.inline
    def setWidth(value: Dimension): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

