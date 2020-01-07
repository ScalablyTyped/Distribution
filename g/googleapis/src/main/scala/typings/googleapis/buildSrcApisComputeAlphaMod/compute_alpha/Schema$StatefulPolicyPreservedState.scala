package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration of preserved resources.
  */
@js.native
trait Schema$StatefulPolicyPreservedState extends js.Object {
  /**
    * Disks created on the instances that will be preserved on instance delete,
    * resize down, etc. This map is keyed with the device names of the disks.
    */
  var disks: js.UndefOr[StringDictionary[Schema$StatefulPolicyPreservedStateDiskDevice]] = js.native
}

object Schema$StatefulPolicyPreservedState {
  @scala.inline
  def apply(disks: StringDictionary[Schema$StatefulPolicyPreservedStateDiskDevice] = null): Schema$StatefulPolicyPreservedState = {
    val __obj = js.Dynamic.literal()
    if (disks != null) __obj.updateDynamic("disks")(disks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$StatefulPolicyPreservedState]
  }
}

