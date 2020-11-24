package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaPerInstanceConfig extends js.Object {
  
  /**
    * Fingerprint of this per-instance config. This field may be used in
    * optimistic locking. It will be ignored when inserting a per-instance
    * config. An up-to-date fingerprint must be provided in order to update an
    * existing per-instance config or the field needs to be unset.
    */
  var fingerprint: js.UndefOr[String] = js.native
  
  /**
    * The URL of the instance. Serves as a merge key during
    * UpdatePerInstanceConfigs operation, i.e. if per-instance config with the
    * same instance URL exists then it will be updated, otherwise a new one
    * will be created.
    */
  var instance: js.UndefOr[String] = js.native
  
  /**
    * The name of the per-instance config and the corresponding instance.
    * Serves as a merge key during UpdatePerInstanceConfigs operation, i.e. if
    * per-instance config with the same name exists then it will be updated,
    * otherwise a new one will be created for the VM instance with the same
    * name. An attempt to create a per-instance config for a VM instance that
    * either doesn&#39;t exist or is not part of the group will result in a
    * failure.
    */
  var name: js.UndefOr[String] = js.native
  
  var `override`: js.UndefOr[SchemaManagedInstanceOverride] = js.native
  
  /**
    * Intended preserved state for the given instance. Does not contain state
    * generated based on Stateful Policy.
    */
  var preservedState: js.UndefOr[SchemaPreservedState] = js.native
}
object SchemaPerInstanceConfig {
  
  @scala.inline
  def apply(): SchemaPerInstanceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPerInstanceConfig]
  }
  
  @scala.inline
  implicit class SchemaPerInstanceConfigOps[Self <: SchemaPerInstanceConfig] (val x: Self) extends AnyVal {
    
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
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFingerprint: Self = this.set("fingerprint", js.undefined)
    
    @scala.inline
    def setInstance(value: String): Self = this.set("instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstance: Self = this.set("instance", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOverride(value: SchemaManagedInstanceOverride): Self = this.set("override", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverride: Self = this.set("override", js.undefined)
    
    @scala.inline
    def setPreservedState(value: SchemaPreservedState): Self = this.set("preservedState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreservedState: Self = this.set("preservedState", js.undefined)
  }
}
