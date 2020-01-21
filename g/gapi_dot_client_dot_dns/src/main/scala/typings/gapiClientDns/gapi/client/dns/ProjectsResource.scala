package typings.gapiClientDns.gapi.client.dns

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDns.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  /** Fetch the representation of an existing Project. */
  def get(request: AnonAltFieldsKey): Request_[Project]
}

object ProjectsResource {
  @scala.inline
  def apply(get: AnonAltFieldsKey => Request_[Project]): ProjectsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[ProjectsResource]
  }
}

