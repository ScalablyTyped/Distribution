package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaNodeGroupsSetNodeTemplateRequest extends StObject {
  
  /**
    * Full or partial URL of the node template resource to be updated for this
    * node group.
    */
  var nodeTemplate: js.UndefOr[String] = js.native
}
object SchemaNodeGroupsSetNodeTemplateRequest {
  
  @scala.inline
  def apply(): SchemaNodeGroupsSetNodeTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeGroupsSetNodeTemplateRequest]
  }
  
  @scala.inline
  implicit class SchemaNodeGroupsSetNodeTemplateRequestMutableBuilder[Self <: SchemaNodeGroupsSetNodeTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeTemplate(value: String): Self = StObject.set(x, "nodeTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeTemplateUndefined: Self = StObject.set(x, "nodeTemplate", js.undefined)
  }
}
