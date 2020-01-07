package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * All configuration data for a particular Computation.
  */
@js.native
trait Schema$ComputationTopology extends js.Object {
  /**
    * The ID of the computation.
    */
  var computationId: js.UndefOr[String] = js.native
  /**
    * The inputs to the computation.
    */
  var inputs: js.UndefOr[js.Array[Schema$StreamLocation]] = js.native
  /**
    * The key ranges processed by the computation.
    */
  var keyRanges: js.UndefOr[js.Array[Schema$KeyRangeLocation]] = js.native
  /**
    * The outputs from the computation.
    */
  var outputs: js.UndefOr[js.Array[Schema$StreamLocation]] = js.native
  /**
    * The state family values.
    */
  var stateFamilies: js.UndefOr[js.Array[Schema$StateFamilyConfig]] = js.native
  /**
    * The system stage name.
    */
  var systemStageName: js.UndefOr[String] = js.native
}

object Schema$ComputationTopology {
  @scala.inline
  def apply(
    computationId: String = null,
    inputs: js.Array[Schema$StreamLocation] = null,
    keyRanges: js.Array[Schema$KeyRangeLocation] = null,
    outputs: js.Array[Schema$StreamLocation] = null,
    stateFamilies: js.Array[Schema$StateFamilyConfig] = null,
    systemStageName: String = null
  ): Schema$ComputationTopology = {
    val __obj = js.Dynamic.literal()
    if (computationId != null) __obj.updateDynamic("computationId")(computationId.asInstanceOf[js.Any])
    if (inputs != null) __obj.updateDynamic("inputs")(inputs.asInstanceOf[js.Any])
    if (keyRanges != null) __obj.updateDynamic("keyRanges")(keyRanges.asInstanceOf[js.Any])
    if (outputs != null) __obj.updateDynamic("outputs")(outputs.asInstanceOf[js.Any])
    if (stateFamilies != null) __obj.updateDynamic("stateFamilies")(stateFamilies.asInstanceOf[js.Any])
    if (systemStageName != null) __obj.updateDynamic("systemStageName")(systemStageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ComputationTopology]
  }
}

