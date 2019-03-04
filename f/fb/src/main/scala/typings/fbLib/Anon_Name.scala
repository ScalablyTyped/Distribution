package typings
package fbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: java.lang.String
  var user_ids: js.Array[java.lang.String]
}

object Anon_Name {
  @scala.inline
  def apply(name: java.lang.String, user_ids: js.Array[java.lang.String]): Anon_Name = {
    val __obj = js.Dynamic.literal(name = name, user_ids = user_ids)
  
    __obj.asInstanceOf[Anon_Name]
  }
}

