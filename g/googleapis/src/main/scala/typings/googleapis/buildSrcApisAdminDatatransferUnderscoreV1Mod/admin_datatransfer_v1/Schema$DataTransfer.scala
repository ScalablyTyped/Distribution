package typings.googleapis.buildSrcApisAdminDatatransferUnderscoreV1Mod.admin_datatransfer_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The JSON template for a DataTransfer resource.
  */
@js.native
trait Schema$DataTransfer extends js.Object {
  /**
    * List of per application data transfer resources. It contains data
    * transfer details of the applications associated with this transfer
    * resource. Note that this list is also used to specify the applications
    * for which data transfer has to be done at the time of the transfer
    * resource creation.
    */
  var applicationDataTransfers: js.UndefOr[js.Array[Schema$ApplicationDataTransfer]] = js.native
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The transfer&#39;s ID (Read-only).
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies the resource as a DataTransfer request.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * ID of the user to whom the data is being transfered.
    */
  var newOwnerUserId: js.UndefOr[String] = js.native
  /**
    * ID of the user whose data is being transfered.
    */
  var oldOwnerUserId: js.UndefOr[String] = js.native
  /**
    * Overall transfer status (Read-only).
    */
  var overallTransferStatusCode: js.UndefOr[String] = js.native
  /**
    * The time at which the data transfer was requested (Read-only).
    */
  var requestTime: js.UndefOr[String] = js.native
}

object Schema$DataTransfer {
  @scala.inline
  def apply(
    applicationDataTransfers: js.Array[Schema$ApplicationDataTransfer] = null,
    etag: String = null,
    id: String = null,
    kind: String = null,
    newOwnerUserId: String = null,
    oldOwnerUserId: String = null,
    overallTransferStatusCode: String = null,
    requestTime: String = null
  ): Schema$DataTransfer = {
    val __obj = js.Dynamic.literal()
    if (applicationDataTransfers != null) __obj.updateDynamic("applicationDataTransfers")(applicationDataTransfers.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (newOwnerUserId != null) __obj.updateDynamic("newOwnerUserId")(newOwnerUserId.asInstanceOf[js.Any])
    if (oldOwnerUserId != null) __obj.updateDynamic("oldOwnerUserId")(oldOwnerUserId.asInstanceOf[js.Any])
    if (overallTransferStatusCode != null) __obj.updateDynamic("overallTransferStatusCode")(overallTransferStatusCode.asInstanceOf[js.Any])
    if (requestTime != null) __obj.updateDynamic("requestTime")(requestTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DataTransfer]
  }
}

