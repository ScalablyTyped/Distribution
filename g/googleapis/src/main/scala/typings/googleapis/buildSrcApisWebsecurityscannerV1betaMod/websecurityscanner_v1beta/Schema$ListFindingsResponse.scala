package typings.googleapis.buildSrcApisWebsecurityscannerV1betaMod.websecurityscanner_v1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the `ListFindings` method.
  */
@js.native
trait Schema$ListFindingsResponse extends js.Object {
  /**
    * The list of Findings returned.
    */
  var findings: js.UndefOr[js.Array[Schema$Finding]] = js.native
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListFindingsResponse {
  @scala.inline
  def apply(findings: js.Array[Schema$Finding] = null, nextPageToken: String = null): Schema$ListFindingsResponse = {
    val __obj = js.Dynamic.literal()
    if (findings != null) __obj.updateDynamic("findings")(findings.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListFindingsResponse]
  }
}

