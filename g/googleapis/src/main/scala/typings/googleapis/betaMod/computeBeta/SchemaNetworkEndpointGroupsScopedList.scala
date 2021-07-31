package typings.googleapis.betaMod.computeBeta

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNetworkEndpointGroupsScopedList extends StObject {
  
  /**
    * [Output Only] The list of network endpoint groups that are contained in
    * this scope.
    */
  var networkEndpointGroups: js.UndefOr[js.Array[SchemaNetworkEndpointGroup]] = js.undefined
  
  /**
    * [Output Only] An informational warning that replaces the list of network
    * endpoint groups when the list is empty.
    */
  var warning: js.UndefOr[Code] = js.undefined
}
object SchemaNetworkEndpointGroupsScopedList {
  
  @scala.inline
  def apply(): SchemaNetworkEndpointGroupsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkEndpointGroupsScopedList]
  }
  
  @scala.inline
  implicit class SchemaNetworkEndpointGroupsScopedListMutableBuilder[Self <: SchemaNetworkEndpointGroupsScopedList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetworkEndpointGroups(value: js.Array[SchemaNetworkEndpointGroup]): Self = StObject.set(x, "networkEndpointGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkEndpointGroupsUndefined: Self = StObject.set(x, "networkEndpointGroups", js.undefined)
    
    @scala.inline
    def setNetworkEndpointGroupsVarargs(value: SchemaNetworkEndpointGroup*): Self = StObject.set(x, "networkEndpointGroups", js.Array(value :_*))
    
    @scala.inline
    def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
