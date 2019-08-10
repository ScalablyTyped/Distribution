package typings.emscripten

import typings.emscripten.Anon_Kind
import typings.emscripten.Anon_KindModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object EmscriptenNs {
  type TypeCompatibleWithC = Double | String | js.Array[js.Any] | Boolean
  type WebAssemblyExports = js.Array[Anon_KindModule]
  type WebAssemblyImports = js.Array[Anon_Kind]
}
