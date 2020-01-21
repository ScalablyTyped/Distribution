package typings.firebaseDatabase

import typings.firebaseDatabase.pathMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPath[T] extends js.Object {
  var path: Path
  var value: T
}

object AnonPath {
  @scala.inline
  def apply[T](path: Path, value: T): AnonPath[T] = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPath[T]]
  }
}

