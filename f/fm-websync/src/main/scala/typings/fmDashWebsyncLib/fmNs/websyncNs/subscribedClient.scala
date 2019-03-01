package typings
package fmDashWebsyncLib.fmNs.websyncNs

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
  var id: java.lang.String
}

object subscribedClient {
  @scala.inline
  def apply(boundRecords: js.Any, id: java.lang.String): subscribedClient = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("boundRecords")(boundRecords)
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[subscribedClient]
  }
}

