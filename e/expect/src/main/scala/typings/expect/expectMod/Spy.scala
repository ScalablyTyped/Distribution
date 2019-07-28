package typings.expect.expectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Spy[T] extends js.Object {
  var __isSpy: Boolean = js.native
  var calls: js.Array[Call[T]] = js.native
  def apply(args: js.Any*): Unit = js.native
  def andCall(fn: js.Function1[/* repeated */ js.Any, _]): Spy[T] = js.native
  def andCallThrough(): Spy[T] = js.native
  def andReturn(value: js.Any): Spy[T] = js.native
  def andThrow(`object`: js.Object): Spy[T] = js.native
  def destroy(): Unit = js.native
  def getLastCall(): Call[T] = js.native
  def reset(): Unit = js.native
  def restore(): Unit = js.native
}

