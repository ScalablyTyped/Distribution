package typings.googleapis.betaMod.computeBeta

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNodeGroupsScopedList extends StObject {
  
  /**
    * [Output Only] A list of node groups contained in this scope.
    */
  var nodeGroups: js.UndefOr[js.Array[SchemaNodeGroup]] = js.undefined
  
  /**
    * [Output Only] An informational warning that appears when the nodeGroup
    * list is empty.
    */
  var warning: js.UndefOr[Code] = js.undefined
}
object SchemaNodeGroupsScopedList {
  
  @scala.inline
  def apply(): SchemaNodeGroupsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeGroupsScopedList]
  }
  
  @scala.inline
  implicit class SchemaNodeGroupsScopedListMutableBuilder[Self <: SchemaNodeGroupsScopedList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeGroups(value: js.Array[SchemaNodeGroup]): Self = StObject.set(x, "nodeGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeGroupsUndefined: Self = StObject.set(x, "nodeGroups", js.undefined)
    
    @scala.inline
    def setNodeGroupsVarargs(value: SchemaNodeGroup*): Self = StObject.set(x, "nodeGroups", js.Array(value :_*))
    
    @scala.inline
    def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
