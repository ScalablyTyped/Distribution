package typings
package gapiDotClientDotClassroomLib.gapiNs.clientNs.classroomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ModifyAttachmentsRequest extends js.Object {
  /**
               * Attachments to add.
               * A student submission may not have more than 20 attachments.
               *
               * Form attachments are not supported.
               */
  var addAttachments: js.UndefOr[js.Array[Attachment]] = js.undefined
}

