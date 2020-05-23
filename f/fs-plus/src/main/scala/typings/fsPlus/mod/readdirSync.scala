package typings.fsPlus.mod

import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.anon.BaseEncodingOptionswithFi
import typings.node.anon.BaseEncodingOptionswithFiEncoding
import typings.node.anon.Encoding
import typings.node.anon.WithFileTypes
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-plus", "readdirSync")
@js.native
object readdirSync extends js.Object {
  def apply(path: PathLike): js.Array[String] = js.native
  def apply(path: PathLike, options: BufferEncoding): js.Array[String] = js.native
  def apply(path: PathLike, options: BaseEncodingOptionswithFi): js.Array[Buffer | String] = js.native
  def apply(path: PathLike, options: BaseEncodingOptionswithFiEncoding): js.Array[typings.node.fsMod.Dirent] = js.native
  def apply(path: PathLike, options: Encoding): js.Array[Buffer] = js.native
  def apply(path: PathLike, options: WithFileTypes): js.Array[String] = js.native
}

