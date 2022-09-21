package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConstraint extends StObject {
  
  /**
    * Defines this constraint as being a BooleanConstraint.
    */
  var booleanConstraint: js.UndefOr[SchemaBooleanConstraint] = js.undefined
  
  /**
    * The evaluation behavior of this constraint in the absence of 'Policy'.
    */
  var constraintDefault: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Detailed description of what this `Constraint` controls as well as how and where it is enforced. Mutable.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The human readable name. Mutable.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Defines this constraint as being a ListConstraint.
    */
  var listConstraint: js.UndefOr[SchemaListConstraint] = js.undefined
  
  /**
    * Immutable value, required to globally be unique. For example, `constraints/serviceuser.services`
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Version of the `Constraint`. Default version is 0;
    */
  var version: js.UndefOr[Double | Null] = js.undefined
}
object SchemaConstraint {
  
  inline def apply(): SchemaConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConstraint]
  }
  
  extension [Self <: SchemaConstraint](x: Self) {
    
    inline def setBooleanConstraint(value: SchemaBooleanConstraint): Self = StObject.set(x, "booleanConstraint", value.asInstanceOf[js.Any])
    
    inline def setBooleanConstraintUndefined: Self = StObject.set(x, "booleanConstraint", js.undefined)
    
    inline def setConstraintDefault(value: String): Self = StObject.set(x, "constraintDefault", value.asInstanceOf[js.Any])
    
    inline def setConstraintDefaultNull: Self = StObject.set(x, "constraintDefault", null)
    
    inline def setConstraintDefaultUndefined: Self = StObject.set(x, "constraintDefault", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setListConstraint(value: SchemaListConstraint): Self = StObject.set(x, "listConstraint", value.asInstanceOf[js.Any])
    
    inline def setListConstraintUndefined: Self = StObject.set(x, "listConstraint", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
