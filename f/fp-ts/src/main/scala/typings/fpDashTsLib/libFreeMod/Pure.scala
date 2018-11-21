package typings
package fpDashTsLib.libFreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Free", "Pure")
@js.native
class Pure[F, A] protected () extends js.Object {
  def this(value: A) = this()
  val _A: A = js.native
  val _L: F = js.native
  val _URI: URI = js.native
  val _tag: fpDashTsLib.fpDashTsLibStrings.Pure = js.native
  val value: A = js.native
  def ap[B](fab: Free[F, js.Function1[/* a */ A, B]]): Free[F, B] = js.native
  def `ap_`[B, C](`this`: Free[F, js.Function1[/* b */ B, C]], fb: Free[F, B]): Free[F, C] = js.native
  def chain[B](f: js.Function1[/* a */ A, Free[F, B]]): Free[F, B] = js.native
  def inspect(): java.lang.String = js.native
  def isImpure(): /* is Impure */scala.Boolean = js.native
  def isPure(): /* is Pure */scala.Boolean = js.native
  def map[B](f: js.Function1[/* a */ A, B]): Free[F, B] = js.native
}

