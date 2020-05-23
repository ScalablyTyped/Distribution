package typings.gapiClientFitness.gapi.client.fitness

import typings.gapiClient.gapi.client.Request
import typings.gapiClientFitness.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataPointChangesResource extends js.Object {
  /** Queries for user's data point changes for a particular data source. */
  def list(request: Alt): Request[ListDataPointChangesResponse]
}

object DataPointChangesResource {
  @scala.inline
  def apply(list: Alt => Request[ListDataPointChangesResponse]): DataPointChangesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[DataPointChangesResource]
  }
}

