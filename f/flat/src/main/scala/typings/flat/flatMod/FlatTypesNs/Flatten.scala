package typings.flat.flatMod.FlatTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Flatten extends js.Object {
  @JSName("flatten")
  var flatten_Original: Flatten = js.native
  @JSName("unflatten")
  var unflatten_Original: Unflatten = js.native
  def apply[TTarget, TResult](target: TTarget): TResult = js.native
  def apply[TTarget, TResult](target: TTarget, options: FlattenOptions): TResult = js.native
  def flatten[TTarget, TResult](target: TTarget): TResult = js.native
  def flatten[TTarget, TResult](target: TTarget, options: FlattenOptions): TResult = js.native
  def unflatten[TTarget, TResult](target: TTarget): TResult = js.native
  def unflatten[TTarget, TResult](target: TTarget, options: UnflattenOptions): TResult = js.native
}

