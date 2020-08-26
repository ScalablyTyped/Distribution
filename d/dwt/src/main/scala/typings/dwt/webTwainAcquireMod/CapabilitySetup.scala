package typings.dwt.webTwainAcquireMod

import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CapabilitySetup extends js.Object {
  /**
    * Specify a capability
    */
  var capability: EnumDWTCap | Double = js.native
  /**
    * The value to set to the capability or the value of the capability after setting.
    */
  var curValue: Double | String = js.native
  var errorCode: js.UndefOr[Double] = js.native
  var errorString: js.UndefOr[String] = js.native
  /**
    * Whether to "ignore" or "fail" the request if an exception occurs when setting this specific capability.
    */
  var exception: js.UndefOr[String] = js.native
}

object CapabilitySetup {
  @scala.inline
  def apply(capability: EnumDWTCap | Double, curValue: Double | String): CapabilitySetup = {
    val __obj = js.Dynamic.literal(capability = capability.asInstanceOf[js.Any], curValue = curValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilitySetup]
  }
  @scala.inline
  implicit class CapabilitySetupOps[Self <: CapabilitySetup] (val x: Self) extends AnyVal {
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
    def setCapability(value: EnumDWTCap | Double): Self = this.set("capability", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurValue(value: Double | String): Self = this.set("curValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorCode(value: Double): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorCode: Self = this.set("errorCode", js.undefined)
    @scala.inline
    def setErrorString(value: String): Self = this.set("errorString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorString: Self = this.set("errorString", js.undefined)
    @scala.inline
    def setException(value: String): Self = this.set("exception", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteException: Self = this.set("exception", js.undefined)
  }
  
}

