package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Body extends js.Object {
  /**
    * Media body contents
    */
  var body: js.UndefOr[js.Any] = js.native
  /**
    * Media mime-type
    */
  var mimeType: js.UndefOr[String] = js.native
}

object Body {
  @scala.inline
  def apply(body: js.Any = null, mimeType: String = null): Body = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
}

