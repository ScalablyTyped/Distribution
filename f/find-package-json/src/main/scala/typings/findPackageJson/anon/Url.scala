package typings.findPackageJson.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Url extends js.Object {
  var email: String
  var url: js.UndefOr[String] = js.undefined
}

object Url {
  @scala.inline
  def apply(email: String, url: String = null): Url = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Url]
  }
}

