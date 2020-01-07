package typings.googleapis.buildSrcApisYoutubereportingV1Mod.youtubereporting_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gdata
  */
@js.native
trait Schema$GdataDiffVersionResponse extends js.Object {
  /**
    * gdata
    */
  var objectSizeBytes: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var objectVersion: js.UndefOr[String] = js.native
}

object Schema$GdataDiffVersionResponse {
  @scala.inline
  def apply(objectSizeBytes: String = null, objectVersion: String = null): Schema$GdataDiffVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (objectSizeBytes != null) __obj.updateDynamic("objectSizeBytes")(objectSizeBytes.asInstanceOf[js.Any])
    if (objectVersion != null) __obj.updateDynamic("objectVersion")(objectVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GdataDiffVersionResponse]
  }
}

