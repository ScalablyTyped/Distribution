package typings.googleapis.buildSrcApisAdminDatatransferUnderscoreV1Mod.admin_datatransfer_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The JSON template for an Application resource.
  */
@js.native
trait Schema$Application extends js.Object {
  /**
    * Etag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The application&#39;s ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies the resource as a DataTransfer Application Resource.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The application&#39;s name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The list of all possible transfer parameters for this application. These
    * parameters can be used to select the data of the user in this application
    * to be transfered.
    */
  var transferParams: js.UndefOr[js.Array[Schema$ApplicationTransferParam]] = js.native
}

object Schema$Application {
  @scala.inline
  def apply(
    etag: String = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    transferParams: js.Array[Schema$ApplicationTransferParam] = null
  ): Schema$Application = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (transferParams != null) __obj.updateDynamic("transferParams")(transferParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Application]
  }
}

