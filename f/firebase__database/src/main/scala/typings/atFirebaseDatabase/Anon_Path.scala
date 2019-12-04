package typings.atFirebaseDatabase

import typings.atFirebaseDatabase.distSrcCoreUtilPathMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Path[T] extends js.Object {
  var path: Path
  var value: T
}

object Anon_Path {
  @scala.inline
  def apply[T](path: Path, value: T): Anon_Path[T] = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Path[T]]
  }
}

