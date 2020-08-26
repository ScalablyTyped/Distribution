package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentTransform extends js.Object {
  /** Dataflow service generated name for this source. */
  var name: js.UndefOr[String] = js.native
  /**
    * User name for the original user transform with which this transform is
    * most closely associated.
    */
  var originalTransform: js.UndefOr[String] = js.native
  /** Human-readable name for this transform; may be user or system generated. */
  var userName: js.UndefOr[String] = js.native
}

object ComponentTransform {
  @scala.inline
  def apply(): ComponentTransform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentTransform]
  }
  @scala.inline
  implicit class ComponentTransformOps[Self <: ComponentTransform] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOriginalTransform(value: String): Self = this.set("originalTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalTransform: Self = this.set("originalTransform", js.undefined)
    @scala.inline
    def setUserName(value: String): Self = this.set("userName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserName: Self = this.set("userName", js.undefined)
  }
  
}

