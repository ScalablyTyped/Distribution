package typings.fibers.fibersMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fiber extends js.Object {
  /**
    * reset() will terminate a running Fiber and restore it to its original
    * state, as if it had returned execution.
    *
    * This is accomplished by causing yield() to throw an exception, and any
    * futher calls to yield() will also throw an exception. This continues
    * until the fiber has completely unwound and returns.
    *
    * If the fiber returns a value it will be returned by reset().
    *
    * If the fiber is not running, reset() will have no effect.
    */
  def reset[T](): T = js.native
  /**
    * run() will start execution of this Fiber, or if it is currently yielding,
    * it will resume execution. If an argument is supplied, this argument will
    * be passed to the fiber, either as the first parameter to the main
    * function [if the fiber has not been started] or as the return value of
    * yield() [if the fiber is currently yielding].
    *
    * This function will return either the parameter passed to yield(), or the
    * returned value from the fiber's main function.
    */
  def run[T, R](): R = js.native
  def run[T, R](param: T): R = js.native
  /**
    * throwInto() will cause a currently yielding fiber's yield() call to
    * throw instead of return gracefully. This can be useful for notifying a
    * fiber that you are no longer interested in its task, and that it should
    * give up.
    *
    * Note that if the fiber does not handle the exception it will continue to
    * bubble up and throwInto() will throw the exception right back at you.
    */
  def throwInto(exception: Error): Unit = js.native
}

