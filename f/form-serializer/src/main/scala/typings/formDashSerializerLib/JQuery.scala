package typings
package formDashSerializerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuery extends js.Object {
  /**
    * Serializes the selected form into JSON.
    */
  def serializeJSON(): java.lang.String
  /**
    * Serializes the selected form into a JavaScript object.
    */
  def serializeObject(): js.Object
}

object JQuery {
  @scala.inline
  def apply(serializeJSON: js.Function0[java.lang.String], serializeObject: js.Function0[js.Object]): JQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("serializeJSON")(serializeJSON)
    __obj.updateDynamic("serializeObject")(serializeObject)
    __obj.asInstanceOf[JQuery]
  }
}

