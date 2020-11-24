package typings.fsExtra.mod

import typings.node.fsMod.ReadSyncOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-extra", "readSync")
@js.native
object readSync extends js.Object {
  
  def apply(fd: Double, buffer: typings.node.NodeJS.ArrayBufferView): Double = js.native
  def apply(fd: Double, buffer: typings.node.NodeJS.ArrayBufferView, offset: Double, length: Double): Double = js.native
  def apply(
    fd: Double,
    buffer: typings.node.NodeJS.ArrayBufferView,
    offset: Double,
    length: Double,
    position: Double
  ): Double = js.native
  def apply(fd: Double, buffer: typings.node.NodeJS.ArrayBufferView, opts: ReadSyncOptions): Double = js.native
}
