package typings.fsDashExtraDashPromise.fsDashExtraDashPromiseMod

import typings.fsDashExtraDashPromise.fsDashExtraDashPromiseStrings.buffer
import typings.node.Anon_BufferEncoding
import typings.node.Anon_EncodingBufferEncoding
import typings.node.Anon_EncodingNull
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra-promise", "realpathSync")
@js.native
object realpathSyncNs extends js.Object {
  def native(path: PathLike): String | Buffer = js.native
  def native(path: PathLike, options: String): String | Buffer = js.native
  def native(path: PathLike, options: Anon_BufferEncoding): Buffer = js.native
  def native(path: PathLike, options: Anon_EncodingBufferEncoding): String = js.native
  def native(path: PathLike, options: Anon_EncodingNull): String | Buffer = js.native
  def native(path: PathLike, options: BufferEncoding): String = js.native
  @JSName("native")
  def native_String(path: PathLike): String = js.native
  @JSName("native")
  def native_buffer(path: PathLike, options: buffer): Buffer = js.native
}

