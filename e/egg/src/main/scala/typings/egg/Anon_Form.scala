package typings.egg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Form extends js.Object {
  var form: js.Array[String]
  var json: js.Array[String]
  var text: js.Array[String]
}

object Anon_Form {
  @scala.inline
  def apply(form: js.Array[String], json: js.Array[String], text: js.Array[String]): Anon_Form = {
    val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Form]
  }
}

