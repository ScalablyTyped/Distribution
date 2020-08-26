package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A managed configuration resource contains the set of managed properties
  * defined by the app developer in the app&#39;s managed configurations
  * schema, as well as any configuration variables defined for the user.
  */
@js.native
trait SchemaManagedConfiguration extends js.Object {
  /**
    * Contains the ID of the managed configuration profile and the set of
    * configuration variables (if any) defined for the user.
    */
  var configurationVariables: js.UndefOr[SchemaConfigurationVariables] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#managedConfiguration&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The set of managed properties for this configuration.
    */
  var managedProperty: js.UndefOr[js.Array[SchemaManagedProperty]] = js.native
  /**
    * The ID of the product that the managed configuration is for, e.g.
    * &quot;app:com.google.android.gm&quot;.
    */
  var productId: js.UndefOr[String] = js.native
}

object SchemaManagedConfiguration {
  @scala.inline
  def apply(): SchemaManagedConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedConfiguration]
  }
  @scala.inline
  implicit class SchemaManagedConfigurationOps[Self <: SchemaManagedConfiguration] (val x: Self) extends AnyVal {
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
    def setConfigurationVariables(value: SchemaConfigurationVariables): Self = this.set("configurationVariables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurationVariables: Self = this.set("configurationVariables", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setManagedPropertyVarargs(value: SchemaManagedProperty*): Self = this.set("managedProperty", js.Array(value :_*))
    @scala.inline
    def setManagedProperty(value: js.Array[SchemaManagedProperty]): Self = this.set("managedProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagedProperty: Self = this.set("managedProperty", js.undefined)
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
  }
  
}

