package typings.fmWebsync.fm.websync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait subscribedClient extends js.Object {
  /**
    * The subscribed client's bound records.
    */
  var boundRecords: js.Any
  /**
    * The subscribed client's unique identifier.
    */
  var id: String
}

object subscribedClient {
  @scala.inline
  def apply(boundRecords: js.Any, id: String): subscribedClient = {
    val __obj = js.Dynamic.literal(boundRecords = boundRecords.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[subscribedClient]
  }
}

