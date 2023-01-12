package typings.freedom.freedom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FreedomInCoreEnvOptions extends StObject {
  
  var debug: js.UndefOr[String] = js.undefined
  
  // debug level
  var logger: js.UndefOr[String] = js.undefined
}
object FreedomInCoreEnvOptions {
  
  inline def apply(): FreedomInCoreEnvOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FreedomInCoreEnvOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FreedomInCoreEnvOptions] (val x: Self) extends AnyVal {
    
    inline def setDebug(value: String): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setLogger(value: String): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
  }
}
