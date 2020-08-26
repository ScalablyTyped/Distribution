package typings.googleapis.cloudiotV1Mod.cloudiotV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for `ListDeviceStates`.
  */
@js.native
trait SchemaListDeviceStatesResponse extends js.Object {
  /**
    * The last few device states. States are listed in descending order of
    * server update time, starting from the most recent one.
    */
  var deviceStates: js.UndefOr[js.Array[SchemaDeviceState]] = js.native
}

object SchemaListDeviceStatesResponse {
  @scala.inline
  def apply(): SchemaListDeviceStatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDeviceStatesResponse]
  }
  @scala.inline
  implicit class SchemaListDeviceStatesResponseOps[Self <: SchemaListDeviceStatesResponse] (val x: Self) extends AnyVal {
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
    def setDeviceStatesVarargs(value: SchemaDeviceState*): Self = this.set("deviceStates", js.Array(value :_*))
    @scala.inline
    def setDeviceStates(value: js.Array[SchemaDeviceState]): Self = this.set("deviceStates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceStates: Self = this.set("deviceStates", js.undefined)
  }
  
}

