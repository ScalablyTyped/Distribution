package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLicenseResourceRequirements extends js.Object {
  /**
    * Minimum number of guest cpus required to use the Instance. Enforced at
    * Instance creation and Instance start.
    */
  var minGuestCpuCount: js.UndefOr[Double] = js.native
  /**
    * Minimum memory required to use the Instance. Enforced at Instance
    * creation and Instance start.
    */
  var minMemoryMb: js.UndefOr[Double] = js.native
}

object SchemaLicenseResourceRequirements {
  @scala.inline
  def apply(): SchemaLicenseResourceRequirements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLicenseResourceRequirements]
  }
  @scala.inline
  implicit class SchemaLicenseResourceRequirementsOps[Self <: SchemaLicenseResourceRequirements] (val x: Self) extends AnyVal {
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
    def setMinGuestCpuCount(value: Double): Self = this.set("minGuestCpuCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinGuestCpuCount: Self = this.set("minGuestCpuCount", js.undefined)
    @scala.inline
    def setMinMemoryMb(value: Double): Self = this.set("minMemoryMb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinMemoryMb: Self = this.set("minMemoryMb", js.undefined)
  }
  
}

