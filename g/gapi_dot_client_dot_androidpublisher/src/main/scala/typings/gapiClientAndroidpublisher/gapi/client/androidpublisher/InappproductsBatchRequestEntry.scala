package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InappproductsBatchRequestEntry extends js.Object {
  var batchId: js.UndefOr[Double] = js.undefined
  var inappproductsinsertrequest: js.UndefOr[InappproductsInsertRequest] = js.undefined
  var inappproductsupdaterequest: js.UndefOr[InappproductsUpdateRequest] = js.undefined
  var methodName: js.UndefOr[String] = js.undefined
}

object InappproductsBatchRequestEntry {
  @scala.inline
  def apply(
    batchId: js.UndefOr[Double] = js.undefined,
    inappproductsinsertrequest: InappproductsInsertRequest = null,
    inappproductsupdaterequest: InappproductsUpdateRequest = null,
    methodName: String = null
  ): InappproductsBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(batchId)) __obj.updateDynamic("batchId")(batchId.get.asInstanceOf[js.Any])
    if (inappproductsinsertrequest != null) __obj.updateDynamic("inappproductsinsertrequest")(inappproductsinsertrequest.asInstanceOf[js.Any])
    if (inappproductsupdaterequest != null) __obj.updateDynamic("inappproductsupdaterequest")(inappproductsupdaterequest.asInstanceOf[js.Any])
    if (methodName != null) __obj.updateDynamic("methodName")(methodName.asInstanceOf[js.Any])
    __obj.asInstanceOf[InappproductsBatchRequestEntry]
  }
}

