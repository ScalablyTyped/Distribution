package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration information for a single streaming computation.
  */
@js.native
trait Schema$StreamingComputationConfig extends js.Object {
  /**
    * Unique identifier for this computation.
    */
  var computationId: js.UndefOr[String] = js.native
  /**
    * Instructions that comprise the computation.
    */
  var instructions: js.UndefOr[js.Array[Schema$ParallelInstruction]] = js.native
  /**
    * Stage name of this computation.
    */
  var stageName: js.UndefOr[String] = js.native
  /**
    * System defined name for this computation.
    */
  var systemName: js.UndefOr[String] = js.native
  /**
    * Map from user name of stateful transforms in this stage to their state
    * family.
    */
  var transformUserNameToStateFamily: js.UndefOr[StringDictionary[String]] = js.native
}

object Schema$StreamingComputationConfig {
  @scala.inline
  def apply(
    computationId: String = null,
    instructions: js.Array[Schema$ParallelInstruction] = null,
    stageName: String = null,
    systemName: String = null,
    transformUserNameToStateFamily: StringDictionary[String] = null
  ): Schema$StreamingComputationConfig = {
    val __obj = js.Dynamic.literal()
    if (computationId != null) __obj.updateDynamic("computationId")(computationId.asInstanceOf[js.Any])
    if (instructions != null) __obj.updateDynamic("instructions")(instructions.asInstanceOf[js.Any])
    if (stageName != null) __obj.updateDynamic("stageName")(stageName.asInstanceOf[js.Any])
    if (systemName != null) __obj.updateDynamic("systemName")(systemName.asInstanceOf[js.Any])
    if (transformUserNameToStateFamily != null) __obj.updateDynamic("transformUserNameToStateFamily")(transformUserNameToStateFamily.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$StreamingComputationConfig]
  }
}

