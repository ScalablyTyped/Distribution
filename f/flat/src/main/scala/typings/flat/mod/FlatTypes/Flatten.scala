package typings.flat.mod.FlatTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Flatten extends js.Object {
  
  def apply[TTarget, TResult](target: TTarget): TResult = js.native
  def apply[TTarget, TResult](target: TTarget, options: FlattenOptions): TResult = js.native
  
  def flatten[TTarget, TResult](target: TTarget): TResult = js.native
  def flatten[TTarget, TResult](target: TTarget, options: FlattenOptions): TResult = js.native
  @JSName("flatten")
  var flatten_Original: Flatten = js.native
  
  def unflatten[TTarget, TResult](target: TTarget): TResult = js.native
  def unflatten[TTarget, TResult](target: TTarget, options: UnflattenOptions): TResult = js.native
  @JSName("unflatten")
  var unflatten_Original: Unflatten = js.native
}
