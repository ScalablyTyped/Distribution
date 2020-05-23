package typings.evernote.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Body extends js.Object {
  var body: js.UndefOr[String] = js.undefined
  var bodyHash: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
}

object Body {
  @scala.inline
  def apply(body: String = null, bodyHash: String = null, size: js.UndefOr[Double] = js.undefined): Body = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (bodyHash != null) __obj.updateDynamic("bodyHash")(bodyHash.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
}

