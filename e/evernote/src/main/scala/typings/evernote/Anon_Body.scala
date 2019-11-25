package typings.evernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: js.UndefOr[String] = js.undefined
  var bodyHash: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
}

object Anon_Body {
  @scala.inline
  def apply(body: String = null, bodyHash: String = null, size: Int | Double = null): Anon_Body = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (bodyHash != null) __obj.updateDynamic("bodyHash")(bodyHash.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Body]
  }
}

