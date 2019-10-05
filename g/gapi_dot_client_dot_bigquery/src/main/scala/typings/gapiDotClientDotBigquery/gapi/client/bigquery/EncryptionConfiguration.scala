package typings.gapiDotClientDotBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptionConfiguration extends js.Object {
  /**
    * [Optional] Describes the Cloud KMS encryption key that will be used to protect destination BigQuery table. The BigQuery Service Account associated with
    * your project requires access to this encryption key.
    */
  var kmsKeyName: js.UndefOr[String] = js.undefined
}

object EncryptionConfiguration {
  @scala.inline
  def apply(kmsKeyName: String = null): EncryptionConfiguration = {
    val __obj = js.Dynamic.literal()
    if (kmsKeyName != null) __obj.updateDynamic("kmsKeyName")(kmsKeyName)
    __obj.asInstanceOf[EncryptionConfiguration]
  }
}

