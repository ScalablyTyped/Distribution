package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaEncryptionConfiguration extends js.Object {
  /**
    * [Optional] Describes the Cloud KMS encryption key that will be used to
    * protect destination BigQuery table. The BigQuery Service Account
    * associated with your project requires access to this encryption key.
    */
  var kmsKeyName: js.UndefOr[String] = js.native
}

object SchemaEncryptionConfiguration {
  @scala.inline
  def apply(kmsKeyName: String = null): SchemaEncryptionConfiguration = {
    val __obj = js.Dynamic.literal()
    if (kmsKeyName != null) __obj.updateDynamic("kmsKeyName")(kmsKeyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEncryptionConfiguration]
  }
}

