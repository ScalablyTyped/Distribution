package typings.glob.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsDirectory extends js.Object {
  def isDirectory(): Boolean
}

object IsDirectory {
  @scala.inline
  def apply(isDirectory: () => Boolean): IsDirectory = {
    val __obj = js.Dynamic.literal(isDirectory = js.Any.fromFunction0(isDirectory))
    __obj.asInstanceOf[IsDirectory]
  }
}

