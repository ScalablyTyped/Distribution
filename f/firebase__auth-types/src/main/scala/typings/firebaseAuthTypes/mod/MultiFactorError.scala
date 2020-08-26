package typings.firebaseAuthTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiFactorError extends AuthError {
  var resolver: MultiFactorResolver = js.native
}

object MultiFactorError {
  @scala.inline
  def apply(code: String, message: String, resolver: MultiFactorResolver): MultiFactorError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], resolver = resolver.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiFactorError]
  }
  @scala.inline
  implicit class MultiFactorErrorOps[Self <: MultiFactorError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setResolver(value: MultiFactorResolver): Self = this.set("resolver", value.asInstanceOf[js.Any])
  }
  
}

