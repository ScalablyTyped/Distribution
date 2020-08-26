package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayoutReference extends js.Object {
  var layoutId: js.UndefOr[String] = js.native
  var predefinedLayout: js.UndefOr[String] = js.native
}

object LayoutReference {
  @scala.inline
  def apply(): LayoutReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutReference]
  }
  @scala.inline
  implicit class LayoutReferenceOps[Self <: LayoutReference] (val x: Self) extends AnyVal {
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
    def setLayoutId(value: String): Self = this.set("layoutId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayoutId: Self = this.set("layoutId", js.undefined)
    @scala.inline
    def setPredefinedLayout(value: String): Self = this.set("predefinedLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePredefinedLayout: Self = this.set("predefinedLayout", js.undefined)
  }
  
}

