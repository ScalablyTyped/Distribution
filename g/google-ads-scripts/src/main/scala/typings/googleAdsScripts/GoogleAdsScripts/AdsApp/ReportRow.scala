package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a row of a report.
  *
  * NOTE: The ReportRow works as an associative array indexed by AWQL column name. In addition to working as a normal associative array,
  * ReportRow also has a ReportRow.formatForUpload() method, for convenience when working with bulk uploads.
  *
  * Typical usage:
  *
  *      var rows = report.rows();
  *      while (rows.hasNext()) {
  *        var row = rows.next();
  *        // The row works as an associative array
  *        var clicks = row['Clicks'];
  *        // Tweak the row and append it to a bulk upload.
  *        row['MaxCpc'] = row['MaxCpc'] + 1;
  *        upload.append(row.formatForUpload());
  *      }
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in string ]: any} */ trait ReportRow extends StObject {
  
  /**
    * Returns the report row as an associative array indexed by display column name.
    *
    * For detailed information about the display column name, please see the `Display Name` column in all types of reports.
    *
    * NOTE: If you're generating a CsvUpload with Report, make sure to use this method while appending rows. Typical usage:
    *
    *      var rows = report.rows();
    *      while (rows.hasNext()) {
    *        var row = rows.next();
    *        // ... tweak the row
    *        upload.append(row.formatForUpload());
    *      }
    */
  def formatForUpload(): Record[String, String | Double]
}
object ReportRow {
  
  inline def apply(formatForUpload: () => Record[String, String | Double]): ReportRow = {
    val __obj = js.Dynamic.literal(formatForUpload = js.Any.fromFunction0(formatForUpload))
    __obj.asInstanceOf[ReportRow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReportRow] (val x: Self) extends AnyVal {
    
    inline def setFormatForUpload(value: () => Record[String, String | Double]): Self = StObject.set(x, "formatForUpload", js.Any.fromFunction0(value))
  }
}
