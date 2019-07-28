package typings.gapiDotClientDotFitness.gapiNs.clientNs.fitnessNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotFitness.Anon_AltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatasetResource extends js.Object {
  /**
    * Aggregates data of a certain type or stream into buckets divided by a given type of boundary. Multiple data sets of multiple types and from multiple
    * sources can be aggreated into exactly one bucket type per request.
    */
  def aggregate(request: Anon_AltFields): Request[AggregateResponse]
}

object DatasetResource {
  @scala.inline
  def apply(aggregate: Anon_AltFields => Request[AggregateResponse]): DatasetResource = {
    val __obj = js.Dynamic.literal(aggregate = js.Any.fromFunction1(aggregate))
  
    __obj.asInstanceOf[DatasetResource]
  }
}

