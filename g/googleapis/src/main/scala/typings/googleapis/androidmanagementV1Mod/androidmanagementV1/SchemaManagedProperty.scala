package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Managed property.
  */
trait SchemaManagedProperty extends StObject {
  
  /**
    * The default value of the property. BUNDLE_ARRAY properties don&#39;t have
    * a default value.
    */
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  
  /**
    * A longer description of the property, providing more detail of what it
    * affects. Localized.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * For CHOICE or MULTISELECT properties, the list of possible entries.
    */
  var entries: js.UndefOr[js.Array[SchemaManagedPropertyEntry]] = js.undefined
  
  /**
    * The unique key that the app uses to identify the property, e.g.
    * &quot;com.google.android.gm.fieldname&quot;.
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * For BUNDLE_ARRAY properties, the list of nested properties. A
    * BUNDLE_ARRAY property is at most two levels deep.
    */
  var nestedProperties: js.UndefOr[js.Array[SchemaManagedProperty]] = js.undefined
  
  /**
    * The name of the property. Localized.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the property.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaManagedProperty {
  
  @scala.inline
  def apply(): SchemaManagedProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedProperty]
  }
  
  @scala.inline
  implicit class SchemaManagedPropertyMutableBuilder[Self <: SchemaManagedProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEntries(value: js.Array[SchemaManagedPropertyEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: SchemaManagedPropertyEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setNestedProperties(value: js.Array[SchemaManagedProperty]): Self = StObject.set(x, "nestedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNestedPropertiesUndefined: Self = StObject.set(x, "nestedProperties", js.undefined)
    
    @scala.inline
    def setNestedPropertiesVarargs(value: SchemaManagedProperty*): Self = StObject.set(x, "nestedProperties", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
