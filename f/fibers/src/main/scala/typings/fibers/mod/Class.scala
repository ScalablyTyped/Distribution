package typings.fibers.mod

import typings.fibers.futureMod._Global_.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fibers", JSImport.Namespace)
@js.native
class Class protected () extends Fiber {
  /**
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
  def this(fn: Function) = this()
}

