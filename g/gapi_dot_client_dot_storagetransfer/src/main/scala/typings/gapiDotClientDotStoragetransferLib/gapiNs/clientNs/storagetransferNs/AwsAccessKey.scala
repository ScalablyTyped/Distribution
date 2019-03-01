package typings
package gapiDotClientDotStoragetransferLib.gapiNs.clientNs.storagetransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AwsAccessKey extends js.Object {
  /**
    * AWS access key ID.
    * Required.
    */
  var accessKeyId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * AWS secret access key. This field is not returned in RPC responses.
    * Required.
    */
  var secretAccessKey: js.UndefOr[java.lang.String] = js.undefined
}

object AwsAccessKey {
  @scala.inline
  def apply(accessKeyId: java.lang.String = null, secretAccessKey: java.lang.String = null): AwsAccessKey = {
    val __obj = js.Dynamic.literal()
    if (accessKeyId != null) __obj.updateDynamic("accessKeyId")(accessKeyId)
    if (secretAccessKey != null) __obj.updateDynamic("secretAccessKey")(secretAccessKey)
    __obj.asInstanceOf[AwsAccessKey]
  }
}

