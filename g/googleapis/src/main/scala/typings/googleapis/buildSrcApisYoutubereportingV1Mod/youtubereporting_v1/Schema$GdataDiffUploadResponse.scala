package typings.googleapis.buildSrcApisYoutubereportingV1Mod.youtubereporting_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gdata
  */
@js.native
trait Schema$GdataDiffUploadResponse extends js.Object {
  /**
    * gdata
    */
  var objectVersion: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var originalObject: js.UndefOr[Schema$GdataCompositeMedia] = js.native
}

object Schema$GdataDiffUploadResponse {
  @scala.inline
  def apply(objectVersion: String = null, originalObject: Schema$GdataCompositeMedia = null): Schema$GdataDiffUploadResponse = {
    val __obj = js.Dynamic.literal()
    if (objectVersion != null) __obj.updateDynamic("objectVersion")(objectVersion.asInstanceOf[js.Any])
    if (originalObject != null) __obj.updateDynamic("originalObject")(originalObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GdataDiffUploadResponse]
  }
}

