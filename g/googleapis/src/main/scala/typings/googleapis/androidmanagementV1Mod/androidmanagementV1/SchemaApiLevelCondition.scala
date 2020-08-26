package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A compliance rule condition which is satisfied if the Android Framework API
  * level on the device doesn&#39;t meet a minimum requirement. There can only
  * be one rule with this type of condition per policy.
  */
@js.native
trait SchemaApiLevelCondition extends js.Object {
  /**
    * The minimum desired Android Framework API level. If the device
    * doesn&#39;t meet the minimum requirement, this condition is satisfied.
    * Must be greater than zero.
    */
  var minApiLevel: js.UndefOr[Double] = js.native
}

object SchemaApiLevelCondition {
  @scala.inline
  def apply(): SchemaApiLevelCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApiLevelCondition]
  }
  @scala.inline
  implicit class SchemaApiLevelConditionOps[Self <: SchemaApiLevelCondition] (val x: Self) extends AnyVal {
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
    def setMinApiLevel(value: Double): Self = this.set("minApiLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinApiLevel: Self = this.set("minApiLevel", js.undefined)
  }
  
}

