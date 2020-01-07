package typings.googleapis.buildSrcApisSqladminV1beta4Mod.sqladmin_v1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Disk encryption status.
  */
@js.native
trait Schema$DiskEncryptionStatus extends js.Object {
  /**
    * This is always sql#diskEncryptionStatus.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * KMS key version used to encrypt the Cloud SQL instance disk
    */
  var kmsKeyVersionName: js.UndefOr[String] = js.native
}

object Schema$DiskEncryptionStatus {
  @scala.inline
  def apply(kind: String = null, kmsKeyVersionName: String = null): Schema$DiskEncryptionStatus = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (kmsKeyVersionName != null) __obj.updateDynamic("kmsKeyVersionName")(kmsKeyVersionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DiskEncryptionStatus]
  }
}

