package typings.emberRunloop

import typings.emberRunloop.privateTypesMod.EmberRunQueues
import typings.emberRunloop.privateTypesMod.RunMethod
import typings.emberRunloop.typesMod.EmberRunTimer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ember/runloop", "begin")
  @js.native
  val begin: js.Function0[Unit] = js.native
  
  @JSImport("@ember/runloop", "bind")
  @js.native
  def bind[Target, Ret](target: Target, method: RunMethod[Target, Ret], args: js.Any*): js.Function1[/* repeated */ js.Any, Ret] = js.native
  
  @JSImport("@ember/runloop", "cancel")
  @js.native
  val cancel: js.Function1[/* timer */ EmberRunTimer, Boolean] = js.native
  
  @JSImport("@ember/runloop", "debounce")
  @js.native
  def debounce(method: js.Function1[/* repeated */ js.Any, _], wait: Double): EmberRunTimer = js.native
  @JSImport("@ember/runloop", "debounce")
  @js.native
  def debounce(method: js.Function1[/* repeated */ js.Any, _], wait: Double, immediate: Boolean): EmberRunTimer = js.native
  @JSImport("@ember/runloop", "debounce")
  @js.native
  def debounce[Target](
    target: Target,
    method: RunMethod[Target, _],
    arg0: js.Any,
    arg1: js.Any,
    arg2: js.Any,
    arg3: js.Any,
    arg4: js.Any,
    arg5: js.Any,
    wait: Double
  ): EmberRunTimer = js.native
  @JSImport("@ember/runloop", "debounce")
  @js.native
  def debounce[Target](
    target: Target,
    method: RunMethod[Target, _],
    arg0: js.Any,
    arg1: js.Any,
    arg2: js.Any,
    arg3: js.Any,
    arg4: js.Any,
    arg5: js.Any,
    wait: Double,
    immediate: Boolean
  ): EmberRunTimer = js.native
  @JSImport("@ember/runloop", "debounce")
  @js.native
  def debounce[Target](
    target: Target,
    method: RunMethod[Target, _],
    arg0: js.Any,
    arg1: js.Any,
    arg2: js.Any,
    arg3: js.Any,
    arg4: js.Any,
    wait: Double
  ): EmberRunTimer = js.native
  @JSImport("@ember/runloop", "debounce")
  @js.native
  def debounce[Target](
    target: Target,
    method: RunMethod[Target, _],
    arg0: js.Any,
    arg1: js.Any,
    arg2: js.Any,
    arg3: js.Any,
    arg4: js.Any,
    wait: Double,
    immediate: Boolean
  ): EmberRunTimer = js.native
  @JSImport("@ember/runloop", "debounce")
  @js.native
  def debounce[Target](
    target: Target,
    method: RunMethod[Target, _],
    arg0: js.Any,
    arg1: js.Any,
    arg2: js.Any,
    arg3: js.Any,
    wait: Double
  ): EmberRunTimer = js.native
  @JSImport("@ember/runloop", "debounce")
  @js.native
  def debounce[Target](
    target: Target,
    method: RunMethod[Target, _],
    arg0: js.Any,
    arg1: js.Any,
    arg2: js.Any,
    arg3: js.Any,
    wait: Double,
    immediate: Boolean
  ): EmberRunTimer = js.native
  @JSImport("@ember/runloop", "debounce")
  @js.native
  def debounce[Target](
    target: Target,
    method: RunMethod[Target, _],
    arg0: js.Any,
    arg1: js.Any,
    arg2: js.Any,
    wait: Double
  ): EmberRunTimer = js.native
  @JSImport("@ember/runloop", "debounce")
  @js.native
  def debounce[Target](
    target: Target,
    method: RunMethod[Target, _],
    arg0: js.Any,
    arg1: js.Any,
    arg2: js.Any,
    wait: Double,
    immediate: Boolean
  ): EmberRunTimer = js.native
  @JSImport("@ember/runloop", "debounce")
  @js.native
  def debounce[Target](target: Target, method: RunMethod[Target, _], arg0: js.Any, arg1: js.Any, wait: Double): EmberRunTimer = js.native
  @JSImport("@ember/runloop", "debounce")
  @js.native
  def debounce[Target](
    target: Target,
    method: RunMethod[Target, _],
    arg0: js.Any,
    arg1: js.Any,
    wait: Double,
    immediate: Boolean
  ): EmberRunTimer = js.native
  @JSImport("@ember/runloop", "debounce")
  @js.native
  def debounce[Target](target: Target, method: RunMethod[Target, _], arg0: js.Any, wait: Double): EmberRunTimer = js.native
  @JSImport("@ember/runloop", "debounce")
  @js.native
  def debounce[Target](target: Target, method: RunMethod[Target, _], arg0: js.Any, wait: Double, immediate: Boolean): EmberRunTimer = js.native
  @JSImport("@ember/runloop", "debounce")
  @js.native
  def debounce[Target](target: Target, method: RunMethod[Target, _], wait: Double): EmberRunTimer = js.native
  @JSImport("@ember/runloop", "debounce")
  @js.native
  def debounce[Target](target: Target, method: RunMethod[Target, _], wait: Double, immediate: Boolean): EmberRunTimer = js.native
  
  @JSImport("@ember/runloop", "end")
  @js.native
  val end: js.Function0[Unit] = js.native
  
  @JSImport("@ember/runloop", "join")
  @js.native
  def join[Ret](method: js.Function1[/* repeated */ js.Any, Ret], args: js.Any*): js.UndefOr[Ret] = js.native
  @JSImport("@ember/runloop", "join")
  @js.native
  def join[Target, Ret](target: Target, method: RunMethod[Target, Ret], args: js.Any*): js.UndefOr[Ret] = js.native
  
  @JSImport("@ember/runloop", "later")
  @js.native
  def later(method: js.Function1[/* repeated */ js.Any, _], wait: Double): EmberRunTimer = js.native
  @JSImport("@ember/runloop", "later")
  @js.native
  def later[Target](
    target: Target,
    method: RunMethod[Target, _],
    arg0: js.Any,
    arg1: js.Any,
    arg2: js.Any,
    arg3: js.Any,
    arg4: js.Any,
    arg5: js.Any,
    wait: Double
  ): EmberRunTimer = js.native
  @JSImport("@ember/runloop", "later")
  @js.native
  def later[Target](
    target: Target,
    method: RunMethod[Target, _],
    arg0: js.Any,
    arg1: js.Any,
    arg2: js.Any,
    arg3: js.Any,
    arg4: js.Any,
    wait: Double
  ): EmberRunTimer = js.native
  @JSImport("@ember/runloop", "later")
  @js.native
  def later[Target](
    target: Target,
    method: RunMethod[Target, _],
    arg0: js.Any,
    arg1: js.Any,
    arg2: js.Any,
    arg3: js.Any,
    wait: Double
  ): EmberRunTimer = js.native
  @JSImport("@ember/runloop", "later")
  @js.native
  def later[Target](
    target: Target,
    method: RunMethod[Target, _],
    arg0: js.Any,
    arg1: js.Any,
    arg2: js.Any,
    wait: Double
  ): EmberRunTimer = js.native
  @JSImport("@ember/runloop", "later")
  @js.native
  def later[Target](target: Target, method: RunMethod[Target, _], arg0: js.Any, arg1: js.Any, wait: Double): EmberRunTimer = js.native
  @JSImport("@ember/runloop", "later")
  @js.native
  def later[Target](target: Target, method: RunMethod[Target, _], arg0: js.Any, wait: Double): EmberRunTimer = js.native
  @JSImport("@ember/runloop", "later")
  @js.native
  def later[Target](target: Target, method: RunMethod[Target, _], wait: Double): EmberRunTimer = js.native
  
  @JSImport("@ember/runloop", "next")
  @js.native
  def next(method: js.Function0[Unit], args: js.Any*): EmberRunTimer = js.native
  @JSImport("@ember/runloop", "next")
  @js.native
  def next[Target](target: Target, method: RunMethod[Target, _], args: js.Any*): EmberRunTimer = js.native
  
  @JSImport("@ember/runloop", "once")
  @js.native
  def once[Target](target: Target, method: RunMethod[Target, _], args: js.Any*): EmberRunTimer = js.native
  
  @JSImport("@ember/runloop", "run")
  @js.native
  val run: RunNamespace = js.native
  
  @JSImport("@ember/runloop", "schedule")
  @js.native
  def schedule(queue: EmberRunQueues, method: js.Function1[/* args */ js.Array[_], _], args: js.Any*): EmberRunTimer = js.native
  @JSImport("@ember/runloop", "schedule")
  @js.native
  def schedule[Target](queue: EmberRunQueues, target: Target, method: RunMethod[Target, _], args: js.Any*): EmberRunTimer = js.native
  
  @JSImport("@ember/runloop", "scheduleOnce")
  @js.native
  def scheduleOnce[Target](queue: EmberRunQueues, target: Target, method: RunMethod[Target, _], args: js.Any*): EmberRunTimer = js.native
  
  @JSImport("@ember/runloop", "throttle")
  @js.native
  def throttle(method: js.Function1[/* repeated */ js.Any, _], spacing: Double): EmberRunTimer = js.native
  @JSImport("@ember/runloop", "throttle")
  @js.native
  def throttle(method: js.Function1[/* repeated */ js.Any, _], spacing: Double, immediate: Boolean): EmberRunTimer = js.native
  @JSImport("@ember/runloop", "throttle")
  @js.native
  def throttle[Target](
    target: Target,
    method: RunMethod[Target, _],
    arg0: js.Any,
    arg1: js.Any,
    arg2: js.Any,
    arg3: js.Any,
    arg4: js.Any,
    arg5: js.Any,
    spacing: Double
  ): EmberRunTimer = js.native
  @JSImport("@ember/runloop", "throttle")
  @js.native
  def throttle[Target](
    target: Target,
    method: RunMethod[Target, _],
    arg0: js.Any,
    arg1: js.Any,
    arg2: js.Any,
    arg3: js.Any,
    arg4: js.Any,
    arg5: js.Any,
    spacing: Double,
    immediate: Boolean
  ): EmberRunTimer = js.native
  @JSImport("@ember/runloop", "throttle")
  @js.native
  def throttle[Target](
    target: Target,
    method: RunMethod[Target, _],
    arg0: js.Any,
    arg1: js.Any,
    arg2: js.Any,
    arg3: js.Any,
    arg4: js.Any,
    spacing: Double
  ): EmberRunTimer = js.native
  @JSImport("@ember/runloop", "throttle")
  @js.native
  def throttle[Target](
    target: Target,
    method: RunMethod[Target, _],
    arg0: js.Any,
    arg1: js.Any,
    arg2: js.Any,
    arg3: js.Any,
    arg4: js.Any,
    spacing: Double,
    immediate: Boolean
  ): EmberRunTimer = js.native
  @JSImport("@ember/runloop", "throttle")
  @js.native
  def throttle[Target](
    target: Target,
    method: RunMethod[Target, _],
    arg0: js.Any,
    arg1: js.Any,
    arg2: js.Any,
    arg3: js.Any,
    spacing: Double
  ): EmberRunTimer = js.native
  @JSImport("@ember/runloop", "throttle")
  @js.native
  def throttle[Target](
    target: Target,
    method: RunMethod[Target, _],
    arg0: js.Any,
    arg1: js.Any,
    arg2: js.Any,
    arg3: js.Any,
    spacing: Double,
    immediate: Boolean
  ): EmberRunTimer = js.native
  @JSImport("@ember/runloop", "throttle")
  @js.native
  def throttle[Target](
    target: Target,
    method: RunMethod[Target, _],
    arg0: js.Any,
    arg1: js.Any,
    arg2: js.Any,
    spacing: Double
  ): EmberRunTimer = js.native
  @JSImport("@ember/runloop", "throttle")
  @js.native
  def throttle[Target](
    target: Target,
    method: RunMethod[Target, _],
    arg0: js.Any,
    arg1: js.Any,
    arg2: js.Any,
    spacing: Double,
    immediate: Boolean
  ): EmberRunTimer = js.native
  @JSImport("@ember/runloop", "throttle")
  @js.native
  def throttle[Target](target: Target, method: RunMethod[Target, _], arg0: js.Any, arg1: js.Any, spacing: Double): EmberRunTimer = js.native
  @JSImport("@ember/runloop", "throttle")
  @js.native
  def throttle[Target](
    target: Target,
    method: RunMethod[Target, _],
    arg0: js.Any,
    arg1: js.Any,
    spacing: Double,
    immediate: Boolean
  ): EmberRunTimer = js.native
  @JSImport("@ember/runloop", "throttle")
  @js.native
  def throttle[Target](target: Target, method: RunMethod[Target, _], arg0: js.Any, spacing: Double): EmberRunTimer = js.native
  @JSImport("@ember/runloop", "throttle")
  @js.native
  def throttle[Target](target: Target, method: RunMethod[Target, _], arg0: js.Any, spacing: Double, immediate: Boolean): EmberRunTimer = js.native
  @JSImport("@ember/runloop", "throttle")
  @js.native
  def throttle[Target](target: Target, method: RunMethod[Target, _], spacing: Double): EmberRunTimer = js.native
  @JSImport("@ember/runloop", "throttle")
  @js.native
  def throttle[Target](target: Target, method: RunMethod[Target, _], spacing: Double, immediate: Boolean): EmberRunTimer = js.native
  
  @js.native
  trait RunNamespace extends StObject {
    
    /**
      * Runs the passed target and method inside of a RunLoop, ensuring any
      * deferred actions including bindings and views updates are flushed at the
      * end.
      */
    def apply[Ret](method: js.Function1[/* repeated */ js.Any, Ret]): Ret = js.native
    def apply[Target, Ret](target: Target, method: RunMethod[Target, Ret], args: js.Any*): Ret = js.native
    
    /**
      * Begins a new RunLoop. Any deferred actions invoked after the begin will
      * be buffered until you invoke a matching call to `run.end()`. This is
      * a lower-level way to use a RunLoop instead of using `run()`.
      */
    def begin(): Unit = js.native
    
    /**
      * Allows you to specify which context to call the specified function in while
      * adding the execution of that function to the Ember run loop. This ability
      * makes this method a great way to asynchronously integrate third-party libraries
      * into your Ember application.
      */
    def bind[Target, Ret](target: Target, method: RunMethod[Target, Ret], args: js.Any*): js.Function1[/* repeated */ js.Any, Ret] = js.native
    
    /**
      * Cancels a scheduled item. Must be a value returned by `run.later()`,
      * `run.once()`, `run.scheduleOnce()`, `run.next()`, `run.debounce()`, or
      * `run.throttle()`.
      */
    def cancel(timer: EmberRunTimer): Boolean = js.native
    
    /**
      * Delay calling the target method until the debounce period has elapsed
      * with no additional debounce calls. If `debounce` is called again before
      * the specified time has elapsed, the timer is reset and the entire period
      * must pass again before the target method is called.
      */
    def debounce(method: js.Function1[/* repeated */ js.Any, _], wait: Double): EmberRunTimer = js.native
    def debounce(method: js.Function1[/* repeated */ js.Any, _], wait: Double, immediate: Boolean): EmberRunTimer = js.native
    def debounce[Target](
      target: Target,
      method: RunMethod[Target, _],
      arg0: js.Any,
      arg1: js.Any,
      arg2: js.Any,
      arg3: js.Any,
      arg4: js.Any,
      arg5: js.Any,
      wait: Double
    ): EmberRunTimer = js.native
    def debounce[Target](
      target: Target,
      method: RunMethod[Target, _],
      arg0: js.Any,
      arg1: js.Any,
      arg2: js.Any,
      arg3: js.Any,
      arg4: js.Any,
      arg5: js.Any,
      wait: Double,
      immediate: Boolean
    ): EmberRunTimer = js.native
    def debounce[Target](
      target: Target,
      method: RunMethod[Target, _],
      arg0: js.Any,
      arg1: js.Any,
      arg2: js.Any,
      arg3: js.Any,
      arg4: js.Any,
      wait: Double
    ): EmberRunTimer = js.native
    def debounce[Target](
      target: Target,
      method: RunMethod[Target, _],
      arg0: js.Any,
      arg1: js.Any,
      arg2: js.Any,
      arg3: js.Any,
      arg4: js.Any,
      wait: Double,
      immediate: Boolean
    ): EmberRunTimer = js.native
    def debounce[Target](
      target: Target,
      method: RunMethod[Target, _],
      arg0: js.Any,
      arg1: js.Any,
      arg2: js.Any,
      arg3: js.Any,
      wait: Double
    ): EmberRunTimer = js.native
    def debounce[Target](
      target: Target,
      method: RunMethod[Target, _],
      arg0: js.Any,
      arg1: js.Any,
      arg2: js.Any,
      arg3: js.Any,
      wait: Double,
      immediate: Boolean
    ): EmberRunTimer = js.native
    def debounce[Target](
      target: Target,
      method: RunMethod[Target, _],
      arg0: js.Any,
      arg1: js.Any,
      arg2: js.Any,
      wait: Double
    ): EmberRunTimer = js.native
    def debounce[Target](
      target: Target,
      method: RunMethod[Target, _],
      arg0: js.Any,
      arg1: js.Any,
      arg2: js.Any,
      wait: Double,
      immediate: Boolean
    ): EmberRunTimer = js.native
    def debounce[Target](target: Target, method: RunMethod[Target, _], arg0: js.Any, arg1: js.Any, wait: Double): EmberRunTimer = js.native
    def debounce[Target](
      target: Target,
      method: RunMethod[Target, _],
      arg0: js.Any,
      arg1: js.Any,
      wait: Double,
      immediate: Boolean
    ): EmberRunTimer = js.native
    def debounce[Target](target: Target, method: RunMethod[Target, _], arg0: js.Any, wait: Double): EmberRunTimer = js.native
    def debounce[Target](target: Target, method: RunMethod[Target, _], arg0: js.Any, wait: Double, immediate: Boolean): EmberRunTimer = js.native
    def debounce[Target](target: Target, method: RunMethod[Target, _], wait: Double): EmberRunTimer = js.native
    def debounce[Target](target: Target, method: RunMethod[Target, _], wait: Double, immediate: Boolean): EmberRunTimer = js.native
    
    /**
      * Ends a RunLoop. This must be called sometime after you call
      * `run.begin()` to flush any deferred actions. This is a lower-level way
      * to use a RunLoop instead of using `run()`.
      */
    def end(): Unit = js.native
    
    /**
      * If no run-loop is present, it creates a new one. If a run loop is
      * present it will queue itself to run on the existing run-loops action
      * queue.
      */
    def join[Ret](method: js.Function1[/* repeated */ js.Any, Ret], args: js.Any*): js.UndefOr[Ret] = js.native
    def join[Target, Ret](target: Target, method: RunMethod[Target, Ret], args: js.Any*): js.UndefOr[Ret] = js.native
    
    /**
      * Invokes the passed target/method and optional arguments after a specified
      * period of time. The last parameter of this method must always be a number
      * of milliseconds.
      */
    def later(method: js.Function1[/* repeated */ js.Any, _], wait: Double): EmberRunTimer = js.native
    def later[Target](
      target: Target,
      method: RunMethod[Target, _],
      arg0: js.Any,
      arg1: js.Any,
      arg2: js.Any,
      arg3: js.Any,
      arg4: js.Any,
      arg5: js.Any,
      wait: Double
    ): EmberRunTimer = js.native
    def later[Target](
      target: Target,
      method: RunMethod[Target, _],
      arg0: js.Any,
      arg1: js.Any,
      arg2: js.Any,
      arg3: js.Any,
      arg4: js.Any,
      wait: Double
    ): EmberRunTimer = js.native
    def later[Target](
      target: Target,
      method: RunMethod[Target, _],
      arg0: js.Any,
      arg1: js.Any,
      arg2: js.Any,
      arg3: js.Any,
      wait: Double
    ): EmberRunTimer = js.native
    def later[Target](
      target: Target,
      method: RunMethod[Target, _],
      arg0: js.Any,
      arg1: js.Any,
      arg2: js.Any,
      wait: Double
    ): EmberRunTimer = js.native
    def later[Target](target: Target, method: RunMethod[Target, _], arg0: js.Any, arg1: js.Any, wait: Double): EmberRunTimer = js.native
    def later[Target](target: Target, method: RunMethod[Target, _], arg0: js.Any, wait: Double): EmberRunTimer = js.native
    def later[Target](target: Target, method: RunMethod[Target, _], wait: Double): EmberRunTimer = js.native
    
    def next(method: js.Function0[Unit], args: js.Any*): EmberRunTimer = js.native
    /**
      * Schedules an item to run from within a separate run loop, after
      * control has been returned to the system. This is equivalent to calling
      * `run.later` with a wait time of 1ms.
      */
    def next[Target](target: Target, method: RunMethod[Target, _], args: js.Any*): EmberRunTimer = js.native
    
    /**
      * Schedule a function to run one time during the current RunLoop. This is equivalent
      * to calling `scheduleOnce` with the "actions" queue.
      */
    def once[Target](target: Target, method: RunMethod[Target, _], args: js.Any*): EmberRunTimer = js.native
    
    var queues: js.Array[EmberRunQueues] = js.native
    
    def schedule(queue: EmberRunQueues, method: js.Function1[/* args */ js.Array[_], _], args: js.Any*): EmberRunTimer = js.native
    /**
      * Adds the passed target/method and any optional arguments to the named
      * queue to be executed at the end of the RunLoop. If you have not already
      * started a RunLoop when calling this method one will be started for you
      * automatically.
      */
    def schedule[Target](queue: EmberRunQueues, target: Target, method: RunMethod[Target, _], args: js.Any*): EmberRunTimer = js.native
    
    /**
      * Schedules a function to run one time in a given queue of the current RunLoop.
      * Calling this method with the same queue/target/method combination will have
      * no effect (past the initial call).
      */
    def scheduleOnce[Target](queue: EmberRunQueues, target: Target, method: RunMethod[Target, _], args: js.Any*): EmberRunTimer = js.native
    
    /**
      * Ensure that the target method is never called more frequently than
      * the specified spacing period. The target method is called immediately.
      */
    def throttle(method: js.Function1[/* repeated */ js.Any, _], spacing: Double): EmberRunTimer = js.native
    def throttle(method: js.Function1[/* repeated */ js.Any, _], spacing: Double, immediate: Boolean): EmberRunTimer = js.native
    def throttle[Target](
      target: Target,
      method: RunMethod[Target, _],
      arg0: js.Any,
      arg1: js.Any,
      arg2: js.Any,
      arg3: js.Any,
      arg4: js.Any,
      arg5: js.Any,
      spacing: Double
    ): EmberRunTimer = js.native
    def throttle[Target](
      target: Target,
      method: RunMethod[Target, _],
      arg0: js.Any,
      arg1: js.Any,
      arg2: js.Any,
      arg3: js.Any,
      arg4: js.Any,
      arg5: js.Any,
      spacing: Double,
      immediate: Boolean
    ): EmberRunTimer = js.native
    def throttle[Target](
      target: Target,
      method: RunMethod[Target, _],
      arg0: js.Any,
      arg1: js.Any,
      arg2: js.Any,
      arg3: js.Any,
      arg4: js.Any,
      spacing: Double
    ): EmberRunTimer = js.native
    def throttle[Target](
      target: Target,
      method: RunMethod[Target, _],
      arg0: js.Any,
      arg1: js.Any,
      arg2: js.Any,
      arg3: js.Any,
      arg4: js.Any,
      spacing: Double,
      immediate: Boolean
    ): EmberRunTimer = js.native
    def throttle[Target](
      target: Target,
      method: RunMethod[Target, _],
      arg0: js.Any,
      arg1: js.Any,
      arg2: js.Any,
      arg3: js.Any,
      spacing: Double
    ): EmberRunTimer = js.native
    def throttle[Target](
      target: Target,
      method: RunMethod[Target, _],
      arg0: js.Any,
      arg1: js.Any,
      arg2: js.Any,
      arg3: js.Any,
      spacing: Double,
      immediate: Boolean
    ): EmberRunTimer = js.native
    def throttle[Target](
      target: Target,
      method: RunMethod[Target, _],
      arg0: js.Any,
      arg1: js.Any,
      arg2: js.Any,
      spacing: Double
    ): EmberRunTimer = js.native
    def throttle[Target](
      target: Target,
      method: RunMethod[Target, _],
      arg0: js.Any,
      arg1: js.Any,
      arg2: js.Any,
      spacing: Double,
      immediate: Boolean
    ): EmberRunTimer = js.native
    def throttle[Target](target: Target, method: RunMethod[Target, _], arg0: js.Any, arg1: js.Any, spacing: Double): EmberRunTimer = js.native
    def throttle[Target](
      target: Target,
      method: RunMethod[Target, _],
      arg0: js.Any,
      arg1: js.Any,
      spacing: Double,
      immediate: Boolean
    ): EmberRunTimer = js.native
    def throttle[Target](target: Target, method: RunMethod[Target, _], arg0: js.Any, spacing: Double): EmberRunTimer = js.native
    def throttle[Target](target: Target, method: RunMethod[Target, _], arg0: js.Any, spacing: Double, immediate: Boolean): EmberRunTimer = js.native
    def throttle[Target](target: Target, method: RunMethod[Target, _], spacing: Double): EmberRunTimer = js.native
    def throttle[Target](target: Target, method: RunMethod[Target, _], spacing: Double, immediate: Boolean): EmberRunTimer = js.native
  }
}
