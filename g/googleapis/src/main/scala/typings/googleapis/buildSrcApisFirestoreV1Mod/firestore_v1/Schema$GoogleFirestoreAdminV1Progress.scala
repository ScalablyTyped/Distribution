package typings.googleapis.buildSrcApisFirestoreV1Mod.firestore_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the progress of the operation. Unit of work is generic and must
  * be interpreted based on where Progress is used.
  */
@js.native
trait Schema$GoogleFirestoreAdminV1Progress extends js.Object {
  /**
    * The amount of work completed.
    */
  var completedWork: js.UndefOr[String] = js.native
  /**
    * The amount of work estimated.
    */
  var estimatedWork: js.UndefOr[String] = js.native
}

object Schema$GoogleFirestoreAdminV1Progress {
  @scala.inline
  def apply(completedWork: String = null, estimatedWork: String = null): Schema$GoogleFirestoreAdminV1Progress = {
    val __obj = js.Dynamic.literal()
    if (completedWork != null) __obj.updateDynamic("completedWork")(completedWork.asInstanceOf[js.Any])
    if (estimatedWork != null) __obj.updateDynamic("estimatedWork")(estimatedWork.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleFirestoreAdminV1Progress]
  }
}

