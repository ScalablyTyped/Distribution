package typings
package fpDashTsLib.es6IdentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6/Identity", "Identity")
@js.native
class Identity[A] protected () extends js.Object {
  def this(value: A) = this()
  val _A: A = js.native
  val _URI: URI = js.native
  val value: A = js.native
  def alt(fx: Identity[A]): Identity[A] = js.native
  def ap[B](fab: Identity[js.Function1[/* a */ A, B]]): Identity[B] = js.native
  /**
    * Flipped version of `ap`
    */
  def ap_[B, C](`this`: Identity[js.Function1[/* b */ B, C]], fb: Identity[B]): Identity[C] = js.native
  def chain[B](f: js.Function1[/* a */ A, Identity[B]]): Identity[B] = js.native
  def extend[B](f: js.Function1[/* ea */ Identity[A], B]): Identity[B] = js.native
  def extract(): A = js.native
  def fold[B](f: js.Function1[/* a */ A, B]): B = js.native
  def inspect(): java.lang.String = js.native
  def map[B](f: js.Function1[/* a */ A, B]): Identity[B] = js.native
  /**
    * Lazy version of `alt`
    *
    * @example
    * import { Identity } from 'fp-ts/lib/Identity'
    *
    * const a = new Identity(1)
    * assert.deepStrictEqual(a.orElse(() => new Identity(2)), a)
    *
    * @since 1.6.0
    */
  def orElse(fx: fpDashTsLib.es6FunctionMod.Lazy[Identity[A]]): Identity[A] = js.native
  def reduce[B](b: B, f: js.Function2[/* b */ B, /* a */ A, B]): B = js.native
}

