package typings.gapiClientFitness.gapi.client.fitness

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AggregateResponse extends js.Object {
  /** A list of buckets containing the aggregated data. */
  var bucket: js.UndefOr[js.Array[AggregateBucket]] = js.undefined
}

object AggregateResponse {
  @scala.inline
  def apply(bucket: js.Array[AggregateBucket] = null): AggregateResponse = {
    val __obj = js.Dynamic.literal()
    if (bucket != null) __obj.updateDynamic("bucket")(bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregateResponse]
  }
}

