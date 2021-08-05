package typings.frctlFractal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sync extends StObject {
  
  var server: js.UndefOr[String] = js.undefined
  
  var sync: js.UndefOr[External] = js.undefined
}
object Sync {
  
  inline def apply(): Sync = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sync]
  }
  
  extension [Self <: Sync](x: Self) {
    
    inline def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
    
    inline def setSync(value: External): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
    
    inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
  }
}
