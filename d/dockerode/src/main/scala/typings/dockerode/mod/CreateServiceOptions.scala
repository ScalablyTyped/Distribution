package typings.dockerode.mod

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateServiceOptions
  extends StObject
     with ServiceSpec {
  
  var abortSignal: js.UndefOr[AbortSignal] = js.undefined
  
  var authconfig: js.UndefOr[AuthConfig] = js.undefined
}
object CreateServiceOptions {
  
  inline def apply(): CreateServiceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateServiceOptions]
  }
  
  extension [Self <: CreateServiceOptions](x: Self) {
    
    inline def setAbortSignal(value: AbortSignal): Self = StObject.set(x, "abortSignal", value.asInstanceOf[js.Any])
    
    inline def setAbortSignalUndefined: Self = StObject.set(x, "abortSignal", js.undefined)
    
    inline def setAuthconfig(value: AuthConfig): Self = StObject.set(x, "authconfig", value.asInstanceOf[js.Any])
    
    inline def setAuthconfigUndefined: Self = StObject.set(x, "authconfig", js.undefined)
  }
}
