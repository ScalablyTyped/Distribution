package typings
package gapiDotPeopleLib.gapiNs.clientNs.peopleNs.peopleNs.connectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var connections: js.Array[gapiDotPeopleLib.gapiNs.clientNs.peopleNs.Person]
  var nextPageToken: java.lang.String
  var nextSyncToken: java.lang.String
}

object Response {
  @scala.inline
  def apply(
    connections: js.Array[gapiDotPeopleLib.gapiNs.clientNs.peopleNs.Person],
    nextPageToken: java.lang.String,
    nextSyncToken: java.lang.String
  ): Response = {
    val __obj = js.Dynamic.literal(connections = connections, nextPageToken = nextPageToken, nextSyncToken = nextSyncToken)
  
    __obj.asInstanceOf[Response]
  }
}

