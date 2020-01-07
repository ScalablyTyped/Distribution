package typings.googleapis.buildSrcApisContainerV1beta1Mod.container_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for returning group information from authenticators.
  */
@js.native
trait Schema$AuthenticatorGroupsConfig extends js.Object {
  /**
    * Whether this cluster should return group membership lookups during
    * authentication using a group of security groups.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * The name of the security group-of-groups to be used. Only relevant if
    * enabled = true.
    */
  var securityGroup: js.UndefOr[String] = js.native
}

object Schema$AuthenticatorGroupsConfig {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, securityGroup: String = null): Schema$AuthenticatorGroupsConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (securityGroup != null) __obj.updateDynamic("securityGroup")(securityGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AuthenticatorGroupsConfig]
  }
}

