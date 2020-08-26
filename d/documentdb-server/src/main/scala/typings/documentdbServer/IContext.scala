package typings.documentdbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContext extends js.Object {
  /** Gets the collection object. */
  def getCollection(): ICollection = js.native
  /** Gets the request object. */
  def getRequest(): IRequest = js.native
  /**
    * Gets the response object.
    * Note: this is not available in pre-triggers.
    */
  def getResponse(): IResponse = js.native
}

object IContext {
  @scala.inline
  def apply(getCollection: () => ICollection, getRequest: () => IRequest, getResponse: () => IResponse): IContext = {
    val __obj = js.Dynamic.literal(getCollection = js.Any.fromFunction0(getCollection), getRequest = js.Any.fromFunction0(getRequest), getResponse = js.Any.fromFunction0(getResponse))
    __obj.asInstanceOf[IContext]
  }
  @scala.inline
  implicit class IContextOps[Self <: IContext] (val x: Self) extends AnyVal {
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
    def setGetCollection(value: () => ICollection): Self = this.set("getCollection", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRequest(value: () => IRequest): Self = this.set("getRequest", js.Any.fromFunction0(value))
    @scala.inline
    def setGetResponse(value: () => IResponse): Self = this.set("getResponse", js.Any.fromFunction0(value))
  }
  
}

