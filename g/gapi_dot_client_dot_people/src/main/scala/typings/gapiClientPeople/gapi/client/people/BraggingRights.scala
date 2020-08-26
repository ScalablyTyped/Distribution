package typings.gapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BraggingRights extends js.Object {
  /** Metadata about the bragging rights. */
  var metadata: js.UndefOr[FieldMetadata] = js.native
  /** The bragging rights; for example, `climbed mount everest`. */
  var value: js.UndefOr[String] = js.native
}

object BraggingRights {
  @scala.inline
  def apply(): BraggingRights = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BraggingRights]
  }
  @scala.inline
  implicit class BraggingRightsOps[Self <: BraggingRights] (val x: Self) extends AnyVal {
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
    def setMetadata(value: FieldMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

