package typings.glob

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsDirectory extends js.Object {
  def isDirectory(): Boolean
}

object AnonIsDirectory {
  @scala.inline
  def apply(isDirectory: () => Boolean): AnonIsDirectory = {
    val __obj = js.Dynamic.literal(isDirectory = js.Any.fromFunction0(isDirectory))
  
    __obj.asInstanceOf[AnonIsDirectory]
  }
}

