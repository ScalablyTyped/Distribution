package typings.googleapis.buildSrcApisToolresultsV1beta3Mod.toolresults_v1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ListPerfSamplesResponse extends js.Object {
  /**
    * Optional, returned if result size exceeds the page size specified in the
    * request (or the default page size, 500, if unspecified). It indicates the
    * last sample timestamp to be used as page_token in subsequent request
    */
  var nextPageToken: js.UndefOr[String] = js.native
  var perfSamples: js.UndefOr[js.Array[Schema$PerfSample]] = js.native
}

object Schema$ListPerfSamplesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, perfSamples: js.Array[Schema$PerfSample] = null): Schema$ListPerfSamplesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (perfSamples != null) __obj.updateDynamic("perfSamples")(perfSamples.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListPerfSamplesResponse]
  }
}

