package typings.glob

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsDirectory extends js.Object {
  def isDirectory(): Boolean
}

object Anon_IsDirectory {
  @scala.inline
  def apply(isDirectory: () => Boolean): Anon_IsDirectory = {
    val __obj = js.Dynamic.literal(isDirectory = js.Any.fromFunction0(isDirectory))
  
    __obj.asInstanceOf[Anon_IsDirectory]
  }
}

