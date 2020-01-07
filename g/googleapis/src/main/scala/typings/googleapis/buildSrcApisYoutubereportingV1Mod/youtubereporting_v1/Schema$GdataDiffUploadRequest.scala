package typings.googleapis.buildSrcApisYoutubereportingV1Mod.youtubereporting_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gdata
  */
@js.native
trait Schema$GdataDiffUploadRequest extends js.Object {
  /**
    * gdata
    */
  var checksumsInfo: js.UndefOr[Schema$GdataCompositeMedia] = js.native
  /**
    * gdata
    */
  var objectInfo: js.UndefOr[Schema$GdataCompositeMedia] = js.native
  /**
    * gdata
    */
  var objectVersion: js.UndefOr[String] = js.native
}

object Schema$GdataDiffUploadRequest {
  @scala.inline
  def apply(
    checksumsInfo: Schema$GdataCompositeMedia = null,
    objectInfo: Schema$GdataCompositeMedia = null,
    objectVersion: String = null
  ): Schema$GdataDiffUploadRequest = {
    val __obj = js.Dynamic.literal()
    if (checksumsInfo != null) __obj.updateDynamic("checksumsInfo")(checksumsInfo.asInstanceOf[js.Any])
    if (objectInfo != null) __obj.updateDynamic("objectInfo")(objectInfo.asInstanceOf[js.Any])
    if (objectVersion != null) __obj.updateDynamic("objectVersion")(objectVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GdataDiffUploadRequest]
  }
}

