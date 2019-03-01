package typings
package gapiDotClientDotBigquerydatatransferLib.gapiNs.clientNs.bigquerydatatransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTransferConfigsResponse extends js.Object {
  /**
    * Output only. The next-pagination token. For multiple-page list results,
    * this token can be used as the
    * `ListTransferConfigsRequest.page_token`
    * to request the next page of list results.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Output only. The stored pipeline transfer configurations. */
  var transferConfigs: js.UndefOr[js.Array[TransferConfig]] = js.undefined
}

object ListTransferConfigsResponse {
  @scala.inline
  def apply(nextPageToken: java.lang.String = null, transferConfigs: js.Array[TransferConfig] = null): ListTransferConfigsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (transferConfigs != null) __obj.updateDynamic("transferConfigs")(transferConfigs)
    __obj.asInstanceOf[ListTransferConfigsResponse]
  }
}

