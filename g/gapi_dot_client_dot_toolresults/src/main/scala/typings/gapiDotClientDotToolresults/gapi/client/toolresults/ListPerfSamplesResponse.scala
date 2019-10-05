package typings.gapiDotClientDotToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPerfSamplesResponse extends js.Object {
  /**
    * Optional, returned if result size exceeds the page size specified in the request (or the default page size, 500, if unspecified). It indicates the last
    * sample timestamp to be used as page_token in subsequent request
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  var perfSamples: js.UndefOr[js.Array[PerfSample]] = js.undefined
}

object ListPerfSamplesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, perfSamples: js.Array[PerfSample] = null): ListPerfSamplesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (perfSamples != null) __obj.updateDynamic("perfSamples")(perfSamples)
    __obj.asInstanceOf[ListPerfSamplesResponse]
  }
}

