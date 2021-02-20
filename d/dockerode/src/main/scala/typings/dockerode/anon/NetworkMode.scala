package typings.dockerode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkMode extends StObject {
  
  var NetworkMode: String = js.native
}
object NetworkMode {
  
  @scala.inline
  def apply(NetworkMode: String): NetworkMode = {
    val __obj = js.Dynamic.literal(NetworkMode = NetworkMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkMode]
  }
  
  @scala.inline
  implicit class NetworkModeMutableBuilder[Self <: NetworkMode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetworkMode(value: String): Self = StObject.set(x, "NetworkMode", value.asInstanceOf[js.Any])
  }
}
