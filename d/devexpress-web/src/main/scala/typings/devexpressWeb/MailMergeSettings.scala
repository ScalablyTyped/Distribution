package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings to set up mail merge operations.
  */
trait MailMergeSettings extends js.Object {
  /**
    * Gets or sets the index of the row from which the exported range starts.
    */
  var exportFrom: Double
  /**
    * Gets or sets the number of data rows in the exported mail-merge range.
    */
  var exportRecordsCount: Double
  /**
    * Gets or sets the merge mode.
    */
  var mergeMode: MergeMode
  /**
    * Specifies which data rows should be exported into a merged document.
    */
  var range: MailMergeExportRange
}

object MailMergeSettings {
  @scala.inline
  def apply(exportFrom: Double, exportRecordsCount: Double, mergeMode: MergeMode, range: MailMergeExportRange): MailMergeSettings = {
    val __obj = js.Dynamic.literal(exportFrom = exportFrom.asInstanceOf[js.Any], exportRecordsCount = exportRecordsCount.asInstanceOf[js.Any], mergeMode = mergeMode.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailMergeSettings]
  }
}

