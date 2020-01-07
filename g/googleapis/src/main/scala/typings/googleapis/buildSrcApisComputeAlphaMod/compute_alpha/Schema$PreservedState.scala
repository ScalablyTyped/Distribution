package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Preserved state for a given instance.
  */
@js.native
trait Schema$PreservedState extends js.Object {
  /**
    * Preserved disks defined for this instance. This map is keyed with the
    * device names of the disks.
    */
  var disks: js.UndefOr[StringDictionary[Schema$PreservedStatePreservedDisk]] = js.native
  /**
    * Preserved metadata defined for this instance.
    */
  var metadata: js.UndefOr[StringDictionary[String]] = js.native
}

object Schema$PreservedState {
  @scala.inline
  def apply(
    disks: StringDictionary[Schema$PreservedStatePreservedDisk] = null,
    metadata: StringDictionary[String] = null
  ): Schema$PreservedState = {
    val __obj = js.Dynamic.literal()
    if (disks != null) __obj.updateDynamic("disks")(disks.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PreservedState]
  }
}

