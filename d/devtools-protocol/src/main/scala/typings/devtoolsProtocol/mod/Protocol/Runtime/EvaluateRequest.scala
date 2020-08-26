package typings.devtoolsProtocol.mod.Protocol.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EvaluateRequest extends js.Object {
  /**
    * The Content Security Policy (CSP) for the target might block 'unsafe-eval'
    * which includes eval(), Function(), setTimeout() and setInterval()
    * when called with non-callable arguments. This flag bypasses CSP for this
    * evaluation and allows unsafe-eval. Defaults to true.
    */
  var allowUnsafeEvalBlockedByCSP: js.UndefOr[Boolean] = js.native
  /**
    * Whether execution should `await` for resulting value and return once awaited promise is
    * resolved.
    */
  var awaitPromise: js.UndefOr[Boolean] = js.native
  /**
    * Specifies in which execution context to perform evaluation. If the parameter is omitted the
    * evaluation will be performed in the context of the inspected page.
    */
  var contextId: js.UndefOr[ExecutionContextId] = js.native
  /**
    * Disable breakpoints during execution.
    */
  var disableBreaks: js.UndefOr[Boolean] = js.native
  /**
    * Expression to evaluate.
    */
  var expression: String = js.native
  /**
    * Whether preview should be generated for the result.
    */
  var generatePreview: js.UndefOr[Boolean] = js.native
  /**
    * Determines whether Command Line API should be available during the evaluation.
    */
  var includeCommandLineAPI: js.UndefOr[Boolean] = js.native
  /**
    * Symbolic group name that can be used to release multiple objects.
    */
  var objectGroup: js.UndefOr[String] = js.native
  /**
    * Setting this flag to true enables `let` re-declaration and top-level `await`.
    * Note that `let` variables can only be re-declared if they originate from
    * `replMode` themselves.
    */
  var replMode: js.UndefOr[Boolean] = js.native
  /**
    * Whether the result is expected to be a JSON object that should be sent by value.
    */
  var returnByValue: js.UndefOr[Boolean] = js.native
  /**
    * In silent mode exceptions thrown during evaluation are not reported and do not pause
    * execution. Overrides `setPauseOnException` state.
    */
  var silent: js.UndefOr[Boolean] = js.native
  /**
    * Whether to throw an exception if side effect cannot be ruled out during evaluation.
    * This implies `disableBreaks` below.
    */
  var throwOnSideEffect: js.UndefOr[Boolean] = js.native
  /**
    * Terminate execution after timing out (number of milliseconds).
    */
  var timeout: js.UndefOr[TimeDelta] = js.native
  /**
    * Whether execution should be treated as initiated by user in the UI.
    */
  var userGesture: js.UndefOr[Boolean] = js.native
}

object EvaluateRequest {
  @scala.inline
  def apply(expression: String): EvaluateRequest = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluateRequest]
  }
  @scala.inline
  implicit class EvaluateRequestOps[Self <: EvaluateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExpression(value: String): Self = this.set("expression", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowUnsafeEvalBlockedByCSP(value: Boolean): Self = this.set("allowUnsafeEvalBlockedByCSP", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowUnsafeEvalBlockedByCSP: Self = this.set("allowUnsafeEvalBlockedByCSP", js.undefined)
    @scala.inline
    def setAwaitPromise(value: Boolean): Self = this.set("awaitPromise", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwaitPromise: Self = this.set("awaitPromise", js.undefined)
    @scala.inline
    def setContextId(value: ExecutionContextId): Self = this.set("contextId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextId: Self = this.set("contextId", js.undefined)
    @scala.inline
    def setDisableBreaks(value: Boolean): Self = this.set("disableBreaks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableBreaks: Self = this.set("disableBreaks", js.undefined)
    @scala.inline
    def setGeneratePreview(value: Boolean): Self = this.set("generatePreview", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeneratePreview: Self = this.set("generatePreview", js.undefined)
    @scala.inline
    def setIncludeCommandLineAPI(value: Boolean): Self = this.set("includeCommandLineAPI", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeCommandLineAPI: Self = this.set("includeCommandLineAPI", js.undefined)
    @scala.inline
    def setObjectGroup(value: String): Self = this.set("objectGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectGroup: Self = this.set("objectGroup", js.undefined)
    @scala.inline
    def setReplMode(value: Boolean): Self = this.set("replMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplMode: Self = this.set("replMode", js.undefined)
    @scala.inline
    def setReturnByValue(value: Boolean): Self = this.set("returnByValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnByValue: Self = this.set("returnByValue", js.undefined)
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    @scala.inline
    def setThrowOnSideEffect(value: Boolean): Self = this.set("throwOnSideEffect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrowOnSideEffect: Self = this.set("throwOnSideEffect", js.undefined)
    @scala.inline
    def setTimeout(value: TimeDelta): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setUserGesture(value: Boolean): Self = this.set("userGesture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserGesture: Self = this.set("userGesture", js.undefined)
  }
  
}

