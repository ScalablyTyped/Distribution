package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A managed configuration resource contains the set of managed properties
  * defined by the app developer in the app&#39;s managed configurations
  * schema, as well as any configuration variables defined for the user.
  */
@js.native
trait Schema$ManagedConfiguration extends js.Object {
  /**
    * Contains the ID of the managed configuration profile and the set of
    * configuration variables (if any) defined for the user.
    */
  var configurationVariables: js.UndefOr[Schema$ConfigurationVariables] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#managedConfiguration&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The set of managed properties for this configuration.
    */
  var managedProperty: js.UndefOr[js.Array[Schema$ManagedProperty]] = js.native
  /**
    * The ID of the product that the managed configuration is for, e.g.
    * &quot;app:com.google.android.gm&quot;.
    */
  var productId: js.UndefOr[String] = js.native
}

object Schema$ManagedConfiguration {
  @scala.inline
  def apply(
    configurationVariables: Schema$ConfigurationVariables = null,
    kind: String = null,
    managedProperty: js.Array[Schema$ManagedProperty] = null,
    productId: String = null
  ): Schema$ManagedConfiguration = {
    val __obj = js.Dynamic.literal()
    if (configurationVariables != null) __obj.updateDynamic("configurationVariables")(configurationVariables.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (managedProperty != null) __obj.updateDynamic("managedProperty")(managedProperty.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ManagedConfiguration]
  }
}

