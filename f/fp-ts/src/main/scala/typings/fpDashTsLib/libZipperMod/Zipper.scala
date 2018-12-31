package typings
package fpDashTsLib.libZipperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Zipper", "Zipper")
@js.native
class Zipper[A] protected () extends js.Object {
  def this(lefts: fpDashTsLib.libArrayMod.Global.Array[A], focus: A, rights: fpDashTsLib.libArrayMod.Global.Array[A]) = this()
  val _A: A = js.native
  val _URI: URI = js.native
  val focus: A = js.native
  val lefts: fpDashTsLib.libArrayMod.Global.Array[A] = js.native
  var length: scala.Double = js.native
  val rights: fpDashTsLib.libArrayMod.Global.Array[A] = js.native
  /**
    * @since 1.9.0
    */
  def ap[B](fab: Zipper[js.Function1[/* a */ A, B]]): Zipper[B] = js.native
  /**
    * Deletes the element at focus and moves the focus to the left. If there is no element on the left,
    * focus is moved to the right.
    * @since 1.9.0
    */
  def deleteLeft(): fpDashTsLib.libOptionMod.Option[Zipper[A]] = js.native
  /**
    * Deletes the element at focus and moves the focus to the right. If there is no element on the right,
    * focus is moved to the left.
    * @since 1.9.0
    */
  def deleteRight(): fpDashTsLib.libOptionMod.Option[Zipper[A]] = js.native
  /**
    * @since 1.9.0
    */
  def down(): fpDashTsLib.libOptionMod.Option[Zipper[A]] = js.native
  /**
    * Moves focus to the end of the zipper.
    * @since 1.9.0
    */
  def end(): Zipper[A] = js.native
  /**
    * Inserts an element to the left of focus and focuses on the new element.
    * @since 1.9.0
    */
  def insertLeft(a: A): Zipper[A] = js.native
  /**
    * Inserts an element to the right of focus and focuses on the new element.
    * @since 1.9.0
    */
  def insertRight(a: A): Zipper[A] = js.native
  def inspect(): java.lang.String = js.native
  /**
    * @since 1.9.0
    */
  def isOutOfBound(index: scala.Double): scala.Boolean = js.native
  /**
    * @since 1.9.0
    */
  def map[B](f: js.Function1[/* a */ A, B]): Zipper[B] = js.native
  /**
    * Apply `f` to the focus and update with the result.
    * @since 1.9.0
    */
  def modify(f: js.Function1[/* a */ A, A]): Zipper[A] = js.native
  /**
    * Moves focus in the zipper, or `None` if there is no such element.
    * @since 1.9.0
    */
  def move(f: js.Function1[/* currentIndex */ scala.Double, scala.Double]): fpDashTsLib.libOptionMod.Option[Zipper[A]] = js.native
  /**
    * @since 1.9.0
    */
  def reduce[B](b: B, f: js.Function2[/* b */ B, /* a */ A, B]): B = js.native
  /**
    * Moves focus to the start of the zipper.
    * @since 1.9.0
    */
  def start(): Zipper[A] = js.native
  /**
    * @since 1.9.0
    */
  def toArray(): fpDashTsLib.libArrayMod.Global.Array[A] = js.native
  /**
    * @since 1.9.0
    */
  def up(): fpDashTsLib.libOptionMod.Option[Zipper[A]] = js.native
  /**
    * Update the focus in this zipper.
    * @since 1.9.0
    */
  def update(a: A): Zipper[A] = js.native
}

