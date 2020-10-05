package typings.electron.originalFsMod

import typings.node.fsMod.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("original-fs", "fchmodSync")
@js.native
object fchmodSync extends js.Object {
  def apply(fd: Double, mode: Mode): Unit = js.native
}

