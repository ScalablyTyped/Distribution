package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Operating System List Response
  */
@js.native
trait Schema$OperatingSystemsListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#operatingSystemsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Operating system collection.
    */
  var operatingSystems: js.UndefOr[js.Array[Schema$OperatingSystem]] = js.native
}

object Schema$OperatingSystemsListResponse {
  @scala.inline
  def apply(kind: String = null, operatingSystems: js.Array[Schema$OperatingSystem] = null): Schema$OperatingSystemsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (operatingSystems != null) __obj.updateDynamic("operatingSystems")(operatingSystems.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OperatingSystemsListResponse]
  }
}

