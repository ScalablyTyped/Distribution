package typings.gapiClientFitness.gapi.client.fitness

import typings.gapiClient.gapi.client.Request
import typings.gapiClientFitness.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatasetResource extends js.Object {
  /**
    * Aggregates data of a certain type or stream into buckets divided by a given type of boundary. Multiple data sets of multiple types and from multiple
    * sources can be aggreated into exactly one bucket type per request.
    */
  def aggregate(request: Fields): Request[AggregateResponse] = js.native
}

object DatasetResource {
  @scala.inline
  def apply(aggregate: Fields => Request[AggregateResponse]): DatasetResource = {
    val __obj = js.Dynamic.literal(aggregate = js.Any.fromFunction1(aggregate))
    __obj.asInstanceOf[DatasetResource]
  }
  @scala.inline
  implicit class DatasetResourceOps[Self <: DatasetResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAggregate(value: Fields => Request[AggregateResponse]): Self = this.set("aggregate", js.Any.fromFunction1(value))
  }
  
}

