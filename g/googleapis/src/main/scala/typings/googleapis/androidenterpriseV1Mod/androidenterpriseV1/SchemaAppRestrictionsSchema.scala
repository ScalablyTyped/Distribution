package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the list of app restrictions available to be pre-configured for
  * the product.
  */
trait SchemaAppRestrictionsSchema extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#appRestrictionsSchema&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The set of restrictions that make up this schema.
    */
  var restrictions: js.UndefOr[js.Array[SchemaAppRestrictionsSchemaRestriction]] = js.undefined
}
object SchemaAppRestrictionsSchema {
  
  @scala.inline
  def apply(): SchemaAppRestrictionsSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppRestrictionsSchema]
  }
  
  @scala.inline
  implicit class SchemaAppRestrictionsSchemaMutableBuilder[Self <: SchemaAppRestrictionsSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setRestrictions(value: js.Array[SchemaAppRestrictionsSchemaRestriction]): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictionsUndefined: Self = StObject.set(x, "restrictions", js.undefined)
    
    @scala.inline
    def setRestrictionsVarargs(value: SchemaAppRestrictionsSchemaRestriction*): Self = StObject.set(x, "restrictions", js.Array(value :_*))
  }
}
