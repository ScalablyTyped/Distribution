package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

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
trait SchemaManagedConfigurationsSettings extends js.Object {
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
  var managedProperty: js.UndefOr[js.Array[SchemaManagedProperty]] = js.native
  /**
    * The ID of the managed configurations settings.
    */
  var mcmId: js.UndefOr[String] = js.native
  /**
    * The name of the managed configurations settings.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaManagedConfigurationsSettings {
  @scala.inline
  def apply(): SchemaManagedConfigurationsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedConfigurationsSettings]
  }
  @scala.inline
  implicit class SchemaManagedConfigurationsSettingsOps[Self <: SchemaManagedConfigurationsSettings] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLastUpdatedTimestampMillis(value: String): Self = this.set("lastUpdatedTimestampMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedTimestampMillis: Self = this.set("lastUpdatedTimestampMillis", js.undefined)
    @scala.inline
    def setManagedPropertyVarargs(value: SchemaManagedProperty*): Self = this.set("managedProperty", js.Array(value :_*))
    @scala.inline
    def setManagedProperty(value: js.Array[SchemaManagedProperty]): Self = this.set("managedProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagedProperty: Self = this.set("managedProperty", js.undefined)
    @scala.inline
    def setMcmId(value: String): Self = this.set("mcmId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMcmId: Self = this.set("mcmId", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

