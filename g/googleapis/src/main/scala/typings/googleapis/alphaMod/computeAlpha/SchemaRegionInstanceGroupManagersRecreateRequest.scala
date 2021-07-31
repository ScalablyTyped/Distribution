package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRegionInstanceGroupManagersRecreateRequest extends StObject {
  
  /**
    * The URLs of one or more instances to recreate. This can be a full URL or
    * a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
    */
  var instances: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaRegionInstanceGroupManagersRecreateRequest {
  
  @scala.inline
  def apply(): SchemaRegionInstanceGroupManagersRecreateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionInstanceGroupManagersRecreateRequest]
  }
  
  @scala.inline
  implicit class SchemaRegionInstanceGroupManagersRecreateRequestMutableBuilder[Self <: SchemaRegionInstanceGroupManagersRecreateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstances(value: js.Array[String]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    @scala.inline
    def setInstancesVarargs(value: String*): Self = StObject.set(x, "instances", js.Array(value :_*))
  }
}
