package typings
package fastDashListLib.fastDashListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait List[T] extends js.Object {
  val length: scala.Double = js.native
  def drop(): scala.Unit = js.native
  def filter[U](
    callbackfn: js.ThisFunction3[
      /* this */ U, 
      /* value */ T, 
      /* index */ scala.Double, 
      /* list */ this.type, 
      scala.Boolean
    ]
  ): List[T] = js.native
  def filter[U](
    callbackfn: js.ThisFunction3[
      /* this */ U, 
      /* value */ T, 
      /* index */ scala.Double, 
      /* list */ this.type, 
      scala.Boolean
    ],
    thisArg: U
  ): List[T] = js.native
  def forEach[U](
    callbackfn: js.ThisFunction3[/* this */ U, /* value */ T, /* index */ scala.Double, /* list */ this.type, scala.Unit]
  ): scala.Unit = js.native
  def forEach[U](
    callbackfn: js.ThisFunction3[/* this */ U, /* value */ T, /* index */ scala.Double, /* list */ this.type, scala.Unit],
    thisArg: U
  ): scala.Unit = js.native
  def item(index: scala.Double): js.UndefOr[T] = js.native
  def map[U, V](
    callbackfn: js.ThisFunction3[/* this */ V, /* value */ T, /* index */ scala.Double, /* list */ this.type, U]
  ): List[U] = js.native
  def map[U, V](
    callbackfn: js.ThisFunction3[/* this */ V, /* value */ T, /* index */ scala.Double, /* list */ this.type, U],
    thisArg: V
  ): List[U] = js.native
  def pop(): js.UndefOr[T] = js.native
  def push(item: T): scala.Unit = js.native
  def reduce[U, V](
    callbackfn: js.ThisFunction4[
      /* this */ V, 
      /* acc */ U, 
      /* value */ T, 
      /* index */ scala.Double, 
      /* list */ this.type, 
      U
    ]
  ): U = js.native
  def reduce[U, V](
    callbackfn: js.ThisFunction4[
      /* this */ V, 
      /* acc */ U, 
      /* value */ T, 
      /* index */ scala.Double, 
      /* list */ this.type, 
      U
    ],
    initialValue: U
  ): U = js.native
  def reduce[U, V](
    callbackfn: js.ThisFunction4[
      /* this */ V, 
      /* acc */ U, 
      /* value */ T, 
      /* index */ scala.Double, 
      /* list */ this.type, 
      U
    ],
    initialValue: U,
    thisArg: V
  ): U = js.native
  def shift(): js.UndefOr[T] = js.native
  def slice(): js.Array[T] = js.native
  def slice(start: scala.Double): js.Array[T] = js.native
  def slice(start: scala.Double, end: scala.Double): js.Array[T] = js.native
  def unshift(item: T): scala.Unit = js.native
}

