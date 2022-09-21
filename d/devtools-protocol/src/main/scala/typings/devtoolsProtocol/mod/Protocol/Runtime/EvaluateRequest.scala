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
    * This is mutually exclusive with `uniqueContextId`, which offers an
    * alternative way to identify the execution context that is more reliable
    * in a multi-process environment.
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
    * Whether the result should be serialized according to https://w3c.github.io/webdriver-bidi.
    */
  var generateWebDriverValue: js.UndefOr[Boolean] = js.undefined
  
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
    * An alternative way to specify the execution context to evaluate in.
    * Compared to contextId that may be reused across processes, this is guaranteed to be
    * system-unique, so it can be used to prevent accidental evaluation of the expression
    * in context different than intended (e.g. as a result of navigation across process
    * boundaries).
    * This is mutually exclusive with `contextId`.
    */
  var uniqueContextId: js.UndefOr[String] = js.undefined
  
  /**
    * Whether execution should be treated as initiated by user in the UI.
    */
  var userGesture: js.UndefOr[Boolean] = js.undefined
}
object EvaluateRequest {
  
  inline def apply(expression: String): EvaluateRequest = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluateRequest]
  }
  
  extension [Self <: EvaluateRequest](x: Self) {
    
    inline def setAllowUnsafeEvalBlockedByCSP(value: Boolean): Self = StObject.set(x, "allowUnsafeEvalBlockedByCSP", value.asInstanceOf[js.Any])
    
    inline def setAllowUnsafeEvalBlockedByCSPUndefined: Self = StObject.set(x, "allowUnsafeEvalBlockedByCSP", js.undefined)
    
    inline def setAwaitPromise(value: Boolean): Self = StObject.set(x, "awaitPromise", value.asInstanceOf[js.Any])
    
    inline def setAwaitPromiseUndefined: Self = StObject.set(x, "awaitPromise", js.undefined)
    
    inline def setContextId(value: ExecutionContextId): Self = StObject.set(x, "contextId", value.asInstanceOf[js.Any])
    
    inline def setContextIdUndefined: Self = StObject.set(x, "contextId", js.undefined)
    
    inline def setDisableBreaks(value: Boolean): Self = StObject.set(x, "disableBreaks", value.asInstanceOf[js.Any])
    
    inline def setDisableBreaksUndefined: Self = StObject.set(x, "disableBreaks", js.undefined)
    
    inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setGeneratePreview(value: Boolean): Self = StObject.set(x, "generatePreview", value.asInstanceOf[js.Any])
    
    inline def setGeneratePreviewUndefined: Self = StObject.set(x, "generatePreview", js.undefined)
    
    inline def setGenerateWebDriverValue(value: Boolean): Self = StObject.set(x, "generateWebDriverValue", value.asInstanceOf[js.Any])
    
    inline def setGenerateWebDriverValueUndefined: Self = StObject.set(x, "generateWebDriverValue", js.undefined)
    
    inline def setIncludeCommandLineAPI(value: Boolean): Self = StObject.set(x, "includeCommandLineAPI", value.asInstanceOf[js.Any])
    
    inline def setIncludeCommandLineAPIUndefined: Self = StObject.set(x, "includeCommandLineAPI", js.undefined)
    
    inline def setObjectGroup(value: String): Self = StObject.set(x, "objectGroup", value.asInstanceOf[js.Any])
    
    inline def setObjectGroupUndefined: Self = StObject.set(x, "objectGroup", js.undefined)
    
    inline def setReplMode(value: Boolean): Self = StObject.set(x, "replMode", value.asInstanceOf[js.Any])
    
    inline def setReplModeUndefined: Self = StObject.set(x, "replMode", js.undefined)
    
    inline def setReturnByValue(value: Boolean): Self = StObject.set(x, "returnByValue", value.asInstanceOf[js.Any])
    
    inline def setReturnByValueUndefined: Self = StObject.set(x, "returnByValue", js.undefined)
    
    inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    inline def setThrowOnSideEffect(value: Boolean): Self = StObject.set(x, "throwOnSideEffect", value.asInstanceOf[js.Any])
    
    inline def setThrowOnSideEffectUndefined: Self = StObject.set(x, "throwOnSideEffect", js.undefined)
    
    inline def setTimeout(value: TimeDelta): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUniqueContextId(value: String): Self = StObject.set(x, "uniqueContextId", value.asInstanceOf[js.Any])
    
    inline def setUniqueContextIdUndefined: Self = StObject.set(x, "uniqueContextId", js.undefined)
    
    inline def setUserGesture(value: Boolean): Self = StObject.set(x, "userGesture", value.asInstanceOf[js.Any])
    
    inline def setUserGestureUndefined: Self = StObject.set(x, "userGesture", js.undefined)
  }
}
