package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The location in Cloud Storage and naming method of the daily usage report.
  * Contains bucket_name and report_name prefix.
  */
@js.native
trait Schema$UsageExportLocation extends js.Object {
  /**
    * The name of an existing bucket in Cloud Storage where the usage report
    * object is stored. The Google Service Account is granted write access to
    * this bucket. This can either be the bucket name by itself, such as
    * example-bucket, or the bucket name with gs:// or
    * https://storage.googleapis.com/ in front of it, such as
    * gs://example-bucket.
    */
  var bucketName: js.UndefOr[String] = js.native
  /**
    * An optional prefix for the name of the usage report object stored in
    * bucketName. If not supplied, defaults to usage. The report is stored as a
    * CSV file named report_name_prefix_gce_YYYYMMDD.csv where YYYYMMDD is the
    * day of the usage according to Pacific Time. If you supply a prefix, it
    * should conform to Cloud Storage object naming conventions.
    */
  var reportNamePrefix: js.UndefOr[String] = js.native
}

object Schema$UsageExportLocation {
  @scala.inline
  def apply(bucketName: String = null, reportNamePrefix: String = null): Schema$UsageExportLocation = {
    val __obj = js.Dynamic.literal()
    if (bucketName != null) __obj.updateDynamic("bucketName")(bucketName.asInstanceOf[js.Any])
    if (reportNamePrefix != null) __obj.updateDynamic("reportNamePrefix")(reportNamePrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UsageExportLocation]
  }
}

