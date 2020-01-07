package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional information about how a Cloud Dataflow job will be executed that
  * isn&#39;t contained in the submitted job.
  */
@js.native
trait Schema$JobExecutionInfo extends js.Object {
  /**
    * A mapping from each stage to the information about that stage.
    */
  var stages: js.UndefOr[StringDictionary[Schema$JobExecutionStageInfo]] = js.native
}

object Schema$JobExecutionInfo {
  @scala.inline
  def apply(stages: StringDictionary[Schema$JobExecutionStageInfo] = null): Schema$JobExecutionInfo = {
    val __obj = js.Dynamic.literal()
    if (stages != null) __obj.updateDynamic("stages")(stages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$JobExecutionInfo]
  }
}

