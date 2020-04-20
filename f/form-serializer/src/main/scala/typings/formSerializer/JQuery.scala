package typings.formSerializer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuery extends js.Object {
  /**
    * Serializes the selected form into JSON.
    */
  def serializeJSON(): String
  /**
    * Serializes the selected form into a JavaScript object.
    */
  def serializeObject(): js.Object
}

object JQuery {
  @scala.inline
  def apply(serializeJSON: () => String, serializeObject: () => js.Object): JQuery = {
    val __obj = js.Dynamic.literal(serializeJSON = js.Any.fromFunction0(serializeJSON), serializeObject = js.Any.fromFunction0(serializeObject))
    __obj.asInstanceOf[JQuery]
  }
}

