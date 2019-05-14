package typings
package fpDashTsLib.es6TreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6/Tree", "Tree")
@js.native
class Tree[A] protected () extends js.Object {
  def this(value: A, forest: Forest[A]) = this()
  val _A: A = js.native
  val _URI: URI = js.native
  val forest: Forest[A] = js.native
  val value: A = js.native
  def ap[B](fab: Tree[js.Function1[/* a */ A, B]]): Tree[B] = js.native
  /**
    * Flipped version of `ap`
    * @since 1.6.0
    */
  def ap_[B, C](`this`: Tree[js.Function1[/* b */ B, C]], fb: Tree[B]): Tree[C] = js.native
  def chain[B](f: js.Function1[/* a */ A, Tree[B]]): Tree[B] = js.native
  def extend[B](f: js.Function1[/* fa */ Tree[A], B]): Tree[B] = js.native
  def extract(): A = js.native
  def inspect(): java.lang.String = js.native
  def map[B](f: js.Function1[/* a */ A, B]): Tree[B] = js.native
  def reduce[B](b: B, f: js.Function2[/* b */ B, /* a */ A, B]): B = js.native
}

