package typings
package fmDashWebsyncLib.fmNs.websyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait baseResponseArgs extends baseArgs {
  /**
    * The singleton client.
    */
  var client: fmDashWebsyncLib.fmNs.websyncNs.client
  /**
    * The ID of the singleton client.
    */
  var clientId: java.lang.String
  /**
    * Extra meta data associated with the request/response.
    */
  var meta: js.Any
  /**
    * The date/time the message was processed on the server.
    */
  var timestamp: stdLib.Date
}

object baseResponseArgs {
  @scala.inline
  def apply(client: client, clientId: java.lang.String, meta: js.Any, timestamp: stdLib.Date): baseResponseArgs = {
    val __obj = js.Dynamic.literal(client = client, clientId = clientId, meta = meta, timestamp = timestamp)
  
    __obj.asInstanceOf[baseResponseArgs]
  }
}

