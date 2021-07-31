package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration of all preserved resources.
  */
trait SchemaStatefulPolicyPreservedResources extends StObject {
  
  /**
    * Disks created on the instances that will be preserved on instance delete,
    * resize down, etc.
    */
  var disks: js.UndefOr[js.Array[SchemaStatefulPolicyPreservedDisk]] = js.undefined
}
object SchemaStatefulPolicyPreservedResources {
  
  @scala.inline
  def apply(): SchemaStatefulPolicyPreservedResources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStatefulPolicyPreservedResources]
  }
  
  @scala.inline
  implicit class SchemaStatefulPolicyPreservedResourcesMutableBuilder[Self <: SchemaStatefulPolicyPreservedResources] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisks(value: js.Array[SchemaStatefulPolicyPreservedDisk]): Self = StObject.set(x, "disks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisksUndefined: Self = StObject.set(x, "disks", js.undefined)
    
    @scala.inline
    def setDisksVarargs(value: SchemaStatefulPolicyPreservedDisk*): Self = StObject.set(x, "disks", js.Array(value :_*))
  }
}
