package typings.gapiClientFitness.gapi.client.fitness

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AggregateResponse extends js.Object {
  /** A list of buckets containing the aggregated data. */
  var bucket: js.UndefOr[js.Array[AggregateBucket]] = js.native
}

object AggregateResponse {
  @scala.inline
  def apply(): AggregateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregateResponse]
  }
  @scala.inline
  implicit class AggregateResponseOps[Self <: AggregateResponse] (val x: Self) extends AnyVal {
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
    def setBucketVarargs(value: AggregateBucket*): Self = this.set("bucket", js.Array(value :_*))
    @scala.inline
    def setBucket(value: js.Array[AggregateBucket]): Self = this.set("bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucket: Self = this.set("bucket", js.undefined)
  }
  
}

