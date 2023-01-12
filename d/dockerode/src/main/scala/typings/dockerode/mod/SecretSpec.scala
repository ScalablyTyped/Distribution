package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecretSpec
  extends StObject
     with Annotations {
  
  var Data: js.UndefOr[String] = js.undefined
  
  var Driver: js.UndefOr[typings.dockerode.mod.Driver] = js.undefined
  
  var Templating: js.UndefOr[Driver] = js.undefined
}
object SecretSpec {
  
  inline def apply(): SecretSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecretSpec]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecretSpec] (val x: Self) extends AnyVal {
    
    inline def setData(value: String): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
    
    inline def setDriver(value: Driver): Self = StObject.set(x, "Driver", value.asInstanceOf[js.Any])
    
    inline def setDriverUndefined: Self = StObject.set(x, "Driver", js.undefined)
    
    inline def setTemplating(value: Driver): Self = StObject.set(x, "Templating", value.asInstanceOf[js.Any])
    
    inline def setTemplatingUndefined: Self = StObject.set(x, "Templating", js.undefined)
  }
}
