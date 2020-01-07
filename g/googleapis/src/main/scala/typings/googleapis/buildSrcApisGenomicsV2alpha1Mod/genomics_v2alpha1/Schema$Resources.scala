package typings.googleapis.buildSrcApisGenomicsV2alpha1Mod.genomics_v2alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The system resources for the pipeline run.  At least one zone or region
  * must be specified or the pipeline run will fail.
  */
@js.native
trait Schema$Resources extends js.Object {
  /**
    * The project ID to allocate resources in.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * The list of regions allowed for VM allocation. If set, the `zones` field
    * must not be set.
    */
  var regions: js.UndefOr[js.Array[String]] = js.native
  /**
    * The virtual machine specification.
    */
  var virtualMachine: js.UndefOr[Schema$VirtualMachine] = js.native
  /**
    * The list of zones allowed for VM allocation. If set, the `regions` field
    * must not be set.
    */
  var zones: js.UndefOr[js.Array[String]] = js.native
}

object Schema$Resources {
  @scala.inline
  def apply(
    projectId: String = null,
    regions: js.Array[String] = null,
    virtualMachine: Schema$VirtualMachine = null,
    zones: js.Array[String] = null
  ): Schema$Resources = {
    val __obj = js.Dynamic.literal()
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (regions != null) __obj.updateDynamic("regions")(regions.asInstanceOf[js.Any])
    if (virtualMachine != null) __obj.updateDynamic("virtualMachine")(virtualMachine.asInstanceOf[js.Any])
    if (zones != null) __obj.updateDynamic("zones")(zones.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Resources]
  }
}

