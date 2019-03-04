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
    val __obj = js.Dynamic.literal(fixed = fixed, key = key, named = named, push = push, validate = validate)
  
    __obj.asInstanceOf[FormSerializerPatterns]
  }
}

