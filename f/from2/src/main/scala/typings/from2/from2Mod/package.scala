package typings.from2

import org.scalablytyped.runtime.Instantiable1
import typings.from2.Anon_False
import typings.from2.Anon_ObjectModeTrue
import typings.node.Buffer
import typings.node.NodeJSNs.ReadableStream
import typings.node.streamMod.ReadableOptions
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object from2Mod {
  type Chunk = String | Buffer | Uint8Array | Null
  type From2Ctor[R /* <: ReadInput | ReadObjectInput */] = Instantiable1[/* read */ R, ReadableStream]
  type NextCallback = js.Function2[/* err */ js.UndefOr[js.Any], /* chunk */ Chunk, Unit]
  type NextObjectCallback = js.Function2[/* err */ js.UndefOr[js.Any], /* chunk */ js.Any, Unit]
  type ObjectModeOptions = Anon_ObjectModeTrue with ReadableOptions
  type Options = Anon_False with ReadableOptions
  type ReadCallback[N /* <: NextCallback | NextObjectCallback */] = js.Function2[/* size */ Double, /* next */ N, Unit]
  type ReadInput = ReadCallback[NextCallback] | js.Array[Chunk]
  type ReadObjectInput = ReadCallback[NextObjectCallback] | js.Array[js.Any]
}
