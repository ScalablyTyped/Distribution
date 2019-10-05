package typings.gapiDotClientDotBigquerydatatransfer.gapi.client.bigquerydatatransfer

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotBigquerydatatransfer.Anon_AccesstokenAltBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferLogsResource extends js.Object {
  /** Returns user facing log messages for the data transfer run. */
  def list(request: Anon_AccesstokenAltBearertoken): Request[ListTransferLogsResponse]
}

object TransferLogsResource {
  @scala.inline
  def apply(list: Anon_AccesstokenAltBearertoken => Request[ListTransferLogsResponse]): TransferLogsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[TransferLogsResource]
  }
}

