package typings
package expressDashJsonschemaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Instance extends js.Object {
  var instance: js.Any
  var message: java.lang.String
  var property: java.lang.String
}

object Anon_Instance {
  @scala.inline
  def apply(instance: js.Any, message: java.lang.String, property: java.lang.String): Anon_Instance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("instance")(instance)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("property")(property)
    __obj.asInstanceOf[Anon_Instance]
  }
}

