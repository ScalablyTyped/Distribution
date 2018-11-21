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
  /**
       * @since 1.6.0
       */
  def ap[B](fab: Tree[js.Function1[/* a */ A, B]]): Tree[B] = js.native
  /**
       * @since 1.6.0
       */
  def `ap_`[B, C](`this`: Tree[js.Function1[/* b */ B, C]], fb: Tree[B]): Tree[C] = js.native
  /**
       * @since 1.6.0
       */
  def chain[B](f: js.Function1[/* a */ A, Tree[B]]): Tree[B] = js.native
  /**
       * @since 1.6.0
       */
  def extend[B](f: js.Function1[/* fa */ Tree[A], B]): Tree[B] = js.native
  /**
       * @since 1.6.0
       */
  def extract(): A = js.native
  /**
       * @since 1.6.0
       */
  def inspect(): java.lang.String = js.native
  /**
       * @since 1.6.0
       */
  def map[B](f: js.Function1[/* a */ A, B]): Tree[B] = js.native
  /**
       * @since 1.6.0
       */
  def reduce[B](b: B, f: js.Function2[/* b */ B, /* a */ A, B]): B = js.native
}

