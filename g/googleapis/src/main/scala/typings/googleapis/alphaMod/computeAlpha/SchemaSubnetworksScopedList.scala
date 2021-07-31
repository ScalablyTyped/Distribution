package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSubnetworksScopedList extends StObject {
  
  /**
    * A list of subnetworks contained in this scope.
    */
  var subnetworks: js.UndefOr[js.Array[SchemaSubnetwork]] = js.undefined
  
  /**
    * An informational warning that appears when the list of addresses is
    * empty.
    */
  var warning: js.UndefOr[Code] = js.undefined
}
object SchemaSubnetworksScopedList {
  
  @scala.inline
  def apply(): SchemaSubnetworksScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubnetworksScopedList]
  }
  
  @scala.inline
  implicit class SchemaSubnetworksScopedListMutableBuilder[Self <: SchemaSubnetworksScopedList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubnetworks(value: js.Array[SchemaSubnetwork]): Self = StObject.set(x, "subnetworks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetworksUndefined: Self = StObject.set(x, "subnetworks", js.undefined)
    
    @scala.inline
    def setSubnetworksVarargs(value: SchemaSubnetwork*): Self = StObject.set(x, "subnetworks", js.Array(value :_*))
    
    @scala.inline
    def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
