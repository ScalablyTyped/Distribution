package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceGroupManagersScopedList extends StObject {
  
  /**
    * [Output Only] The list of managed instance groups that are contained in
    * the specified project and zone.
    */
  var instanceGroupManagers: js.UndefOr[js.Array[SchemaInstanceGroupManager]] = js.undefined
  
  /**
    * [Output Only] The warning that replaces the list of managed instance
    * groups when the list is empty.
    */
  var warning: js.UndefOr[Code] = js.undefined
}
object SchemaInstanceGroupManagersScopedList {
  
  @scala.inline
  def apply(): SchemaInstanceGroupManagersScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagersScopedList]
  }
  
  @scala.inline
  implicit class SchemaInstanceGroupManagersScopedListMutableBuilder[Self <: SchemaInstanceGroupManagersScopedList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceGroupManagers(value: js.Array[SchemaInstanceGroupManager]): Self = StObject.set(x, "instanceGroupManagers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceGroupManagersUndefined: Self = StObject.set(x, "instanceGroupManagers", js.undefined)
    
    @scala.inline
    def setInstanceGroupManagersVarargs(value: SchemaInstanceGroupManager*): Self = StObject.set(x, "instanceGroupManagers", js.Array(value :_*))
    
    @scala.inline
    def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
