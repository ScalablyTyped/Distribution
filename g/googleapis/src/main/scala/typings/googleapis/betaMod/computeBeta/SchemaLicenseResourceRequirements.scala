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
  def apply(
    minGuestCpuCount: js.UndefOr[Double] = js.undefined,
    minMemoryMb: js.UndefOr[Double] = js.undefined
  ): SchemaLicenseResourceRequirements = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(minGuestCpuCount)) __obj.updateDynamic("minGuestCpuCount")(minGuestCpuCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minMemoryMb)) __obj.updateDynamic("minMemoryMb")(minMemoryMb.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLicenseResourceRequirements]
  }
}

