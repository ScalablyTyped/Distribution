package typings.firefoxWebextBrowser.browser.devtools.network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* devtools.network types */
/**
  * Represents a network request for a document resource (script, image and so on). See HAR Specification for
  * reference.
  */
@js.native
trait Request extends js.Object {
  /** Returns content of the response body. */
  def getContent(): js.Promise[js.Object] = js.native
}

object Request {
  @scala.inline
  def apply(getContent: () => js.Promise[js.Object]): Request = {
    val __obj = js.Dynamic.literal(getContent = js.Any.fromFunction0(getContent))
    __obj.asInstanceOf[Request]
  }
  @scala.inline
  implicit class RequestOps[Self <: Request] (val x: Self) extends AnyVal {
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
    def setGetContent(value: () => js.Promise[js.Object]): Self = this.set("getContent", js.Any.fromFunction0(value))
  }
  
}

