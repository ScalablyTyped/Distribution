package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings to set up mail merge operations.
  */
trait MailMergeSettings extends js.Object {
  /**
    * Gets or sets the index of the row from which the exported range starts.
    * Value: An integer value specifying the row index.
    */
  var exportFrom: Double
  /**
    * Gets or sets the number of data rows in the exported mail-merge range.
    * Value: An integer value specifying the row count.
    */
  var exportRecordsCount: Double
  /**
    * Gets or sets the merge mode.
    * Value: One of the <see cref="MergeMode" /> values.
    */
  var mergeMode: js.Any
  /**
    * Gets or sets a value specifying which data rows should be exported into a merged document.
    * Value: One of the <see cref="MailMergeExportRange" /> values.
    */
  var range: js.Any
}

object MailMergeSettings {
  @scala.inline
  def apply(exportFrom: Double, exportRecordsCount: Double, mergeMode: js.Any, range: js.Any): MailMergeSettings = {
    val __obj = js.Dynamic.literal(exportFrom = exportFrom, exportRecordsCount = exportRecordsCount, mergeMode = mergeMode, range = range)
  
    __obj.asInstanceOf[MailMergeSettings]
  }
}

