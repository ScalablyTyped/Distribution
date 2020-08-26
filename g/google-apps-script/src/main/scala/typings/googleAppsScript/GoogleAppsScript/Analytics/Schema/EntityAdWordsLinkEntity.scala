package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityAdWordsLinkEntity extends js.Object {
  var webPropertyRef: js.UndefOr[WebPropertyRef] = js.native
}

object EntityAdWordsLinkEntity {
  @scala.inline
  def apply(): EntityAdWordsLinkEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityAdWordsLinkEntity]
  }
  @scala.inline
  implicit class EntityAdWordsLinkEntityOps[Self <: EntityAdWordsLinkEntity] (val x: Self) extends AnyVal {
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
    def setWebPropertyRef(value: WebPropertyRef): Self = this.set("webPropertyRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebPropertyRef: Self = this.set("webPropertyRef", js.undefined)
  }
  
}

