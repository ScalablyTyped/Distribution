package typings.googleapis.buildSrcApisYoutubereportingV1Mod.youtubereporting_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gdata
  */
@js.native
trait Schema$GdataDiffChecksumsResponse extends js.Object {
  /**
    * gdata
    */
  var checksumsLocation: js.UndefOr[Schema$GdataCompositeMedia] = js.native
  /**
    * gdata
    */
  var chunkSizeBytes: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var objectLocation: js.UndefOr[Schema$GdataCompositeMedia] = js.native
  /**
    * gdata
    */
  var objectSizeBytes: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var objectVersion: js.UndefOr[String] = js.native
}

object Schema$GdataDiffChecksumsResponse {
  @scala.inline
  def apply(
    checksumsLocation: Schema$GdataCompositeMedia = null,
    chunkSizeBytes: String = null,
    objectLocation: Schema$GdataCompositeMedia = null,
    objectSizeBytes: String = null,
    objectVersion: String = null
  ): Schema$GdataDiffChecksumsResponse = {
    val __obj = js.Dynamic.literal()
    if (checksumsLocation != null) __obj.updateDynamic("checksumsLocation")(checksumsLocation.asInstanceOf[js.Any])
    if (chunkSizeBytes != null) __obj.updateDynamic("chunkSizeBytes")(chunkSizeBytes.asInstanceOf[js.Any])
    if (objectLocation != null) __obj.updateDynamic("objectLocation")(objectLocation.asInstanceOf[js.Any])
    if (objectSizeBytes != null) __obj.updateDynamic("objectSizeBytes")(objectSizeBytes.asInstanceOf[js.Any])
    if (objectVersion != null) __obj.updateDynamic("objectVersion")(objectVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GdataDiffChecksumsResponse]
  }
}

