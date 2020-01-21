package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBody extends js.Object {
  /**
    * Media body contents
    */
  var body: js.UndefOr[js.Any] = js.native
  /**
    * Media mime-type
    */
  var mimeType: js.UndefOr[String] = js.native
}

object AnonBody {
  @scala.inline
  def apply(body: js.Any = null, mimeType: String = null): AnonBody = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBody]
  }
}

