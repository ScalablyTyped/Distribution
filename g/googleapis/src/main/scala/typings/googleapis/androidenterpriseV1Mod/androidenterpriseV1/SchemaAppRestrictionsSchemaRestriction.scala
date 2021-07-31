package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A restriction in the App Restriction Schema represents a piece of
  * configuration that may be pre-applied.
  */
trait SchemaAppRestrictionsSchemaRestriction extends StObject {
  
  /**
    * The default value of the restriction. bundle and bundleArray restrictions
    * never have a default value.
    */
  var defaultValue: js.UndefOr[SchemaAppRestrictionsSchemaRestrictionRestrictionValue] = js.undefined
  
  /**
    * A longer description of the restriction, giving more detail of what it
    * affects.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * For choice or multiselect restrictions, the list of possible entries&#39;
    * human-readable names.
    */
  var entry: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * For choice or multiselect restrictions, the list of possible entries&#39;
    * machine-readable values. These values should be used in the
    * configuration, either as a single string value for a choice restriction
    * or in a stringArray for a multiselect restriction.
    */
  var entryValue: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The unique key that the product uses to identify the restriction, e.g.
    * &quot;com.google.android.gm.fieldname&quot;.
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * For bundle or bundleArray restrictions, the list of nested restrictions.
    * A bundle restriction is always nested within a bundleArray restriction,
    * and a bundleArray restriction is at most two levels deep.
    */
  var nestedRestriction: js.UndefOr[js.Array[SchemaAppRestrictionsSchemaRestriction]] = js.undefined
  
  /**
    * The type of the restriction.
    */
  var restrictionType: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the restriction.
    */
  var title: js.UndefOr[String] = js.undefined
}
object SchemaAppRestrictionsSchemaRestriction {
  
  @scala.inline
  def apply(): SchemaAppRestrictionsSchemaRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppRestrictionsSchemaRestriction]
  }
  
  @scala.inline
  implicit class SchemaAppRestrictionsSchemaRestrictionMutableBuilder[Self <: SchemaAppRestrictionsSchemaRestriction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: SchemaAppRestrictionsSchemaRestrictionRestrictionValue): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEntry(value: js.Array[String]): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryUndefined: Self = StObject.set(x, "entry", js.undefined)
    
    @scala.inline
    def setEntryValue(value: js.Array[String]): Self = StObject.set(x, "entryValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryValueUndefined: Self = StObject.set(x, "entryValue", js.undefined)
    
    @scala.inline
    def setEntryValueVarargs(value: String*): Self = StObject.set(x, "entryValue", js.Array(value :_*))
    
    @scala.inline
    def setEntryVarargs(value: String*): Self = StObject.set(x, "entry", js.Array(value :_*))
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setNestedRestriction(value: js.Array[SchemaAppRestrictionsSchemaRestriction]): Self = StObject.set(x, "nestedRestriction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNestedRestrictionUndefined: Self = StObject.set(x, "nestedRestriction", js.undefined)
    
    @scala.inline
    def setNestedRestrictionVarargs(value: SchemaAppRestrictionsSchemaRestriction*): Self = StObject.set(x, "nestedRestriction", js.Array(value :_*))
    
    @scala.inline
    def setRestrictionType(value: String): Self = StObject.set(x, "restrictionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictionTypeUndefined: Self = StObject.set(x, "restrictionType", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
