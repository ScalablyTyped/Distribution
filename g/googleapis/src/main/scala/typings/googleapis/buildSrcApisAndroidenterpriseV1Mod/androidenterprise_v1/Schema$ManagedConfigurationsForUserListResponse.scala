package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The managed configuration resources for the user.
  */
@js.native
trait Schema$ManagedConfigurationsForUserListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#managedConfigurationsForUserListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A managed configuration for an app for a specific user.
    */
  var managedConfigurationForUser: js.UndefOr[js.Array[Schema$ManagedConfiguration]] = js.native
}

object Schema$ManagedConfigurationsForUserListResponse {
  @scala.inline
  def apply(kind: String = null, managedConfigurationForUser: js.Array[Schema$ManagedConfiguration] = null): Schema$ManagedConfigurationsForUserListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (managedConfigurationForUser != null) __obj.updateDynamic("managedConfigurationForUser")(managedConfigurationForUser.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ManagedConfigurationsForUserListResponse]
  }
}

