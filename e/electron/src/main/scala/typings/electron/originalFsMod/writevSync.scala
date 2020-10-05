package typings.electron.originalFsMod

import typings.node.NodeJS.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("original-fs", "writevSync")
@js.native
object writevSync extends js.Object {
  def apply(fd: Double, buffers: js.Array[ArrayBufferView]): Double = js.native
  def apply(fd: Double, buffers: js.Array[ArrayBufferView], position: Double): Double = js.native
}

