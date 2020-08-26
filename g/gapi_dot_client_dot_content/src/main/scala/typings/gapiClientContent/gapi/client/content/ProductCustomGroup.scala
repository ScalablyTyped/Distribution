package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductCustomGroup extends js.Object {
  /** The sub-attributes. */
  var attributes: js.UndefOr[js.Array[ProductCustomAttribute]] = js.native
  /** The name of the group. Underscores will be replaced by spaces upon insertion. */
  var name: js.UndefOr[String] = js.native
}

object ProductCustomGroup {
  @scala.inline
  def apply(): ProductCustomGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductCustomGroup]
  }
  @scala.inline
  implicit class ProductCustomGroupOps[Self <: ProductCustomGroup] (val x: Self) extends AnyVal {
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
    def setAttributesVarargs(value: ProductCustomAttribute*): Self = this.set("attributes", js.Array(value :_*))
    @scala.inline
    def setAttributes(value: js.Array[ProductCustomAttribute]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

