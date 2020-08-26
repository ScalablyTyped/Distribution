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
  def apply(): SchemaPreservedState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPreservedState]
  }
  @scala.inline
  implicit class SchemaPreservedStateOps[Self <: SchemaPreservedState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDisks(value: StringDictionary[SchemaPreservedStatePreservedDisk]): Self = this.set("disks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisks: Self = this.set("disks", js.undefined)
    @scala.inline
    def setMetadata(value: StringDictionary[String]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
  
}

