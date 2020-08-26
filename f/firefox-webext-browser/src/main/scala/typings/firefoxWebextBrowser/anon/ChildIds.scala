package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChildIds extends js.Object {
  var childIds: js.Array[String] = js.native
}

object ChildIds {
  @scala.inline
  def apply(childIds: js.Array[String]): ChildIds = {
    val __obj = js.Dynamic.literal(childIds = childIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildIds]
  }
  @scala.inline
  implicit class ChildIdsOps[Self <: ChildIds] (val x: Self) extends AnyVal {
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
    def setChildIdsVarargs(value: String*): Self = this.set("childIds", js.Array(value :_*))
    @scala.inline
    def setChildIds(value: js.Array[String]): Self = this.set("childIds", value.asInstanceOf[js.Any])
  }
  
}

