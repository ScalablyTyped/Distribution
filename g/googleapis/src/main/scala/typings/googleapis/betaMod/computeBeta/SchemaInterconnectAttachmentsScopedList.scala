package typings.googleapis.betaMod.computeBeta

import typings.googleapis.AnonCode
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
  var warning: js.UndefOr[AnonCode] = js.native
}

object SchemaInterconnectAttachmentsScopedList {
  @scala.inline
  def apply(interconnectAttachments: js.Array[SchemaInterconnectAttachment] = null, warning: AnonCode = null): SchemaInterconnectAttachmentsScopedList = {
    val __obj = js.Dynamic.literal()
    if (interconnectAttachments != null) __obj.updateDynamic("interconnectAttachments")(interconnectAttachments.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInterconnectAttachmentsScopedList]
  }
}

