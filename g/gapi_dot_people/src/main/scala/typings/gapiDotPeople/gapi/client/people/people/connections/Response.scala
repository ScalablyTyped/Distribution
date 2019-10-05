package typings.gapiDotPeople.gapi.client.people.people.connections

import typings.gapiDotPeople.gapi.client.people.Person
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
    val __obj = js.Dynamic.literal(connections = connections, nextPageToken = nextPageToken, nextSyncToken = nextSyncToken)
  
    __obj.asInstanceOf[Response]
  }
}

