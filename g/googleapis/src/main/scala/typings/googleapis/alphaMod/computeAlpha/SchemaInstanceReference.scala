package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceReference extends StObject {
  
  /**
    * The URL for a specific instance. @required compute.instancegroups.addInstances/removeInstances
    */
  var instance: js.UndefOr[String | Null] = js.undefined
}
object SchemaInstanceReference {
  
  inline def apply(): SchemaInstanceReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceReference]
  }
  
  extension [Self <: SchemaInstanceReference](x: Self) {
    
    inline def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceNull: Self = StObject.set(x, "instance", null)
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
  }
}
