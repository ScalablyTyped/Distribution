package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PruneNetworksInfo extends StObject {
  
  var NetworksDeleted: js.Array[String] = js.native
}
object PruneNetworksInfo {
  
  @scala.inline
  def apply(NetworksDeleted: js.Array[String]): PruneNetworksInfo = {
    val __obj = js.Dynamic.literal(NetworksDeleted = NetworksDeleted.asInstanceOf[js.Any])
    __obj.asInstanceOf[PruneNetworksInfo]
  }
  
  @scala.inline
  implicit class PruneNetworksInfoMutableBuilder[Self <: PruneNetworksInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetworksDeleted(value: js.Array[String]): Self = StObject.set(x, "NetworksDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworksDeletedVarargs(value: String*): Self = StObject.set(x, "NetworksDeleted", js.Array(value :_*))
  }
}
