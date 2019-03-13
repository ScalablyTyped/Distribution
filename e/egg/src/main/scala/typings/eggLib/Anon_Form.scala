package typings
package eggLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Form extends js.Object {
  var form: js.Array[java.lang.String]
  var json: js.Array[java.lang.String]
  var text: js.Array[java.lang.String]
}

object Anon_Form {
  @scala.inline
  def apply(
    form: js.Array[java.lang.String],
    json: js.Array[java.lang.String],
    text: js.Array[java.lang.String]
  ): Anon_Form = {
    val __obj = js.Dynamic.literal(form = form, json = json, text = text)
  
    __obj.asInstanceOf[Anon_Form]
  }
}

