package typings.devtoolsProtocol.mod.Protocol.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrackIndexedDBForOriginRequest extends StObject {
  
  /**
    * Security origin.
    */
  var origin: String
}
object TrackIndexedDBForOriginRequest {
  
  inline def apply(origin: String): TrackIndexedDBForOriginRequest = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackIndexedDBForOriginRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrackIndexedDBForOriginRequest] (val x: Self) extends AnyVal {
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
  }
}
