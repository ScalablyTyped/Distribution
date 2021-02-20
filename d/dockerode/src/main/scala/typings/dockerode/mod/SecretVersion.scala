package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecretVersion extends StObject {
  
  var Index: Double = js.native
}
object SecretVersion {
  
  @scala.inline
  def apply(Index: Double): SecretVersion = {
    val __obj = js.Dynamic.literal(Index = Index.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecretVersion]
  }
  
  @scala.inline
  implicit class SecretVersionMutableBuilder[Self <: SecretVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
  }
}
