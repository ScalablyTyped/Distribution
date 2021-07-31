package typings.ethereumProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TraceParams extends StObject {
  
  var disableMemory: js.UndefOr[Boolean] = js.undefined
  
  var disableStack: js.UndefOr[Boolean] = js.undefined
  
  var disableStorage: js.UndefOr[Boolean] = js.undefined
}
object TraceParams {
  
  @scala.inline
  def apply(): TraceParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TraceParams]
  }
  
  @scala.inline
  implicit class TraceParamsMutableBuilder[Self <: TraceParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisableMemory(value: Boolean): Self = StObject.set(x, "disableMemory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableMemoryUndefined: Self = StObject.set(x, "disableMemory", js.undefined)
    
    @scala.inline
    def setDisableStack(value: Boolean): Self = StObject.set(x, "disableStack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableStackUndefined: Self = StObject.set(x, "disableStack", js.undefined)
    
    @scala.inline
    def setDisableStorage(value: Boolean): Self = StObject.set(x, "disableStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableStorageUndefined: Self = StObject.set(x, "disableStorage", js.undefined)
  }
}
