package typings.from2

import org.scalablytyped.runtime.Instantiable1
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.node.streamMod.ReadableOptions
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("from2", JSImport.Namespace)
@js.native
object from2Mod extends js.Object {
  def apply(opts: ObjectModeOptions, read: ReadObjectInput): ReadableStream = js.native
  def apply(opts: Options, read: ReadInput): ReadableStream = js.native
  def apply(read: ReadInput): ReadableStream = js.native
  def ctor(): From2Ctor[ReadInput] = js.native
  def ctor(opts: ObjectModeOptions): From2Ctor[ReadObjectInput] = js.native
  def ctor(opts: Options): From2Ctor[ReadInput] = js.native
  def obj(opts: Anon_ObjectMode with ReadableOptions, read: ReadObjectInput): ReadableStream = js.native
  def obj(read: ReadObjectInput): ReadableStream = js.native
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

