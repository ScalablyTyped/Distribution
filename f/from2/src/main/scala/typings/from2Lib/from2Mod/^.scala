package typings
package from2Lib.from2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("from2", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(opts: ObjectModeOptions, read: ReadObjectInput): nodeLib.NodeJSNs.ReadableStream = js.native
  def apply(opts: Options, read: ReadInput): nodeLib.NodeJSNs.ReadableStream = js.native
  def apply(read: ReadInput): nodeLib.NodeJSNs.ReadableStream = js.native
  def ctor(): From2Ctor[ReadInput] = js.native
  def ctor(opts: ObjectModeOptions): From2Ctor[ReadObjectInput] = js.native
  def ctor(opts: Options): From2Ctor[ReadInput] = js.native
  def obj(opts: from2Lib.Anon_ObjectMode with nodeLib.streamMod.ReadableOptions, read: ReadObjectInput): nodeLib.NodeJSNs.ReadableStream = js.native
  def obj(read: ReadObjectInput): nodeLib.NodeJSNs.ReadableStream = js.native
}

