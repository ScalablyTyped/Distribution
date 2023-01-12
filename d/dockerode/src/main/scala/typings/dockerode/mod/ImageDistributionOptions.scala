package typings.dockerode.mod

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageDistributionOptions extends StObject {
  
  var abortSignal: js.UndefOr[AbortSignal] = js.undefined
  
  var authconfig: js.UndefOr[AuthConfig] = js.undefined
}
object ImageDistributionOptions {
  
  inline def apply(): ImageDistributionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageDistributionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageDistributionOptions] (val x: Self) extends AnyVal {
    
    inline def setAbortSignal(value: AbortSignal): Self = StObject.set(x, "abortSignal", value.asInstanceOf[js.Any])
    
    inline def setAbortSignalUndefined: Self = StObject.set(x, "abortSignal", js.undefined)
    
    inline def setAuthconfig(value: AuthConfig): Self = StObject.set(x, "authconfig", value.asInstanceOf[js.Any])
    
    inline def setAuthconfigUndefined: Self = StObject.set(x, "authconfig", js.undefined)
  }
}
