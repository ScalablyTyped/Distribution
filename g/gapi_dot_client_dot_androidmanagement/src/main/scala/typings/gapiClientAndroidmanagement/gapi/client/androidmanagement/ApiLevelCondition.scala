package typings.gapiClientAndroidmanagement.gapi.client.androidmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiLevelCondition extends js.Object {
  /**
    * The minimum desired Android Framework API level. If the device does not meet the minimum requirement, this condition is satisfied. Must be greater than
    * zero.
    */
  var minApiLevel: js.UndefOr[Double] = js.native
}

object ApiLevelCondition {
  @scala.inline
  def apply(): ApiLevelCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiLevelCondition]
  }
  @scala.inline
  implicit class ApiLevelConditionOps[Self <: ApiLevelCondition] (val x: Self) extends AnyVal {
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

