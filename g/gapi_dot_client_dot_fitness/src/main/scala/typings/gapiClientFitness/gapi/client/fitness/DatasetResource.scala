package typings.gapiClientFitness.gapi.client.fitness

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientFitness.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatasetResource extends js.Object {
  /**
    * Aggregates data of a certain type or stream into buckets divided by a given type of boundary. Multiple data sets of multiple types and from multiple
    * sources can be aggreated into exactly one bucket type per request.
    */
  def aggregate(request: AnonFields): Request_[AggregateResponse]
}

object DatasetResource {
  @scala.inline
  def apply(aggregate: AnonFields => Request_[AggregateResponse]): DatasetResource = {
    val __obj = js.Dynamic.literal(aggregate = js.Any.fromFunction1(aggregate))
    __obj.asInstanceOf[DatasetResource]
  }
}

