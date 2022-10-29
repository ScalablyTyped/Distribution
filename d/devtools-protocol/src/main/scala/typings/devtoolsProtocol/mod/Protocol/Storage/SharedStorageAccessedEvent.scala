package typings.devtoolsProtocol.mod.Protocol.Storage

import typings.devtoolsProtocol.mod.Protocol.Network.TimeSinceEpoch
import typings.devtoolsProtocol.mod.Protocol.Page.FrameId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedStorageAccessedEvent extends StObject {
  
  /**
    * Time of the access.
    */
  var accessTime: TimeSinceEpoch
  
  /**
    * DevTools Frame Token for the primary frame tree's root.
    */
  var mainFrameId: FrameId
  
  /**
    * Serialized origin for the context that invoked the Shared Storage API.
    */
  var ownerOrigin: String
  
  /**
    * The sub-parameters warapped by `params` are all optional and their
    * presence/absence depends on `type`.
    */
  var params: SharedStorageAccessParams
  
  /**
    * Enum value indicating the Shared Storage API method invoked.
    */
  var `type`: SharedStorageAccessType
}
object SharedStorageAccessedEvent {
  
  inline def apply(
    accessTime: TimeSinceEpoch,
    mainFrameId: FrameId,
    ownerOrigin: String,
    params: SharedStorageAccessParams,
    `type`: SharedStorageAccessType
  ): SharedStorageAccessedEvent = {
    val __obj = js.Dynamic.literal(accessTime = accessTime.asInstanceOf[js.Any], mainFrameId = mainFrameId.asInstanceOf[js.Any], ownerOrigin = ownerOrigin.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedStorageAccessedEvent]
  }
  
  extension [Self <: SharedStorageAccessedEvent](x: Self) {
    
    inline def setAccessTime(value: TimeSinceEpoch): Self = StObject.set(x, "accessTime", value.asInstanceOf[js.Any])
    
    inline def setMainFrameId(value: FrameId): Self = StObject.set(x, "mainFrameId", value.asInstanceOf[js.Any])
    
    inline def setOwnerOrigin(value: String): Self = StObject.set(x, "ownerOrigin", value.asInstanceOf[js.Any])
    
    inline def setParams(value: SharedStorageAccessParams): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setType(value: SharedStorageAccessType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
