package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Operating System Version List Response
  */
@js.native
trait Schema$OperatingSystemVersionsListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#operatingSystemVersionsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Operating system version collection.
    */
  var operatingSystemVersions: js.UndefOr[js.Array[Schema$OperatingSystemVersion]] = js.native
}

object Schema$OperatingSystemVersionsListResponse {
  @scala.inline
  def apply(kind: String = null, operatingSystemVersions: js.Array[Schema$OperatingSystemVersion] = null): Schema$OperatingSystemVersionsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (operatingSystemVersions != null) __obj.updateDynamic("operatingSystemVersions")(operatingSystemVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OperatingSystemVersionsListResponse]
  }
}

