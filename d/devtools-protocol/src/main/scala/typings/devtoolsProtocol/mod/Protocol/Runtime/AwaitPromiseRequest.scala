package typings.devtoolsProtocol.mod.Protocol.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwaitPromiseRequest extends StObject {
  
  /**
    * Whether preview should be generated for the result.
    */
  var generatePreview: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Identifier of the promise.
    */
  var promiseObjectId: RemoteObjectId
  
  /**
    * Whether the result is expected to be a JSON object that should be sent by value.
    */
  var returnByValue: js.UndefOr[Boolean] = js.undefined
}
object AwaitPromiseRequest {
  
  inline def apply(promiseObjectId: RemoteObjectId): AwaitPromiseRequest = {
    val __obj = js.Dynamic.literal(promiseObjectId = promiseObjectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwaitPromiseRequest]
  }
  
  extension [Self <: AwaitPromiseRequest](x: Self) {
    
    inline def setGeneratePreview(value: Boolean): Self = StObject.set(x, "generatePreview", value.asInstanceOf[js.Any])
    
    inline def setGeneratePreviewUndefined: Self = StObject.set(x, "generatePreview", js.undefined)
    
    inline def setPromiseObjectId(value: RemoteObjectId): Self = StObject.set(x, "promiseObjectId", value.asInstanceOf[js.Any])
    
    inline def setReturnByValue(value: Boolean): Self = StObject.set(x, "returnByValue", value.asInstanceOf[js.Any])
    
    inline def setReturnByValueUndefined: Self = StObject.set(x, "returnByValue", js.undefined)
  }
}
