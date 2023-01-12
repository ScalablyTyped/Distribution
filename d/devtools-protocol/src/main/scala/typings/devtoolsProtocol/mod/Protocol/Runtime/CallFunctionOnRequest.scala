package typings.devtoolsProtocol.mod.Protocol.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallFunctionOnRequest extends StObject {
  
  /**
    * Call arguments. All call arguments must belong to the same JavaScript world as the target
    * object.
    */
  var arguments: js.UndefOr[js.Array[CallArgument]] = js.undefined
  
  /**
    * Whether execution should `await` for resulting value and return once awaited promise is
    * resolved.
    */
  var awaitPromise: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies execution context which global object will be used to call function on. Either
    * executionContextId or objectId should be specified.
    */
  var executionContextId: js.UndefOr[ExecutionContextId] = js.undefined
  
  /**
    * Declaration of the function to call.
    */
  var functionDeclaration: String
  
  /**
    * Whether preview should be generated for the result.
    */
  var generatePreview: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the result should contain `webDriverValue`, serialized according to
    * https://w3c.github.io/webdriver-bidi. This is mutually exclusive with `returnByValue`, but
    * resulting `objectId` is still provided.
    */
  var generateWebDriverValue: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Symbolic group name that can be used to release multiple objects. If objectGroup is not
    * specified and objectId is, objectGroup will be inherited from object.
    */
  var objectGroup: js.UndefOr[String] = js.undefined
  
  /**
    * Identifier of the object to call function on. Either objectId or executionContextId should
    * be specified.
    */
  var objectId: js.UndefOr[RemoteObjectId] = js.undefined
  
  /**
    * Whether the result is expected to be a JSON object which should be sent by value.
    */
  var returnByValue: js.UndefOr[Boolean] = js.undefined
  
  /**
    * In silent mode exceptions thrown during evaluation are not reported and do not pause
    * execution. Overrides `setPauseOnException` state.
    */
  var silent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to throw an exception if side effect cannot be ruled out during evaluation.
    */
  var throwOnSideEffect: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether execution should be treated as initiated by user in the UI.
    */
  var userGesture: js.UndefOr[Boolean] = js.undefined
}
object CallFunctionOnRequest {
  
  inline def apply(functionDeclaration: String): CallFunctionOnRequest = {
    val __obj = js.Dynamic.literal(functionDeclaration = functionDeclaration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallFunctionOnRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CallFunctionOnRequest] (val x: Self) extends AnyVal {
    
    inline def setArguments(value: js.Array[CallArgument]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
    
    inline def setArgumentsVarargs(value: CallArgument*): Self = StObject.set(x, "arguments", js.Array(value*))
    
    inline def setAwaitPromise(value: Boolean): Self = StObject.set(x, "awaitPromise", value.asInstanceOf[js.Any])
    
    inline def setAwaitPromiseUndefined: Self = StObject.set(x, "awaitPromise", js.undefined)
    
    inline def setExecutionContextId(value: ExecutionContextId): Self = StObject.set(x, "executionContextId", value.asInstanceOf[js.Any])
    
    inline def setExecutionContextIdUndefined: Self = StObject.set(x, "executionContextId", js.undefined)
    
    inline def setFunctionDeclaration(value: String): Self = StObject.set(x, "functionDeclaration", value.asInstanceOf[js.Any])
    
    inline def setGeneratePreview(value: Boolean): Self = StObject.set(x, "generatePreview", value.asInstanceOf[js.Any])
    
    inline def setGeneratePreviewUndefined: Self = StObject.set(x, "generatePreview", js.undefined)
    
    inline def setGenerateWebDriverValue(value: Boolean): Self = StObject.set(x, "generateWebDriverValue", value.asInstanceOf[js.Any])
    
    inline def setGenerateWebDriverValueUndefined: Self = StObject.set(x, "generateWebDriverValue", js.undefined)
    
    inline def setObjectGroup(value: String): Self = StObject.set(x, "objectGroup", value.asInstanceOf[js.Any])
    
    inline def setObjectGroupUndefined: Self = StObject.set(x, "objectGroup", js.undefined)
    
    inline def setObjectId(value: RemoteObjectId): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setReturnByValue(value: Boolean): Self = StObject.set(x, "returnByValue", value.asInstanceOf[js.Any])
    
    inline def setReturnByValueUndefined: Self = StObject.set(x, "returnByValue", js.undefined)
    
    inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    inline def setThrowOnSideEffect(value: Boolean): Self = StObject.set(x, "throwOnSideEffect", value.asInstanceOf[js.Any])
    
    inline def setThrowOnSideEffectUndefined: Self = StObject.set(x, "throwOnSideEffect", js.undefined)
    
    inline def setUserGesture(value: Boolean): Self = StObject.set(x, "userGesture", value.asInstanceOf[js.Any])
    
    inline def setUserGestureUndefined: Self = StObject.set(x, "userGesture", js.undefined)
  }
}
