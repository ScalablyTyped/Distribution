package typings.gapiClientKgsearch.gapi.client.kgsearch

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientKgsearch.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntitiesResource extends js.Object {
  /**
    * Searches Knowledge Graph for entities that match the constraints.
    * A list of matched entities will be returned in response, which will be in
    * JSON-LD format and compatible with http://schema.org
    */
  def search(request: AnonAccesstoken): Request_[SearchResponse]
}

object EntitiesResource {
  @scala.inline
  def apply(search: AnonAccesstoken => Request_[SearchResponse]): EntitiesResource = {
    val __obj = js.Dynamic.literal(search = js.Any.fromFunction1(search))
  
    __obj.asInstanceOf[EntitiesResource]
  }
}

