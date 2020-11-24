package typings.fsExtra.mod

import typings.node.fsMod.PathLike
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-extra", "appendFileSync")
@js.native
object appendFileSync extends js.Object {
  
  def apply(file: Double, data: String): Unit = js.native
  def apply(file: Double, data: String, options: typings.node.fsMod.WriteFileOptions): Unit = js.native
  def apply(file: Double, data: Uint8Array): Unit = js.native
  def apply(file: Double, data: Uint8Array, options: typings.node.fsMod.WriteFileOptions): Unit = js.native
  def apply(file: PathLike, data: String): Unit = js.native
  def apply(file: PathLike, data: String, options: typings.node.fsMod.WriteFileOptions): Unit = js.native
  def apply(file: PathLike, data: Uint8Array): Unit = js.native
  def apply(file: PathLike, data: Uint8Array, options: typings.node.fsMod.WriteFileOptions): Unit = js.native
}
