package typings.fibers.fibersMod

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FiberConstructor
  extends /**
  * Instantiate a new Fiber. You may invoke this either as a function or as
  * a constructor; the behavior is the same.
  *
  * When run() is called on this fiber for the first time, `fn` will be
  * invoked as the first frame on a new stack. Execution will continue on
  * this new stack until `fn` returns, or Fiber.yield() is called.
  *
  * After the function returns the fiber is reset to original state and
  * may be restarted with another call to run().
  */
Instantiable1[/* fn */ js.Function, Fiber] {
  /**
    * `Fiber.current` will contain the currently-running Fiber. It will be
    * `undefined` if there is no fiber (i.e. the main stack of execution).
    *
    * See "Garbage Collection" for more information on responsible use of
    * `Fiber.current`.
    */
  val current: js.UndefOr[Fiber] = js.native
  def apply(fn: js.Function): Fiber = js.native
  /**
    * `Fiber.yield()` will halt execution of the current fiber and return control
    * back to original caller of run(). If an argument is supplied to yield(),
    * run() will return that value.
    *
    * When run() is called again, yield() will return.
    *
    * Note that this function is a global to allow for correct garbage
    * collection. This results in no loss of functionality because it is only
    * valid to yield from the currently running fiber anyway.
    *
    * Note also that `yield` is a reserved word in Javascript. This is normally
    * not an issue, however some code linters may complain. Rest assured that it
    * will run fine now and in future versions of Javascript.
    */
  def `yield`[T, R](): T = js.native
  def `yield`[T, R](param: R): T = js.native
}

