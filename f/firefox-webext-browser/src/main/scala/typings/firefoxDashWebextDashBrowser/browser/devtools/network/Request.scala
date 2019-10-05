package typings.firefoxDashWebextDashBrowser.browser.devtools.network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* devtools.network types */
/**
  * Represents a network request for a document resource (script, image and so on). See HAR Specification for
  * reference.
  */
trait Request extends js.Object {
  /** Returns content of the response body. */
  def getContent(): js.Promise[js.Object]
}

object Request {
  @scala.inline
  def apply(getContent: () => js.Promise[js.Object]): Request = {
    val __obj = js.Dynamic.literal(getContent = js.Any.fromFunction0(getContent))
  
    __obj.asInstanceOf[Request]
  }
}

