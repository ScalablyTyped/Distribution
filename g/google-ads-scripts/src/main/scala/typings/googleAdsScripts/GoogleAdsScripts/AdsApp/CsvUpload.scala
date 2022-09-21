package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Bulk Upload which can be incrementally built up in CSV format and uploaded to the Bulk Uploads service. */
trait CsvUpload extends StObject {
  
  /**
    * Appends a row to the Bulk Upload.
    *
    * The row object is a key-value map. For each key-value pair:
    *
    * If the key exists in the provided column headers, its value will fill into the cell corresponding to the matching column;
    * If it doesn't exist, the key-value pair is ignored.
    *
    *      // The resulting CSV bulk upload of the following code would be:
    *      // +-------------+-------------+----------------+
    *      // |   Campaign  | Campaign ID | Campaign state |
    *      // +-------------+-------------+----------------+
    *      // | Campaign #2 |  2001684997 |     enabled    |
    *      // +-------------+-------------+----------------+
    *      var bulkUpload = AdsApp.bulkUploads().newCsvUpload([
    *          "Campaign",
    *          "Campaign ID",
    *          "Campaign state"]);
    *      bulkUpload.append({
    *          "Campaign":"Campaign #2",
    *          "Campaign ID":"2001684997",
    *          "Campaign state":"enabled"});
    */
  def append(row: Record[String, String | Double]): this.type
  
  /**
    * Uploads the file and applies the changes.
    *
    * **When previewing a script, apply() previews the Bulk Upload instead of applying it.**
    */
  @JSName("apply")
  def apply(): Unit
  
  /** Specifies that this upload is used for Campaign Management entity changes. */
  def forCampaignManagement(): this.type
  
  /** Specifies that this upload is used for reporting offline conversions. */
  def forOfflineConversions(): this.type
  
  /** Uploads the file and previews the changes. */
  def preview(): Unit
  
  /** Sets the file name of the uploaded file. */
  def setFileName(fileName: String): this.type
}
object CsvUpload {
  
  inline def apply(
    append: Record[String, String | Double] => CsvUpload,
    apply: () => Unit,
    forCampaignManagement: () => CsvUpload,
    forOfflineConversions: () => CsvUpload,
    preview: () => Unit,
    setFileName: String => CsvUpload
  ): CsvUpload = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), apply = js.Any.fromFunction0(apply), forCampaignManagement = js.Any.fromFunction0(forCampaignManagement), forOfflineConversions = js.Any.fromFunction0(forOfflineConversions), preview = js.Any.fromFunction0(preview), setFileName = js.Any.fromFunction1(setFileName))
    __obj.asInstanceOf[CsvUpload]
  }
  
  extension [Self <: CsvUpload](x: Self) {
    
    inline def setAppend(value: Record[String, String | Double] => CsvUpload): Self = StObject.set(x, "append", js.Any.fromFunction1(value))
    
    inline def setApply(value: () => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction0(value))
    
    inline def setForCampaignManagement(value: () => CsvUpload): Self = StObject.set(x, "forCampaignManagement", js.Any.fromFunction0(value))
    
    inline def setForOfflineConversions(value: () => CsvUpload): Self = StObject.set(x, "forOfflineConversions", js.Any.fromFunction0(value))
    
    inline def setPreview(value: () => Unit): Self = StObject.set(x, "preview", js.Any.fromFunction0(value))
    
    inline def setSetFileName(value: String => CsvUpload): Self = StObject.set(x, "setFileName", js.Any.fromFunction1(value))
  }
}
