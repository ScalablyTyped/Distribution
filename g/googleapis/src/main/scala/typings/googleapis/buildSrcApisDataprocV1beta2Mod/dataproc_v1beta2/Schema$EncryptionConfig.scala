package typings.googleapis.buildSrcApisDataprocV1beta2Mod.dataproc_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Encryption settings for the cluster.
  */
@js.native
trait Schema$EncryptionConfig extends js.Object {
  /**
    * Optional. The Cloud KMS key name to use for PD disk encryption for all
    * instances in the cluster.
    */
  var gcePdKmsKeyName: js.UndefOr[String] = js.native
}

object Schema$EncryptionConfig {
  @scala.inline
  def apply(gcePdKmsKeyName: String = null): Schema$EncryptionConfig = {
    val __obj = js.Dynamic.literal()
    if (gcePdKmsKeyName != null) __obj.updateDynamic("gcePdKmsKeyName")(gcePdKmsKeyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$EncryptionConfig]
  }
}

