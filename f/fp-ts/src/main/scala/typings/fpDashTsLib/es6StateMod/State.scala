package typings
package fpDashTsLib.es6StateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6/State", "State")
@js.native
class State[S, A] protected () extends js.Object {
  def this(run: js.Function1[/* s */ S, js.Tuple2[A, S]]) = this()
  val _A: A = js.native
  val _L: S = js.native
  val _URI: URI = js.native
  /** @obsolete */
  def ap[B](fab: State[S, js.Function1[/* a */ A, B]]): State[S, B] = js.native
  /**
    * Flipped version of `ap`
    * @obsolete
    */
  def ap_[B, C](`this`: State[S, js.Function1[/* b */ B, C]], fb: State[S, B]): State[S, C] = js.native
  /**
    * Combine two effectful actions, keeping only the result of the first
    * @since 1.7.0
    * @obsolete
    */
  def applyFirst[B](fb: State[S, B]): State[S, A] = js.native
  /**
    * Combine two effectful actions, keeping only the result of the second
    * @since 1.7.0
    * @obsolete
    */
  def applySecond[B](fb: State[S, B]): State[S, B] = js.native
  /** @obsolete */
  def chain[B](f: js.Function1[/* a */ A, State[S, B]]): State[S, B] = js.native
  /** @obsolete */
  def eval(s: S): A = js.native
  /** @obsolete */
  def exec(s: S): S = js.native
  /** @obsolete */
  def map[B](f: js.Function1[/* a */ A, B]): State[S, B] = js.native
  def run(s: S): js.Tuple2[A, S] = js.native
}

