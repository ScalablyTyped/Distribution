package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateIsolatedWorldRequest extends StObject {
  
  /**
    * Id of the frame in which the isolated world should be created.
    */
  var frameId: FrameId
  
  /**
    * Whether or not universal access should be granted to the isolated world. This is a powerful
    * option, use with caution.
    */
  var grantUniveralAccess: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An optional name which is reported in the Execution Context.
    */
  var worldName: js.UndefOr[String] = js.undefined
}
object CreateIsolatedWorldRequest {
  
  inline def apply(frameId: FrameId): CreateIsolatedWorldRequest = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIsolatedWorldRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateIsolatedWorldRequest] (val x: Self) extends AnyVal {
    
    inline def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setGrantUniveralAccess(value: Boolean): Self = StObject.set(x, "grantUniveralAccess", value.asInstanceOf[js.Any])
    
    inline def setGrantUniveralAccessUndefined: Self = StObject.set(x, "grantUniveralAccess", js.undefined)
    
    inline def setWorldName(value: String): Self = StObject.set(x, "worldName", value.asInstanceOf[js.Any])
    
    inline def setWorldNameUndefined: Self = StObject.set(x, "worldName", js.undefined)
  }
}
