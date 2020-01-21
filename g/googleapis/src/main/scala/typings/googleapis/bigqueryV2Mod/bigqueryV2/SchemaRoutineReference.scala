package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaRoutineReference extends js.Object {
  /**
    * [Required] The ID of the dataset containing this routine.
    */
  var datasetId: js.UndefOr[String] = js.native
  /**
    * [Required] The ID of the project containing this routine.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * [Required] The ID of the routine. The ID must contain only letters (a-z,
    * A-Z), numbers (0-9), or underscores (_). The maximum length is 256
    * characters.
    */
  var routineId: js.UndefOr[String] = js.native
}

object SchemaRoutineReference {
  @scala.inline
  def apply(datasetId: String = null, projectId: String = null, routineId: String = null): SchemaRoutineReference = {
    val __obj = js.Dynamic.literal()
    if (datasetId != null) __obj.updateDynamic("datasetId")(datasetId.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (routineId != null) __obj.updateDynamic("routineId")(routineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRoutineReference]
  }
}

