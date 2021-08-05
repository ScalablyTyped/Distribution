package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings to set up mail merge operations.
  */
trait MailMergeSettings extends StObject {
  
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
  
  inline def apply(exportFrom: Double, exportRecordsCount: Double, mergeMode: MergeMode, range: MailMergeExportRange): MailMergeSettings = {
    val __obj = js.Dynamic.literal(exportFrom = exportFrom.asInstanceOf[js.Any], exportRecordsCount = exportRecordsCount.asInstanceOf[js.Any], mergeMode = mergeMode.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailMergeSettings]
  }
  
  extension [Self <: MailMergeSettings](x: Self) {
    
    inline def setExportFrom(value: Double): Self = StObject.set(x, "exportFrom", value.asInstanceOf[js.Any])
    
    inline def setExportRecordsCount(value: Double): Self = StObject.set(x, "exportRecordsCount", value.asInstanceOf[js.Any])
    
    inline def setMergeMode(value: MergeMode): Self = StObject.set(x, "mergeMode", value.asInstanceOf[js.Any])
    
    inline def setRange(value: MailMergeExportRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
