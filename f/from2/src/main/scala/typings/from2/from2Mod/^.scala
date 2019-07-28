package typings.from2.from2Mod

import typings.from2.Anon_ObjectMode
import typings.node.NodeJSNs.ReadableStream
import typings.node.streamMod.ReadableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("from2", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(opts: ObjectModeOptions, read: ReadObjectInput): ReadableStream = js.native
  def apply(opts: Options, read: ReadInput): ReadableStream = js.native
  def apply(read: ReadInput): ReadableStream = js.native
  def ctor(): From2Ctor[ReadInput] = js.native
  def ctor(opts: ObjectModeOptions): From2Ctor[ReadObjectInput] = js.native
  def ctor(opts: Options): From2Ctor[ReadInput] = js.native
  def obj(opts: Anon_ObjectMode with ReadableOptions, read: ReadObjectInput): ReadableStream = js.native
  def obj(read: ReadObjectInput): ReadableStream = js.native
}

