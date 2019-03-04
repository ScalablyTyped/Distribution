package typings
package gapiDotClientDotKgsearchLib.gapiNs.clientNs.kgsearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntitiesResource extends js.Object {
  /**
    * Searches Knowledge Graph for entities that match the constraints.
    * A list of matched entities will be returned in response, which will be in
    * JSON-LD format and compatible with http://schema.org
    */
  def search(request: gapiDotClientDotKgsearchLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[SearchResponse]
}

object EntitiesResource {
  @scala.inline
  def apply(
    search: js.Function1[
      gapiDotClientDotKgsearchLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[SearchResponse]
    ]
  ): EntitiesResource = {
    val __obj = js.Dynamic.literal(search = search)
  
    __obj.asInstanceOf[EntitiesResource]
  }
}

