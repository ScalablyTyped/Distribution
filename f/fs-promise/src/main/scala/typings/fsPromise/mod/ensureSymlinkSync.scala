package typings.fsPromise.mod

import typings.fsExtra.mod.SymlinkType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-promise", "ensureSymlinkSync")
@js.native
object ensureSymlinkSync extends js.Object {
  
  def apply(src: String, dest: String): Unit = js.native
  def apply(src: String, dest: String, `type`: SymlinkType): Unit = js.native
}
