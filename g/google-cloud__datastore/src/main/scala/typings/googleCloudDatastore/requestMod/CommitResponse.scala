package typings.googleCloudDatastore.requestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommitResponse extends js.Object {
  var indexUpdates: Double = js.native
  var mutationResults: js.Array[MutationResult] = js.native
}

object CommitResponse {
  @scala.inline
  def apply(indexUpdates: Double, mutationResults: js.Array[MutationResult]): CommitResponse = {
    val __obj = js.Dynamic.literal(indexUpdates = indexUpdates.asInstanceOf[js.Any], mutationResults = mutationResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitResponse]
  }
  @scala.inline
  implicit class CommitResponseOps[Self <: CommitResponse] (val x: Self) extends AnyVal {
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
    def setIndexUpdates(value: Double): Self = this.set("indexUpdates", value.asInstanceOf[js.Any])
    @scala.inline
    def setMutationResultsVarargs(value: MutationResult*): Self = this.set("mutationResults", js.Array(value :_*))
    @scala.inline
    def setMutationResults(value: js.Array[MutationResult]): Self = this.set("mutationResults", value.asInstanceOf[js.Any])
  }
  
}

