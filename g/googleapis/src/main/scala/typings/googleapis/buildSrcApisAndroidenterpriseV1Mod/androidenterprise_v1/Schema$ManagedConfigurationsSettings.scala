package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A managed configurations settings resource contains the set of managed
  * properties that have been configured for an Android app to be applied to a
  * set of users. The app&#39;s developer would have defined configurable
  * properties in the managed configurations schema.
  */
@js.native
trait Schema$ManagedConfigurationsSettings extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#managedConfigurationsSettings&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The last updated time of the managed configuration settings in
    * milliseconds since 1970-01-01T00:00:00Z.
    */
  var lastUpdatedTimestampMillis: js.UndefOr[String] = js.native
  /**
    * The set of managed properties for this configuration.
    */
  var managedProperty: js.UndefOr[js.Array[Schema$ManagedProperty]] = js.native
  /**
    * The ID of the managed configurations settings.
    */
  var mcmId: js.UndefOr[String] = js.native
  /**
    * The name of the managed configurations settings.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$ManagedConfigurationsSettings {
  @scala.inline
  def apply(
    kind: String = null,
    lastUpdatedTimestampMillis: String = null,
    managedProperty: js.Array[Schema$ManagedProperty] = null,
    mcmId: String = null,
    name: String = null
  ): Schema$ManagedConfigurationsSettings = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lastUpdatedTimestampMillis != null) __obj.updateDynamic("lastUpdatedTimestampMillis")(lastUpdatedTimestampMillis.asInstanceOf[js.Any])
    if (managedProperty != null) __obj.updateDynamic("managedProperty")(managedProperty.asInstanceOf[js.Any])
    if (mcmId != null) __obj.updateDynamic("mcmId")(mcmId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ManagedConfigurationsSettings]
  }
}

