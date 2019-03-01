package typings
package glDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ObjRatio extends js.Object {
  var obj: js.Any
  var ratio: scala.Boolean
  var `type`: java.lang.String
}

object Anon_ObjRatio {
  @scala.inline
  def apply(obj: js.Any, ratio: scala.Boolean, `type`: java.lang.String): Anon_ObjRatio = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("obj")(obj)
    __obj.updateDynamic("ratio")(ratio)
    __obj.asInstanceOf[Anon_ObjRatio]
  }
}

