package typings.gapiClientCivicinfo.gapi.client.civicinfo

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCivicinfo.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DivisionsResource extends js.Object {
  /** Searches for political divisions by their natural name or OCD ID. */
  def search(request: AnonAlt): Request_[DivisionSearchResponse]
}

object DivisionsResource {
  @scala.inline
  def apply(search: AnonAlt => Request_[DivisionSearchResponse]): DivisionsResource = {
    val __obj = js.Dynamic.literal(search = js.Any.fromFunction1(search))
    __obj.asInstanceOf[DivisionsResource]
  }
}

