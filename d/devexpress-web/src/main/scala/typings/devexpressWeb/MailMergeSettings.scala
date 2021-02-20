package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings to set up mail merge operations.
  */
@js.native
trait MailMergeSettings extends StObject {
  
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
object MailMergeSettings {
  
  @scala.inline
  def apply(exportFrom: Double, exportRecordsCount: Double, mergeMode: MergeMode, range: MailMergeExportRange): MailMergeSettings = {
    val __obj = js.Dynamic.literal(exportFrom = exportFrom.asInstanceOf[js.Any], exportRecordsCount = exportRecordsCount.asInstanceOf[js.Any], mergeMode = mergeMode.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailMergeSettings]
  }
  
  @scala.inline
  implicit class MailMergeSettingsMutableBuilder[Self <: MailMergeSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportFrom(value: Double): Self = StObject.set(x, "exportFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportRecordsCount(value: Double): Self = StObject.set(x, "exportRecordsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeMode(value: MergeMode): Self = StObject.set(x, "mergeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: MailMergeExportRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
