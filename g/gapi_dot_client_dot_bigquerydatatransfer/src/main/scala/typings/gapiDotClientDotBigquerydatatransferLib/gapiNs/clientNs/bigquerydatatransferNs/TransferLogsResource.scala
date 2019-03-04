package typings
package gapiDotClientDotBigquerydatatransferLib.gapiNs.clientNs.bigquerydatatransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferLogsResource extends js.Object {
  /** Returns user facing log messages for the data transfer run. */
  def list(request: gapiDotClientDotBigquerydatatransferLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[ListTransferLogsResponse]
}

object TransferLogsResource {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotClientDotBigquerydatatransferLib.Anon_AccesstokenAltBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListTransferLogsResponse]
    ]
  ): TransferLogsResource = {
    val __obj = js.Dynamic.literal(list = list)
  
    __obj.asInstanceOf[TransferLogsResource]
  }
}

