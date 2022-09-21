package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUsageExportLocation extends StObject {
  
  /**
    * The name of an existing bucket in Cloud Storage where the usage report object is stored. The Google Service Account is granted write access to this bucket. This can either be the bucket name by itself, such as example-bucket, or the bucket name with gs:// or https://storage.googleapis.com/ in front of it, such as gs://example-bucket.
    */
  var bucketName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An optional prefix for the name of the usage report object stored in bucketName. If not supplied, defaults to usage_gce. The report is stored as a CSV file named report_name_prefix_gce_YYYYMMDD.csv where YYYYMMDD is the day of the usage according to Pacific Time. If you supply a prefix, it should conform to Cloud Storage object naming conventions.
    */
  var reportNamePrefix: js.UndefOr[String | Null] = js.undefined
}
object SchemaUsageExportLocation {
  
  inline def apply(): SchemaUsageExportLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUsageExportLocation]
  }
  
  extension [Self <: SchemaUsageExportLocation](x: Self) {
    
    inline def setBucketName(value: String): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketNameNull: Self = StObject.set(x, "bucketName", null)
    
    inline def setBucketNameUndefined: Self = StObject.set(x, "bucketName", js.undefined)
    
    inline def setReportNamePrefix(value: String): Self = StObject.set(x, "reportNamePrefix", value.asInstanceOf[js.Any])
    
    inline def setReportNamePrefixNull: Self = StObject.set(x, "reportNamePrefix", null)
    
    inline def setReportNamePrefixUndefined: Self = StObject.set(x, "reportNamePrefix", js.undefined)
  }
}
