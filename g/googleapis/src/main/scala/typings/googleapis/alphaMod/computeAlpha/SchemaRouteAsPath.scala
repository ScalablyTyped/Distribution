package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRouteAsPath extends StObject {
  
  /**
    * [Output Only] The AS numbers of the AS Path.
    */
  var asLists: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  /**
    * [Output Only] The type of the AS Path, which can be one of the following values: - 'AS_SET': unordered set of autonomous systems that the route in has traversed - 'AS_SEQUENCE': ordered set of autonomous systems that the route has traversed - 'AS_CONFED_SEQUENCE': ordered set of Member Autonomous Systems in the local confederation that the route has traversed - 'AS_CONFED_SET': unordered set of Member Autonomous Systems in the local confederation that the route has traversed
    */
  var pathSegmentType: js.UndefOr[String | Null] = js.undefined
}
object SchemaRouteAsPath {
  
  inline def apply(): SchemaRouteAsPath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouteAsPath]
  }
  
  extension [Self <: SchemaRouteAsPath](x: Self) {
    
    inline def setAsLists(value: js.Array[Double]): Self = StObject.set(x, "asLists", value.asInstanceOf[js.Any])
    
    inline def setAsListsNull: Self = StObject.set(x, "asLists", null)
    
    inline def setAsListsUndefined: Self = StObject.set(x, "asLists", js.undefined)
    
    inline def setAsListsVarargs(value: Double*): Self = StObject.set(x, "asLists", js.Array(value*))
    
    inline def setPathSegmentType(value: String): Self = StObject.set(x, "pathSegmentType", value.asInstanceOf[js.Any])
    
    inline def setPathSegmentTypeNull: Self = StObject.set(x, "pathSegmentType", null)
    
    inline def setPathSegmentTypeUndefined: Self = StObject.set(x, "pathSegmentType", js.undefined)
  }
}
