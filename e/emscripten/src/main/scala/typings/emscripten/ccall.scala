package typings.emscripten

import typings.emscripten.Emscripten.CCallOpts
import typings.emscripten.Emscripten.JSType
import typings.emscripten.Emscripten.TypeCompatibleWithC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ccall")
@js.native
object ccall extends js.Object {
  def apply(ident: String, returnType: Null, argTypes: js.Array[JSType], args: js.Array[TypeCompatibleWithC]): js.Any = js.native
  def apply(
    ident: String,
    returnType: Null,
    argTypes: js.Array[JSType],
    args: js.Array[TypeCompatibleWithC],
    opts: CCallOpts
  ): js.Any = js.native
  // Below runtime function/variable declarations are exportable by
  // -s EXTRA_EXPORTED_RUNTIME_METHODS. You can extend or merge
  // EmscriptenModule interface to add runtime functions.
  //
  // For example, by using -s "EXTRA_EXPORTED_RUNTIME_METHODS=['ccall']"
  // You can access ccall() via Module["ccall"]. In this case, you should
  // extend EmscriptenModule to pass the compiler check like the following:
  //
  // interface YourOwnEmscriptenModule extends EmscriptenModule {
  //     ccall: typeof ccall;
  // }
  //
  // See: https://emscripten.org/docs/getting_started/FAQ.html#why-do-i-get-typeerror-module-something-is-not-a-function
  def apply(ident: String, returnType: JSType, argTypes: js.Array[JSType], args: js.Array[TypeCompatibleWithC]): js.Any = js.native
  def apply(
    ident: String,
    returnType: JSType,
    argTypes: js.Array[JSType],
    args: js.Array[TypeCompatibleWithC],
    opts: CCallOpts
  ): js.Any = js.native
}

