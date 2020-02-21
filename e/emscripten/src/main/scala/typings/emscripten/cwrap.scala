package typings.emscripten

import typings.emscripten.Emscripten.CCallOpts
import typings.emscripten.Emscripten.JSType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("cwrap")
@js.native
object cwrap extends js.Object {
  def apply(ident: String, returnType: Null, argTypes: js.Array[JSType]): js.Function1[/* repeated */ js.Any, _] = js.native
  def apply(ident: String, returnType: Null, argTypes: js.Array[JSType], opts: CCallOpts): js.Function1[/* repeated */ js.Any, _] = js.native
  def apply(ident: String, returnType: JSType, argTypes: js.Array[JSType]): js.Function1[/* repeated */ js.Any, _] = js.native
  def apply(ident: String, returnType: JSType, argTypes: js.Array[JSType], opts: CCallOpts): js.Function1[/* repeated */ js.Any, _] = js.native
}

