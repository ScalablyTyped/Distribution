package typings.fsExtra.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-extra", "createSymlink")
@js.native
object createSymlink extends js.Object {
  
  def apply(src: String, dest: String, `type`: SymlinkType): Unit = js.native
  def apply(src: String, dest: String, `type`: SymlinkType, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}
