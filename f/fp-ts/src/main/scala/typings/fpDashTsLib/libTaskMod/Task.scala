package typings
package fpDashTsLib.libTaskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Task", "Task")
@js.native
class Task[A] protected () extends js.Object {
  def this(run: fpDashTsLib.libFunctionMod.Lazy[js.Promise[A]]) = this()
  val _A: A = js.native
  val _URI: URI = js.native
  /** @obsolete */
  def ap[B](fab: Task[js.Function1[/* a */ A, B]]): Task[B] = js.native
  /**
    * Flipped version of `ap`
    * @obsolete
    */
  def ap_[B, C](`this`: Task[js.Function1[/* b */ B, C]], fb: Task[B]): Task[C] = js.native
  /**
    * Combine two effectful actions, keeping only the result of the first
    * @since 1.6.0
    * @obsolete
    */
  def applyFirst[B](fb: Task[B]): Task[A] = js.native
  /**
    * Combine two effectful actions, keeping only the result of the second
    * @since 1.5.0
    * @obsolete
    */
  def applySecond[B](fb: Task[B]): Task[B] = js.native
  /** @obsolete */
  def chain[B](f: js.Function1[/* a */ A, Task[B]]): Task[B] = js.native
  def inspect(): java.lang.String = js.native
  /** @obsolete */
  def map[B](f: js.Function1[/* a */ A, B]): Task[B] = js.native
  def run(): js.Promise[js.Promise[A]] = js.native
}

