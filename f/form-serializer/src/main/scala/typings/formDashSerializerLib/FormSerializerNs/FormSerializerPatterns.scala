package typings
package formDashSerializerLib.FormSerializerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormSerializerPatterns extends js.Object {
  var fixed: stdLib.RegExp
  var key: stdLib.RegExp
  var named: stdLib.RegExp
  var push: stdLib.RegExp
  var validate: stdLib.RegExp
}

object FormSerializerPatterns {
  @scala.inline
  def apply(
    fixed: stdLib.RegExp,
    key: stdLib.RegExp,
    named: stdLib.RegExp,
    push: stdLib.RegExp,
    validate: stdLib.RegExp
  ): FormSerializerPatterns = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fixed")(fixed)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("named")(named)
    __obj.updateDynamic("push")(push)
    __obj.updateDynamic("validate")(validate)
    __obj.asInstanceOf[FormSerializerPatterns]
  }
}

