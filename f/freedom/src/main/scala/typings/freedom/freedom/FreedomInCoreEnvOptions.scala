package typings.freedom.freedom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FreedomInCoreEnvOptions extends StObject {
  
  var debug: js.UndefOr[String] = js.native
  
  // debug level
  var logger: js.UndefOr[String] = js.native
}
object FreedomInCoreEnvOptions {
  
  @scala.inline
  def apply(): FreedomInCoreEnvOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FreedomInCoreEnvOptions]
  }
  
  @scala.inline
  implicit class FreedomInCoreEnvOptionsMutableBuilder[Self <: FreedomInCoreEnvOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDebug(value: String): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    @scala.inline
    def setLogger(value: String): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
  }
}
