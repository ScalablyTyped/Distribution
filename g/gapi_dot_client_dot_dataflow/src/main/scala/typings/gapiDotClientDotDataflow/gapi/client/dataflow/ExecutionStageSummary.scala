package typings.gapiDotClientDotDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutionStageSummary extends js.Object {
  /** Collections produced and consumed by component transforms of this stage. */
  var componentSource: js.UndefOr[js.Array[ComponentSource]] = js.undefined
  /** Transforms that comprise this execution stage. */
  var componentTransform: js.UndefOr[js.Array[ComponentTransform]] = js.undefined
  /** Dataflow service generated id for this stage. */
  var id: js.UndefOr[String] = js.undefined
  /** Input sources for this stage. */
  var inputSource: js.UndefOr[js.Array[StageSource]] = js.undefined
  /** Type of tranform this stage is executing. */
  var kind: js.UndefOr[String] = js.undefined
  /** Dataflow service generated name for this stage. */
  var name: js.UndefOr[String] = js.undefined
  /** Output sources for this stage. */
  var outputSource: js.UndefOr[js.Array[StageSource]] = js.undefined
}

object ExecutionStageSummary {
  @scala.inline
  def apply(
    componentSource: js.Array[ComponentSource] = null,
    componentTransform: js.Array[ComponentTransform] = null,
    id: String = null,
    inputSource: js.Array[StageSource] = null,
    kind: String = null,
    name: String = null,
    outputSource: js.Array[StageSource] = null
  ): ExecutionStageSummary = {
    val __obj = js.Dynamic.literal()
    if (componentSource != null) __obj.updateDynamic("componentSource")(componentSource.asInstanceOf[js.Any])
    if (componentTransform != null) __obj.updateDynamic("componentTransform")(componentTransform.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inputSource != null) __obj.updateDynamic("inputSource")(inputSource.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (outputSource != null) __obj.updateDynamic("outputSource")(outputSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionStageSummary]
  }
}

