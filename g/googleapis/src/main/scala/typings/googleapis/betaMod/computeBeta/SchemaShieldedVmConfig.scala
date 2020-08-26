package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of Shielded VM options.
  */
@js.native
trait SchemaShieldedVmConfig extends js.Object {
  /**
    * Defines whether the instance has integrity monitoring enabled.
    */
  var enableIntegrityMonitoring: js.UndefOr[Boolean] = js.native
  /**
    * Defines whether the instance has Secure Boot enabled.
    */
  var enableSecureBoot: js.UndefOr[Boolean] = js.native
  /**
    * Defines whether the instance has the vTPM enabled.
    */
  var enableVtpm: js.UndefOr[Boolean] = js.native
}

object SchemaShieldedVmConfig {
  @scala.inline
  def apply(): SchemaShieldedVmConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShieldedVmConfig]
  }
  @scala.inline
  implicit class SchemaShieldedVmConfigOps[Self <: SchemaShieldedVmConfig] (val x: Self) extends AnyVal {
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
    def setEnableIntegrityMonitoring(value: Boolean): Self = this.set("enableIntegrityMonitoring", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableIntegrityMonitoring: Self = this.set("enableIntegrityMonitoring", js.undefined)
    @scala.inline
    def setEnableSecureBoot(value: Boolean): Self = this.set("enableSecureBoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableSecureBoot: Self = this.set("enableSecureBoot", js.undefined)
    @scala.inline
    def setEnableVtpm(value: Boolean): Self = this.set("enableVtpm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableVtpm: Self = this.set("enableVtpm", js.undefined)
  }
  
}

