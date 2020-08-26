package typings.execa.mod

import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecaChildPromise[StdoutErrorType] extends js.Object {
  /**
  		Stream combining/interleaving [`stdout`](https://nodejs.org/api/child_process.html#child_process_subprocess_stdout) and [`stderr`](https://nodejs.org/api/child_process.html#child_process_subprocess_stderr).
  		This is `undefined` if either:
  			- the `all` option is `false` (the default value)
  			- both `stdout` and `stderr` options are set to [`'inherit'`, `'ipc'`, `Stream` or `integer`](https://nodejs.org/dist/latest-v6.x/docs/api/child_process.html#child_process_options_stdio)
  		*/
  var all: js.UndefOr[Readable] = js.native
  /**
  		Similar to [`childProcess.kill()`](https://nodejs.org/api/child_process.html#child_process_subprocess_kill_signal). This is preferred when cancelling the child process execution as the error is more descriptive and [`childProcessResult.isCanceled`](#iscanceled) is set to `true`.
  		*/
  def cancel(): Unit = js.native
  def `catch`[ResultType](): js.Promise[ExecaReturnValue[StdoutErrorType] | ResultType] = js.native
  def `catch`[ResultType](
    onRejected: js.Function1[/* reason */ ExecaError[StdoutErrorType], ResultType | js.Thenable[ResultType]]
  ): js.Promise[ExecaReturnValue[StdoutErrorType] | ResultType] = js.native
  /**
  		Same as the original [`child_process#kill()`](https://nodejs.org/api/child_process.html#child_process_subprocess_kill_signal), except if `signal` is `SIGTERM` (the default value) and the child process is not terminated after 5 seconds, force it by sending `SIGKILL`.
  		*/
  def kill(): Unit = js.native
  def kill(signal: js.UndefOr[scala.Nothing], options: KillOptions): Unit = js.native
  def kill(signal: String): Unit = js.native
  def kill(signal: String, options: KillOptions): Unit = js.native
}

