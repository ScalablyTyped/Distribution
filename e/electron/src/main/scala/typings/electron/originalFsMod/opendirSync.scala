package typings.electron.originalFsMod

import typings.node.fsMod.OpenDirOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("original-fs", "opendirSync")
@js.native
object opendirSync extends js.Object {
  
  def apply(path: String): typings.node.fsMod.Dir = js.native
  def apply(path: String, options: OpenDirOptions): typings.node.fsMod.Dir = js.native
}
