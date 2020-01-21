package typings.gapiClientStoragetransfer.gapi.client.storagetransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AwsS3Data extends js.Object {
  /**
    * AWS access key used to sign the API requests to the AWS S3 bucket.
    * Permissions on the bucket must be granted to the access ID of the
    * AWS access key.
    * Required.
    */
  var awsAccessKey: js.UndefOr[AwsAccessKey] = js.undefined
  /**
    * S3 Bucket name (see
    * [Creating a bucket](http://docs.aws.amazon.com/AmazonS3/latest/dev/create-bucket-get-location-example.html)).
    * Required.
    */
  var bucketName: js.UndefOr[String] = js.undefined
}

object AwsS3Data {
  @scala.inline
  def apply(awsAccessKey: AwsAccessKey = null, bucketName: String = null): AwsS3Data = {
    val __obj = js.Dynamic.literal()
    if (awsAccessKey != null) __obj.updateDynamic("awsAccessKey")(awsAccessKey.asInstanceOf[js.Any])
    if (bucketName != null) __obj.updateDynamic("bucketName")(bucketName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsS3Data]
  }
}

