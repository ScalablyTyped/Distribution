package typings.dockerode.mod

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecInspectOptions extends StObject {
  
  var abortSignal: js.UndefOr[AbortSignal] = js.undefined
}
object ExecInspectOptions {
  
  inline def apply(): ExecInspectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecInspectOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecInspectOptions] (val x: Self) extends AnyVal {
    
    inline def setAbortSignal(value: AbortSignal): Self = StObject.set(x, "abortSignal", value.asInstanceOf[js.Any])
    
    inline def setAbortSignalUndefined: Self = StObject.set(x, "abortSignal", js.undefined)
  }
}
