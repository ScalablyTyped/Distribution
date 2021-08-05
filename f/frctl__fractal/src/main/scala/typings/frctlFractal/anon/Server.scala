package typings.frctlFractal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Server extends StObject {
  
  var server: js.UndefOr[Double] = js.undefined
  
  var sync: js.UndefOr[Double] = js.undefined
}
object Server {
  
  inline def apply(): Server = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Server]
  }
  
  extension [Self <: Server](x: Self) {
    
    inline def setServer(value: Double): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
    
    inline def setSync(value: Double): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
    
    inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
  }
}
