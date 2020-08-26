package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtraDescription extends js.Object {
  var description: js.UndefOr[String] = js.native
  var extraDescription: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
}

object ExtraDescription {
  @scala.inline
  def apply(): ExtraDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtraDescription]
  }
  @scala.inline
  implicit class ExtraDescriptionOps[Self <: ExtraDescription] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setExtraDescription(value: String): Self = this.set("extraDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraDescription: Self = this.set("extraDescription", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

