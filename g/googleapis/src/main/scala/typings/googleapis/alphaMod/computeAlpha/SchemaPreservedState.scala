package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Preserved state for a given instance.
  */
@js.native
trait SchemaPreservedState extends js.Object {
  /**
    * Preserved disks defined for this instance. This map is keyed with the
    * device names of the disks.
    */
  var disks: js.UndefOr[StringDictionary[SchemaPreservedStatePreservedDisk]] = js.native
  /**
    * Preserved metadata defined for this instance.
    */
  var metadata: js.UndefOr[StringDictionary[String]] = js.native
}

object SchemaPreservedState {
  @scala.inline
  def apply(
    disks: StringDictionary[SchemaPreservedStatePreservedDisk] = null,
    metadata: StringDictionary[String] = null
  ): SchemaPreservedState = {
    val __obj = js.Dynamic.literal()
    if (disks != null) __obj.updateDynamic("disks")(disks.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPreservedState]
  }
}

