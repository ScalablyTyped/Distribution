package typings.gitlab.resourceMembersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncludeInherited extends js.Object {
  var includeInherited: js.UndefOr[Boolean] = js.native
}

object IncludeInherited {
  @scala.inline
  def apply(): IncludeInherited = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeInherited]
  }
  @scala.inline
  implicit class IncludeInheritedOps[Self <: IncludeInherited] (val x: Self) extends AnyVal {
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
    def setIncludeInherited(value: Boolean): Self = this.set("includeInherited", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeInherited: Self = this.set("includeInherited", js.undefined)
  }
  
}

