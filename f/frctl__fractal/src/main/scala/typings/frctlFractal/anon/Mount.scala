package typings.frctlFractal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mount extends StObject {
  
  var mount: js.UndefOr[String] = js.undefined
}
object Mount {
  
  inline def apply(): Mount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Mount] (val x: Self) extends AnyVal {
    
    inline def setMount(value: String): Self = StObject.set(x, "mount", value.asInstanceOf[js.Any])
    
    inline def setMountUndefined: Self = StObject.set(x, "mount", js.undefined)
  }
}
