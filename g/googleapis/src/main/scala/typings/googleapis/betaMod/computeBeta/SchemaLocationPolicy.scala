package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLocationPolicy extends StObject {
  
  /**
    * Location configurations mapped by location name. Currently only zone names are supported and must be represented as valid internal URLs, such as zones/us-central1-a.
    */
  var locations: js.UndefOr[StringDictionary[SchemaLocationPolicyLocation] | Null] = js.undefined
  
  /**
    * Strategy for distributing VMs across zones in a region.
    */
  var targetShape: js.UndefOr[String | Null] = js.undefined
}
object SchemaLocationPolicy {
  
  inline def apply(): SchemaLocationPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocationPolicy]
  }
  
  extension [Self <: SchemaLocationPolicy](x: Self) {
    
    inline def setLocations(value: StringDictionary[SchemaLocationPolicyLocation]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setLocationsNull: Self = StObject.set(x, "locations", null)
    
    inline def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    inline def setTargetShape(value: String): Self = StObject.set(x, "targetShape", value.asInstanceOf[js.Any])
    
    inline def setTargetShapeNull: Self = StObject.set(x, "targetShape", null)
    
    inline def setTargetShapeUndefined: Self = StObject.set(x, "targetShape", js.undefined)
  }
}
