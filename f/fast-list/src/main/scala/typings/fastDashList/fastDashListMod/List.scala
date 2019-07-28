package typings.fastDashList.fastDashListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait List[T] extends js.Object {
  val length: Double = js.native
  def drop(): Unit = js.native
  def filter[U](
    callbackfn: js.ThisFunction3[/* this */ U, /* value */ T, /* index */ Double, /* list */ this.type, Boolean]
  ): List[T] = js.native
  def filter[U](
    callbackfn: js.ThisFunction3[/* this */ U, /* value */ T, /* index */ Double, /* list */ this.type, Boolean],
    thisArg: U
  ): List[T] = js.native
  def forEach[U](
    callbackfn: js.ThisFunction3[/* this */ U, /* value */ T, /* index */ Double, /* list */ this.type, Unit]
  ): Unit = js.native
  def forEach[U](
    callbackfn: js.ThisFunction3[/* this */ U, /* value */ T, /* index */ Double, /* list */ this.type, Unit],
    thisArg: U
  ): Unit = js.native
  def item(index: Double): js.UndefOr[T] = js.native
  def map[U, V](
    callbackfn: js.ThisFunction3[/* this */ V, /* value */ T, /* index */ Double, /* list */ this.type, U]
  ): List[U] = js.native
  def map[U, V](
    callbackfn: js.ThisFunction3[/* this */ V, /* value */ T, /* index */ Double, /* list */ this.type, U],
    thisArg: V
  ): List[U] = js.native
  def pop(): js.UndefOr[T] = js.native
  def push(item: T): Unit = js.native
  def reduce[U, V](
    callbackfn: js.ThisFunction4[/* this */ V, /* acc */ U, /* value */ T, /* index */ Double, /* list */ this.type, U]
  ): U = js.native
  def reduce[U, V](
    callbackfn: js.ThisFunction4[/* this */ V, /* acc */ U, /* value */ T, /* index */ Double, /* list */ this.type, U],
    initialValue: U
  ): U = js.native
  def reduce[U, V](
    callbackfn: js.ThisFunction4[/* this */ V, /* acc */ U, /* value */ T, /* index */ Double, /* list */ this.type, U],
    initialValue: U,
    thisArg: V
  ): U = js.native
  def shift(): js.UndefOr[T] = js.native
  def slice(): js.Array[T] = js.native
  def slice(start: Double): js.Array[T] = js.native
  def slice(start: Double, end: Double): js.Array[T] = js.native
  def unshift(item: T): Unit = js.native
}

