package typings.googleapis.anon

import typings.googleapis.v3Mod.analyticsV3.SchemaWebPropertyRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebPropertyRef extends js.Object {
  var webPropertyRef: js.UndefOr[SchemaWebPropertyRef] = js.native
}

object WebPropertyRef {
  @scala.inline
  def apply(): WebPropertyRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebPropertyRef]
  }
  @scala.inline
  implicit class WebPropertyRefOps[Self <: WebPropertyRef] (val x: Self) extends AnyVal {
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
    def setWebPropertyRef(value: SchemaWebPropertyRef): Self = this.set("webPropertyRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebPropertyRef: Self = this.set("webPropertyRef", js.undefined)
  }
  
}

