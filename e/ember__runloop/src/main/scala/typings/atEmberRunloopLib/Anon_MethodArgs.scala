package typings
package atEmberRunloopLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_MethodArgs extends js.Object {
  var queues: js.Array[atEmberRunloopLib.dashPrivateTypesMod.EmberRunQueues] = js.native
  /**
    * Runs the passed target and method inside of a RunLoop, ensuring any
    * deferred actions including bindings and views updates are flushed at the
    * end.
    */
  def apply[Ret](method: js.Function1[/* repeated */ js.Any, Ret]): Ret = js.native
  def apply[Target, Ret](target: Target, method: atEmberRunloopLib.dashPrivateTypesMod.RunMethod[Target, Ret]): Ret = js.native
  /**
    * Begins a new RunLoop. Any deferred actions invoked after the begin will
    * be buffered until you invoke a matching call to `run.end()`. This is
    * a lower-level way to use a RunLoop instead of using `run()`.
    */
  def begin(): scala.Unit = js.native
  /**
    * Allows you to specify which context to call the specified function in while
    * adding the execution of that function to the Ember run loop. This ability
    * makes this method a great way to asynchronously integrate third-party libraries
    * into your Ember application.
    */
  def bind[Target, Ret](
    target: Target,
    method: atEmberRunloopLib.dashPrivateTypesMod.RunMethod[Target, Ret],
    args: js.Any*
  ): js.Function1[/* repeated */ js.Any, Ret] = js.native
  /**
    * Cancels a scheduled item. Must be a value returned by `run.later()`,
    * `run.once()`, `run.scheduleOnce()`, `run.next()`, `run.debounce()`, or
    * `run.throttle()`.
    */
  def cancel(timer: atEmberRunloopLib.typesMod.EmberRunTimer): scala.Boolean = js.native
  /**
    * Delay calling the target method until the debounce period has elapsed
    * with no additional debounce calls. If `debounce` is called again before
    * the specified time has elapsed, the timer is reset and the entire period
    * must pass again before the target method is called.
    */
  def debounce(method: js.Function1[/* repeated */ js.Any, _], wait: scala.Double): atEmberRunloopLib.typesMod.EmberRunTimer = js.native
  def debounce(method: js.Function1[/* repeated */ js.Any, _], wait: scala.Double, immediate: scala.Boolean): atEmberRunloopLib.typesMod.EmberRunTimer = js.native
  def debounce[Target](
    target: Target,
    method: atEmberRunloopLib.dashPrivateTypesMod.RunMethod[Target, _],
    arg0: js.Any,
    arg1: js.Any,
    arg2: js.Any,
    arg3: js.Any,
    arg4: js.Any,
    arg5: js.Any,
    wait: scala.Double
  ): atEmberRunloopLib.typesMod.EmberRunTimer = js.native
  def debounce[Target](
    target: Target,
    method: atEmberRunloopLib.dashPrivateTypesMod.RunMethod[Target, _],
    arg0: js.Any,
    arg1: js.Any,
    arg2: js.Any,
    arg3: js.Any,
    arg4: js.Any,
    arg5: js.Any,
    wait: scala.Double,
    immediate: scala.Boolean
  ): atEmberRunloopLib.typesMod.EmberRunTimer = js.native
  def debounce[Target](
    target: Target,
    method: atEmberRunloopLib.dashPrivateTypesMod.RunMethod[Target, _],
    arg0: js.Any,
    arg1: js.Any,
    arg2: js.Any,
    arg3: js.Any,
    arg4: js.Any,
    wait: scala.Double
  ): atEmberRunloopLib.typesMod.EmberRunTimer = js.native
  def debounce[Target](
    target: Target,
    method: atEmberRunloopLib.dashPrivateTypesMod.RunMethod[Target, _],
    arg0: js.Any,
    arg1: js.Any,
    arg2: js.Any,
    arg3: js.Any,
    arg4: js.Any,
    wait: scala.Double,
    immediate: scala.Boolean
  ): atEmberRunloopLib.typesMod.EmberRunTimer = js.native
  def debounce[Target](
    target: Target,
    method: atEmberRunloopLib.dashPrivateTypesMod.RunMethod[Target, _],
    arg0: js.Any,
    arg1: js.Any,
    arg2: js.Any,
    arg3: js.Any,
    wait: scala.Double
  ): atEmberRunloopLib.typesMod.EmberRunTimer = js.native
  def debounce[Target](
    target: Target,
    method: atEmberRunloopLib.dashPrivateTypesMod.RunMethod[Target, _],
    arg0: js.Any,
    arg1: js.Any,
    arg2: js.Any,
    arg3: js.Any,
    wait: scala.Double,
    immediate: scala.Boolean
  ): atEmberRunloopLib.typesMod.EmberRunTimer = js.native
  def debounce[Target](
    target: Target,
    method: atEmberRunloopLib.dashPrivateTypesMod.RunMethod[Target, _],
    arg0: js.Any,
    arg1: js.Any,
    arg2: js.Any,
    wait: scala.Double
  ): atEmberRunloopLib.typesMod.EmberRunTimer = js.native
  def debounce[Target](
    target: Target,
    method: atEmberRunloopLib.dashPrivateTypesMod.RunMethod[Target, _],
    arg0: js.Any,
    arg1: js.Any,
    arg2: js.Any,
    wait: scala.Double,
    immediate: scala.Boolean
  ): atEmberRunloopLib.typesMod.EmberRunTimer = js.native
  def debounce[Target](
    target: Target,
    method: atEmberRunloopLib.dashPrivateTypesMod.RunMethod[Target, _],
    arg0: js.Any,
    arg1: js.Any,
    wait: scala.Double
  ): atEmberRunloopLib.typesMod.EmberRunTimer = js.native
  def debounce[Target](
    target: Target,
    method: atEmberRunloopLib.dashPrivateTypesMod.RunMethod[Target, _],
    arg0: js.Any,
    arg1: js.Any,
    wait: scala.Double,
    immediate: scala.Boolean
  ): atEmberRunloopLib.typesMod.EmberRunTimer = js.native
  def debounce[Target](
    target: Target,
    method: atEmberRunloopLib.dashPrivateTypesMod.RunMethod[Target, _],
    arg0: js.Any,
    wait: scala.Double
  ): atEmberRunloopLib.typesMod.EmberRunTimer = js.native
  def debounce[Target](
    target: Target,
    method: atEmberRunloopLib.dashPrivateTypesMod.RunMethod[Target, _],
    arg0: js.Any,
    wait: scala.Double,
    immediate: scala.Boolean
  ): atEmberRunloopLib.typesMod.EmberRunTimer = js.native
  def debounce[Target](
    target: Target,
    method: atEmberRunloopLib.dashPrivateTypesMod.RunMethod[Target, _],
    wait: scala.Double
  ): atEmberRunloopLib.typesMod.EmberRunTimer = js.native
  def debounce[Target](
    target: Target,
    method: atEmberRunloopLib.dashPrivateTypesMod.RunMethod[Target, _],
    wait: scala.Double,
    immediate: scala.Boolean
  ): atEmberRunloopLib.typesMod.EmberRunTimer = js.native
  /**
    * Ends a RunLoop. This must be called sometime after you call
    * `run.begin()` to flush any deferred actions. This is a lower-level way
    * to use a RunLoop instead of using `run()`.
    */
  def end(): scala.Unit = js.native
  /**
    * If no run-loop is present, it creates a new one. If a run loop is
    * present it will queue itself to run on the existing run-loops action
    * queue.
    */
  def join[Ret](method: js.Function1[/* repeated */ js.Any, Ret], args: js.Any*): js.UndefOr[Ret] = js.native
  def join[Target, Ret](
    target: Target,
    method: atEmberRunloopLib.dashPrivateTypesMod.RunMethod[Target, Ret],
    args: js.Any*
  ): js.UndefOr[Ret] = js.native
  /**
    * Invokes the passed target/method and optional arguments after a specified
    * period of time. The last parameter of this method must always be a number
    * of milliseconds.
    */
  def later(method: js.Function1[/* repeated */ js.Any, _], wait: scala.Double): atEmberRunloopLib.typesMod.EmberRunTimer = js.native
  def later[Target](
    target: Target,
    method: atEmberRunloopLib.dashPrivateTypesMod.RunMethod[Target, _],
    arg0: js.Any,
    arg1: js.Any,
    arg2: js.Any,
    arg3: js.Any,
    arg4: js.Any,
    arg5: js.Any,
    wait: scala.Double
  ): atEmberRunloopLib.typesMod.EmberRunTimer = js.native
  def later[Target](
    target: Target,
    method: atEmberRunloopLib.dashPrivateTypesMod.RunMethod[Target, _],
    arg0: js.Any,
    arg1: js.Any,
    arg2: js.Any,
    arg3: js.Any,
    arg4: js.Any,
    wait: scala.Double
  ): atEmberRunloopLib.typesMod.EmberRunTimer = js.native
  def later[Target](
    target: Target,
    method: atEmberRunloopLib.dashPrivateTypesMod.RunMethod[Target, _],
    arg0: js.Any,
    arg1: js.Any,
    arg2: js.Any,
    arg3: js.Any,
    wait: scala.Double
  ): atEmberRunloopLib.typesMod.EmberRunTimer = js.native
  def later[Target](
    target: Target,
    method: atEmberRunloopLib.dashPrivateTypesMod.RunMethod[Target, _],
    arg0: js.Any,
    arg1: js.Any,
    arg2: js.Any,
    wait: scala.Double
  ): atEmberRunloopLib.typesMod.EmberRunTimer = js.native
  def later[Target](
    target: Target,
    method: atEmberRunloopLib.dashPrivateTypesMod.RunMethod[Target, _],
    arg0: js.Any,
    arg1: js.Any,
    wait: scala.Double
  ): atEmberRunloopLib.typesMod.EmberRunTimer = js.native
  def later[Target](
    target: Target,
    method: atEmberRunloopLib.dashPrivateTypesMod.RunMethod[Target, _],
    arg0: js.Any,
    wait: scala.Double
  ): atEmberRunloopLib.typesMod.EmberRunTimer = js.native
  def later[Target](
    target: Target,
    method: atEmberRunloopLib.dashPrivateTypesMod.RunMethod[Target, _],
    wait: scala.Double
  ): atEmberRunloopLib.typesMod.EmberRunTimer = js.native
  /**
    * Schedules an item to run from within a separate run loop, after
    * control has been returned to the system. This is equivalent to calling
    * `run.later` with a wait time of 1ms.
    */
  def next[Target](target: Target, method: atEmberRunloopLib.dashPrivateTypesMod.RunMethod[Target, _], args: js.Any*): atEmberRunloopLib.typesMod.EmberRunTimer = js.native
  /**
    * Schedule a function to run one time during the current RunLoop. This is equivalent
    * to calling `scheduleOnce` with the "actions" queue.
    */
  def once[Target](target: Target, method: atEmberRunloopLib.dashPrivateTypesMod.RunMethod[Target, _], args: js.Any*): atEmberRunloopLib.typesMod.EmberRunTimer = js.native
  def schedule(
    queue: atEmberRunloopLib.dashPrivateTypesMod.EmberRunQueues,
    method: js.Function1[/* args */ js.Array[_], _],
    args: js.Any*
  ): atEmberRunloopLib.typesMod.EmberRunTimer = js.native
  /**
    * Adds the passed target/method and any optional arguments to the named
    * queue to be executed at the end of the RunLoop. If you have not already
    * started a RunLoop when calling this method one will be started for you
    * automatically.
    */
  def schedule[Target](
    queue: atEmberRunloopLib.dashPrivateTypesMod.EmberRunQueues,
    target: Target,
    method: atEmberRunloopLib.dashPrivateTypesMod.RunMethod[Target, _],
    args: js.Any*
  ): atEmberRunloopLib.typesMod.EmberRunTimer = js.native
  /**
    * Schedules a function to run one time in a given queue of the current RunLoop.
    * Calling this method with the same queue/target/method combination will have
    * no effect (past the initial call).
    */
  def scheduleOnce[Target](
    queue: atEmberRunloopLib.dashPrivateTypesMod.EmberRunQueues,
    target: Target,
    method: atEmberRunloopLib.dashPrivateTypesMod.RunMethod[Target, _],
    args: js.Any*
  ): atEmberRunloopLib.typesMod.EmberRunTimer = js.native
  /**
    * Ensure that the target method is never called more frequently than
    * the specified spacing period. The target method is called immediately.
    */
  def throttle(method: js.Function1[/* repeated */ js.Any, _], spacing: scala.Double): atEmberRunloopLib.typesMod.EmberRunTimer = js.native
  def throttle(method: js.Function1[/* repeated */ js.Any, _], spacing: scala.Double, immediate: scala.Boolean): atEmberRunloopLib.typesMod.EmberRunTimer = js.native
  def throttle[Target](
    target: Target,
    method: atEmberRunloopLib.dashPrivateTypesMod.RunMethod[Target, _],
    arg0: js.Any,
    arg1: js.Any,
    arg2: js.Any,
    arg3: js.Any,
    arg4: js.Any,
    arg5: js.Any,
    spacing: scala.Double
  ): atEmberRunloopLib.typesMod.EmberRunTimer = js.native
  def throttle[Target](
    target: Target,
    method: atEmberRunloopLib.dashPrivateTypesMod.RunMethod[Target, _],
    arg0: js.Any,
    arg1: js.Any,
    arg2: js.Any,
    arg3: js.Any,
    arg4: js.Any,
    arg5: js.Any,
    spacing: scala.Double,
    immediate: scala.Boolean
  ): atEmberRunloopLib.typesMod.EmberRunTimer = js.native
  def throttle[Target](
    target: Target,
    method: atEmberRunloopLib.dashPrivateTypesMod.RunMethod[Target, _],
    arg0: js.Any,
    arg1: js.Any,
    arg2: js.Any,
    arg3: js.Any,
    arg4: js.Any,
    spacing: scala.Double
  ): atEmberRunloopLib.typesMod.EmberRunTimer = js.native
  def throttle[Target](
    target: Target,
    method: atEmberRunloopLib.dashPrivateTypesMod.RunMethod[Target, _],
    arg0: js.Any,
    arg1: js.Any,
    arg2: js.Any,
    arg3: js.Any,
    arg4: js.Any,
    spacing: scala.Double,
    immediate: scala.Boolean
  ): atEmberRunloopLib.typesMod.EmberRunTimer = js.native
  def throttle[Target](
    target: Target,
    method: atEmberRunloopLib.dashPrivateTypesMod.RunMethod[Target, _],
    arg0: js.Any,
    arg1: js.Any,
    arg2: js.Any,
    arg3: js.Any,
    spacing: scala.Double
  ): atEmberRunloopLib.typesMod.EmberRunTimer = js.native
  def throttle[Target](
    target: Target,
    method: atEmberRunloopLib.dashPrivateTypesMod.RunMethod[Target, _],
    arg0: js.Any,
    arg1: js.Any,
    arg2: js.Any,
    arg3: js.Any,
    spacing: scala.Double,
    immediate: scala.Boolean
  ): atEmberRunloopLib.typesMod.EmberRunTimer = js.native
  def throttle[Target](
    target: Target,
    method: atEmberRunloopLib.dashPrivateTypesMod.RunMethod[Target, _],
    arg0: js.Any,
    arg1: js.Any,
    arg2: js.Any,
    spacing: scala.Double
  ): atEmberRunloopLib.typesMod.EmberRunTimer = js.native
  def throttle[Target](
    target: Target,
    method: atEmberRunloopLib.dashPrivateTypesMod.RunMethod[Target, _],
    arg0: js.Any,
    arg1: js.Any,
    arg2: js.Any,
    spacing: scala.Double,
    immediate: scala.Boolean
  ): atEmberRunloopLib.typesMod.EmberRunTimer = js.native
  def throttle[Target](
    target: Target,
    method: atEmberRunloopLib.dashPrivateTypesMod.RunMethod[Target, _],
    arg0: js.Any,
    arg1: js.Any,
    spacing: scala.Double
  ): atEmberRunloopLib.typesMod.EmberRunTimer = js.native
  def throttle[Target](
    target: Target,
    method: atEmberRunloopLib.dashPrivateTypesMod.RunMethod[Target, _],
    arg0: js.Any,
    arg1: js.Any,
    spacing: scala.Double,
    immediate: scala.Boolean
  ): atEmberRunloopLib.typesMod.EmberRunTimer = js.native
  def throttle[Target](
    target: Target,
    method: atEmberRunloopLib.dashPrivateTypesMod.RunMethod[Target, _],
    arg0: js.Any,
    spacing: scala.Double
  ): atEmberRunloopLib.typesMod.EmberRunTimer = js.native
  def throttle[Target](
    target: Target,
    method: atEmberRunloopLib.dashPrivateTypesMod.RunMethod[Target, _],
    arg0: js.Any,
    spacing: scala.Double,
    immediate: scala.Boolean
  ): atEmberRunloopLib.typesMod.EmberRunTimer = js.native
  def throttle[Target](
    target: Target,
    method: atEmberRunloopLib.dashPrivateTypesMod.RunMethod[Target, _],
    spacing: scala.Double
  ): atEmberRunloopLib.typesMod.EmberRunTimer = js.native
  def throttle[Target](
    target: Target,
    method: atEmberRunloopLib.dashPrivateTypesMod.RunMethod[Target, _],
    spacing: scala.Double,
    immediate: scala.Boolean
  ): atEmberRunloopLib.typesMod.EmberRunTimer = js.native
}

