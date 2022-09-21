package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLocationPolicyLocation extends StObject {
  
  /**
    * Constraints that the caller requires on the result distribution in this zone.
    */
  var constraints: js.UndefOr[SchemaLocationPolicyLocationConstraints] = js.undefined
  
  /**
    * Preference for a given location. Set to either ALLOW or DENY.
    */
  var preference: js.UndefOr[String | Null] = js.undefined
}
object SchemaLocationPolicyLocation {
  
  inline def apply(): SchemaLocationPolicyLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocationPolicyLocation]
  }
  
  extension [Self <: SchemaLocationPolicyLocation](x: Self) {
    
    inline def setConstraints(value: SchemaLocationPolicyLocationConstraints): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
    
    inline def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
    
    inline def setPreference(value: String): Self = StObject.set(x, "preference", value.asInstanceOf[js.Any])
    
    inline def setPreferenceNull: Self = StObject.set(x, "preference", null)
    
    inline def setPreferenceUndefined: Self = StObject.set(x, "preference", js.undefined)
  }
}
