package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppRestrictionsSchemaRestriction extends StObject {
  
  /**
    * The default value of the restriction. bundle and bundleArray restrictions never have a default value.
    */
  var defaultValue: js.UndefOr[SchemaAppRestrictionsSchemaRestrictionRestrictionValue] = js.undefined
  
  /**
    * A longer description of the restriction, giving more detail of what it affects.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * For choice or multiselect restrictions, the list of possible entries' human-readable names.
    */
  var entry: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * For choice or multiselect restrictions, the list of possible entries' machine-readable values. These values should be used in the configuration, either as a single string value for a choice restriction or in a stringArray for a multiselect restriction.
    */
  var entryValue: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The unique key that the product uses to identify the restriction, e.g. "com.google.android.gm.fieldname".
    */
  var key: js.UndefOr[String | Null] = js.undefined
  
  /**
    * For bundle or bundleArray restrictions, the list of nested restrictions. A bundle restriction is always nested within a bundleArray restriction, and a bundleArray restriction is at most two levels deep.
    */
  var nestedRestriction: js.UndefOr[js.Array[SchemaAppRestrictionsSchemaRestriction]] = js.undefined
  
  /**
    * The type of the restriction.
    */
  var restrictionType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the restriction.
    */
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaAppRestrictionsSchemaRestriction {
  
  inline def apply(): SchemaAppRestrictionsSchemaRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppRestrictionsSchemaRestriction]
  }
  
  extension [Self <: SchemaAppRestrictionsSchemaRestriction](x: Self) {
    
    inline def setDefaultValue(value: SchemaAppRestrictionsSchemaRestrictionRestrictionValue): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEntry(value: js.Array[String]): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    
    inline def setEntryNull: Self = StObject.set(x, "entry", null)
    
    inline def setEntryUndefined: Self = StObject.set(x, "entry", js.undefined)
    
    inline def setEntryValue(value: js.Array[String]): Self = StObject.set(x, "entryValue", value.asInstanceOf[js.Any])
    
    inline def setEntryValueNull: Self = StObject.set(x, "entryValue", null)
    
    inline def setEntryValueUndefined: Self = StObject.set(x, "entryValue", js.undefined)
    
    inline def setEntryValueVarargs(value: String*): Self = StObject.set(x, "entryValue", js.Array(value*))
    
    inline def setEntryVarargs(value: String*): Self = StObject.set(x, "entry", js.Array(value*))
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setNestedRestriction(value: js.Array[SchemaAppRestrictionsSchemaRestriction]): Self = StObject.set(x, "nestedRestriction", value.asInstanceOf[js.Any])
    
    inline def setNestedRestrictionUndefined: Self = StObject.set(x, "nestedRestriction", js.undefined)
    
    inline def setNestedRestrictionVarargs(value: SchemaAppRestrictionsSchemaRestriction*): Self = StObject.set(x, "nestedRestriction", js.Array(value*))
    
    inline def setRestrictionType(value: String): Self = StObject.set(x, "restrictionType", value.asInstanceOf[js.Any])
    
    inline def setRestrictionTypeNull: Self = StObject.set(x, "restrictionType", null)
    
    inline def setRestrictionTypeUndefined: Self = StObject.set(x, "restrictionType", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
