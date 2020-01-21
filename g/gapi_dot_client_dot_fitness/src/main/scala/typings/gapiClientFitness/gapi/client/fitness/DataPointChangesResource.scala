package typings.gapiClientFitness.gapi.client.fitness

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientFitness.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataPointChangesResource extends js.Object {
  /** Queries for user's data point changes for a particular data source. */
  def list(request: AnonAlt): Request_[ListDataPointChangesResponse]
}

object DataPointChangesResource {
  @scala.inline
  def apply(list: AnonAlt => Request_[ListDataPointChangesResponse]): DataPointChangesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[DataPointChangesResource]
  }
}

