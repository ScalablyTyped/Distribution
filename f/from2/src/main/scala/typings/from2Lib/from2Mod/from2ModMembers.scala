package typings
package from2Lib.from2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("from2", JSImport.Namespace)
@js.native
object from2ModMembers extends js.Object {
  def apply(opts: from2Lib.from2Mod.from2Ns.ObjectModeOptions, read: from2Lib.from2Mod.from2Ns.ReadObjectInput): nodeLib.NodeJSNs.ReadableStream = js.native
  def apply(opts: from2Lib.from2Mod.from2Ns.Options, read: from2Lib.from2Mod.from2Ns.ReadInput): nodeLib.NodeJSNs.ReadableStream = js.native
  def apply(read: from2Lib.from2Mod.from2Ns.ReadInput): nodeLib.NodeJSNs.ReadableStream = js.native
  def ctor(): from2Lib.from2Mod.from2Ns.From2Ctor[from2Lib.from2Mod.from2Ns.ReadInput] = js.native
  def ctor(opts: from2Lib.from2Mod.from2Ns.ObjectModeOptions): from2Lib.from2Mod.from2Ns.From2Ctor[from2Lib.from2Mod.from2Ns.ReadObjectInput] = js.native
  def ctor(opts: from2Lib.from2Mod.from2Ns.Options): from2Lib.from2Mod.from2Ns.From2Ctor[from2Lib.from2Mod.from2Ns.ReadInput] = js.native
  def obj(
    opts: from2Lib.Anon_ObjectMode with nodeLib.streamMod.internalNs.ReadableOptions,
    read: from2Lib.from2Mod.from2Ns.ReadObjectInput
  ): nodeLib.NodeJSNs.ReadableStream = js.native
  def obj(read: from2Lib.from2Mod.from2Ns.ReadObjectInput): nodeLib.NodeJSNs.ReadableStream = js.native
}

