package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ExecutionStageSummary extends js.Object {
  /** Collections produced and consumed by component transforms of this stage. */
  var componentSource: js.UndefOr[js.Array[ComponentSource]] = js.undefined
  /** Transforms that comprise this execution stage. */
  var componentTransform: js.UndefOr[js.Array[ComponentTransform]] = js.undefined
  /** Dataflow service generated id for this stage. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Input sources for this stage. */
  var inputSource: js.UndefOr[js.Array[StageSource]] = js.undefined
  /** Type of tranform this stage is executing. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Dataflow service generated name for this stage. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Output sources for this stage. */
  var outputSource: js.UndefOr[js.Array[StageSource]] = js.undefined
}

