package typings.devtoolsProtocol.mod.Protocol.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluateRequest extends StObject {
  
  /**
    * The Content Security Policy (CSP) for the target might block 'unsafe-eval'
    * which includes eval(), Function(), setTimeout() and setInterval()
    * when called with non-callable arguments. This flag bypasses CSP for this
    * evaluation and allows unsafe-eval. Defaults to true.
    */
  var allowUnsafeEvalBlockedByCSP: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether execution should `await` for resulting value and return once awaited promise is
    * resolved.
    */
  var awaitPromise: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies in which execution context to perform evaluation. If the parameter is omitted the
    * evaluation will be performed in the context of the inspected page.
    */
  var contextId: js.UndefOr[ExecutionContextId] = js.undefined
  
  /**
    * Disable breakpoints during execution.
    */
  var disableBreaks: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Expression to evaluate.
    */
  var expression: String
  
  /**
    * Whether preview should be generated for the result.
    */
  var generatePreview: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determines whether Command Line API should be available during the evaluation.
    */
  var includeCommandLineAPI: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Symbolic group name that can be used to release multiple objects.
    */
  var objectGroup: js.UndefOr[String] = js.undefined
  
  /**
    * Setting this flag to true enables `let` re-declaration and top-level `await`.
    * Note that `let` variables can only be re-declared if they originate from
    * `replMode` themselves.
    */
  var replMode: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the result is expected to be a JSON object that should be sent by value.
    */
  var returnByValue: js.UndefOr[Boolean] = js.undefined
  
  /**
    * In silent mode exceptions thrown during evaluation are not reported and do not pause
    * execution. Overrides `setPauseOnException` state.
    */
  var silent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to throw an exception if side effect cannot be ruled out during evaluation.
    * This implies `disableBreaks` below.
    */
  var throwOnSideEffect: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Terminate execution after timing out (number of milliseconds).
    */
  var timeout: js.UndefOr[TimeDelta] = js.undefined
  
  /**
    * Whether execution should be treated as initiated by user in the UI.
    */
  var userGesture: js.UndefOr[Boolean] = js.undefined
}
object EvaluateRequest {
  
  @scala.inline
  def apply(expression: String): EvaluateRequest = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluateRequest]
  }
  
  @scala.inline
  implicit class EvaluateRequestMutableBuilder[Self <: EvaluateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowUnsafeEvalBlockedByCSP(value: Boolean): Self = StObject.set(x, "allowUnsafeEvalBlockedByCSP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowUnsafeEvalBlockedByCSPUndefined: Self = StObject.set(x, "allowUnsafeEvalBlockedByCSP", js.undefined)
    
    @scala.inline
    def setAwaitPromise(value: Boolean): Self = StObject.set(x, "awaitPromise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwaitPromiseUndefined: Self = StObject.set(x, "awaitPromise", js.undefined)
    
    @scala.inline
    def setContextId(value: ExecutionContextId): Self = StObject.set(x, "contextId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextIdUndefined: Self = StObject.set(x, "contextId", js.undefined)
    
    @scala.inline
    def setDisableBreaks(value: Boolean): Self = StObject.set(x, "disableBreaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableBreaksUndefined: Self = StObject.set(x, "disableBreaks", js.undefined)
    
    @scala.inline
    def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeneratePreview(value: Boolean): Self = StObject.set(x, "generatePreview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeneratePreviewUndefined: Self = StObject.set(x, "generatePreview", js.undefined)
    
    @scala.inline
    def setIncludeCommandLineAPI(value: Boolean): Self = StObject.set(x, "includeCommandLineAPI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeCommandLineAPIUndefined: Self = StObject.set(x, "includeCommandLineAPI", js.undefined)
    
    @scala.inline
    def setObjectGroup(value: String): Self = StObject.set(x, "objectGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectGroupUndefined: Self = StObject.set(x, "objectGroup", js.undefined)
    
    @scala.inline
    def setReplMode(value: Boolean): Self = StObject.set(x, "replMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplModeUndefined: Self = StObject.set(x, "replMode", js.undefined)
    
    @scala.inline
    def setReturnByValue(value: Boolean): Self = StObject.set(x, "returnByValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnByValueUndefined: Self = StObject.set(x, "returnByValue", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    @scala.inline
    def setThrowOnSideEffect(value: Boolean): Self = StObject.set(x, "throwOnSideEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrowOnSideEffectUndefined: Self = StObject.set(x, "throwOnSideEffect", js.undefined)
    
    @scala.inline
    def setTimeout(value: TimeDelta): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setUserGesture(value: Boolean): Self = StObject.set(x, "userGesture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserGestureUndefined: Self = StObject.set(x, "userGesture", js.undefined)
  }
}
