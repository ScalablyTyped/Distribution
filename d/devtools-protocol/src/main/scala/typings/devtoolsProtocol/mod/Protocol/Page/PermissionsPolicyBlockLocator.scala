package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PermissionsPolicyBlockLocator extends StObject {
  
  var blockReason: PermissionsPolicyBlockReason
  
  var frameId: FrameId
}
object PermissionsPolicyBlockLocator {
  
  inline def apply(blockReason: PermissionsPolicyBlockReason, frameId: FrameId): PermissionsPolicyBlockLocator = {
    val __obj = js.Dynamic.literal(blockReason = blockReason.asInstanceOf[js.Any], frameId = frameId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionsPolicyBlockLocator]
  }
  
  extension [Self <: PermissionsPolicyBlockLocator](x: Self) {
    
    inline def setBlockReason(value: PermissionsPolicyBlockReason): Self = StObject.set(x, "blockReason", value.asInstanceOf[js.Any])
    
    inline def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
  }
}
