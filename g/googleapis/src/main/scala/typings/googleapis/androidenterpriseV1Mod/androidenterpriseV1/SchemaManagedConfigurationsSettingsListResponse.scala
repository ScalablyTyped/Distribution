package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The managed configurations settings for a product.
  */
@js.native
trait SchemaManagedConfigurationsSettingsListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#managedConfigurationsSettingsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A managed configurations settings for an app that may be assigned to a
    * group of users in an enterprise.
    */
  var managedConfigurationsSettings: js.UndefOr[js.Array[SchemaManagedConfigurationsSettings]] = js.native
}

object SchemaManagedConfigurationsSettingsListResponse {
  @scala.inline
  def apply(
    kind: String = null,
    managedConfigurationsSettings: js.Array[SchemaManagedConfigurationsSettings] = null
  ): SchemaManagedConfigurationsSettingsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (managedConfigurationsSettings != null) __obj.updateDynamic("managedConfigurationsSettings")(managedConfigurationsSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaManagedConfigurationsSettingsListResponse]
  }
}

