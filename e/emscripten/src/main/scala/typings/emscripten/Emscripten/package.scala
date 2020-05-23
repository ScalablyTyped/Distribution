package typings.emscripten

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Emscripten {
  type TypeCompatibleWithC = scala.Double | java.lang.String | js.Array[js.Any] | scala.Boolean
  type WebAssemblyExports = js.Array[typings.emscripten.anon.Module]
  type WebAssemblyImports = js.Array[typings.emscripten.anon.Kind]
}
