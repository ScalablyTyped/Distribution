package typings
package expectLib.expectMod.expectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Spy[T] extends js.Object {
  var __isSpy: scala.Boolean = js.native
  var calls: js.Array[Call[T]] = js.native
  def apply(args: js.Any*): scala.Unit = js.native
  def andCall(fn: js.Function1[/* repeated */js.Any, _]): Spy[T] = js.native
  def andCallThrough(): Spy[T] = js.native
  def andReturn(value: js.Any): Spy[T] = js.native
  def andThrow(`object`: js.Object): Spy[T] = js.native
  def destroy(): scala.Unit = js.native
  def getLastCall(): Call[T] = js.native
  def reset(): scala.Unit = js.native
  def restore(): scala.Unit = js.native
}

