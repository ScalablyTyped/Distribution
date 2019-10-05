package typings.gapiDotClientDotAdexchangeseller.gapi.client.adexchangeseller

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAdexchangeseller.Anon_AccountIdAltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DimensionsResource extends js.Object {
  /** List the metadata for the dimensions available to this AdExchange account. */
  def list(request: Anon_AccountIdAltFields): Request[Metadata]
}

object DimensionsResource {
  @scala.inline
  def apply(list: Anon_AccountIdAltFields => Request[Metadata]): DimensionsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[DimensionsResource]
  }
}

