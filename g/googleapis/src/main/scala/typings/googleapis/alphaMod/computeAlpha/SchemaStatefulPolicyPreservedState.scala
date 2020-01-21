package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration of preserved resources.
  */
@js.native
trait SchemaStatefulPolicyPreservedState extends js.Object {
  /**
    * Disks created on the instances that will be preserved on instance delete,
    * resize down, etc. This map is keyed with the device names of the disks.
    */
  var disks: js.UndefOr[StringDictionary[SchemaStatefulPolicyPreservedStateDiskDevice]] = js.native
}

object SchemaStatefulPolicyPreservedState {
  @scala.inline
  def apply(disks: StringDictionary[SchemaStatefulPolicyPreservedStateDiskDevice] = null): SchemaStatefulPolicyPreservedState = {
    val __obj = js.Dynamic.literal()
    if (disks != null) __obj.updateDynamic("disks")(disks.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaStatefulPolicyPreservedState]
  }
}

