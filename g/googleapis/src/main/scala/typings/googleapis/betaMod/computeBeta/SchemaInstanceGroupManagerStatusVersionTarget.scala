package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceGroupManagerStatusVersionTarget extends StObject {
  
  /**
    * [Output Only] A bit indicating whether version target has been reached in this managed instance group, i.e. all instances are in their target version. Instances' target version are specified by version field on Instance Group Manager.
    */
  var isReached: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaInstanceGroupManagerStatusVersionTarget {
  
  inline def apply(): SchemaInstanceGroupManagerStatusVersionTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagerStatusVersionTarget]
  }
  
  extension [Self <: SchemaInstanceGroupManagerStatusVersionTarget](x: Self) {
    
    inline def setIsReached(value: Boolean): Self = StObject.set(x, "isReached", value.asInstanceOf[js.Any])
    
    inline def setIsReachedNull: Self = StObject.set(x, "isReached", null)
    
    inline def setIsReachedUndefined: Self = StObject.set(x, "isReached", js.undefined)
  }
}
