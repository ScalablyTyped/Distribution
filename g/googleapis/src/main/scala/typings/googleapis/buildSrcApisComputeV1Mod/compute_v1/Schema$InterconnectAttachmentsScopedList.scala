package typings.googleapis.buildSrcApisComputeV1Mod.compute_v1

import typings.googleapis.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$InterconnectAttachmentsScopedList extends js.Object {
  /**
    * A list of interconnect attachments contained in this scope.
    */
  var interconnectAttachments: js.UndefOr[js.Array[Schema$InterconnectAttachment]] = js.native
  /**
    * Informational warning which replaces the list of addresses when the list
    * is empty.
    */
  var warning: js.UndefOr[Anon_Code] = js.native
}

object Schema$InterconnectAttachmentsScopedList {
  @scala.inline
  def apply(interconnectAttachments: js.Array[Schema$InterconnectAttachment] = null, warning: Anon_Code = null): Schema$InterconnectAttachmentsScopedList = {
    val __obj = js.Dynamic.literal()
    if (interconnectAttachments != null) __obj.updateDynamic("interconnectAttachments")(interconnectAttachments.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InterconnectAttachmentsScopedList]
  }
}

