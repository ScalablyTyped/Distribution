package typings.googleapis.buildSrcApisAdminDatatransferUnderscoreV1Mod.admin_datatransfer_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Template to map fields of ApplicationDataTransfer resource.
  */
@js.native
trait Schema$ApplicationDataTransfer extends js.Object {
  /**
    * The application&#39;s ID.
    */
  var applicationId: js.UndefOr[String] = js.native
  /**
    * The transfer parameters for the application. These parameters are used to
    * select the data which will get transfered in context of this application.
    */
  var applicationTransferParams: js.UndefOr[js.Array[Schema$ApplicationTransferParam]] = js.native
  /**
    * Current status of transfer for this application. (Read-only)
    */
  var applicationTransferStatus: js.UndefOr[String] = js.native
}

object Schema$ApplicationDataTransfer {
  @scala.inline
  def apply(
    applicationId: String = null,
    applicationTransferParams: js.Array[Schema$ApplicationTransferParam] = null,
    applicationTransferStatus: String = null
  ): Schema$ApplicationDataTransfer = {
    val __obj = js.Dynamic.literal()
    if (applicationId != null) __obj.updateDynamic("applicationId")(applicationId.asInstanceOf[js.Any])
    if (applicationTransferParams != null) __obj.updateDynamic("applicationTransferParams")(applicationTransferParams.asInstanceOf[js.Any])
    if (applicationTransferStatus != null) __obj.updateDynamic("applicationTransferStatus")(applicationTransferStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ApplicationDataTransfer]
  }
}

