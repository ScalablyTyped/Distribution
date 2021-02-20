package typings.dockerode.anon

import org.scalablytyped.runtime.StringDictionary
import typings.dockerode.mod.NetworkInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Networks extends StObject {
  
  var Networks: StringDictionary[NetworkInfo] = js.native
}
object Networks {
  
  @scala.inline
  def apply(Networks: StringDictionary[NetworkInfo]): Networks = {
    val __obj = js.Dynamic.literal(Networks = Networks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Networks]
  }
  
  @scala.inline
  implicit class NetworksMutableBuilder[Self <: Networks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetworks(value: StringDictionary[NetworkInfo]): Self = StObject.set(x, "Networks", value.asInstanceOf[js.Any])
  }
}
