package typings.fmDashWebsync.fmNs.websyncNs

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait baseResponseArgs extends baseArgs {
  /**
    * The singleton client.
    */
  var client: typings.fmDashWebsync.fmNs.websyncNs.client
  /**
    * The ID of the singleton client.
    */
  var clientId: String
  /**
    * Extra meta data associated with the request/response.
    */
  var meta: js.Any
  /**
    * The date/time the message was processed on the server.
    */
  var timestamp: Date
}

object baseResponseArgs {
  @scala.inline
  def apply(
    client: client,
    clientId: String,
    meta: js.Any,
    timestamp: Date,
    StringDictionary: StringDictionary[js.Any] = null
  ): baseResponseArgs = {
    val __obj = js.Dynamic.literal(client = client, clientId = clientId, meta = meta, timestamp = timestamp)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[baseResponseArgs]
  }
}

