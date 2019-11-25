package typings.fuseDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name[T] extends js.Object {
  var name: String
  var weight: Double
}

object Anon_Name {
  @scala.inline
  def apply[T](name: String, weight: Double): Anon_Name[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Name[T]]
  }
}

