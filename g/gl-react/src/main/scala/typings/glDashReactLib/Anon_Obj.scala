package typings
package glDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Obj extends js.Object {
  var obj: js.Any
  var `type`: java.lang.String
}

object Anon_Obj {
  @scala.inline
  def apply(obj: js.Any, `type`: java.lang.String): Anon_Obj = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("obj")(obj)
    __obj.asInstanceOf[Anon_Obj]
  }
}

