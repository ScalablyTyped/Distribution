package typings.edgeJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("edge-js", "func")
@js.native
object func extends js.Object {
  def apply[TInput, TOutput](language: String, params: String): Func_[TInput, TOutput] = js.native
  def apply[TInput, TOutput](language: String, params: js.Function): Func_[TInput, TOutput] = js.native
  def apply[TInput, TOutput](language: String, params: Params): Func_[TInput, TOutput] = js.native
  def apply[TInput, TOutput](language: String, params: Source): Func_[TInput, TOutput] = js.native
  def apply[TInput, TOutput](language: String, params: TSQL): Func_[TInput, TOutput] = js.native
  def apply[TInput, TOutput](params: String): Func_[TInput, TOutput] = js.native
  def apply[TInput, TOutput](params: js.Function): Func_[TInput, TOutput] = js.native
  def apply[TInput, TOutput](params: Params): Func_[TInput, TOutput] = js.native
  def apply[TInput, TOutput](params: Source): Func_[TInput, TOutput] = js.native
  def apply[TInput, TOutput](params: TSQL): Func_[TInput, TOutput] = js.native
}

