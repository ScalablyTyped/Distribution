package typings
package fpDashTsLib.libTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Tree", "Tree")
@js.native
class Tree[A] protected () extends js.Object {
  def this(value: A, forest: Forest[A]) = this()
  val _A: A = js.native
  val _URI: URI = js.native
  val forest: Forest[A] = js.native
  val value: A = js.native
  /** @obsolete */
  def ap[B](fab: Tree[js.Function1[/* a */ A, B]]): Tree[B] = js.native
  /**
    * Flipped version of `ap`
    * @since 1.6.0
    * @obsolete
    */
  def ap_[B, C](`this`: Tree[js.Function1[/* b */ B, C]], fb: Tree[B]): Tree[C] = js.native
  /** @obsolete */
  def chain[B](f: js.Function1[/* a */ A, Tree[B]]): Tree[B] = js.native
  /** @obsolete */
  def extend[B](f: js.Function1[/* fa */ Tree[A], B]): Tree[B] = js.native
  /** @obsolete */
  def extract(): A = js.native
  def inspect(): java.lang.String = js.native
  /** @obsolete */
  def map[B](f: js.Function1[/* a */ A, B]): Tree[B] = js.native
  /** @obsolete */
  def reduce[B](b: B, f: js.Function2[/* b */ B, /* a */ A, B]): B = js.native
}

