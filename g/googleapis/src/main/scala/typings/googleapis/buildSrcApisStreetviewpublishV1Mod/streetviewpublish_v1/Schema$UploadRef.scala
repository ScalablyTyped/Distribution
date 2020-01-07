package typings.googleapis.buildSrcApisStreetviewpublishV1Mod.streetviewpublish_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Upload reference for media files.
  */
@js.native
trait Schema$UploadRef extends js.Object {
  /**
    * Required. An upload reference should be unique for each user. It follows
    * the form:
    * &quot;https://streetviewpublish.googleapis.com/media/user/{account_id}/photo/{upload_reference}&quot;
    */
  var uploadUrl: js.UndefOr[String] = js.native
}

object Schema$UploadRef {
  @scala.inline
  def apply(uploadUrl: String = null): Schema$UploadRef = {
    val __obj = js.Dynamic.literal()
    if (uploadUrl != null) __obj.updateDynamic("uploadUrl")(uploadUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UploadRef]
  }
}

