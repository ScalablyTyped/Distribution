package typings
package fpDashTsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6", "state")
@js.native
object stateNs extends js.Object {
  @js.native
  class State[S, A] protected ()
    extends fpDashTsLib.es6StateMod.State[S, A] {
    def this(run: js.Function1[/* s */ S, js.Tuple2[A, S]]) = this()
  }
  
  val URI: fpDashTsLib.fpDashTsLibStrings.State = js.native
  val state: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.es6StateMod.URI] = js.native
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(apFirst, apSecond, chain, chainFirst, flatten, map) */ def ap[L, A](fa: fpDashTsLib.es6StateMod.State[L, A]): js.Function1[
    /* fab */ fpDashTsLib.es6StateMod.State[L, js.Function1[/* a */ A, _]], 
    fpDashTsLib.es6StateMod.State[L, _]
  ] = js.native
  def evalState[S, A](ma: fpDashTsLib.es6StateMod.State[S, A], s: S): A = js.native
  def execState[S, A](ma: fpDashTsLib.es6StateMod.State[S, A], s: S): S = js.native
  def get[S](): fpDashTsLib.es6StateMod.State[S, S] = js.native
  def gets[S, A](f: js.Function1[/* s */ S, A]): fpDashTsLib.es6StateMod.State[S, A] = js.native
  def modify[S](f: js.Function1[/* s */ S, S]): fpDashTsLib.es6StateMod.State[S, js.UndefOr[scala.Nothing]] = js.native
  def of[S, A](a: A): fpDashTsLib.es6StateMod.State[S, A] = js.native
  def put[S](s: S): fpDashTsLib.es6StateMod.State[S, scala.Unit] = js.native
}

