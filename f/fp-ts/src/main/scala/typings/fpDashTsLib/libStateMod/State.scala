package typings
package fpDashTsLib.libStateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/State", "State")
@js.native
class State[S, A] protected () extends js.Object {
  def this(run: js.Function1[/* s */ S, js.Tuple2[A, S]]) = this()
  val _A: A = js.native
  val _L: S = js.native
  val _URI: URI = js.native
  def ap[B](fab: State[S, js.Function1[/* a */ A, B]]): State[S, B] = js.native
  /**
       * Flipped version of {@link ap}
       */
  def `ap_`[B, C](`this`: State[S, js.Function1[/* b */ B, C]], fb: State[S, B]): State[S, C] = js.native
  /**
       * Combine two effectful actions, keeping only the result of the first
       * @since 1.7.0
       */
  def applyFirst[B](fb: State[S, B]): State[S, A] = js.native
  /**
       * Combine two effectful actions, keeping only the result of the second
       * @since 1.7.0
       */
  def applySecond[B](fb: State[S, B]): State[S, B] = js.native
  def chain[B](f: js.Function1[/* a */ A, State[S, B]]): State[S, B] = js.native
  def eval(s: S): A = js.native
  def exec(s: S): S = js.native
  def map[B](f: js.Function1[/* a */ A, B]): State[S, B] = js.native
  def run(s: S): js.Tuple2[A, S] = js.native
}

