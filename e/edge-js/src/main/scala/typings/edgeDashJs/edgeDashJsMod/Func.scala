package typings.edgeDashJs.edgeDashJsMod

import typings.edgeDashJs.edgeDashJsNumbers.`true`
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Func[TInput, TOutput] extends js.Object {
  def apply(payload: TInput, callback: js.Function2[/* error */ Error, /* result */ TOutput, Unit]): Unit = js.native
  def apply(payload: TInput, sync: `true`): TOutput = js.native
}

@JSImport("edge-js", "func")
@js.native
object func extends js.Object {
  def apply[TInput, TOutput](language: String, params: String): Func[TInput, TOutput] = js.native
  def apply[TInput, TOutput](language: String, params: js.Function): Func[TInput, TOutput] = js.native
  def apply[TInput, TOutput](language: String, params: Params): Func[TInput, TOutput] = js.native
  def apply[TInput, TOutput](language: String, params: Source): Func[TInput, TOutput] = js.native
  def apply[TInput, TOutput](language: String, params: TSQL): Func[TInput, TOutput] = js.native
  def apply[TInput, TOutput](params: String): Func[TInput, TOutput] = js.native
  def apply[TInput, TOutput](params: js.Function): Func[TInput, TOutput] = js.native
  def apply[TInput, TOutput](params: Params): Func[TInput, TOutput] = js.native
  def apply[TInput, TOutput](params: Source): Func[TInput, TOutput] = js.native
  def apply[TInput, TOutput](params: TSQL): Func[TInput, TOutput] = js.native
}

