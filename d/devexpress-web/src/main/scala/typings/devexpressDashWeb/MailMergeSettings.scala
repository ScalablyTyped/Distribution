package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings to set up mail merge operations.
  */
@JSGlobal("MailMergeSettings")
@js.native
class MailMergeSettings () extends js.Object {
  /**
    * Gets or sets the index of the row from which the exported range starts.
    */
  var exportFrom: Double = js.native
  /**
    * Gets or sets the number of data rows in the exported mail-merge range.
    */
  var exportRecordsCount: Double = js.native
  /**
    * Gets or sets the merge mode.
    */
  var mergeMode: MergeMode = js.native
  /**
    * Specifies which data rows should be exported into a merged document.
    */
  var range: MailMergeExportRange = js.native
}

