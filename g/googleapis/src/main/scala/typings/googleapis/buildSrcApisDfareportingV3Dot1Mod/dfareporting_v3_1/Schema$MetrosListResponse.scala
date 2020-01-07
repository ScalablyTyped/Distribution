package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metro List Response
  */
@js.native
trait Schema$MetrosListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#metrosListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Metro collection.
    */
  var metros: js.UndefOr[js.Array[Schema$Metro]] = js.native
}

object Schema$MetrosListResponse {
  @scala.inline
  def apply(kind: String = null, metros: js.Array[Schema$Metro] = null): Schema$MetrosListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metros != null) __obj.updateDynamic("metros")(metros.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MetrosListResponse]
  }
}

