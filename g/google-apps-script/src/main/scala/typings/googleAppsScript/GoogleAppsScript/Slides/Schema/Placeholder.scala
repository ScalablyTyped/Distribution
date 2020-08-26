package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Placeholder extends js.Object {
  var index: js.UndefOr[Double] = js.native
  var parentObjectId: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object Placeholder {
  @scala.inline
  def apply(): Placeholder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Placeholder]
  }
  @scala.inline
  implicit class PlaceholderOps[Self <: Placeholder] (val x: Self) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setParentObjectId(value: String): Self = this.set("parentObjectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentObjectId: Self = this.set("parentObjectId", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

