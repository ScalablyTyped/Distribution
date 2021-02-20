package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecretSpec extends Annotations {
  
  var Data: js.UndefOr[String] = js.native
  
  var Driver: js.UndefOr[typings.dockerode.mod.Driver] = js.native
  
  var Templating: js.UndefOr[Driver] = js.native
}
object SecretSpec {
  
  @scala.inline
  def apply(): SecretSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecretSpec]
  }
  
  @scala.inline
  implicit class SecretSpecMutableBuilder[Self <: SecretSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
    
    @scala.inline
    def setDriver(value: Driver): Self = StObject.set(x, "Driver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriverUndefined: Self = StObject.set(x, "Driver", js.undefined)
    
    @scala.inline
    def setTemplating(value: Driver): Self = StObject.set(x, "Templating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplatingUndefined: Self = StObject.set(x, "Templating", js.undefined)
  }
}
