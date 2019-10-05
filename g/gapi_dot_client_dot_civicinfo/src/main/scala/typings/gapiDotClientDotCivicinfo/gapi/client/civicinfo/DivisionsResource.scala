package typings.gapiDotClientDotCivicinfo.gapi.client.civicinfo

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotCivicinfo.Anon_Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DivisionsResource extends js.Object {
  /** Searches for political divisions by their natural name or OCD ID. */
  def search(request: Anon_Alt): Request[DivisionSearchResponse]
}

object DivisionsResource {
  @scala.inline
  def apply(search: Anon_Alt => Request[DivisionSearchResponse]): DivisionsResource = {
    val __obj = js.Dynamic.literal(search = js.Any.fromFunction1(search))
  
    __obj.asInstanceOf[DivisionsResource]
  }
}

