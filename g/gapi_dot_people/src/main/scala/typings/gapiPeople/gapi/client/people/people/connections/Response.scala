package typings.gapiPeople.gapi.client.people.people.connections

import typings.gapiPeople.gapi.client.people.Person
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var connections: js.Array[Person]
  var nextPageToken: String
  var nextSyncToken: String
}

object Response {
  @scala.inline
  def apply(connections: js.Array[Person], nextPageToken: String, nextSyncToken: String): Response = {
    val __obj = js.Dynamic.literal(connections = connections.asInstanceOf[js.Any], nextPageToken = nextPageToken.asInstanceOf[js.Any], nextSyncToken = nextSyncToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
}

