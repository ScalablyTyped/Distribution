package typings
package globLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsDirectory extends js.Object {
  def isDirectory(): scala.Boolean
}

object Anon_IsDirectory {
  @scala.inline
  def apply(isDirectory: () => scala.Boolean): Anon_IsDirectory = {
    val __obj = js.Dynamic.literal(isDirectory = js.Any.fromFunction0(isDirectory))
  
    __obj.asInstanceOf[Anon_IsDirectory]
  }
}

