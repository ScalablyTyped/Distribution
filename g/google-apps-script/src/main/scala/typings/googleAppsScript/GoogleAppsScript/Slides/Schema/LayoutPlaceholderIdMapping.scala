package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayoutPlaceholderIdMapping extends js.Object {
  var layoutPlaceholder: js.UndefOr[Placeholder] = js.native
  var layoutPlaceholderObjectId: js.UndefOr[String] = js.native
  var objectId: js.UndefOr[String] = js.native
}

object LayoutPlaceholderIdMapping {
  @scala.inline
  def apply(): LayoutPlaceholderIdMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutPlaceholderIdMapping]
  }
  @scala.inline
  implicit class LayoutPlaceholderIdMappingOps[Self <: LayoutPlaceholderIdMapping] (val x: Self) extends AnyVal {
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
    def setLayoutPlaceholder(value: Placeholder): Self = this.set("layoutPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayoutPlaceholder: Self = this.set("layoutPlaceholder", js.undefined)
    @scala.inline
    def setLayoutPlaceholderObjectId(value: String): Self = this.set("layoutPlaceholderObjectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayoutPlaceholderObjectId: Self = this.set("layoutPlaceholderObjectId", js.undefined)
    @scala.inline
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
  }
  
}

