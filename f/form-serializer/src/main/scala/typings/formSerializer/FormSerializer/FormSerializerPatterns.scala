package typings.formSerializer.FormSerializer

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormSerializerPatterns extends js.Object {
  var fixed: RegExp
  var key: RegExp
  var named: RegExp
  var push: RegExp
  var validate: RegExp
}

object FormSerializerPatterns {
  @scala.inline
  def apply(fixed: RegExp, key: RegExp, named: RegExp, push: RegExp, validate: RegExp): FormSerializerPatterns = {
    val __obj = js.Dynamic.literal(fixed = fixed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], named = named.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any], validate = validate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FormSerializerPatterns]
  }
}

