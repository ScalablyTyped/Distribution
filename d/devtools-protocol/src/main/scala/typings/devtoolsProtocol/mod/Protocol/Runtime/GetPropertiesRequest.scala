package typings.devtoolsProtocol.mod.Protocol.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPropertiesRequest extends StObject {
  
  /**
    * If true, returns accessor properties (with getter/setter) only; internal properties are not
    * returned either.
    */
  var accessorPropertiesOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether preview should be generated for the results.
    */
  var generatePreview: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, returns non-indexed properties only.
    */
  var nonIndexedPropertiesOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Identifier of the object to return properties for.
    */
  var objectId: RemoteObjectId
  
  /**
    * If true, returns properties belonging only to the element itself, not to its prototype
    * chain.
    */
  var ownProperties: js.UndefOr[Boolean] = js.undefined
}
object GetPropertiesRequest {
  
  inline def apply(objectId: RemoteObjectId): GetPropertiesRequest = {
    val __obj = js.Dynamic.literal(objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPropertiesRequest]
  }
  
  extension [Self <: GetPropertiesRequest](x: Self) {
    
    inline def setAccessorPropertiesOnly(value: Boolean): Self = StObject.set(x, "accessorPropertiesOnly", value.asInstanceOf[js.Any])
    
    inline def setAccessorPropertiesOnlyUndefined: Self = StObject.set(x, "accessorPropertiesOnly", js.undefined)
    
    inline def setGeneratePreview(value: Boolean): Self = StObject.set(x, "generatePreview", value.asInstanceOf[js.Any])
    
    inline def setGeneratePreviewUndefined: Self = StObject.set(x, "generatePreview", js.undefined)
    
    inline def setNonIndexedPropertiesOnly(value: Boolean): Self = StObject.set(x, "nonIndexedPropertiesOnly", value.asInstanceOf[js.Any])
    
    inline def setNonIndexedPropertiesOnlyUndefined: Self = StObject.set(x, "nonIndexedPropertiesOnly", js.undefined)
    
    inline def setObjectId(value: RemoteObjectId): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setOwnProperties(value: Boolean): Self = StObject.set(x, "ownProperties", value.asInstanceOf[js.Any])
    
    inline def setOwnPropertiesUndefined: Self = StObject.set(x, "ownProperties", js.undefined)
  }
}
