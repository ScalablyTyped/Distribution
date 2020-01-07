package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creative List Response
  */
@js.native
trait Schema$CreativesListResponse extends js.Object {
  /**
    * Creative collection.
    */
  var creatives: js.UndefOr[js.Array[Schema$Creative]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#creativesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$CreativesListResponse {
  @scala.inline
  def apply(creatives: js.Array[Schema$Creative] = null, kind: String = null, nextPageToken: String = null): Schema$CreativesListResponse = {
    val __obj = js.Dynamic.literal()
    if (creatives != null) __obj.updateDynamic("creatives")(creatives.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreativesListResponse]
  }
}

