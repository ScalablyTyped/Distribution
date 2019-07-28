package typings.fb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: String
  var user_ids: js.Array[String]
}

object Anon_Name {
  @scala.inline
  def apply(name: String, user_ids: js.Array[String]): Anon_Name = {
    val __obj = js.Dynamic.literal(name = name, user_ids = user_ids)
  
    __obj.asInstanceOf[Anon_Name]
  }
}

