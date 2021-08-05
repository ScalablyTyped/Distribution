package typings.dockerode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkMode extends StObject {
  
  var NetworkMode: String
}
object NetworkMode {
  
  inline def apply(NetworkMode: String): NetworkMode = {
    val __obj = js.Dynamic.literal(NetworkMode = NetworkMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkMode]
  }
  
  extension [Self <: NetworkMode](x: Self) {
    
    inline def setNetworkMode(value: String): Self = StObject.set(x, "NetworkMode", value.asInstanceOf[js.Any])
  }
}
