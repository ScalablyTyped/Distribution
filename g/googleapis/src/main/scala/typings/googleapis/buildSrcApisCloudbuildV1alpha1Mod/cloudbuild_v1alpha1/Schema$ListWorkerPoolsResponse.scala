package typings.googleapis.buildSrcApisCloudbuildV1alpha1Mod.cloudbuild_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response containing existing `WorkerPools`.
  */
@js.native
trait Schema$ListWorkerPoolsResponse extends js.Object {
  /**
    * `WorkerPools` for the project.
    */
  var workerPools: js.UndefOr[js.Array[Schema$WorkerPool]] = js.native
}

object Schema$ListWorkerPoolsResponse {
  @scala.inline
  def apply(workerPools: js.Array[Schema$WorkerPool] = null): Schema$ListWorkerPoolsResponse = {
    val __obj = js.Dynamic.literal()
    if (workerPools != null) __obj.updateDynamic("workerPools")(workerPools.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListWorkerPoolsResponse]
  }
}

