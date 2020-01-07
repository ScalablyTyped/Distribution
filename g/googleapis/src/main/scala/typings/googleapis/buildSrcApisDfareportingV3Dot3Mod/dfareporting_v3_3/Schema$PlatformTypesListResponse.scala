package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Platform Type List Response
  */
@js.native
trait Schema$PlatformTypesListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#platformTypesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Platform type collection.
    */
  var platformTypes: js.UndefOr[js.Array[Schema$PlatformType]] = js.native
}

object Schema$PlatformTypesListResponse {
  @scala.inline
  def apply(kind: String = null, platformTypes: js.Array[Schema$PlatformType] = null): Schema$PlatformTypesListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (platformTypes != null) __obj.updateDynamic("platformTypes")(platformTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PlatformTypesListResponse]
  }
}

