package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings to set up mail merge operations.
  */
@JSGlobal("MailMergeSettings")
@js.native
class MailMergeSettings ()
  extends typings.devexpressWeb.MailMergeSettings {
  /**
    * Gets or sets the index of the row from which the exported range starts.
    */
  /* CompleteClass */
  override var exportFrom: Double = js.native
  /**
    * Gets or sets the number of data rows in the exported mail-merge range.
    */
  /* CompleteClass */
  override var exportRecordsCount: Double = js.native
  /**
    * Gets or sets the merge mode.
    */
  /* CompleteClass */
  override var mergeMode: typings.devexpressWeb.MergeMode = js.native
  /**
    * Specifies which data rows should be exported into a merged document.
    */
  /* CompleteClass */
  override var range: typings.devexpressWeb.MailMergeExportRange = js.native
}

