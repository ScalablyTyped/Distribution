package typings.googleapis.buildSrcApisFitnessV1Mod.fitness_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$AggregateResponse extends js.Object {
  /**
    * A list of buckets containing the aggregated data.
    */
  var bucket: js.UndefOr[js.Array[Schema$AggregateBucket]] = js.native
}

object Schema$AggregateResponse {
  @scala.inline
  def apply(bucket: js.Array[Schema$AggregateBucket] = null): Schema$AggregateResponse = {
    val __obj = js.Dynamic.literal()
    if (bucket != null) __obj.updateDynamic("bucket")(bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AggregateResponse]
  }
}

