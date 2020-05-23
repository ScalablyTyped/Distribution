package typings.fsExtra.mod

import typings.node.NodeJS.ArrayBufferView
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra", "writeFileSync")
@js.native
object writeFileSync extends js.Object {
  def apply(path: Double, data: String): Unit = js.native
  def apply(path: Double, data: String, options: typings.node.fsMod.WriteFileOptions): Unit = js.native
  def apply(path: Double, data: ArrayBufferView): Unit = js.native
  def apply(path: Double, data: ArrayBufferView, options: typings.node.fsMod.WriteFileOptions): Unit = js.native
  def apply(path: PathLike, data: String): Unit = js.native
  def apply(path: PathLike, data: String, options: typings.node.fsMod.WriteFileOptions): Unit = js.native
  def apply(path: PathLike, data: ArrayBufferView): Unit = js.native
  def apply(path: PathLike, data: ArrayBufferView, options: typings.node.fsMod.WriteFileOptions): Unit = js.native
}

