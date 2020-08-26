package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The location in Cloud Storage and naming method of the daily usage report.
  * Contains bucket_name and report_name prefix.
  */
@js.native
trait SchemaUsageExportLocation extends js.Object {
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

object SchemaUsageExportLocation {
  @scala.inline
  def apply(): SchemaUsageExportLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUsageExportLocation]
  }
  @scala.inline
  implicit class SchemaUsageExportLocationOps[Self <: SchemaUsageExportLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBucketName(value: String): Self = this.set("bucketName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucketName: Self = this.set("bucketName", js.undefined)
    @scala.inline
    def setReportNamePrefix(value: String): Self = this.set("reportNamePrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportNamePrefix: Self = this.set("reportNamePrefix", js.undefined)
  }
  
}

