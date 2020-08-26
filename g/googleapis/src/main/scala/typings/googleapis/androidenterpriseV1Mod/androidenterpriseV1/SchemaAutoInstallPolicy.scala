package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAutoInstallPolicy extends js.Object {
  /**
    * The constraints for auto-installing the app. You can specify a maximum of
    * one constraint.
    */
  var autoInstallConstraint: js.UndefOr[js.Array[SchemaAutoInstallConstraint]] = js.native
  /**
    * The auto-install mode. If unset defaults to &quot;doNotAutoInstall&quot;.
    */
  var autoInstallMode: js.UndefOr[String] = js.native
  /**
    * The priority of the install, as an unsigned integer. A lower number means
    * higher priority.
    */
  var autoInstallPriority: js.UndefOr[Double] = js.native
  /**
    * The minimum version of the app. If a lower version of the app is
    * installed, then the app will be auto-updated according to the
    * auto-install constraints, instead of waiting for the regular auto-update.
    */
  var minimumVersionCode: js.UndefOr[Double] = js.native
}

object SchemaAutoInstallPolicy {
  @scala.inline
  def apply(): SchemaAutoInstallPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoInstallPolicy]
  }
  @scala.inline
  implicit class SchemaAutoInstallPolicyOps[Self <: SchemaAutoInstallPolicy] (val x: Self) extends AnyVal {
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
    def setAutoInstallConstraintVarargs(value: SchemaAutoInstallConstraint*): Self = this.set("autoInstallConstraint", js.Array(value :_*))
    @scala.inline
    def setAutoInstallConstraint(value: js.Array[SchemaAutoInstallConstraint]): Self = this.set("autoInstallConstraint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoInstallConstraint: Self = this.set("autoInstallConstraint", js.undefined)
    @scala.inline
    def setAutoInstallMode(value: String): Self = this.set("autoInstallMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoInstallMode: Self = this.set("autoInstallMode", js.undefined)
    @scala.inline
    def setAutoInstallPriority(value: Double): Self = this.set("autoInstallPriority", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoInstallPriority: Self = this.set("autoInstallPriority", js.undefined)
    @scala.inline
    def setMinimumVersionCode(value: Double): Self = this.set("minimumVersionCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumVersionCode: Self = this.set("minimumVersionCode", js.undefined)
  }
  
}

