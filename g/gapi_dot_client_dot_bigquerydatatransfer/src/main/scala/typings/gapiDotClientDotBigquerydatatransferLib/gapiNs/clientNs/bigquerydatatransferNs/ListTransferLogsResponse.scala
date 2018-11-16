package typings
package gapiDotClientDotBigquerydatatransferLib.gapiNs.clientNs.bigquerydatatransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListTransferLogsResponse extends js.Object {
  /**
               * Output only. The next-pagination token. For multiple-page list results,
               * this token can be used as the
               * `GetTransferRunLogRequest.page_token`
               * to request the next page of list results.
               */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Output only. The stored pipeline transfer messages. */
  var transferMessages: js.UndefOr[js.Array[TransferMessage]] = js.undefined
}

