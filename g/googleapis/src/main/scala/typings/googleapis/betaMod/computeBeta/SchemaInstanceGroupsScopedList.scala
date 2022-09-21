package typings.googleapis.betaMod.computeBeta

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceGroupsScopedList extends StObject {
  
  /**
    * [Output Only] The list of instance groups that are contained in this scope.
    */
  var instanceGroups: js.UndefOr[js.Array[SchemaInstanceGroup]] = js.undefined
  
  /**
    * [Output Only] An informational warning that replaces the list of instance groups when the list is empty.
    */
  var warning: js.UndefOr[Code | Null] = js.undefined
}
object SchemaInstanceGroupsScopedList {
  
  inline def apply(): SchemaInstanceGroupsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupsScopedList]
  }
  
  extension [Self <: SchemaInstanceGroupsScopedList](x: Self) {
    
    inline def setInstanceGroups(value: js.Array[SchemaInstanceGroup]): Self = StObject.set(x, "instanceGroups", value.asInstanceOf[js.Any])
    
    inline def setInstanceGroupsUndefined: Self = StObject.set(x, "instanceGroups", js.undefined)
    
    inline def setInstanceGroupsVarargs(value: SchemaInstanceGroup*): Self = StObject.set(x, "instanceGroups", js.Array(value*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningNull: Self = StObject.set(x, "warning", null)
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
