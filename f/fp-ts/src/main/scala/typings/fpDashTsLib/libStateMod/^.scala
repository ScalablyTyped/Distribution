package typings
package fpDashTsLib.libStateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/State", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: fpDashTsLib.fpDashTsLibStrings.State = js.native
  val state: fpDashTsLib.libMonadMod.Monad2[URI] = js.native
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(apFirst, apSecond, chain, chainFirst, flatten, map) */ def ap[L, A](fa: State[L, A]): js.Function1[/* fab */ State[L, js.Function1[/* a */ A, _]], State[L, _]] = js.native
  def evalState[S, A](ma: State[S, A], s: S): A = js.native
  def execState[S, A](ma: State[S, A], s: S): S = js.native
  def get[S](): State[S, S] = js.native
  def gets[S, A](f: js.Function1[/* s */ S, A]): State[S, A] = js.native
  def modify[S](f: js.Function1[/* s */ S, S]): State[S, js.UndefOr[scala.Nothing]] = js.native
  def of[S, A](a: A): State[S, A] = js.native
  def put[S](s: S): State[S, scala.Unit] = js.native
}

