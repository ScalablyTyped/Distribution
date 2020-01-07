package typings.googleapis.buildSrcApisYoutubereportingV1Mod.youtubereporting_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gdata
  */
@js.native
trait Schema$GdataDiffDownloadResponse extends js.Object {
  /**
    * gdata
    */
  var objectLocation: js.UndefOr[Schema$GdataCompositeMedia] = js.native
}

object Schema$GdataDiffDownloadResponse {
  @scala.inline
  def apply(objectLocation: Schema$GdataCompositeMedia = null): Schema$GdataDiffDownloadResponse = {
    val __obj = js.Dynamic.literal()
    if (objectLocation != null) __obj.updateDynamic("objectLocation")(objectLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GdataDiffDownloadResponse]
  }
}

