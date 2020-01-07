package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Browser List Response
  */
@js.native
trait Schema$BrowsersListResponse extends js.Object {
  /**
    * Browser collection.
    */
  var browsers: js.UndefOr[js.Array[Schema$Browser]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#browsersListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$BrowsersListResponse {
  @scala.inline
  def apply(browsers: js.Array[Schema$Browser] = null, kind: String = null): Schema$BrowsersListResponse = {
    val __obj = js.Dynamic.literal()
    if (browsers != null) __obj.updateDynamic("browsers")(browsers.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BrowsersListResponse]
  }
}

