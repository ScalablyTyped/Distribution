package typings.googleCloudDatastore.requestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitResponse extends js.Object {
  var indexUpdates: Double
  var mutationResults: js.Array[MutationResult]
}

object CommitResponse {
  @scala.inline
  def apply(indexUpdates: Double, mutationResults: js.Array[MutationResult]): CommitResponse = {
    val __obj = js.Dynamic.literal(indexUpdates = indexUpdates.asInstanceOf[js.Any], mutationResults = mutationResults.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CommitResponse]
  }
}

