package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaInstanceGroupsScopedList extends StObject {
  
  /**
    * [Output Only] The list of instance groups that are contained in this
    * scope.
    */
  var instanceGroups: js.UndefOr[js.Array[SchemaInstanceGroup]] = js.native
  
  /**
    * [Output Only] An informational warning that replaces the list of instance
    * groups when the list is empty.
    */
  var warning: js.UndefOr[Code] = js.native
}
object SchemaInstanceGroupsScopedList {
  
  @scala.inline
  def apply(): SchemaInstanceGroupsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupsScopedList]
  }
  
  @scala.inline
  implicit class SchemaInstanceGroupsScopedListMutableBuilder[Self <: SchemaInstanceGroupsScopedList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceGroups(value: js.Array[SchemaInstanceGroup]): Self = StObject.set(x, "instanceGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceGroupsUndefined: Self = StObject.set(x, "instanceGroups", js.undefined)
    
    @scala.inline
    def setInstanceGroupsVarargs(value: SchemaInstanceGroup*): Self = StObject.set(x, "instanceGroups", js.Array(value :_*))
    
    @scala.inline
    def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
