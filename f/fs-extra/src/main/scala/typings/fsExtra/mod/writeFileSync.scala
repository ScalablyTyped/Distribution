package typings.fsExtra.mod

import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-extra", "writeFileSync")
@js.native
object writeFileSync extends js.Object {
  
  def apply(path: Double, data: String): Unit = js.native
  def apply(path: Double, data: String, options: typings.node.fsMod.WriteFileOptions): Unit = js.native
  def apply(path: Double, data: typings.node.NodeJS.ArrayBufferView): Unit = js.native
  def apply(
    path: Double,
    data: typings.node.NodeJS.ArrayBufferView,
    options: typings.node.fsMod.WriteFileOptions
  ): Unit = js.native
  def apply(path: PathLike, data: String): Unit = js.native
  def apply(path: PathLike, data: String, options: typings.node.fsMod.WriteFileOptions): Unit = js.native
  def apply(path: PathLike, data: typings.node.NodeJS.ArrayBufferView): Unit = js.native
  def apply(
    path: PathLike,
    data: typings.node.NodeJS.ArrayBufferView,
    options: typings.node.fsMod.WriteFileOptions
  ): Unit = js.native
}
