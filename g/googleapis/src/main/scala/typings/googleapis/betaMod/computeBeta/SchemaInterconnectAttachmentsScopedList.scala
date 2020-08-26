package typings.googleapis.betaMod.computeBeta

import typings.googleapis.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInterconnectAttachmentsScopedList extends js.Object {
  /**
    * A list of interconnect attachments contained in this scope.
    */
  var interconnectAttachments: js.UndefOr[js.Array[SchemaInterconnectAttachment]] = js.native
  /**
    * Informational warning which replaces the list of addresses when the list
    * is empty.
    */
  var warning: js.UndefOr[Code] = js.native
}

object SchemaInterconnectAttachmentsScopedList {
  @scala.inline
  def apply(): SchemaInterconnectAttachmentsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterconnectAttachmentsScopedList]
  }
  @scala.inline
  implicit class SchemaInterconnectAttachmentsScopedListOps[Self <: SchemaInterconnectAttachmentsScopedList] (val x: Self) extends AnyVal {
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
    def setInterconnectAttachmentsVarargs(value: SchemaInterconnectAttachment*): Self = this.set("interconnectAttachments", js.Array(value :_*))
    @scala.inline
    def setInterconnectAttachments(value: js.Array[SchemaInterconnectAttachment]): Self = this.set("interconnectAttachments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterconnectAttachments: Self = this.set("interconnectAttachments", js.undefined)
    @scala.inline
    def setWarning(value: Code): Self = this.set("warning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
  
}

