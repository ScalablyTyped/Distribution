package typings.devtoolsProtocol.mod.Protocol.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPropertiesRequest extends StObject {
  
  /**
    * If true, returns accessor properties (with getter/setter) only; internal properties are not
    * returned either.
    */
  var accessorPropertiesOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether preview should be generated for the results.
    */
  var generatePreview: js.UndefOr[Boolean] = js.native
  
  /**
    * Identifier of the object to return properties for.
    */
  var objectId: RemoteObjectId = js.native
  
  /**
    * If true, returns properties belonging only to the element itself, not to its prototype
    * chain.
    */
  var ownProperties: js.UndefOr[Boolean] = js.native
}
object GetPropertiesRequest {
  
  @scala.inline
  def apply(objectId: RemoteObjectId): GetPropertiesRequest = {
    val __obj = js.Dynamic.literal(objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPropertiesRequest]
  }
  
  @scala.inline
  implicit class GetPropertiesRequestMutableBuilder[Self <: GetPropertiesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessorPropertiesOnly(value: Boolean): Self = StObject.set(x, "accessorPropertiesOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessorPropertiesOnlyUndefined: Self = StObject.set(x, "accessorPropertiesOnly", js.undefined)
    
    @scala.inline
    def setGeneratePreview(value: Boolean): Self = StObject.set(x, "generatePreview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeneratePreviewUndefined: Self = StObject.set(x, "generatePreview", js.undefined)
    
    @scala.inline
    def setObjectId(value: RemoteObjectId): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnProperties(value: Boolean): Self = StObject.set(x, "ownProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnPropertiesUndefined: Self = StObject.set(x, "ownProperties", js.undefined)
  }
}
