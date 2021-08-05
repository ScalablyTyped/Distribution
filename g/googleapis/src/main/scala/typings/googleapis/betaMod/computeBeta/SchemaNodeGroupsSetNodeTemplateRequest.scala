package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNodeGroupsSetNodeTemplateRequest extends StObject {
  
  /**
    * Full or partial URL of the node template resource to be updated for this
    * node group.
    */
  var nodeTemplate: js.UndefOr[String] = js.undefined
}
object SchemaNodeGroupsSetNodeTemplateRequest {
  
  inline def apply(): SchemaNodeGroupsSetNodeTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeGroupsSetNodeTemplateRequest]
  }
  
  extension [Self <: SchemaNodeGroupsSetNodeTemplateRequest](x: Self) {
    
    inline def setNodeTemplate(value: String): Self = StObject.set(x, "nodeTemplate", value.asInstanceOf[js.Any])
    
    inline def setNodeTemplateUndefined: Self = StObject.set(x, "nodeTemplate", js.undefined)
  }
}
