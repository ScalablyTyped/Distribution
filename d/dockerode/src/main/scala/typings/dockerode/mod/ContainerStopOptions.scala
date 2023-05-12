package typings.dockerode.mod

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerStopOptions extends StObject {
  
  var abortSignal: js.UndefOr[AbortSignal] = js.undefined
  
  var signal: js.UndefOr[String] = js.undefined
  
  /** Number of seconds to wait before killing the container */
  var t: js.UndefOr[Double] = js.undefined
}
object ContainerStopOptions {
  
  inline def apply(): ContainerStopOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerStopOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContainerStopOptions] (val x: Self) extends AnyVal {
    
    inline def setAbortSignal(value: AbortSignal): Self = StObject.set(x, "abortSignal", value.asInstanceOf[js.Any])
    
    inline def setAbortSignalUndefined: Self = StObject.set(x, "abortSignal", js.undefined)
    
    inline def setSignal(value: String): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setT(value: Double): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    
    inline def setTUndefined: Self = StObject.set(x, "t", js.undefined)
  }
}
