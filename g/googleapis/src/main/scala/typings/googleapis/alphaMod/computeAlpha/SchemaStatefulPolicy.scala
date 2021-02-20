package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaStatefulPolicy extends StObject {
  
  var preservedResources: js.UndefOr[SchemaStatefulPolicyPreservedResources] = js.native
  
  var preservedState: js.UndefOr[SchemaStatefulPolicyPreservedState] = js.native
}
object SchemaStatefulPolicy {
  
  @scala.inline
  def apply(): SchemaStatefulPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStatefulPolicy]
  }
  
  @scala.inline
  implicit class SchemaStatefulPolicyMutableBuilder[Self <: SchemaStatefulPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreservedResources(value: SchemaStatefulPolicyPreservedResources): Self = StObject.set(x, "preservedResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreservedResourcesUndefined: Self = StObject.set(x, "preservedResources", js.undefined)
    
    @scala.inline
    def setPreservedState(value: SchemaStatefulPolicyPreservedState): Self = StObject.set(x, "preservedState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreservedStateUndefined: Self = StObject.set(x, "preservedState", js.undefined)
  }
}
