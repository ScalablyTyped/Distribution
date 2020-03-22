package typings.gapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientBigquerydatatransfer.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferLogsResource extends js.Object {
  /** Returns user facing log messages for the data transfer run. */
  def list(request: AnonBearertoken): Request_[ListTransferLogsResponse]
}

object TransferLogsResource {
  @scala.inline
  def apply(list: AnonBearertoken => Request_[ListTransferLogsResponse]): TransferLogsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[TransferLogsResource]
  }
}

