package typings.dockerode.mod

import typings.dockerode.dockerodeStrings.`next-exit`
import typings.dockerode.dockerodeStrings.`not-running`
import typings.dockerode.dockerodeStrings.removed
import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerWaitOptions extends StObject {
  
  var abortSignal: js.UndefOr[AbortSignal] = js.undefined
  
  /** Since v1.30 */
  var condition: js.UndefOr[`not-running` | `next-exit` | removed] = js.undefined
}
object ContainerWaitOptions {
  
  inline def apply(): ContainerWaitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerWaitOptions]
  }
  
  extension [Self <: ContainerWaitOptions](x: Self) {
    
    inline def setAbortSignal(value: AbortSignal): Self = StObject.set(x, "abortSignal", value.asInstanceOf[js.Any])
    
    inline def setAbortSignalUndefined: Self = StObject.set(x, "abortSignal", js.undefined)
    
    inline def setCondition(value: `not-running` | `next-exit` | removed): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
  }
}
