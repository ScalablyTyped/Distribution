package typings.fhirJsClient.FHIR.SMART

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * User in context
  */
@js.native
trait User extends js.Object {
  /**
    * Fetch the current user information from server. The library expects the userId to be of the format "ResourceType/Id"
    */
  def read(): js.Promise[Response] = js.native
}

object User {
  @scala.inline
  def apply(read: () => js.Promise[Response]): User = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction0(read))
    __obj.asInstanceOf[User]
  }
  @scala.inline
  implicit class UserOps[Self <: User] (val x: Self) extends AnyVal {
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
    def setRead(value: () => js.Promise[Response]): Self = this.set("read", js.Any.fromFunction0(value))
  }
  
}

