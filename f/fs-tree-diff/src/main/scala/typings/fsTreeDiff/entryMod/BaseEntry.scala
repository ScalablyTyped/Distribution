package typings.fsTreeDiff.entryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseEntry extends js.Object {
  var relativePath: String
  def isDirectory(): Boolean
}

object BaseEntry {
  @scala.inline
  def apply(isDirectory: () => Boolean, relativePath: String): BaseEntry = {
    val __obj = js.Dynamic.literal(isDirectory = js.Any.fromFunction0(isDirectory), relativePath = relativePath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BaseEntry]
  }
}

