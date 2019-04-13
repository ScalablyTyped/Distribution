package typings
package from2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object from2Mod {
  type Chunk = java.lang.String | nodeLib.Buffer | stdLib.Uint8Array | scala.Null
  type From2Ctor[R /* <: ReadInput | ReadObjectInput */] = org.scalablytyped.runtime.Instantiable1[/* read */ R, nodeLib.NodeJSNs.ReadableStream]
  type NextCallback = js.Function2[/* err */ js.UndefOr[js.Any], /* chunk */ Chunk, scala.Unit]
  type NextObjectCallback = js.Function2[/* err */ js.UndefOr[js.Any], /* chunk */ js.Any, scala.Unit]
  type ObjectModeOptions = from2Lib.Anon_ObjectModeTrue with nodeLib.streamMod.ReadableOptions
  type Options = from2Lib.Anon_False with nodeLib.streamMod.ReadableOptions
  type ReadCallback[N /* <: NextCallback | NextObjectCallback */] = js.Function2[/* size */ scala.Double, /* next */ N, scala.Unit]
  type ReadInput = ReadCallback[NextCallback] | js.Array[Chunk]
  type ReadObjectInput = ReadCallback[NextObjectCallback] | js.Array[js.Any]
}
