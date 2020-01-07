package typings.googleapis.buildSrcApisStoragetransferV1Mod.storagetransfer_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AWS access key (see [AWS Security
  * Credentials](http://docs.aws.amazon.com/general/latest/gr/aws-security-credentials.html)).
  */
@js.native
trait Schema$AwsAccessKey extends js.Object {
  /**
    * AWS access key ID. Required.
    */
  var accessKeyId: js.UndefOr[String] = js.native
  /**
    * AWS secret access key. This field is not returned in RPC responses.
    * Required.
    */
  var secretAccessKey: js.UndefOr[String] = js.native
}

object Schema$AwsAccessKey {
  @scala.inline
  def apply(accessKeyId: String = null, secretAccessKey: String = null): Schema$AwsAccessKey = {
    val __obj = js.Dynamic.literal()
    if (accessKeyId != null) __obj.updateDynamic("accessKeyId")(accessKeyId.asInstanceOf[js.Any])
    if (secretAccessKey != null) __obj.updateDynamic("secretAccessKey")(secretAccessKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AwsAccessKey]
  }
}

