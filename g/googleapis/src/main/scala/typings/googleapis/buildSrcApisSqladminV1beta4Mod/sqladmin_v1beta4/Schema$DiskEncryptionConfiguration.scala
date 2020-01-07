package typings.googleapis.buildSrcApisSqladminV1beta4Mod.sqladmin_v1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Disk encryption configuration.
  */
@js.native
trait Schema$DiskEncryptionConfiguration extends js.Object {
  /**
    * This is always sql#diskEncryptionConfiguration.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * KMS key resource name
    */
  var kmsKeyName: js.UndefOr[String] = js.native
}

object Schema$DiskEncryptionConfiguration {
  @scala.inline
  def apply(kind: String = null, kmsKeyName: String = null): Schema$DiskEncryptionConfiguration = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (kmsKeyName != null) __obj.updateDynamic("kmsKeyName")(kmsKeyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DiskEncryptionConfiguration]
  }
}

