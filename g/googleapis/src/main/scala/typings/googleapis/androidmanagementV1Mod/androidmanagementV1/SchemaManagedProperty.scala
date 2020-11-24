package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Managed property.
  */
@js.native
trait SchemaManagedProperty extends js.Object {
  
  /**
    * The default value of the property. BUNDLE_ARRAY properties don&#39;t have
    * a default value.
    */
  var defaultValue: js.UndefOr[js.Any] = js.native
  
  /**
    * A longer description of the property, providing more detail of what it
    * affects. Localized.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * For CHOICE or MULTISELECT properties, the list of possible entries.
    */
  var entries: js.UndefOr[js.Array[SchemaManagedPropertyEntry]] = js.native
  
  /**
    * The unique key that the app uses to identify the property, e.g.
    * &quot;com.google.android.gm.fieldname&quot;.
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * For BUNDLE_ARRAY properties, the list of nested properties. A
    * BUNDLE_ARRAY property is at most two levels deep.
    */
  var nestedProperties: js.UndefOr[js.Array[SchemaManagedProperty]] = js.native
  
  /**
    * The name of the property. Localized.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * The type of the property.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaManagedProperty {
  
  @scala.inline
  def apply(): SchemaManagedProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedProperty]
  }
  
  @scala.inline
  implicit class SchemaManagedPropertyOps[Self <: SchemaManagedProperty] (val x: Self) extends AnyVal {
    
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
    def setDefaultValue(value: js.Any): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: SchemaManagedPropertyEntry*): Self = this.set("entries", js.Array(value :_*))
    
    @scala.inline
    def setEntries(value: js.Array[SchemaManagedPropertyEntry]): Self = this.set("entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntries: Self = this.set("entries", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setNestedPropertiesVarargs(value: SchemaManagedProperty*): Self = this.set("nestedProperties", js.Array(value :_*))
    
    @scala.inline
    def setNestedProperties(value: js.Array[SchemaManagedProperty]): Self = this.set("nestedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNestedProperties: Self = this.set("nestedProperties", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
