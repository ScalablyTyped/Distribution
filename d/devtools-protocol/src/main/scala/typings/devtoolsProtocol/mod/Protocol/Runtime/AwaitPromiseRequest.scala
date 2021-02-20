package typings.devtoolsProtocol.mod.Protocol.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwaitPromiseRequest extends StObject {
  
  /**
    * Whether preview should be generated for the result.
    */
  var generatePreview: js.UndefOr[Boolean] = js.native
  
  /**
    * Identifier of the promise.
    */
  var promiseObjectId: RemoteObjectId = js.native
  
  /**
    * Whether the result is expected to be a JSON object that should be sent by value.
    */
  var returnByValue: js.UndefOr[Boolean] = js.native
}
object AwaitPromiseRequest {
  
  @scala.inline
  def apply(promiseObjectId: RemoteObjectId): AwaitPromiseRequest = {
    val __obj = js.Dynamic.literal(promiseObjectId = promiseObjectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwaitPromiseRequest]
  }
  
  @scala.inline
  implicit class AwaitPromiseRequestMutableBuilder[Self <: AwaitPromiseRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeneratePreview(value: Boolean): Self = StObject.set(x, "generatePreview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeneratePreviewUndefined: Self = StObject.set(x, "generatePreview", js.undefined)
    
    @scala.inline
    def setPromiseObjectId(value: RemoteObjectId): Self = StObject.set(x, "promiseObjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnByValue(value: Boolean): Self = StObject.set(x, "returnByValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnByValueUndefined: Self = StObject.set(x, "returnByValue", js.undefined)
  }
}
