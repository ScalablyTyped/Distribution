package typings.fsTreeDiff.entryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Entry extends DefaultEntry
object Entry {
  
  @scala.inline
  def apply(isDirectory: () => Boolean, relativePath: String): Entry = {
    val __obj = js.Dynamic.literal(isDirectory = js.Any.fromFunction0(isDirectory), relativePath = relativePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entry]
  }
}
