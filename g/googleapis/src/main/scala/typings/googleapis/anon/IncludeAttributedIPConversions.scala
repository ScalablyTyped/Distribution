package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncludeAttributedIPConversions extends js.Object {
  var includeAttributedIPConversions: js.UndefOr[Boolean] = js.native
  var includeUnattributedCookieConversions: js.UndefOr[Boolean] = js.native
  var includeUnattributedIPConversions: js.UndefOr[Boolean] = js.native
}

object IncludeAttributedIPConversions {
  @scala.inline
  def apply(): IncludeAttributedIPConversions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeAttributedIPConversions]
  }
  @scala.inline
  implicit class IncludeAttributedIPConversionsOps[Self <: IncludeAttributedIPConversions] (val x: Self) extends AnyVal {
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
    def setIncludeAttributedIPConversions(value: Boolean): Self = this.set("includeAttributedIPConversions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeAttributedIPConversions: Self = this.set("includeAttributedIPConversions", js.undefined)
    @scala.inline
    def setIncludeUnattributedCookieConversions(value: Boolean): Self = this.set("includeUnattributedCookieConversions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeUnattributedCookieConversions: Self = this.set("includeUnattributedCookieConversions", js.undefined)
    @scala.inline
    def setIncludeUnattributedIPConversions(value: Boolean): Self = this.set("includeUnattributedIPConversions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeUnattributedIPConversions: Self = this.set("includeUnattributedIPConversions", js.undefined)
  }
  
}

