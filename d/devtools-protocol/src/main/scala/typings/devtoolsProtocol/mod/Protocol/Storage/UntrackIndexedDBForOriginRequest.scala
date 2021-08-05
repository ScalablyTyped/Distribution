package typings.devtoolsProtocol.mod.Protocol.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntrackIndexedDBForOriginRequest extends StObject {
  
  /**
    * Security origin.
    */
  var origin: String
}
object UntrackIndexedDBForOriginRequest {
  
  inline def apply(origin: String): UntrackIndexedDBForOriginRequest = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntrackIndexedDBForOriginRequest]
  }
  
  extension [Self <: UntrackIndexedDBForOriginRequest](x: Self) {
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
  }
}
