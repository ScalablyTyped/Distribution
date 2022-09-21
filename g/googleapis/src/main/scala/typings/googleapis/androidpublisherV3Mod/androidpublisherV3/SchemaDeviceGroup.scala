package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeviceGroup extends StObject {
  
  /**
    * Device selectors for this group. A device matching any of the selectors is included in this group.
    */
  var deviceSelectors: js.UndefOr[js.Array[SchemaDeviceSelector]] = js.undefined
  
  /**
    * The name of the group.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaDeviceGroup {
  
  inline def apply(): SchemaDeviceGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceGroup]
  }
  
  extension [Self <: SchemaDeviceGroup](x: Self) {
    
    inline def setDeviceSelectors(value: js.Array[SchemaDeviceSelector]): Self = StObject.set(x, "deviceSelectors", value.asInstanceOf[js.Any])
    
    inline def setDeviceSelectorsUndefined: Self = StObject.set(x, "deviceSelectors", js.undefined)
    
    inline def setDeviceSelectorsVarargs(value: SchemaDeviceSelector*): Self = StObject.set(x, "deviceSelectors", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
