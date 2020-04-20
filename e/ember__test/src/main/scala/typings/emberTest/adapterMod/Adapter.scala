package typings.emberTest.adapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Adapter extends js.Object {
  /**
    * This callback will be called whenever an async operation has completed.
    */
  def asyncEnd(): js.Any
  /**
    * This callback will be called whenever an async operation is about to start.
    */
  def asyncStart(): js.Any
  /**
    * Override this method with your testing framework's false assertion.
    * This function is called whenever an exception occurs causing the testing
    * promise to fail.
    */
  def exception(error: String): js.Any
}

object Adapter {
  @scala.inline
  def apply(asyncEnd: () => js.Any, asyncStart: () => js.Any, exception: String => js.Any): Adapter = {
    val __obj = js.Dynamic.literal(asyncEnd = js.Any.fromFunction0(asyncEnd), asyncStart = js.Any.fromFunction0(asyncStart), exception = js.Any.fromFunction1(exception))
    __obj.asInstanceOf[Adapter]
  }
}

